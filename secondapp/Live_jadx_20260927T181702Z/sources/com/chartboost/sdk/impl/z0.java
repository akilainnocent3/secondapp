package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z0 extends ConstraintLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f41694c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GradientDrawable f41695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c6 f41696b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Context context, AttributeSet attributeSet, int i10, GradientDrawable backgroundDrawable, c6 densityProvider) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(backgroundDrawable, "backgroundDrawable");
        kotlin.jvm.internal.m0.p(densityProvider, "densityProvider");
        this.f41695a = backgroundDrawable;
        this.f41696b = densityProvider;
        a();
    }

    public final int a(double d10) {
        return this.f41696b.a(d10);
    }

    @oy.l
    public final GradientDrawable getBackgroundDrawable() {
        return this.f41695a;
    }

    public final void setCornerRadius(int i10) {
        this.f41695a.setCornerRadius(i10);
    }

    public final int a(int i10) {
        return this.f41696b.a(i10);
    }

    public final void a(boolean z10) {
        setBackground(z10 ? this.f41695a : null);
    }

    public final void a() {
        GradientDrawable gradientDrawable = this.f41695a;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(16.0f);
        gradientDrawable.setColor(-15262682);
        setBackgroundColor(0);
        setBackground(this.f41695a);
    }

    public /* synthetic */ z0(Context context, AttributeSet attributeSet, int i10, GradientDrawable gradientDrawable, c6 c6Var, int i11, kotlin.jvm.internal.x xVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? new GradientDrawable() : gradientDrawable, (i11 & 16) != 0 ? new w5(context) : c6Var);
    }
}
