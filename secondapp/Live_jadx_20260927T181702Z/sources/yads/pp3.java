package yads;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pp3 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qp3 f154064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rp3 f154067d;

    public /* synthetic */ pp3(qp3 qp3Var, String str, String str2) {
        this(qp3Var, str, str2, new rp3());
    }

    @Override // yads.qp3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ArrayList a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        rp3 rp3Var = this.f154067d;
        String str = this.f154065b;
        rp3Var.getClass();
        xmlPullParser.require(2, null, str);
        while (true) {
            this.f154067d.getClass();
            if (xmlPullParser.next() == 3) {
                return arrayList;
            }
            this.f154067d.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if (kotlin.jvm.internal.m0.g(this.f154066c, xmlPullParser.getName())) {
                    Object objA = this.f154064a.a(xmlPullParser, knVar);
                    if (objA != null) {
                        arrayList.add(objA);
                    }
                } else {
                    this.f154067d.getClass();
                    rp3.b(xmlPullParser);
                }
            }
        }
    }

    public pp3(qp3 qp3Var, String str, String str2, rp3 rp3Var) {
        this.f154064a = qp3Var;
        this.f154065b = str;
        this.f154066c = str2;
        this.f154067d = rp3Var;
    }
}
