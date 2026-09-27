package com.startapp.sdk.internal;

import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class z1 {
    public static final String a(String str) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            kotlin.jvm.internal.m0.o(bArrDecode, "decode(...)");
            return new String(bArrDecode, cv.g.f77202b);
        } catch (Exception unused) {
            return str;
        }
    }
}
