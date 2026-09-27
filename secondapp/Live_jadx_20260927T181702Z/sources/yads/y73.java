package yads;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class y73 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f158174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i63 f158175b;

    public /* synthetic */ y73() {
        rp3 rp3Var = new rp3();
        g63[] g63VarArrValues = g63.values();
        this(rp3Var, new i63(new HashSet(fr.h0.Q(Arrays.copyOf(g63VarArrValues, g63VarArrValues.length)))));
    }

    @Override // yads.qp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final x73 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f158174a.getClass();
        xmlPullParser.require(2, null, "Tracking");
        String attributeValue = xmlPullParser.getAttributeValue(null, "event");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "offset");
        this.f158174a.getClass();
        String strA = rp3.a(xmlPullParser);
        if (attributeValue == null || attributeValue.length() == 0 || strA.length() <= 0) {
            return null;
        }
        return new x73(attributeValue, strA, attributeValue2 != null ? this.f158175b.a(attributeValue2) : null);
    }

    public y73(rp3 rp3Var, i63 i63Var) {
        this.f158174a = rp3Var;
        this.f158175b = i63Var;
    }
}
