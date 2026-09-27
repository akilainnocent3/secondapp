package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42675d;

    /* JADX WARN: Code duplicated, block: B:14:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0048 A[SYNTHETIC] */
    public e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        this.f42672a = xmlPullParser.getAttributeValue(null, "vendor");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null) {
                    str = "JavaScriptResource";
                    if (name.equals("JavaScriptResource")) {
                        xmlPullParser.require(2, null, "JavaScriptResource");
                        this.f42675d = xmlPullParser.getAttributeValue(null, "apiFramework");
                        this.f42673b = b(xmlPullParser);
                    } else {
                        if (name != null) {
                            str = "VerificationParameters";
                            if (name.equals("VerificationParameters")) {
                                xmlPullParser.require(2, null, "VerificationParameters");
                                this.f42674c = b(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else {
                    if (name != null) {
                        str = "VerificationParameters";
                        if (name.equals("VerificationParameters")) {
                            xmlPullParser.require(2, null, "VerificationParameters");
                            this.f42674c = b(xmlPullParser);
                            xmlPullParser.require(3, null, str);
                        }
                    }
                    a(xmlPullParser);
                }
            }
        }
    }

    public String c() {
        return this.f42672a;
    }

    public String d() {
        return this.f42674c;
    }

    public String e() {
        return this.f42673b;
    }
}
