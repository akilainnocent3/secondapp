package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class x extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f42807b;

    public x(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f42806a = xmlPullParser.getAttributeValue(null, "type");
        xmlPullParser.require(2, null, "Extension");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals("AdVerifications")) {
                    a(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, "AdVerifications");
                    this.f42807b = new b0(xmlPullParser);
                    xmlPullParser.require(3, null, "AdVerifications");
                }
            }
        }
    }

    public b0 c() {
        return this.f42807b;
    }
}
