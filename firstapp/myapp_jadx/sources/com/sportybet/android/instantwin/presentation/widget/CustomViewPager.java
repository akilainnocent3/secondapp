package com.sportybet.android.instantwin.presentation.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes.dex */
public class CustomViewPager extends ViewPager {
    public float x0;

    public interface a {
    }

    public CustomViewPager(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.x0 = x;
        } else if (action == 2) {
            if (this.x0 < x && getCurrentItem() == 0) {
                throw null;
            }
            if (this.x0 > x && getCurrentItem() == getAdapter().c() - 1) {
                throw null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnSwipeOutListener(a aVar) {
    }

    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
