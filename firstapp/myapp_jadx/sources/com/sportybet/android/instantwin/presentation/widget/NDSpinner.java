package com.sportybet.android.instantwin.presentation.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSpinner;

/* JADX INFO: loaded from: classes.dex */
public class NDSpinner extends AppCompatSpinner {
    public NDSpinner(Context context) {
        super(context);
    }

    @Override // android.widget.AbsSpinner
    public void setSelection(int i, boolean z) {
        boolean z2 = i == getSelectedItemPosition();
        super.setSelection(i, z);
        if (z2) {
            getOnItemSelectedListener().onItemSelected(this, getSelectedView(), i, getSelectedItemId());
        }
    }

    public NDSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NDSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.AbsSpinner, android.widget.AdapterView
    public void setSelection(int i) {
        boolean z = i == getSelectedItemPosition();
        super.setSelection(i);
        if (z) {
            getOnItemSelectedListener().onItemSelected(this, getSelectedView(), i, getSelectedItemId());
        }
    }
}
