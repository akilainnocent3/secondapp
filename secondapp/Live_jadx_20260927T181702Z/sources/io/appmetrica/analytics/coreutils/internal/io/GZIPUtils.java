package io.appmetrica.analytics.coreutils.internal.io;

import cs.o;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import oy.l;
import oy.m;
import xr.b;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class GZIPUtils {

    @l
    public static final GZIPUtils INSTANCE = new GZIPUtils();

    private GZIPUtils() {
    }

    @o
    @m
    public static final byte[] gzipBytes(@m byte[] bArr) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (bArr == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    CloseableUtilsKt.closeSafely(gZIPOutputStream);
                    CloseableUtilsKt.closeSafely(byteArrayOutputStream2);
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    CloseableUtilsKt.closeSafely(gZIPOutputStream);
                    CloseableUtilsKt.closeSafely(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                gZIPOutputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            gZIPOutputStream = null;
        }
    }

    @o
    @m
    public static final byte[] unGzipBytes(@m byte[] bArr) throws Throwable {
        Throwable th2;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream = null;
        if (bArr == null) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream2);
                try {
                    byte[] bArrP = b.p(gZIPInputStream);
                    CloseableUtilsKt.closeSafely(gZIPInputStream);
                    CloseableUtilsKt.closeSafely(byteArrayInputStream2);
                    return bArrP;
                } catch (Throwable th3) {
                    th2 = th3;
                    byteArrayInputStream = byteArrayInputStream2;
                    CloseableUtilsKt.closeSafely(gZIPInputStream);
                    CloseableUtilsKt.closeSafely(byteArrayInputStream);
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                gZIPInputStream = null;
            }
        } catch (Throwable th5) {
            th2 = th5;
            gZIPInputStream = null;
        }
    }
}
