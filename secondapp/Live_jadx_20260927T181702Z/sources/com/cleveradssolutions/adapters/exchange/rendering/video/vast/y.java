package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class y extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42811b;

    public y(XmlPullParser xmlPullParser) {
        this.f42810a = xmlPullParser.getAttributeValue(null, "xmlEncoded");
        this.f42811b = b(xmlPullParser);
    }
}
