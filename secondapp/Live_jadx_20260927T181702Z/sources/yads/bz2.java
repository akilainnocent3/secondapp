package yads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bz2 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f147458a;

    public bz2(rp3 rp3Var) {
        this.f147458a = rp3Var;
    }

    @Override // yads.qp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final hq0 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f147458a.getClass();
        xmlPullParser.require(2, null, "Extension");
        String attributeValue = xmlPullParser.getAttributeValue(null, "type");
        this.f147458a.getClass();
        String strA = rp3.a(xmlPullParser);
        if (attributeValue == null || attributeValue.length() == 0 || strA.length() <= 0) {
            return null;
        }
        return new hq0(attributeValue, strA);
    }
}
