package com.cleveradssolutions.adapters.exchange.rendering.utils.helpers;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static int a(float f10, Context context) {
        return (int) d(f10, context);
    }

    public static float b(float f10, Context context) {
        return f10 / e(context);
    }

    public static int c(float f10, Context context) {
        return (int) (b(f10, context) + 0.5f);
    }

    public static float d(float f10, Context context) {
        return TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
    }

    public static float e(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }
}
