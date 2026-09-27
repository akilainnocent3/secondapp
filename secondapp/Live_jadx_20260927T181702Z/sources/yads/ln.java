package yads;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ln f152058a = new ln();

    public static final byte[] a(String str) {
        Object objB;
        try {
            dr.i1.a aVar = dr.i1.f79460c;
            if (str == null) {
                str = "";
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    byte[] bArrP = xr.b.p(gZIPInputStream);
                    xr.c.a(gZIPInputStream, null);
                    xr.c.a(byteArrayInputStream, null);
                    objB = dr.i1.b(bArrP);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        xr.c.a(gZIPInputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    xr.c.a(byteArrayInputStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            dr.i1.a aVar2 = dr.i1.f79460c;
            objB = dr.i1.b(dr.j1.a(th6));
        }
        if (dr.i1.e(objB) != null) {
            objB = new byte[0];
        }
        return (byte[]) objB;
    }

    public static final String b(String str) {
        Object objB;
        try {
            dr.i1.a aVar = dr.i1.f79460c;
            objB = dr.i1.b(new String(a(str), cv.g.f77202b));
        } catch (Throwable th2) {
            dr.i1.a aVar2 = dr.i1.f79460c;
            objB = dr.i1.b(dr.j1.a(th2));
        }
        if (dr.i1.e(objB) != null) {
            objB = "";
        }
        return (String) objB;
    }
}
