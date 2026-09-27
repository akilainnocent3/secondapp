package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY})
public class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f7129a = "ThemeUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f7130b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f7131c = {-16842910};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f7132d = {R.attr.state_focused};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f7133e = {R.attr.state_activated};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f7134f = {R.attr.state_pressed};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f7135g = {R.attr.state_checked};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f7136h = {R.attr.state_selected};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f7137i = {-16842919, -16842908};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f7138j = new int[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f7139k = new int[1];

    public static void a(@NonNull View view, @NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(m.a.m.S0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(m.a.m.f106045g3)) {
                Log.e(f7129a, "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static ColorStateList b(int i10, int i11) {
        return new ColorStateList(new int[][]{f7131c, f7138j}, new int[]{i11, i10});
    }

    public static int c(@NonNull Context context, int i10) {
        ColorStateList colorStateListF = f(context, i10);
        if (colorStateListF != null && colorStateListF.isStateful()) {
            return colorStateListF.getColorForState(f7131c, colorStateListF.getDefaultColor());
        }
        TypedValue typedValueG = g();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueG, true);
        return e(context, i10, typedValueG.getFloat());
    }

    public static int d(@NonNull Context context, int i10) {
        int[] iArr = f7139k;
        iArr[0] = i10;
        l2 l2VarF = l2.F(context, null, iArr);
        try {
            return l2VarF.c(0, 0);
        } finally {
            l2VarF.I();
        }
    }

    public static int e(@NonNull Context context, int i10, float f10) {
        int iD = d(context, i10);
        return k1.b0.D(iD, Math.round(Color.alpha(iD) * f10));
    }

    @Nullable
    public static ColorStateList f(@NonNull Context context, int i10) {
        int[] iArr = f7139k;
        iArr[0] = i10;
        l2 l2VarF = l2.F(context, null, iArr);
        try {
            return l2VarF.d(0);
        } finally {
            l2VarF.I();
        }
    }

    public static TypedValue g() {
        ThreadLocal<TypedValue> threadLocal = f7130b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
