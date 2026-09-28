package com.sportybet.plugin.realsports.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import defpackage.itf0;
import defpackage.jtu;
import defpackage.kwl;
import defpackage.qum;
import defpackage.zch0;

/* JADX INFO: loaded from: classes7.dex */
public class MarqueeView extends kwl implements Runnable {
    public String A;
    public final LinearLayout c;
    public int d;
    public int e;
    public int f;
    public int i;
    public final int v;
    public boolean w;
    public final Object y;
    public qum z;

    public static class a implements qum {
    }

    public MarqueeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((jtu) generatedComponent()).D(this);
        }
        this.d = 1;
        this.f = 20;
        this.y = new Object();
        this.A = "" + hashCode();
        this.v = zch0.f(context);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.spr_scroll_content, (ViewGroup) null);
        this.c = linearLayout;
        addView(linearLayout);
    }

    public final void a(View view) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = this.i != 0 ? this.f : 0;
        layoutParams.setMargins(i, 0, 0, 0);
        view.setLayoutParams(layoutParams);
        this.c.addView(view);
        view.measure(0, 0);
        this.i = view.getMeasuredWidth() + i + this.i;
    }

    public final void b(boolean z) {
        int i;
        synchronized (this.y) {
            try {
                removeCallbacks(this);
                if (z) {
                    i = this.d == 1 ? this.i : 0;
                } else {
                    i = this.e;
                }
                this.e = i;
                if (this.i > this.v - this.f && this.c.getChildCount() > 0) {
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_MARQUEE_VIEW);
                    aVar.a("[%s] start scroll, resetPosition: %b", this.A, Boolean.valueOf(z));
                    postDelayed(this, 100L);
                    this.w = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.y) {
            try {
                if (this.w) {
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_MARQUEE_VIEW);
                    aVar.a("[%s] stop scroll", this.A);
                    removeCallbacks(this);
                    this.w = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.w || this.c.getChildCount() == 0) {
            return;
        }
        this.c.scrollTo(this.e, 0);
        int i = this.d;
        if (i == 1) {
            float f = this.e;
            this.z.getClass();
            this.z.getClass();
            int i2 = (int) (f - 3.0f);
            this.e = i2;
            if (i2 < (-this.v)) {
                this.e = this.i;
            }
        } else if (i == 2) {
            float f2 = this.e;
            this.z.getClass();
            this.z.getClass();
            int i3 = (int) (3.0f + f2);
            this.e = i3;
            if (i3 >= this.i) {
                this.e = -this.v;
            }
        }
        removeCallbacks(this);
        this.z.getClass();
        postDelayed(this, 30L);
    }

    public void setItemViewMarginLeft(int i) {
        this.f = i;
    }

    public void setLogPrefix(String str) {
        this.A = str;
    }

    public void setScrollDirection(int i) {
        this.d = i;
    }

    public MarqueeView(Context context) {
        this(context, null);
    }

    public MarqueeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
