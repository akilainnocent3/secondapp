package com.vungle.ads.internal.util;

import android.util.Base64;
import cv.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class InputOutputUtils {

    @l
    public static final InputOutputUtils INSTANCE = new InputOutputUtils();

    private InputOutputUtils() {
    }

    @l
    public final String convertForSending(@l String stringToConvert) throws IllegalAccessException, IOException, InvocationTargetException {
        m0.p(stringToConvert, "stringToConvert");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(stringToConvert.length());
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                byte[] bytes = stringToConvert.getBytes(g.f77202b);
                m0.o(bytes, "this as java.lang.String).getBytes(charset)");
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.close();
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                m0.o(strEncodeToString, "encodeToString(compressed, Base64.NO_WRAP)");
                xr.c.a(gZIPOutputStream, null);
                xr.c.a(byteArrayOutputStream, null);
                return strEncodeToString;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    xr.c.a(gZIPOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                xr.c.a(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }
}
