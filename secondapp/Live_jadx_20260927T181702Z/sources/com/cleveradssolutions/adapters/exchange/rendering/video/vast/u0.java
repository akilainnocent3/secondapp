package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class u0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f42784a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f42785b = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:14:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x004f A[SYNTHETIC] */
    public u0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        ArrayList arrayList;
        Object v0Var;
        xmlPullParser.require(2, null, "MediaFiles");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null) {
                    str = "MediaFile";
                    if (name.equals("MediaFile")) {
                        xmlPullParser.require(2, null, "MediaFile");
                        arrayList = this.f42784a;
                        v0Var = new t0(xmlPullParser);
                    } else {
                        if (name != null) {
                            str = "Mezzanine";
                            if (name.equals("Mezzanine")) {
                                xmlPullParser.require(2, null, "Mezzanine");
                                arrayList = this.f42785b;
                                v0Var = new v0(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    arrayList.add(v0Var);
                    xmlPullParser.require(3, null, str);
                } else {
                    if (name != null) {
                        str = "Mezzanine";
                        if (name.equals("Mezzanine")) {
                            xmlPullParser.require(2, null, "Mezzanine");
                            arrayList = this.f42785b;
                            v0Var = new v0(xmlPullParser);
                            arrayList.add(v0Var);
                            xmlPullParser.require(3, null, str);
                        }
                    }
                    a(xmlPullParser);
                }
            }
        }
    }

    public ArrayList c() {
        return this.f42784a;
    }
}
