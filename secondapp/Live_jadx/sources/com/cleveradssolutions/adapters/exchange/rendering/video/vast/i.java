package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class i extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42704b;

    public i(XmlPullParser xmlPullParser) {
        this.f42703a = xmlPullParser.getAttributeValue(null, "authority");
        this.f42704b = b(xmlPullParser);
        com.cleveradssolutions.adapters.exchange.b.h("Category", "Parsed Category: authority=" + this.f42703a + ", value=" + this.f42704b);
    }
}
