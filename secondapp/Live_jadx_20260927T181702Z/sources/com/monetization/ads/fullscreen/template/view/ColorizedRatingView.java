package com.monetization.ads.fullscreen.template.view;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import oy.l;
import oy.m;
import pn.b;
import pn.c;
import yads.wl2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class ColorizedRatingView extends wl2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f71830a = Color.parseColor("#FFF4C900");

    public ColorizedRatingView(@l Context context) {
        super(context);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@m Drawable drawable) {
        super.setProgressDrawable(drawable);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
            if (layerDrawable.getNumberOfLayers() >= 3) {
                Drawable drawable2 = layerDrawable.getDrawable(0);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 29) {
                    c.a();
                    drawable2.setColorFilter(b.a(-3355444, BlendMode.SRC_ATOP));
                } else {
                    drawable2.setColorFilter(-3355444, PorterDuff.Mode.SRC_ATOP);
                }
                Drawable drawable3 = layerDrawable.getDrawable(1);
                int i11 = f71830a;
                if (i10 >= 29) {
                    c.a();
                    drawable3.setColorFilter(b.a(i11, BlendMode.SRC_ATOP));
                } else {
                    drawable3.setColorFilter(i11, PorterDuff.Mode.SRC_ATOP);
                }
                Drawable drawable4 = layerDrawable.getDrawable(2);
                if (i10 < 29) {
                    drawable4.setColorFilter(i11, PorterDuff.Mode.SRC_ATOP);
                } else {
                    c.a();
                    drawable4.setColorFilter(b.a(i11, BlendMode.SRC_ATOP));
                }
            }
        }
    }

    public ColorizedRatingView(@l Context context, @m AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ColorizedRatingView(@l Context context, @m AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
