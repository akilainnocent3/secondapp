package yads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class z73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f158648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y73 f158649b;

    public /* synthetic */ z73() {
        this(new rp3(), new y73());
    }

    public final HashMap a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f158648a.getClass();
        xmlPullParser.require(2, null, "TrackingEvents");
        HashMap map = new HashMap();
        while (true) {
            this.f158648a.getClass();
            if (xmlPullParser.next() == 3) {
                return map;
            }
            this.f158648a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if (kotlin.jvm.internal.m0.g("Tracking", xmlPullParser.getName())) {
                    x73 x73VarA = this.f158649b.a(xmlPullParser);
                    if (x73VarA != null) {
                        String str = x73VarA.f157706a;
                        String str2 = x73VarA.f157707b;
                        if (!map.containsKey(str)) {
                            map.put(str, new ArrayList());
                        }
                        List list = (List) map.get(str);
                        if (list != null) {
                            list.add(str2);
                        }
                    }
                } else {
                    this.f158648a.getClass();
                    rp3.b(xmlPullParser);
                }
            }
        }
    }

    public z73(rp3 rp3Var, y73 y73Var) {
        this.f158648a = rp3Var;
        this.f158649b = y73Var;
    }
}
