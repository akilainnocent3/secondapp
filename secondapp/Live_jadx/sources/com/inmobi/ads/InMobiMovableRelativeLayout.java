package com.inmobi.ads;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.media.C3961r9;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class InMobiMovableRelativeLayout extends RelativeLayout {

    @l
    public static final C3961r9 Companion = new C3961r9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f54279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup.LayoutParams f54280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f54281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f54282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f54283e;

    public InMobiMovableRelativeLayout(@m Context context) {
        super(context);
        this.f54279a = new WeakReference(null);
        this.f54281c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }

    private final void setParentView(ViewGroup viewGroup) {
        this.f54279a = new WeakReference(viewGroup);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        m0.n(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        setParentView((ViewGroup) parent);
        if (this.f54280b == null) {
            this.f54280b = getLayoutParams();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setParentView(null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@l MotionEvent ev2) {
        ViewGroup viewGroup;
        m0.p(ev2, "ev");
        if (this.f54281c) {
            float rawX = ev2.getRawX();
            float rawY = ev2.getRawY();
            int action = ev2.getAction();
            if (action == 0) {
                this.f54282d = rawX;
                this.f54283e = rawY;
            } else if (action == 2 && (viewGroup = (ViewGroup) this.f54279a.get()) != null) {
                float f10 = rawX - this.f54282d;
                float f11 = rawY - this.f54283e;
                int left = (int) (getLeft() + f10);
                int top = (int) (getTop() + f11);
                int paddingLeft = viewGroup.getPaddingLeft();
                int paddingTop = viewGroup.getPaddingTop();
                int width = viewGroup.getWidth() - viewGroup.getPaddingRight();
                int height = viewGroup.getHeight() - viewGroup.getPaddingBottom();
                int iMax = Math.max(paddingLeft, Math.min(left, width - getWidth()));
                int iMax2 = Math.max(paddingTop, Math.min(top, height - getHeight()));
                layout(iMax, iMax2, getWidth() + iMax, getHeight() + iMax2);
                this.f54282d = rawX;
                this.f54283e = rawY;
            }
        }
        return super.onInterceptTouchEvent(ev2);
    }

    public final void resetPosition() {
        setLayoutParams(this.f54280b);
    }

    public final void setIsMovable(boolean z10) {
        this.f54281c = z10;
    }

    public InMobiMovableRelativeLayout(@m Context context, @m AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54279a = new WeakReference(null);
        this.f54281c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }

    public InMobiMovableRelativeLayout(@m Context context, @m AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f54279a = new WeakReference(null);
        this.f54281c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }
}
