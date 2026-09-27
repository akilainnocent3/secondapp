package yads;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class dh3 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f148215a;

    public /* synthetic */ dh3() {
        this(new rp3());
    }

    @Override // yads.qp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final ch3 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f148215a.getClass();
        String str = null;
        xmlPullParser.require(2, null, "VideoClicks");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f148215a.getClass();
            if (xmlPullParser.next() == 3) {
                return new ch3(str, arrayList);
            }
            this.f148215a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (kotlin.jvm.internal.m0.g("ClickThrough", name)) {
                    this.f148215a.getClass();
                    String strA = rp3.a(xmlPullParser);
                    if (strA.length() > 0) {
                        str = strA;
                    }
                } else if (kotlin.jvm.internal.m0.g("ClickTracking", name)) {
                    this.f148215a.getClass();
                    String strA2 = rp3.a(xmlPullParser);
                    if (strA2.length() > 0) {
                        arrayList.add(strA2);
                    }
                } else {
                    this.f148215a.getClass();
                    rp3.b(xmlPullParser);
                }
            }
        }
    }

    public dh3(rp3 rp3Var) {
        this.f148215a = rp3Var;
    }
}
