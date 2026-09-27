package yads;

import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jp3 {
    public static boolean a(XmlPullParser xmlPullParser, String str, boolean z10) {
        Boolean boolA6;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            String lowerCase = attributeValue.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m0.o(lowerCase, "toLowerCase(...)");
            if (lowerCase != null && (boolA6 = cv.p0.a6(lowerCase)) != null) {
                return boolA6.booleanValue();
            }
        }
        return z10;
    }
}
