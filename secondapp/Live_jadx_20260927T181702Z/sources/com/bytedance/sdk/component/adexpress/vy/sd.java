package com.bytedance.sdk.component.adexpress.vy;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd {
    public static Drawable hww(Context context, com.bytedance.sdk.component.adexpress.dynamic.vy.vgm vgmVar) {
        if (context == null || vgmVar == null) {
            return null;
        }
        return hww(context, (int) vgm.hww(context, vgmVar.bs()), vgmVar.wgt(), vgmVar.mw());
    }

    public static Drawable hww(Context context, int i10, int i11, int i12) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i10, i11);
        }
        gradientDrawable.setColor(i12);
        return gradientDrawable;
    }
}
