package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static float a(int i, float f, float f2) {
        return (Math.max(0, i - 1) * f2) + f;
    }

    public static float b(int i, float f, float f2) {
        return i > 0 ? (f2 / 2.0f) + f : f;
    }

    public static float c(float f, float f2, float f3, int i) {
        return i > 0 ? (f3 / 2.0f) + f2 : f;
    }
}
