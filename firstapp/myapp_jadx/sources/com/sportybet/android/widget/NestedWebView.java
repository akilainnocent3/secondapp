package com.sportybet.android.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import defpackage.plx;
import defpackage.qlx;

/* JADX INFO: loaded from: classes4.dex */
public class NestedWebView extends WebView implements plx {
    public int a;
    public final int[] b;
    public final int[] c;
    public int d;
    public final qlx e;

    public NestedWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new int[2];
        this.c = new int[2];
        this.e = new qlx(this);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.e.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.e.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.e.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.e.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.e.f(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.e.d;
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEventObtain.getActionMasked();
        if (actionMasked == 0) {
            this.d = 0;
        }
        int y = (int) motionEventObtain.getY();
        motionEventObtain.offsetLocation(0.0f, this.d);
        if (actionMasked == 0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEventObtain);
            this.a = y;
            startNestedScroll(2);
            return zOnTouchEvent;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int i = this.a - y;
                int[] iArr = this.c;
                int[] iArr2 = this.b;
                if (dispatchNestedPreScroll(0, i, iArr, iArr2)) {
                    i -= iArr[1];
                    int i2 = iArr2[1];
                    this.a = y - i2;
                    motionEventObtain.offsetLocation(0.0f, -i2);
                    this.d += iArr2[1];
                }
                int i3 = i;
                boolean zOnTouchEvent2 = super.onTouchEvent(motionEventObtain);
                int[] iArr3 = this.b;
                if (dispatchNestedScroll(0, iArr3[1], 0, i3, iArr3)) {
                    motionEventObtain.offsetLocation(0.0f, iArr2[1]);
                    int i4 = this.d;
                    int i5 = iArr2[1];
                    this.d = i4 + i5;
                    this.a -= i5;
                }
                return zOnTouchEvent2;
            }
            if (actionMasked != 3) {
                return false;
            }
        }
        boolean zOnTouchEvent3 = super.onTouchEvent(motionEventObtain);
        stopNestedScroll();
        return zOnTouchEvent3;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.e.g(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.e.h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.e.i(0);
    }

    public NestedWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.webViewStyle);
    }

    public NestedWebView(Context context) {
        this(context, null);
    }
}
