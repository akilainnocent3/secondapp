package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f42642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f42643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42644c;

    /* JADX WARN: Code duplicated, block: B:14:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0046 A[SYNTHETIC] */
    public a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        xmlPullParser.require(2, null, "VAST");
        this.f42644c = xmlPullParser.getAttributeValue(null, "version");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null) {
                    str = "Error";
                    if (name.equals("Error")) {
                        xmlPullParser.require(2, null, "Error");
                        this.f42642a = new w(xmlPullParser);
                    } else {
                        if (name != null) {
                            str = "Ad";
                            if (name.equals("Ad")) {
                                if (this.f42643b == null) {
                                    this.f42643b = new ArrayList();
                                }
                                xmlPullParser.require(2, null, "Ad");
                                this.f42643b.add(new g0(xmlPullParser));
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else {
                    if (name != null) {
                        str = "Ad";
                        if (name.equals("Ad")) {
                            if (this.f42643b == null) {
                                this.f42643b = new ArrayList();
                            }
                            xmlPullParser.require(2, null, "Ad");
                            this.f42643b.add(new g0(xmlPullParser));
                            xmlPullParser.require(3, null, str);
                        }
                    }
                    a(xmlPullParser);
                }
            }
        }
    }

    public ArrayList c() {
        return this.f42643b;
    }
}
