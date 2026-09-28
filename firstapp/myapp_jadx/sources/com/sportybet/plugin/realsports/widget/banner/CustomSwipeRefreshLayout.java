package com.sportybet.plugin.realsports.widget.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes4.dex */
public class CustomSwipeRefreshLayout extends SwipeRefreshLayout {
    public float h0;
    public float i0;
    public boolean j0;
    public final int k0;

    public CustomSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.h0 = motionEvent.getY();
            this.i0 = motionEvent.getX();
            this.j0 = false;
        } else if (action == 1) {
            this.j0 = false;
        } else if (action != 2) {
            if (action == 3) {
                this.j0 = false;
            }
        } else {
            if (this.j0) {
                return false;
            }
            float y = motionEvent.getY();
            float fAbs = Math.abs(motionEvent.getX() - this.i0);
            float fAbs2 = Math.abs(y - this.h0);
            if (fAbs > this.k0 && fAbs > fAbs2) {
                this.j0 = true;
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
