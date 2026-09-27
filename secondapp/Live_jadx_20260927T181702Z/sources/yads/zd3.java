package yads;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f158778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pp3 f158779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pp3 f158780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pl3 f158781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ee3 f158782e;

    public /* synthetic */ zd3(Context context, io2 io2Var) {
        this(new rp3(), new pp3(new h20(context, io2Var), "Creatives", "Creative"), new pp3(new kd3(), "AdVerifications", "Verification"), new pl3(), new ee3());
    }

    public final void a(XmlPullParser xmlPullParser, td3 td3Var, kn knVar) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (kotlin.jvm.internal.m0.g("Impression", name)) {
            this.f158778a.getClass();
            String strA = rp3.a(xmlPullParser);
            LinkedHashMap linkedHashMap = td3Var.f155853n;
            Object arrayList = linkedHashMap.get("impression");
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put("impression", arrayList);
            }
            ((List) arrayList).add(strA);
            return;
        }
        if (kotlin.jvm.internal.m0.g("ViewableImpression", name)) {
            td3Var.f155848i = this.f158781d.a(xmlPullParser);
            return;
        }
        if (kotlin.jvm.internal.m0.g("Error", name)) {
            this.f158778a.getClass();
            String strA2 = rp3.a(xmlPullParser);
            LinkedHashMap linkedHashMap2 = td3Var.f155853n;
            Object arrayList2 = linkedHashMap2.get("error");
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put("error", arrayList2);
            }
            ((List) arrayList2).add(strA2);
            return;
        }
        if (kotlin.jvm.internal.m0.g("Survey", name)) {
            this.f158778a.getClass();
            td3Var.f155846g = rp3.a(xmlPullParser);
            return;
        }
        if (kotlin.jvm.internal.m0.g("Description", name)) {
            this.f158778a.getClass();
            td3Var.f155845f = rp3.a(xmlPullParser);
            return;
        }
        if (kotlin.jvm.internal.m0.g("AdTitle", name)) {
            this.f158778a.getClass();
            td3Var.f155844e = rp3.a(xmlPullParser);
            return;
        }
        if (kotlin.jvm.internal.m0.g("AdSystem", name)) {
            this.f158778a.getClass();
            td3Var.f155843d = rp3.a(xmlPullParser);
            return;
        }
        if (kotlin.jvm.internal.m0.g("Creatives", name)) {
            td3Var.f155851l.addAll(this.f158779b.a(xmlPullParser, knVar));
            return;
        }
        if (kotlin.jvm.internal.m0.g("AdVerifications", name)) {
            td3Var.f155852m.addAll(this.f158780c.a(xmlPullParser, knVar));
            return;
        }
        if (!kotlin.jvm.internal.m0.g("Extensions", name)) {
            this.f158778a.getClass();
            rp3.b(xmlPullParser);
            return;
        }
        ee3 ee3Var = this.f158782e;
        ee3Var.f148670a.getClass();
        xmlPullParser.require(2, null, "Extensions");
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        while (true) {
            ee3Var.f148670a.getClass();
            if (xmlPullParser.next() == 3) {
                td3Var.f155854o = new de3(fr.r0.a6(arrayList4), fr.r0.a6(arrayList3));
                return;
            }
            ee3Var.f148670a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if (kotlin.jvm.internal.m0.g("Extension", xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(null, "type");
                    if (ee3.f148669e.contains(attributeValue)) {
                        hq0 hq0VarA = ee3Var.f148671b.a(xmlPullParser);
                        if (hq0VarA != null) {
                            arrayList4.add(hq0VarA);
                        }
                    } else if (kotlin.jvm.internal.m0.g(ee3.f148668d, attributeValue)) {
                        arrayList3.addAll(ee3Var.f148672c.a(xmlPullParser, knVar));
                    } else {
                        ee3Var.f148670a.getClass();
                        rp3.b(xmlPullParser);
                    }
                } else {
                    ee3Var.f148670a.getClass();
                    rp3.b(xmlPullParser);
                }
            }
        }
    }

    public zd3(rp3 rp3Var, pp3 pp3Var, pp3 pp3Var2, pl3 pl3Var, ee3 ee3Var) {
        this.f158778a = rp3Var;
        this.f158779b = pp3Var;
        this.f158780c = pp3Var2;
        this.f158781d = pl3Var;
        this.f158782e = ee3Var;
    }
}
