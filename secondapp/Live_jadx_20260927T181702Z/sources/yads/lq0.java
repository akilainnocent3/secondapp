package yads;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class lq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f152082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bz2 f152083b;

    public /* synthetic */ lq0(rp3 rp3Var) {
        this(rp3Var, new bz2(rp3Var));
    }

    public final ArrayList a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f152082a.getClass();
        xmlPullParser.require(2, null, "Extensions");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f152082a.getClass();
            if (xmlPullParser.next() == 3) {
                return arrayList;
            }
            this.f152082a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if (kotlin.jvm.internal.m0.g("Extension", xmlPullParser.getName())) {
                    hq0 hq0VarA = this.f152083b.a(xmlPullParser);
                    if (hq0VarA != null) {
                        arrayList.add(hq0VarA);
                    }
                } else {
                    this.f152082a.getClass();
                    rp3.b(xmlPullParser);
                }
            }
        }
    }

    public lq0(rp3 rp3Var, bz2 bz2Var) {
        this.f152082a = rp3Var;
        this.f152083b = bz2Var;
    }
}
