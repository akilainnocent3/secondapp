package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import com.ironsource.C4497s;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class v0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42790e;

    public v0(XmlPullParser xmlPullParser) {
        this.f42786a = xmlPullParser.getAttributeValue(null, C4497s.f63496g);
        this.f42787b = xmlPullParser.getAttributeValue(null, "type");
        this.f42788c = xmlPullParser.getAttributeValue(null, "width");
        this.f42789d = xmlPullParser.getAttributeValue(null, "height");
        this.f42790e = b(xmlPullParser);
    }
}
