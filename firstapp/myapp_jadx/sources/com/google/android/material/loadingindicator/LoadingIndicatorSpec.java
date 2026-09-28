package com.google.android.material.loadingindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.sportybet.android.gp.tz.R;
import defpackage.gof0;
import defpackage.hb5;
import defpackage.pk30;
import defpackage.vbv;

/* JADX INFO: loaded from: classes4.dex */
public final class LoadingIndicatorSpec {
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int e;

    public LoadingIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        int i2 = LoadingIndicator.c;
        this.d = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.m3_loading_indicator_shape_size);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.m3_loading_indicator_container_size);
        gof0.a(context, attributeSet, i, R.style.Widget_Material3_LoadingIndicator);
        int[] iArr = pk30.z;
        gof0.b(context, attributeSet, iArr, i, R.style.Widget_Material3_LoadingIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, R.style.Widget_Material3_LoadingIndicator);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize2);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize2);
        if (!typedArrayObtainStyledAttributes.hasValue(3)) {
            this.d = new int[]{vbv.c(context, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(3).type != 1) {
            this.d = new int[]{typedArrayObtainStyledAttributes.getColor(3, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(3, -1));
            this.d = intArray;
            if (intArray.length == 0) {
                hb5.a("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        this.e = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public LoadingIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.loadingIndicatorStyle);
    }
}
