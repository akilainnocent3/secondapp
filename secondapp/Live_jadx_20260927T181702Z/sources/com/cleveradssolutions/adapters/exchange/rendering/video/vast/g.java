package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class g extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f42686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f42687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f42688c;

    public g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        xmlPullParser.require(2, null, "ViewableImpression");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                String str = "Viewable";
                if ("Viewable".equals(name)) {
                    if (this.f42686a == null) {
                        this.f42686a = new ArrayList();
                    }
                    arrayList = this.f42686a;
                } else {
                    str = "NotViewable";
                    if ("NotViewable".equals(name)) {
                        if (this.f42687b == null) {
                            this.f42687b = new ArrayList();
                        }
                        arrayList = this.f42687b;
                    } else {
                        str = "ViewUndetermined";
                        if ("ViewUndetermined".equals(name)) {
                            if (this.f42688c == null) {
                                this.f42688c = new ArrayList();
                            }
                            arrayList = this.f42688c;
                        } else {
                            a(xmlPullParser);
                        }
                    }
                }
                arrayList.add(b(xmlPullParser));
                xmlPullParser.require(3, null, str);
            }
        }
        com.cleveradssolutions.adapters.exchange.b.h("ViewableImpression", "Parsed ViewableImpression: viewable=" + this.f42686a + ", notViewable=" + this.f42687b + ", undetermined=" + this.f42688c);
    }
}
