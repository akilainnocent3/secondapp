package yads;

import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jn {
    public static String a(String str) {
        byte[] bytes = str.getBytes(cv.g.f77202b);
        kotlin.jvm.internal.m0.o(bytes, "getBytes(...)");
        return a(bytes);
    }

    public static String a(byte[] bArr) {
        Object objB;
        try {
            dr.i1.a aVar = dr.i1.f79460c;
            objB = dr.i1.b(Base64.encodeToString(bArr, 2));
        } catch (Throwable th2) {
            dr.i1.a aVar2 = dr.i1.f79460c;
            objB = dr.i1.b(dr.j1.a(th2));
        }
        if (dr.i1.e(objB) != null) {
            boolean z10 = ad1.f146762a;
        }
        if (dr.i1.i(objB)) {
            objB = null;
        }
        return (String) objB;
    }
}
