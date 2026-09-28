package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class vbv {
    public static int a(int i, int i2) {
        return b78.f(i, (Color.alpha(i) * i2) / 255);
    }

    public static int b(int i, View view) {
        Context context = view.getContext();
        TypedValue typedValueE = bbv.e(i, view.getContext(), view.getClass().getCanonicalName());
        int i2 = typedValueE.resourceId;
        return i2 != 0 ? context.getColor(i2) : typedValueE.data;
    }

    public static int c(Context context, int i, int i2) {
        Integer numD = d(context, i);
        return numD != null ? numD.intValue() : i2;
    }

    public static Integer d(Context context, int i) {
        TypedValue typedValueA = bbv.a(context, i);
        if (typedValueA == null) {
            return null;
        }
        int i2 = typedValueA.resourceId;
        return Integer.valueOf(i2 != 0 ? context.getColor(i2) : typedValueA.data);
    }

    public static ColorStateList e(Context context, int i) {
        TypedValue typedValueA = bbv.a(context, i);
        if (typedValueA == null) {
            return null;
        }
        int i2 = typedValueA.resourceId;
        if (i2 != 0) {
            return th50.a(i2, context.getTheme(), context.getResources());
        }
        int i3 = typedValueA.data;
        if (i3 != 0) {
            return ColorStateList.valueOf(i3);
        }
        return null;
    }

    public static boolean f(int i) {
        return i != 0 && b78.c(i) > 0.5d;
    }

    public static int g(float f, int i, int i2) {
        return b78.d(b78.f(i2, Math.round(Color.alpha(i2) * f)), i);
    }
}
