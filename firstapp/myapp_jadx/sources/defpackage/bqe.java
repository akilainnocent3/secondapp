package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes5.dex */
public final class bqe {
    public static DisplayMetrics a;
    public static Resources b;

    public static int a(float f) {
        DisplayMetrics displayMetrics = a;
        return displayMetrics != null ? (int) TypedValue.applyDimension(1, f, displayMetrics) : (int) f;
    }

    public static int b(float f, Context context) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static float c() {
        DisplayMetrics displayMetrics = a;
        if (displayMetrics != null) {
            return displayMetrics.density;
        }
        return 2.0f;
    }

    public static int d() {
        DisplayMetrics displayMetrics = a;
        if (displayMetrics != null) {
            return displayMetrics.widthPixels;
        }
        return 720;
    }
}
