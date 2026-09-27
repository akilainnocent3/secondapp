package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class h0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f42702a = new ArrayList();

    public h0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "Extensions");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals("Extension")) {
                    a(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, "Extension");
                    this.f42702a.add(new x(xmlPullParser));
                    xmlPullParser.require(3, null, "Extension");
                }
            }
        }
    }

    public ArrayList c() {
        return this.f42702a;
    }
}
