package cv;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@cs.j(name = "CharsetsKt")
public final class h {
    @ur.f
    public static final Charset a(String charsetName) {
        kotlin.jvm.internal.m0.p(charsetName, "charsetName");
        Charset charsetForName = Charset.forName(charsetName);
        kotlin.jvm.internal.m0.o(charsetForName, "forName(...)");
        return charsetForName;
    }
}
