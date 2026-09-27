package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class z extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42813b;

    public z(XmlPullParser xmlPullParser) {
        this.f42812a = xmlPullParser.getAttributeValue(null, "version");
        this.f42813b = b(xmlPullParser);
    }
}
