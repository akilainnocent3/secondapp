package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class s0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f42764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f42765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f42766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f42767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f42768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f42769g;

    /* JADX WARN: Code duplicated, block: B:14:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:22:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2 A[SYNTHETIC] */
    public s0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        xmlPullParser.require(2, null, "Linear");
        this.f42763a = xmlPullParser.getAttributeValue(null, "skipoffset");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null) {
                    str = "AdParameters";
                    if (name.equals("AdParameters")) {
                        xmlPullParser.require(2, null, "AdParameters");
                        this.f42764b = new y(xmlPullParser);
                    } else if (name != null) {
                        str = mg.b.e.f107451s;
                        if (name.equals(mg.b.e.f107451s)) {
                            xmlPullParser.require(2, null, mg.b.e.f107451s);
                            this.f42765c = new v(xmlPullParser);
                        } else if (name != null) {
                            str = "MediaFiles";
                            if (name.equals("MediaFiles")) {
                                xmlPullParser.require(2, null, "MediaFiles");
                                this.f42766d = new u0(xmlPullParser).c();
                            } else if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42767e = new e1(xmlPullParser).c();
                                } else if (name != null) {
                                    str = "VideoClicks";
                                    if (name.equals("VideoClicks")) {
                                        xmlPullParser.require(2, null, "VideoClicks");
                                        this.f42768f = new f(xmlPullParser);
                                    } else {
                                        if (name != null) {
                                            str = "Icons";
                                            if (name.equals("Icons")) {
                                                xmlPullParser.require(2, null, "Icons");
                                                this.f42769g = new p0(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else {
                                    if (name != null) {
                                        str = "Icons";
                                        if (name.equals("Icons")) {
                                            xmlPullParser.require(2, null, "Icons");
                                            this.f42769g = new p0(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else if (name != null) {
                                str = "VideoClicks";
                                if (name.equals("VideoClicks")) {
                                    xmlPullParser.require(2, null, "VideoClicks");
                                    this.f42768f = new f(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "Icons";
                                        if (name.equals("Icons")) {
                                            xmlPullParser.require(2, null, "Icons");
                                            this.f42769g = new p0(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "Icons";
                                    if (name.equals("Icons")) {
                                        xmlPullParser.require(2, null, "Icons");
                                        this.f42769g = new p0(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "TrackingEvents";
                            if (name.equals("TrackingEvents")) {
                                xmlPullParser.require(2, null, "TrackingEvents");
                                this.f42767e = new e1(xmlPullParser).c();
                            } else if (name != null) {
                                str = "VideoClicks";
                                if (name.equals("VideoClicks")) {
                                    xmlPullParser.require(2, null, "VideoClicks");
                                    this.f42768f = new f(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "Icons";
                                        if (name.equals("Icons")) {
                                            xmlPullParser.require(2, null, "Icons");
                                            this.f42769g = new p0(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "Icons";
                                    if (name.equals("Icons")) {
                                        xmlPullParser.require(2, null, "Icons");
                                        this.f42769g = new p0(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "VideoClicks";
                            if (name.equals("VideoClicks")) {
                                xmlPullParser.require(2, null, "VideoClicks");
                                this.f42768f = new f(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "Icons";
                                    if (name.equals("Icons")) {
                                        xmlPullParser.require(2, null, "Icons");
                                        this.f42769g = new p0(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "Icons";
                                if (name.equals("Icons")) {
                                    xmlPullParser.require(2, null, "Icons");
                                    this.f42769g = new p0(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "MediaFiles";
                        if (name.equals("MediaFiles")) {
                            xmlPullParser.require(2, null, "MediaFiles");
                            this.f42766d = new u0(xmlPullParser).c();
                        } else if (name != null) {
                            str = "TrackingEvents";
                            if (name.equals("TrackingEvents")) {
                                xmlPullParser.require(2, null, "TrackingEvents");
                                this.f42767e = new e1(xmlPullParser).c();
                            } else if (name != null) {
                                str = "VideoClicks";
                                if (name.equals("VideoClicks")) {
                                    xmlPullParser.require(2, null, "VideoClicks");
                                    this.f42768f = new f(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "Icons";
                                        if (name.equals("Icons")) {
                                            xmlPullParser.require(2, null, "Icons");
                                            this.f42769g = new p0(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "Icons";
                                    if (name.equals("Icons")) {
                                        xmlPullParser.require(2, null, "Icons");
                                        this.f42769g = new p0(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "VideoClicks";
                            if (name.equals("VideoClicks")) {
                                xmlPullParser.require(2, null, "VideoClicks");
                                this.f42768f = new f(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "Icons";
                                    if (name.equals("Icons")) {
                                        xmlPullParser.require(2, null, "Icons");
                                        this.f42769g = new p0(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "Icons";
                                if (name.equals("Icons")) {
                                    xmlPullParser.require(2, null, "Icons");
                                    this.f42769g = new p0(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "TrackingEvents";
                        if (name.equals("TrackingEvents")) {
                            xmlPullParser.require(2, null, "TrackingEvents");
                            this.f42767e = new e1(xmlPullParser).c();
                        } else if (name != null) {
                            str = "VideoClicks";
                            if (name.equals("VideoClicks")) {
                                xmlPullParser.require(2, null, "VideoClicks");
                                this.f42768f = new f(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "Icons";
                                    if (name.equals("Icons")) {
                                        xmlPullParser.require(2, null, "Icons");
                                        this.f42769g = new p0(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "Icons";
                                if (name.equals("Icons")) {
                                    xmlPullParser.require(2, null, "Icons");
                                    this.f42769g = new p0(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "VideoClicks";
                        if (name.equals("VideoClicks")) {
                            xmlPullParser.require(2, null, "VideoClicks");
                            this.f42768f = new f(xmlPullParser);
                        } else {
                            if (name != null) {
                                str = "Icons";
                                if (name.equals("Icons")) {
                                    xmlPullParser.require(2, null, "Icons");
                                    this.f42769g = new p0(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "Icons";
                            if (name.equals("Icons")) {
                                xmlPullParser.require(2, null, "Icons");
                                this.f42769g = new p0(xmlPullParser).c();
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = mg.b.e.f107451s;
                    if (name.equals(mg.b.e.f107451s)) {
                        xmlPullParser.require(2, null, mg.b.e.f107451s);
                        this.f42765c = new v(xmlPullParser);
                    } else if (name != null) {
                        str = "MediaFiles";
                        if (name.equals("MediaFiles")) {
                            xmlPullParser.require(2, null, "MediaFiles");
                            this.f42766d = new u0(xmlPullParser).c();
                        } else if (name != null) {
                            str = "TrackingEvents";
                            if (name.equals("TrackingEvents")) {
                                xmlPullParser.require(2, null, "TrackingEvents");
                                this.f42767e = new e1(xmlPullParser).c();
                            } else if (name != null) {
                                str = "VideoClicks";
                                if (name.equals("VideoClicks")) {
                                    xmlPullParser.require(2, null, "VideoClicks");
                                    this.f42768f = new f(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "Icons";
                                        if (name.equals("Icons")) {
                                            xmlPullParser.require(2, null, "Icons");
                                            this.f42769g = new p0(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "Icons";
                                    if (name.equals("Icons")) {
                                        xmlPullParser.require(2, null, "Icons");
                                        this.f42769g = new p0(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "VideoClicks";
                            if (name.equals("VideoClicks")) {
                                xmlPullParser.require(2, null, "VideoClicks");
                                this.f42768f = new f(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "Icons";
                                    if (name.equals("Icons")) {
                                        xmlPullParser.require(2, null, "Icons");
                                        this.f42769g = new p0(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "Icons";
                                if (name.equals("Icons")) {
                                    xmlPullParser.require(2, null, "Icons");
                                    this.f42769g = new p0(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "TrackingEvents";
                        if (name.equals("TrackingEvents")) {
                            xmlPullParser.require(2, null, "TrackingEvents");
                            this.f42767e = new e1(xmlPullParser).c();
                        } else if (name != null) {
                            str = "VideoClicks";
                            if (name.equals("VideoClicks")) {
                                xmlPullParser.require(2, null, "VideoClicks");
                                this.f42768f = new f(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "Icons";
                                    if (name.equals("Icons")) {
                                        xmlPullParser.require(2, null, "Icons");
                                        this.f42769g = new p0(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "Icons";
                                if (name.equals("Icons")) {
                                    xmlPullParser.require(2, null, "Icons");
                                    this.f42769g = new p0(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "VideoClicks";
                        if (name.equals("VideoClicks")) {
                            xmlPullParser.require(2, null, "VideoClicks");
                            this.f42768f = new f(xmlPullParser);
                        } else {
                            if (name != null) {
                                str = "Icons";
                                if (name.equals("Icons")) {
                                    xmlPullParser.require(2, null, "Icons");
                                    this.f42769g = new p0(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "Icons";
                            if (name.equals("Icons")) {
                                xmlPullParser.require(2, null, "Icons");
                                this.f42769g = new p0(xmlPullParser).c();
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "MediaFiles";
                    if (name.equals("MediaFiles")) {
                        xmlPullParser.require(2, null, "MediaFiles");
                        this.f42766d = new u0(xmlPullParser).c();
                    } else if (name != null) {
                        str = "TrackingEvents";
                        if (name.equals("TrackingEvents")) {
                            xmlPullParser.require(2, null, "TrackingEvents");
                            this.f42767e = new e1(xmlPullParser).c();
                        } else if (name != null) {
                            str = "VideoClicks";
                            if (name.equals("VideoClicks")) {
                                xmlPullParser.require(2, null, "VideoClicks");
                                this.f42768f = new f(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "Icons";
                                    if (name.equals("Icons")) {
                                        xmlPullParser.require(2, null, "Icons");
                                        this.f42769g = new p0(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "Icons";
                                if (name.equals("Icons")) {
                                    xmlPullParser.require(2, null, "Icons");
                                    this.f42769g = new p0(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "VideoClicks";
                        if (name.equals("VideoClicks")) {
                            xmlPullParser.require(2, null, "VideoClicks");
                            this.f42768f = new f(xmlPullParser);
                        } else {
                            if (name != null) {
                                str = "Icons";
                                if (name.equals("Icons")) {
                                    xmlPullParser.require(2, null, "Icons");
                                    this.f42769g = new p0(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "Icons";
                            if (name.equals("Icons")) {
                                xmlPullParser.require(2, null, "Icons");
                                this.f42769g = new p0(xmlPullParser).c();
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "TrackingEvents";
                    if (name.equals("TrackingEvents")) {
                        xmlPullParser.require(2, null, "TrackingEvents");
                        this.f42767e = new e1(xmlPullParser).c();
                    } else if (name != null) {
                        str = "VideoClicks";
                        if (name.equals("VideoClicks")) {
                            xmlPullParser.require(2, null, "VideoClicks");
                            this.f42768f = new f(xmlPullParser);
                        } else {
                            if (name != null) {
                                str = "Icons";
                                if (name.equals("Icons")) {
                                    xmlPullParser.require(2, null, "Icons");
                                    this.f42769g = new p0(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "Icons";
                            if (name.equals("Icons")) {
                                xmlPullParser.require(2, null, "Icons");
                                this.f42769g = new p0(xmlPullParser).c();
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "VideoClicks";
                    if (name.equals("VideoClicks")) {
                        xmlPullParser.require(2, null, "VideoClicks");
                        this.f42768f = new f(xmlPullParser);
                    } else {
                        if (name != null) {
                            str = "Icons";
                            if (name.equals("Icons")) {
                                xmlPullParser.require(2, null, "Icons");
                                this.f42769g = new p0(xmlPullParser).c();
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else {
                    if (name != null) {
                        str = "Icons";
                        if (name.equals("Icons")) {
                            xmlPullParser.require(2, null, "Icons");
                            this.f42769g = new p0(xmlPullParser).c();
                            xmlPullParser.require(3, null, str);
                        }
                    }
                    a(xmlPullParser);
                }
            }
        }
    }

    public ArrayList c() {
        return this.f42766d;
    }

    public String d() {
        return this.f42763a;
    }

    public ArrayList e() {
        return this.f42767e;
    }

    public f f() {
        return this.f42768f;
    }

    public v g() {
        return this.f42765c;
    }
}
