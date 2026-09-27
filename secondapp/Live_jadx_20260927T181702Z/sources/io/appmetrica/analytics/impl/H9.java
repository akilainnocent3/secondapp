package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class H9 {
    public static final B9 a(int i10, String str) {
        byte[] bytes;
        B9 b10 = new B9();
        b10.f95604a = i10;
        if (str == null || (bytes = str.getBytes(cv.g.f77202b)) == null) {
            bytes = b10.f95605b;
        }
        b10.f95605b = bytes;
        return b10;
    }
}
