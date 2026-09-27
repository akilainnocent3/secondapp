package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class n0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l0 f42736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m0 f42737b;

    /* JADX WARN: Code duplicated, block: B:14:0x0034 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x003e A[SYNTHETIC] */
    public n0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        xmlPullParser.require(2, null, "IconClicks");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null) {
                    str = "IconClickThrough";
                    if (name.equals("IconClickThrough")) {
                        xmlPullParser.require(2, null, "IconClickThrough");
                        this.f42736a = new l0(xmlPullParser);
                    } else {
                        if (name != null) {
                            str = "IconClickTracking";
                            if (name.equals("IconClickTracking")) {
                                xmlPullParser.require(2, null, "IconClickTracking");
                                this.f42737b = new m0(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else {
                    if (name != null) {
                        str = "IconClickTracking";
                        if (name.equals("IconClickTracking")) {
                            xmlPullParser.require(2, null, "IconClickTracking");
                            this.f42737b = new m0(xmlPullParser);
                            xmlPullParser.require(3, null, str);
                        }
                    }
                    a(xmlPullParser);
                }
            }
        }
    }
}
