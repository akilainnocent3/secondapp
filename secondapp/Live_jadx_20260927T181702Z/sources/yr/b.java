package yr;

import dr.l1;
import java.nio.charset.Charset;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class b {
    @l1(version = "1.8")
    @ur.f
    public static final byte[] a(a aVar, CharSequence source, int i10, int i11) {
        m0.p(aVar, "<this>");
        m0.p(source, "source");
        if (!(source instanceof String)) {
            return aVar.f(source, i10, i11);
        }
        String str = (String) source;
        aVar.i(str.length(), i10, i11);
        String strSubstring = str.substring(i10, i11);
        m0.o(strSubstring, "substring(...)");
        Charset charset = cv.g.f77207g;
        m0.n(strSubstring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = strSubstring.getBytes(charset);
        m0.o(bytes, "getBytes(...)");
        return bytes;
    }

    @l1(version = "1.8")
    @ur.f
    public static final int b(a aVar, byte[] source, byte[] destination, int i10, int i11, int i12) {
        m0.p(aVar, "<this>");
        m0.p(source, "source");
        m0.p(destination, "destination");
        return aVar.x(source, destination, i10, i11, i12);
    }

    @l1(version = "1.8")
    @ur.f
    public static final byte[] c(a aVar, byte[] source, int i10, int i11) {
        m0.p(aVar, "<this>");
        m0.p(source, "source");
        return aVar.D(source, i10, i11);
    }

    @l1(version = "1.8")
    @ur.f
    public static final String d(a aVar, byte[] source, int i10, int i11) {
        m0.p(aVar, "<this>");
        m0.p(source, "source");
        return new String(aVar.D(source, i10, i11), cv.g.f77207g);
    }
}
