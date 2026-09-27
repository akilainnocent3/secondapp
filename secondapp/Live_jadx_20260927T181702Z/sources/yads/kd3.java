package yads;

import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kd3 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f151508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final be1 f151509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jd3 f151510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z73 f151511d;

    public /* synthetic */ kd3() {
        this(new rp3(), new be1(), new jd3(), new z73());
    }

    @Override // yads.qp3
    public final Object a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, IOException {
        this.f151508a.getClass();
        xmlPullParser.require(2, null, "Verification");
        this.f151508a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "vendor");
        HashMap map = new HashMap();
        ae1 ae1Var = null;
        String strA = null;
        while (true) {
            this.f151508a.getClass();
            if (xmlPullParser.next() == 3) {
                break;
            }
            this.f151508a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (kotlin.jvm.internal.m0.g("JavaScriptResource", name)) {
                    be1 be1Var = this.f151509b;
                    be1Var.f147153a.getClass();
                    xmlPullParser.require(2, null, "JavaScriptResource");
                    be1Var.f147153a.getClass();
                    String attributeValue2 = xmlPullParser.getAttributeValue(null, "apiFramework");
                    be1Var.f147153a.getClass();
                    String attributeValue3 = xmlPullParser.getAttributeValue(null, "browserOptional");
                    Boolean boolValueOf = attributeValue3 != null ? Boolean.valueOf(Boolean.parseBoolean(attributeValue3)) : null;
                    be1Var.f147153a.getClass();
                    String strA2 = rp3.a(xmlPullParser);
                    ae1Var = (attributeValue2 == null || attributeValue2.length() == 0 || boolValueOf == null || strA2.length() <= 0) ? null : new ae1(attributeValue2, strA2, boolValueOf.booleanValue());
                } else if (kotlin.jvm.internal.m0.g("VerificationParameters", name)) {
                    jd3 jd3Var = this.f151510c;
                    jd3Var.f151048a.getClass();
                    xmlPullParser.require(2, null, "VerificationParameters");
                    jd3Var.f151048a.getClass();
                    strA = rp3.a(xmlPullParser);
                    if (strA.length() == 0) {
                        strA = null;
                    }
                } else if (kotlin.jvm.internal.m0.g("TrackingEvents", name)) {
                    map = this.f151511d.a(xmlPullParser);
                } else {
                    this.f151508a.getClass();
                    rp3.b(xmlPullParser);
                }
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return new gd3(attributeValue, ae1Var, strA, map);
    }

    public kd3(rp3 rp3Var, be1 be1Var, jd3 jd3Var, z73 z73Var) {
        this.f151508a = rp3Var;
        this.f151509b = be1Var;
        this.f151510c = jd3Var;
        this.f151511d = z73Var;
    }
}
