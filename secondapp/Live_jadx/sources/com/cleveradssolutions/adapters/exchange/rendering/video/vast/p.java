package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class p extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f42742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s0 f42743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f42744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x0 f42745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f1 f42746i;

    /* JADX WARN: Code duplicated, block: B:14:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    /* JADX WARN: Code duplicated, block: B:18:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    /* JADX WARN: Code duplicated, block: B:26:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5 A[SYNTHETIC] */
    public p(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        xmlPullParser.require(2, null, "Creative");
        this.f42738a = xmlPullParser.getAttributeValue(null, "id");
        this.f42739b = xmlPullParser.getAttributeValue(null, "sequence");
        this.f42740c = xmlPullParser.getAttributeValue(null, "adID");
        this.f42741d = xmlPullParser.getAttributeValue(null, "apiFramework");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null) {
                    str = "UniversalAdId";
                    if (name.equals("UniversalAdId")) {
                        xmlPullParser.require(2, null, "UniversalAdId");
                        this.f42746i = new f1(xmlPullParser);
                    } else if (name != null) {
                        str = "CreativeExtensions";
                        if (name.equals("CreativeExtensions")) {
                            xmlPullParser.require(2, null, "CreativeExtensions");
                            this.f42742e = new r(xmlPullParser).c();
                        } else if (name != null) {
                            str = "Linear";
                            if (name.equals("Linear")) {
                                xmlPullParser.require(2, null, "Linear");
                                this.f42743f = new s0(xmlPullParser);
                            } else if (name != null) {
                                str = "CompanionAds";
                                if (name.equals("CompanionAds")) {
                                    xmlPullParser.require(2, null, "CompanionAds");
                                    this.f42744g = new m(xmlPullParser).c();
                                } else {
                                    if (name != null) {
                                        str = "NonLinearAds";
                                        if (name.equals("NonLinearAds")) {
                                            xmlPullParser.require(2, null, "NonLinearAds");
                                            this.f42745h = new x0(xmlPullParser);
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "NonLinearAds";
                                    if (name.equals("NonLinearAds")) {
                                        xmlPullParser.require(2, null, "NonLinearAds");
                                        this.f42745h = new x0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "CompanionAds";
                            if (name.equals("CompanionAds")) {
                                xmlPullParser.require(2, null, "CompanionAds");
                                this.f42744g = new m(xmlPullParser).c();
                            } else {
                                if (name != null) {
                                    str = "NonLinearAds";
                                    if (name.equals("NonLinearAds")) {
                                        xmlPullParser.require(2, null, "NonLinearAds");
                                        this.f42745h = new x0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "NonLinearAds";
                                if (name.equals("NonLinearAds")) {
                                    xmlPullParser.require(2, null, "NonLinearAds");
                                    this.f42745h = new x0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "Linear";
                        if (name.equals("Linear")) {
                            xmlPullParser.require(2, null, "Linear");
                            this.f42743f = new s0(xmlPullParser);
                        } else if (name != null) {
                            str = "CompanionAds";
                            if (name.equals("CompanionAds")) {
                                xmlPullParser.require(2, null, "CompanionAds");
                                this.f42744g = new m(xmlPullParser).c();
                            } else {
                                if (name != null) {
                                    str = "NonLinearAds";
                                    if (name.equals("NonLinearAds")) {
                                        xmlPullParser.require(2, null, "NonLinearAds");
                                        this.f42745h = new x0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "NonLinearAds";
                                if (name.equals("NonLinearAds")) {
                                    xmlPullParser.require(2, null, "NonLinearAds");
                                    this.f42745h = new x0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "CompanionAds";
                        if (name.equals("CompanionAds")) {
                            xmlPullParser.require(2, null, "CompanionAds");
                            this.f42744g = new m(xmlPullParser).c();
                        } else {
                            if (name != null) {
                                str = "NonLinearAds";
                                if (name.equals("NonLinearAds")) {
                                    xmlPullParser.require(2, null, "NonLinearAds");
                                    this.f42745h = new x0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "NonLinearAds";
                            if (name.equals("NonLinearAds")) {
                                xmlPullParser.require(2, null, "NonLinearAds");
                                this.f42745h = new x0(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "CreativeExtensions";
                    if (name.equals("CreativeExtensions")) {
                        xmlPullParser.require(2, null, "CreativeExtensions");
                        this.f42742e = new r(xmlPullParser).c();
                    } else if (name != null) {
                        str = "Linear";
                        if (name.equals("Linear")) {
                            xmlPullParser.require(2, null, "Linear");
                            this.f42743f = new s0(xmlPullParser);
                        } else if (name != null) {
                            str = "CompanionAds";
                            if (name.equals("CompanionAds")) {
                                xmlPullParser.require(2, null, "CompanionAds");
                                this.f42744g = new m(xmlPullParser).c();
                            } else {
                                if (name != null) {
                                    str = "NonLinearAds";
                                    if (name.equals("NonLinearAds")) {
                                        xmlPullParser.require(2, null, "NonLinearAds");
                                        this.f42745h = new x0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "NonLinearAds";
                                if (name.equals("NonLinearAds")) {
                                    xmlPullParser.require(2, null, "NonLinearAds");
                                    this.f42745h = new x0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "CompanionAds";
                        if (name.equals("CompanionAds")) {
                            xmlPullParser.require(2, null, "CompanionAds");
                            this.f42744g = new m(xmlPullParser).c();
                        } else {
                            if (name != null) {
                                str = "NonLinearAds";
                                if (name.equals("NonLinearAds")) {
                                    xmlPullParser.require(2, null, "NonLinearAds");
                                    this.f42745h = new x0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "NonLinearAds";
                            if (name.equals("NonLinearAds")) {
                                xmlPullParser.require(2, null, "NonLinearAds");
                                this.f42745h = new x0(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "Linear";
                    if (name.equals("Linear")) {
                        xmlPullParser.require(2, null, "Linear");
                        this.f42743f = new s0(xmlPullParser);
                    } else if (name != null) {
                        str = "CompanionAds";
                        if (name.equals("CompanionAds")) {
                            xmlPullParser.require(2, null, "CompanionAds");
                            this.f42744g = new m(xmlPullParser).c();
                        } else {
                            if (name != null) {
                                str = "NonLinearAds";
                                if (name.equals("NonLinearAds")) {
                                    xmlPullParser.require(2, null, "NonLinearAds");
                                    this.f42745h = new x0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "NonLinearAds";
                            if (name.equals("NonLinearAds")) {
                                xmlPullParser.require(2, null, "NonLinearAds");
                                this.f42745h = new x0(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "CompanionAds";
                    if (name.equals("CompanionAds")) {
                        xmlPullParser.require(2, null, "CompanionAds");
                        this.f42744g = new m(xmlPullParser).c();
                    } else {
                        if (name != null) {
                            str = "NonLinearAds";
                            if (name.equals("NonLinearAds")) {
                                xmlPullParser.require(2, null, "NonLinearAds");
                                this.f42745h = new x0(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else {
                    if (name != null) {
                        str = "NonLinearAds";
                        if (name.equals("NonLinearAds")) {
                            xmlPullParser.require(2, null, "NonLinearAds");
                            this.f42745h = new x0(xmlPullParser);
                            xmlPullParser.require(3, null, str);
                        }
                    }
                    a(xmlPullParser);
                }
            }
        }
    }

    public s0 c() {
        return this.f42743f;
    }

    public x0 d() {
        return this.f42745h;
    }

    public ArrayList e() {
        return this.f42744g;
    }
}
