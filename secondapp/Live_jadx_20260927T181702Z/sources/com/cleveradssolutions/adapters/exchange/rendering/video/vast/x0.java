package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class x0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f42808a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f42809b;

    /* JADX WARN: Code duplicated, block: B:14:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0048 A[SYNTHETIC] */
    public x0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        xmlPullParser.require(2, null, "NonLinearAds");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null) {
                    str = "NonLinear";
                    if (name.equals("NonLinear")) {
                        xmlPullParser.require(2, null, "NonLinear");
                        this.f42808a.add(new w0(xmlPullParser));
                    } else {
                        if (name != null) {
                            str = "TrackingEvents";
                            if (name.equals("TrackingEvents")) {
                                xmlPullParser.require(2, null, "TrackingEvents");
                                this.f42809b = new e1(xmlPullParser).c();
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else {
                    if (name != null) {
                        str = "TrackingEvents";
                        if (name.equals("TrackingEvents")) {
                            xmlPullParser.require(2, null, "TrackingEvents");
                            this.f42809b = new e1(xmlPullParser).c();
                            xmlPullParser.require(3, null, str);
                        }
                    }
                    a(xmlPullParser);
                }
            }
        }
    }

    public ArrayList c() {
        return this.f42809b;
    }
}
