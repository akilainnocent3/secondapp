package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView;

/* JADX INFO: loaded from: classes7.dex */
public final class cid0 implements g6i0 {
    public final KeyboardView a;
    public final CheckBox b;
    public final LinearLayout c;
    public final TextView d;
    public final AppCompatTextView e;
    public final AppCompatTextView f;
    public final AppCompatTextView i;
    public final LinearLayout v;
    public final View w;
    public final RecyclerView y;

    public cid0(KeyboardView keyboardView, CheckBox checkBox, LinearLayout linearLayout, TextView textView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, LinearLayout linearLayout2, View view, RecyclerView recyclerView) {
        this.a = keyboardView;
        this.b = checkBox;
        this.c = linearLayout;
        this.d = textView;
        this.e = appCompatTextView;
        this.f = appCompatTextView2;
        this.i = appCompatTextView3;
        this.v = linearLayout2;
        this.w = view;
        this.y = recyclerView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
