package com.sportybet.plugin.jackpot.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes4.dex */
public class ChildClickableLinearLayout extends LinearLayout {
    public boolean a;

    public ChildClickableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.a;
    }

    public void setChildClickable(boolean z) {
        this.a = z;
    }

    public ChildClickableLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
    }

    public ChildClickableLinearLayout(Context context) {
        super(context);
        this.a = true;
    }
}
