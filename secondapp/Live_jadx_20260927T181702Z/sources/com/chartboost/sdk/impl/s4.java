package com.chartboost.sdk.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s4 f40840a = new s4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f40841b = new byte[0];

    public final int a(InputStream input, OutputStream output) {
        kotlin.jvm.internal.m0.p(input, "input");
        kotlin.jvm.internal.m0.p(output, "output");
        long jB = b(input, output);
        if (jB > 2147483647L) {
            return -1;
        }
        return (int) jB;
    }

    public final long b(InputStream input, OutputStream output) {
        kotlin.jvm.internal.m0.p(input, "input");
        kotlin.jvm.internal.m0.p(output, "output");
        return a(input, output, 8192);
    }

    public final long a(InputStream input, OutputStream output, int i10) {
        kotlin.jvm.internal.m0.p(input, "input");
        kotlin.jvm.internal.m0.p(output, "output");
        return a(input, output, new byte[i10]);
    }

    public final long a(InputStream input, OutputStream output, byte[] buffer) throws IOException {
        kotlin.jvm.internal.m0.p(input, "input");
        kotlin.jvm.internal.m0.p(output, "output");
        kotlin.jvm.internal.m0.p(buffer, "buffer");
        long j10 = 0;
        while (true) {
            int i10 = input.read(buffer);
            if (i10 == -1) {
                return j10;
            }
            output.write(buffer, 0, i10);
            j10 += (long) i10;
        }
    }

    public final byte[] a(InputStream input) throws IllegalAccessException, IOException, InvocationTargetException {
        kotlin.jvm.internal.m0.p(input, "input");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f40840a.a(input, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            kotlin.jvm.internal.m0.o(byteArray, "toByteArray(...)");
            xr.c.a(byteArrayOutputStream, null);
            return byteArray;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                xr.c.a(byteArrayOutputStream, th2);
                throw th3;
            }
        }
    }
}
