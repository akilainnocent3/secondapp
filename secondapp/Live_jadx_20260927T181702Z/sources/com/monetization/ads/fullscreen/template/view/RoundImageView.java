package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import cs.k;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import yads.u10;
import yads.v10;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class RoundImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u10 f71837a;

    @SuppressLint({"CustomViewStyleable"})
    @k
    public RoundImageView(@l Context context) {
        this(context, null, 0, null, 14, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        u10 u10Var = this.f71837a;
        if (u10Var.f156189d != null && !u10Var.f156188c.isEmpty()) {
            canvas.clipPath(u10Var.f156188c);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f71837a.a();
    }

    @SuppressLint({"CustomViewStyleable"})
    @k
    public RoundImageView(@l Context context, @m AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
    }

    @SuppressLint({"CustomViewStyleable"})
    @k
    public RoundImageView(@l Context context, @m AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, null, 8, null);
    }

    @SuppressLint({"CustomViewStyleable"})
    @k
    public RoundImageView(@l Context context, @m AttributeSet attributeSet, int i10, @l v10 v10Var) {
        super(context, attributeSet, i10);
        v10Var.getClass();
        this.f71837a = v10.a(context, this, attributeSet, i10);
    }

    public /* synthetic */ RoundImageView(Context context, AttributeSet attributeSet, int i10, v10 v10Var, int i11, x xVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? new v10() : v10Var);
    }
}
