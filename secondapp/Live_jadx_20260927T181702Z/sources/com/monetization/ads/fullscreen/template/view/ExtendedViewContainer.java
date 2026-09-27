package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.R;
import cs.k;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import yads.cz2;
import yads.dj1;
import yads.ej1;
import yads.hj1;
import yads.ij1;
import yads.oy;
import yads.u10;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class ExtendedViewContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u10 f71834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij1 f71835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ij1 f71836c;

    @SuppressLint({"CustomViewStyleable"})
    @k
    public ExtendedViewContainer(@l Context context) {
        this(context, null, 0, 6, null);
    }

    private final oy a(float f10, float f11) {
        return new oy(new ej1(this, f10, getContext().getApplicationContext()), new dj1(this, f11, getContext().getApplicationContext()));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        u10 u10Var = this.f71834a;
        if (u10Var.f156189d != null && !u10Var.f156188c.isEmpty()) {
            canvas.clipPath(u10Var.f156188c);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        hj1 hj1VarA = this.f71836c.a(i10, i11);
        super.onMeasure(hj1VarA.f150155a, hj1VarA.f150156b);
        this.f71834a.a();
    }

    public final void setMeasureSpecProvider(@l ij1 ij1Var) {
        this.f71836c = new oy(this.f71835b, ij1Var);
        requestLayout();
        invalidate();
    }

    @SuppressLint({"CustomViewStyleable"})
    @k
    public ExtendedViewContainer(@l Context context, @m AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ExtendedViewContainer(Context context, AttributeSet attributeSet, int i10, int i11, x xVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @SuppressLint({"CustomViewStyleable"})
    @k
    public ExtendedViewContainer(@l Context context, @m AttributeSet attributeSet, int i10) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int dimensionPixelSize4;
        super(context, attributeSet, i10);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MonetizationAdsInternalExtendedContainer, i10, 0);
            int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_corner_radius, 0);
            dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_top_left_corner_radius, dimensionPixelSize5);
            dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_top_right_corner_radius, dimensionPixelSize5);
            dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_bottom_right_corner_radius, dimensionPixelSize5);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_bottom_left_corner_radius, dimensionPixelSize5);
            this.f71835b = a(typedArrayObtainStyledAttributes.getFloat(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_max_screen_width, 1.0f), typedArrayObtainStyledAttributes.getFloat(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_max_screen_height, 1.0f));
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f71835b = new cz2();
            dimensionPixelSize = 0;
            dimensionPixelSize2 = 0;
            dimensionPixelSize3 = 0;
            dimensionPixelSize4 = 0;
        }
        this.f71836c = this.f71835b;
        this.f71834a = new u10(this, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize);
        setWillNotDraw(false);
    }
}
