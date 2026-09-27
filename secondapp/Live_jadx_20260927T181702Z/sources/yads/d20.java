package yads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class d20 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qp3 f148006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rp3 f148007b;

    public d20(jr0 jr0Var, rp3 rp3Var) {
        this.f148006a = jr0Var;
        this.f148007b = rp3Var;
    }

    @Override // yads.qp3
    public final Object a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, IOException {
        this.f148007b.getClass();
        Object objA = null;
        xmlPullParser.require(2, null, "CreativeExtension");
        while (true) {
            this.f148007b.getClass();
            if (xmlPullParser.next() == 3) {
                return objA;
            }
            this.f148007b.getClass();
            if (xmlPullParser.getEventType() == 2) {
                objA = this.f148006a.a(xmlPullParser, knVar);
            }
        }
    }
}
