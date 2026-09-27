package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.xk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4122xk {
    public static int a(String str) {
        if (cv.k0.J2(str, "track_", false, 2, null)) {
            str = str.substring(6);
            kotlin.jvm.internal.m0.o(str, "substring(...)");
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
