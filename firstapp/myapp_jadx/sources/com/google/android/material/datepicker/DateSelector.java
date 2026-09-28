package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import defpackage.lcv;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public interface DateSelector<S> extends Parcelable {
    static void g1(final EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: qyc
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                for (EditText editText : editTextArr) {
                    if (editText.hasFocus()) {
                        return;
                    }
                }
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            }
        };
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
        final EditText editText2 = editTextArr[0];
        editText2.postDelayed(new Runnable() { // from class: ryc
            @Override // java.lang.Runnable
            public final void run() {
                View view = editText2;
                view.requestFocus();
                view.post(new cai0(view));
            }
        }, 100L);
    }

    void C1(long j);

    String D0(Context context);

    ArrayList I0();

    String Z(Context context);

    int c0(Context context);

    boolean p1();

    View q1(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, lcv.a aVar);

    ArrayList t1();

    S w1();
}
