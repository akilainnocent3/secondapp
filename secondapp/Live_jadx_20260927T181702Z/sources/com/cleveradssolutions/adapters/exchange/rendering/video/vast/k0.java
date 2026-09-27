package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class k0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f42710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f42711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f42712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b1 f42713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j0 f42714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i0 f42715k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n0 f42716l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o0 f42717m;

    /* JADX WARN: Code duplicated, block: B:14:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0076  */
    /* JADX WARN: Code duplicated, block: B:18:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x008b  */
    /* JADX WARN: Code duplicated, block: B:22:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd A[SYNTHETIC] */
    public k0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        xmlPullParser.require(2, null, "Icon");
        this.f42705a = xmlPullParser.getAttributeValue(null, "program");
        this.f42706b = xmlPullParser.getAttributeValue(null, "width");
        this.f42707c = xmlPullParser.getAttributeValue(null, "height");
        this.f42708d = xmlPullParser.getAttributeValue(null, "xPosition");
        this.f42709e = xmlPullParser.getAttributeValue(null, "yPosition");
        this.f42710f = xmlPullParser.getAttributeValue(null, "duration");
        this.f42711g = xmlPullParser.getAttributeValue(null, "offset");
        this.f42712h = xmlPullParser.getAttributeValue(null, "apiFramework");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null) {
                    str = "StaticResource";
                    if (name.equals("StaticResource")) {
                        xmlPullParser.require(2, null, "StaticResource");
                        this.f42713i = new b1(xmlPullParser);
                    } else if (name != null) {
                        str = "IFrameResource";
                        if (name.equals("IFrameResource")) {
                            xmlPullParser.require(2, null, "IFrameResource");
                            this.f42714j = new j0(xmlPullParser);
                        } else if (name != null) {
                            str = "HTMLResource";
                            if (name.equals("HTMLResource")) {
                                xmlPullParser.require(2, null, "HTMLResource");
                                this.f42715k = new i0(xmlPullParser);
                            } else if (name != null) {
                                str = "IconClicks";
                                if (name.equals("IconClicks")) {
                                    xmlPullParser.require(2, null, "IconClicks");
                                    this.f42716l = new n0(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "IconViewTracking";
                                        if (name.equals("IconViewTracking")) {
                                            xmlPullParser.require(2, null, "IconViewTracking");
                                            this.f42717m = new o0(xmlPullParser);
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "IconViewTracking";
                                    if (name.equals("IconViewTracking")) {
                                        xmlPullParser.require(2, null, "IconViewTracking");
                                        this.f42717m = new o0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "IconClicks";
                            if (name.equals("IconClicks")) {
                                xmlPullParser.require(2, null, "IconClicks");
                                this.f42716l = new n0(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "IconViewTracking";
                                    if (name.equals("IconViewTracking")) {
                                        xmlPullParser.require(2, null, "IconViewTracking");
                                        this.f42717m = new o0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "IconViewTracking";
                                if (name.equals("IconViewTracking")) {
                                    xmlPullParser.require(2, null, "IconViewTracking");
                                    this.f42717m = new o0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "HTMLResource";
                        if (name.equals("HTMLResource")) {
                            xmlPullParser.require(2, null, "HTMLResource");
                            this.f42715k = new i0(xmlPullParser);
                        } else if (name != null) {
                            str = "IconClicks";
                            if (name.equals("IconClicks")) {
                                xmlPullParser.require(2, null, "IconClicks");
                                this.f42716l = new n0(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "IconViewTracking";
                                    if (name.equals("IconViewTracking")) {
                                        xmlPullParser.require(2, null, "IconViewTracking");
                                        this.f42717m = new o0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "IconViewTracking";
                                if (name.equals("IconViewTracking")) {
                                    xmlPullParser.require(2, null, "IconViewTracking");
                                    this.f42717m = new o0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "IconClicks";
                        if (name.equals("IconClicks")) {
                            xmlPullParser.require(2, null, "IconClicks");
                            this.f42716l = new n0(xmlPullParser);
                        } else {
                            if (name != null) {
                                str = "IconViewTracking";
                                if (name.equals("IconViewTracking")) {
                                    xmlPullParser.require(2, null, "IconViewTracking");
                                    this.f42717m = new o0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "IconViewTracking";
                            if (name.equals("IconViewTracking")) {
                                xmlPullParser.require(2, null, "IconViewTracking");
                                this.f42717m = new o0(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "IFrameResource";
                    if (name.equals("IFrameResource")) {
                        xmlPullParser.require(2, null, "IFrameResource");
                        this.f42714j = new j0(xmlPullParser);
                    } else if (name != null) {
                        str = "HTMLResource";
                        if (name.equals("HTMLResource")) {
                            xmlPullParser.require(2, null, "HTMLResource");
                            this.f42715k = new i0(xmlPullParser);
                        } else if (name != null) {
                            str = "IconClicks";
                            if (name.equals("IconClicks")) {
                                xmlPullParser.require(2, null, "IconClicks");
                                this.f42716l = new n0(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "IconViewTracking";
                                    if (name.equals("IconViewTracking")) {
                                        xmlPullParser.require(2, null, "IconViewTracking");
                                        this.f42717m = new o0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "IconViewTracking";
                                if (name.equals("IconViewTracking")) {
                                    xmlPullParser.require(2, null, "IconViewTracking");
                                    this.f42717m = new o0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "IconClicks";
                        if (name.equals("IconClicks")) {
                            xmlPullParser.require(2, null, "IconClicks");
                            this.f42716l = new n0(xmlPullParser);
                        } else {
                            if (name != null) {
                                str = "IconViewTracking";
                                if (name.equals("IconViewTracking")) {
                                    xmlPullParser.require(2, null, "IconViewTracking");
                                    this.f42717m = new o0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "IconViewTracking";
                            if (name.equals("IconViewTracking")) {
                                xmlPullParser.require(2, null, "IconViewTracking");
                                this.f42717m = new o0(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "HTMLResource";
                    if (name.equals("HTMLResource")) {
                        xmlPullParser.require(2, null, "HTMLResource");
                        this.f42715k = new i0(xmlPullParser);
                    } else if (name != null) {
                        str = "IconClicks";
                        if (name.equals("IconClicks")) {
                            xmlPullParser.require(2, null, "IconClicks");
                            this.f42716l = new n0(xmlPullParser);
                        } else {
                            if (name != null) {
                                str = "IconViewTracking";
                                if (name.equals("IconViewTracking")) {
                                    xmlPullParser.require(2, null, "IconViewTracking");
                                    this.f42717m = new o0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "IconViewTracking";
                            if (name.equals("IconViewTracking")) {
                                xmlPullParser.require(2, null, "IconViewTracking");
                                this.f42717m = new o0(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "IconClicks";
                    if (name.equals("IconClicks")) {
                        xmlPullParser.require(2, null, "IconClicks");
                        this.f42716l = new n0(xmlPullParser);
                    } else {
                        if (name != null) {
                            str = "IconViewTracking";
                            if (name.equals("IconViewTracking")) {
                                xmlPullParser.require(2, null, "IconViewTracking");
                                this.f42717m = new o0(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else {
                    if (name != null) {
                        str = "IconViewTracking";
                        if (name.equals("IconViewTracking")) {
                            xmlPullParser.require(2, null, "IconViewTracking");
                            this.f42717m = new o0(xmlPullParser);
                            xmlPullParser.require(3, null, str);
                        }
                    }
                    a(xmlPullParser);
                }
            }
        }
    }
}
