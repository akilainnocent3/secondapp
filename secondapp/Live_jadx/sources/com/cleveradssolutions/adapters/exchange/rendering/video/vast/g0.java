package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class g0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f42689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f42690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42692d;

    /* JADX WARN: Code duplicated, block: B:14:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Code duplicated, block: B:22:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x004e A[SYNTHETIC] */
    public g0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        xmlPullParser.require(2, null, "Ad");
        this.f42691c = xmlPullParser.getAttributeValue(null, "id");
        this.f42692d = xmlPullParser.getAttributeValue(null, "sequence");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null) {
                    str = "InLine";
                    if (name.equals("InLine")) {
                        xmlPullParser.require(2, null, "InLine");
                        this.f42689a = new r0(xmlPullParser);
                    } else {
                        if (name != null) {
                            str = "Wrapper";
                            if (name.equals("Wrapper")) {
                                xmlPullParser.require(2, null, "Wrapper");
                                this.f42690b = new h(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else {
                    if (name != null) {
                        str = "Wrapper";
                        if (name.equals("Wrapper")) {
                            xmlPullParser.require(2, null, "Wrapper");
                            this.f42690b = new h(xmlPullParser);
                            xmlPullParser.require(3, null, str);
                        }
                    }
                    a(xmlPullParser);
                }
            }
        }
    }

    public r0 c() {
        return this.f42689a;
    }

    public h d() {
        return this.f42690b;
    }

    public String e() {
        return this.f42691c;
    }
}
