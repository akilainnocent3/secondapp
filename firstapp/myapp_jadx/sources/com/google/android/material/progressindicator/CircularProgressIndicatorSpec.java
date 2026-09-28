package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.sportybet.android.gp.tz.R;
import defpackage.ecv;
import defpackage.gof0;
import defpackage.j42;
import defpackage.pk30;

/* JADX INFO: loaded from: classes4.dex */
public final class CircularProgressIndicatorSpec extends j42 {
    public int o;
    public int p;
    public int q;
    public int r;
    public final boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int i2 = CircularProgressIndicator.D;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        gof0.a(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = pk30.k;
        gof0.b(context, attributeSet, iArr, i, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        this.o = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.p = Math.max(ecv.c(context, typedArrayObtainStyledAttributes, 4, dimensionPixelSize), this.a * 2);
        this.q = ecv.c(context, typedArrayObtainStyledAttributes, 3, dimensionPixelSize2);
        this.r = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.s = typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
        d();
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }
}
