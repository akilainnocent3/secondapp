package com.cleveradssolutions.internal.http;

import dr.w2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final byte[] a(byte[] bArr) throws IllegalAccessException, IOException, InvocationTargetException {
        m0.p(bArr, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            w2 w2Var = w2.f79517a;
            xr.c.a(gZIPOutputStream, null);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            m0.o(byteArray, "toByteArray(...)");
            return byteArray;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                xr.c.a(gZIPOutputStream, th2);
                throw th3;
            }
        }
    }
}
