package kw;

import java.text.Normalizer;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class j {
    @oy.l
    public static final String a(@oy.l String string) {
        m0.p(string, "string");
        String strNormalize = Normalizer.normalize(string, Normalizer.Form.NFC);
        m0.o(strNormalize, "normalize(...)");
        return strNormalize;
    }
}
