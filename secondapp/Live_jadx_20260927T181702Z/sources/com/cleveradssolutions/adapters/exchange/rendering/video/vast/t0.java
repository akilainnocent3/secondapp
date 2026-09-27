package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import com.ironsource.C4497s;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class t0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f42775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f42776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f42777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f42778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f42779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f42780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f42781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f42782m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f42783n;

    public t0(XmlPullParser xmlPullParser) {
        this.f42770a = xmlPullParser.getAttributeValue(null, "id");
        this.f42772c = xmlPullParser.getAttributeValue(null, C4497s.f63496g);
        this.f42773d = xmlPullParser.getAttributeValue(null, "type");
        this.f42774e = xmlPullParser.getAttributeValue(null, "bitrate");
        this.f42775f = xmlPullParser.getAttributeValue(null, "minBitrate");
        this.f42776g = xmlPullParser.getAttributeValue(null, "maxBitrate");
        this.f42777h = xmlPullParser.getAttributeValue(null, "width");
        this.f42778i = xmlPullParser.getAttributeValue(null, "height");
        this.f42779j = xmlPullParser.getAttributeValue(null, "xPosition");
        this.f42780k = xmlPullParser.getAttributeValue(null, "yPosition");
        this.f42781l = xmlPullParser.getAttributeValue(null, "duration");
        this.f42782m = xmlPullParser.getAttributeValue(null, "offset");
        this.f42783n = xmlPullParser.getAttributeValue(null, "apiFramework");
        this.f42771b = b(xmlPullParser);
    }

    public String c() {
        return this.f42773d;
    }

    public String d() {
        return this.f42771b;
    }

    public String e() {
        return this.f42777h;
    }

    public String f() {
        return this.f42778i;
    }
}
