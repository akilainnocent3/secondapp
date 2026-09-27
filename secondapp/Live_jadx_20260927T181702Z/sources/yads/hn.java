package yads;

import android.util.Base64;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hn {
    public static String a(String str) {
        Charset charset = cv.g.f77202b;
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.m0.o(bytes, "getBytes(...)");
        try {
            return new String(Base64.decode(bytes, 0), charset);
        } catch (Exception unused) {
            String str2 = new String(bytes, cv.g.f77202b);
            boolean z10 = ad1.f146762a;
            return str2;
        }
    }

    public static String b(String str) {
        Charset charset = cv.g.f77202b;
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.m0.o(bytes, "getBytes(...)");
        try {
            return new String(Base64.decode(bytes, 0), charset);
        } catch (Exception unused) {
            boolean z10 = ad1.f146762a;
            return null;
        }
    }
}
