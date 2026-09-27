package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class a1 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42647c;

    public a1(XmlPullParser xmlPullParser) {
        this.f42645a = xmlPullParser.getAttributeValue(null, "model");
        this.f42646b = xmlPullParser.getAttributeValue(null, "currency");
        this.f42647c = b(xmlPullParser);
    }
}
