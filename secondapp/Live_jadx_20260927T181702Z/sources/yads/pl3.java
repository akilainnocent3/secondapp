package yads;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pl3 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f153989a;

    public /* synthetic */ pl3() {
        this(new rp3());
    }

    @Override // yads.qp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final ol3 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f153989a.getClass();
        xmlPullParser.require(2, null, "ViewableImpression");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f153989a.getClass();
            if (xmlPullParser.next() == 3) {
                return new ol3(arrayList);
            }
            this.f153989a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if (kotlin.jvm.internal.m0.g("Viewable", xmlPullParser.getName())) {
                    this.f153989a.getClass();
                    arrayList.add(rp3.a(xmlPullParser));
                } else {
                    this.f153989a.getClass();
                    rp3.b(xmlPullParser);
                }
            }
        }
    }

    public pl3(rp3 rp3Var) {
        this.f153989a = rp3Var;
    }
}
