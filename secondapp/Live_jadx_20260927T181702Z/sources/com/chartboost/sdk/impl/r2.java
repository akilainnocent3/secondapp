package com.chartboost.sdk.impl;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r2 f40730a = new r2();

    public static final String a(String input) {
        kotlin.jvm.internal.m0.p(input, "input");
        byte[] bytes = input.getBytes(cv.g.f77202b);
        kotlin.jvm.internal.m0.o(bytes, "getBytes(...)");
        r2 r2Var = f40730a;
        return r2Var.a(r2Var.b(bytes));
    }

    public final byte[] b(byte[] bArr) {
        return MessageDigest.getInstance("SHA-1").digest(bArr);
    }

    public final String a(byte[] bArr) {
        String str = String.format("%0" + (bArr.length << 1) + "x", Arrays.copyOf(new Object[]{new BigInteger(1, bArr)}, 1));
        kotlin.jvm.internal.m0.o(str, "format(...)");
        return str;
    }
}
