package yads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jr0 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f151221a;

    public jr0(rp3 rp3Var) {
        this.f151221a = rp3Var;
    }

    @Override // yads.qp3
    public final Object a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, IOException {
        this.f151221a.getClass();
        xmlPullParser.require(2, null, "FalseClick");
        this.f151221a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "interval");
        Long lR1 = attributeValue != null ? cv.j0.r1(attributeValue) : null;
        this.f151221a.getClass();
        String strA = rp3.a(xmlPullParser);
        if (strA.length() <= 0 || lR1 == null) {
            return null;
        }
        return new dr0(strA, lR1.longValue());
    }
}
