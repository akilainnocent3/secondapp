package com.bytedance.adsdk.ugeno.hu.hww;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd extends hww {
    public sd(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.hu.hww.hww
    public Drawable tq(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }
}
