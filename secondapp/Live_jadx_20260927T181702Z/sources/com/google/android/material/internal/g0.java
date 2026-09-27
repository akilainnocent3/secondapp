package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.l2;
import k.c1;
import k.d1;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@y0({y0.a.LIBRARY_GROUP})
public final class g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f51073b = "Theme.AppCompat";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f51075d = "Theme.MaterialComponents";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f51072a = {ih.a.c.R3};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f51074c = {ih.a.c.Y3};

    public static void a(@NonNull Context context) {
        e(context, f51072a, f51073b);
    }

    public static void b(@NonNull Context context, AttributeSet attributeSet, @k.f int i10, @c1 int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ih.a.o.Rx, i10, i11);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(ih.a.o.Tx, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z10) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(ih.a.c.f91275y9, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(@NonNull Context context) {
        e(context, f51074c, f51075d);
    }

    public static void d(@NonNull Context context, AttributeSet attributeSet, @NonNull @d1 int[] iArr, @k.f int i10, @c1 int i11, @Nullable @d1 int... iArr2) {
        boolean zG;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ih.a.o.Rx, i10, i11);
        if (!typedArrayObtainStyledAttributes.getBoolean(ih.a.o.Ux, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zG = typedArrayObtainStyledAttributes.getResourceId(ih.a.o.Sx, -1) != -1;
        } else {
            zG = g(context, attributeSet, iArr, i10, i11, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zG) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void e(@NonNull Context context, @NonNull int[] iArr, String str) {
        if (j(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    public static boolean f(@NonNull Context context) {
        return j(context, f51072a);
    }

    public static boolean g(@NonNull Context context, AttributeSet attributeSet, @NonNull @d1 int[] iArr, @k.f int i10, @c1 int i11, @NonNull @d1 int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        for (int i12 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i12, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static boolean h(@NonNull Context context) {
        return ki.b.b(context, ih.a.c.f91253x9, false);
    }

    public static boolean i(@NonNull Context context) {
        return j(context, f51074c);
    }

    public static boolean j(@NonNull Context context, @NonNull int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    @NonNull
    public static TypedArray k(@NonNull Context context, AttributeSet attributeSet, @NonNull @d1 int[] iArr, @k.f int i10, @c1 int i11, @d1 int... iArr2) {
        b(context, attributeSet, i10, i11);
        d(context, attributeSet, iArr, i10, i11, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
    }

    public static l2 l(@NonNull Context context, AttributeSet attributeSet, @NonNull @d1 int[] iArr, @k.f int i10, @c1 int i11, @d1 int... iArr2) {
        b(context, attributeSet, i10, i11);
        d(context, attributeSet, iArr, i10, i11, iArr2);
        return l2.G(context, attributeSet, iArr, i10, i11);
    }
}
