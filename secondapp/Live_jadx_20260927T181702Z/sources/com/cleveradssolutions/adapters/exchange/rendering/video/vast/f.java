package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class f extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f42679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f42680b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f42681c = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Code duplicated, block: B:19:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x004c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0064 A[SYNTHETIC] */
    public f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        ArrayList arrayList;
        Object tVar;
        xmlPullParser.require(2, null, "VideoClicks");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null) {
                    str = "ClickThrough";
                    if (name.equals("ClickThrough")) {
                        xmlPullParser.require(2, null, "ClickThrough");
                        this.f42679a = new j(xmlPullParser);
                    } else if (name != null) {
                        str = "ClickTracking";
                        if (name.equals("ClickTracking")) {
                            xmlPullParser.require(2, null, "ClickTracking");
                            arrayList = this.f42680b;
                            tVar = new k(xmlPullParser);
                        } else {
                            if (name != null) {
                                str = "CustomClick";
                                if (name.equals("CustomClick")) {
                                    xmlPullParser.require(2, null, "CustomClick");
                                    arrayList = this.f42681c;
                                    tVar = new t(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                        arrayList.add(tVar);
                    } else {
                        if (name != null) {
                            str = "CustomClick";
                            if (name.equals("CustomClick")) {
                                xmlPullParser.require(2, null, "CustomClick");
                                arrayList = this.f42681c;
                                tVar = new t(xmlPullParser);
                                arrayList.add(tVar);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "ClickTracking";
                    if (name.equals("ClickTracking")) {
                        xmlPullParser.require(2, null, "ClickTracking");
                        arrayList = this.f42680b;
                        tVar = new k(xmlPullParser);
                    } else {
                        if (name != null) {
                            str = "CustomClick";
                            if (name.equals("CustomClick")) {
                                xmlPullParser.require(2, null, "CustomClick");
                                arrayList = this.f42681c;
                                tVar = new t(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    arrayList.add(tVar);
                    xmlPullParser.require(3, null, str);
                } else {
                    if (name != null) {
                        str = "CustomClick";
                        if (name.equals("CustomClick")) {
                            xmlPullParser.require(2, null, "CustomClick");
                            arrayList = this.f42681c;
                            tVar = new t(xmlPullParser);
                            arrayList.add(tVar);
                            xmlPullParser.require(3, null, str);
                        }
                    }
                    a(xmlPullParser);
                }
            }
        }
    }

    public ArrayList c() {
        return this.f42680b;
    }

    public j d() {
        return this.f42679a;
    }
}
