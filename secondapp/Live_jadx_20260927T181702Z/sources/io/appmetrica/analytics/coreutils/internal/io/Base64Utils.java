package io.appmetrica.analytics.coreutils.internal.io;

import android.util.Base64;
import cs.o;
import cv.g;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import oy.l;
import oy.m;
import xr.b;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Base64Utils {

    @l
    public static final Base64Utils INSTANCE = new Base64Utils();
    public static final int IO_BUFFER_SIZE = 4096;

    private Base64Utils() {
    }

    @o
    @m
    public static final String compressBase64(@m byte[] bArr) {
        try {
            return Base64.encodeToString(GZIPUtils.gzipBytes(bArr), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    @o
    @m
    public static final String compressBase64String(@m String str) {
        byte[] bytes;
        if (str != null) {
            try {
                bytes = str.getBytes(g.f77202b);
            } catch (Throwable unused) {
                return null;
            }
        } else {
            bytes = null;
        }
        return compressBase64(bytes);
    }

    @l
    @o
    public static final byte[] decompressBase64GzipAsBytes(@m String str) {
        GZIPInputStream gZIPInputStream;
        byte[] bArrP;
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(Base64.decode(str, 0));
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream2);
                try {
                    bArrP = b.p(gZIPInputStream);
                } catch (Throwable unused) {
                    byteArrayInputStream = byteArrayInputStream2;
                    try {
                        bArrP = new byte[0];
                        byteArrayInputStream2 = byteArrayInputStream;
                    } finally {
                        CloseableUtilsKt.closeSafely(gZIPInputStream);
                        CloseableUtilsKt.closeSafely(byteArrayInputStream);
                    }
                }
            } catch (Throwable unused2) {
                gZIPInputStream = null;
            }
        } catch (Throwable unused3) {
            gZIPInputStream = null;
        }
        return bArrP;
    }

    @o
    @m
    public static final String decompressBase64GzipAsString(@m String str) {
        try {
            return new String(decompressBase64GzipAsBytes(str), g.f77202b);
        } catch (Throwable unused) {
            return null;
        }
    }
}
