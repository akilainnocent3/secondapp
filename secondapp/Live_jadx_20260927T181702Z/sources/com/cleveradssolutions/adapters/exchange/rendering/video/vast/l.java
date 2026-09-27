package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class l extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f42723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f42724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f42725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f42726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b1 f42727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j0 f42728k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i0 f42729l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public y f42730m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d0 f42731n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n f42732o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o f42733p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f42734q;

    /* JADX WARN: Code duplicated, block: B:14:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x007e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0093  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:46:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0105 A[SYNTHETIC] */
    public l(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        xmlPullParser.require(2, null, "Companion");
        this.f42718a = xmlPullParser.getAttributeValue(null, "id");
        this.f42719b = xmlPullParser.getAttributeValue(null, "width");
        this.f42720c = xmlPullParser.getAttributeValue(null, "height");
        this.f42721d = xmlPullParser.getAttributeValue(null, "assetWidth");
        this.f42722e = xmlPullParser.getAttributeValue(null, "assetHeight");
        this.f42723f = xmlPullParser.getAttributeValue(null, "expandedWidth");
        this.f42724g = xmlPullParser.getAttributeValue(null, "expandedHeight");
        this.f42725h = xmlPullParser.getAttributeValue(null, "apiFramework");
        this.f42726i = xmlPullParser.getAttributeValue(null, "adSlotID");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null) {
                    str = "StaticResource";
                    if (name.equals("StaticResource")) {
                        xmlPullParser.require(2, null, "StaticResource");
                        this.f42727j = new b1(xmlPullParser);
                    } else if (name != null) {
                        str = "IFrameResource";
                        if (name.equals("IFrameResource")) {
                            xmlPullParser.require(2, null, "IFrameResource");
                            this.f42728k = new j0(xmlPullParser);
                        } else if (name != null) {
                            str = "HTMLResource";
                            if (name.equals("HTMLResource")) {
                                xmlPullParser.require(2, null, "HTMLResource");
                                this.f42729l = new i0(xmlPullParser);
                            } else if (name != null) {
                                str = "AdParameters";
                                if (name.equals("AdParameters")) {
                                    xmlPullParser.require(2, null, "AdParameters");
                                    this.f42730m = new y(xmlPullParser);
                                } else if (name != null) {
                                    str = "AltText";
                                    if (name.equals("AltText")) {
                                        xmlPullParser.require(2, null, "AltText");
                                        this.f42731n = new d0(xmlPullParser);
                                    } else if (name != null) {
                                        str = "CompanionClickThrough";
                                        if (name.equals("CompanionClickThrough")) {
                                            xmlPullParser.require(2, null, "CompanionClickThrough");
                                            this.f42732o = new n(xmlPullParser);
                                        } else if (name != null) {
                                            str = "CompanionClickTracking";
                                            if (name.equals("CompanionClickTracking")) {
                                                xmlPullParser.require(2, null, "CompanionClickTracking");
                                                this.f42733p = new o(xmlPullParser);
                                            } else {
                                                if (name != null) {
                                                    str = "TrackingEvents";
                                                    if (name.equals("TrackingEvents")) {
                                                        xmlPullParser.require(2, null, "TrackingEvents");
                                                        this.f42734q = new e1(xmlPullParser).c();
                                                    }
                                                }
                                                a(xmlPullParser);
                                            }
                                        } else {
                                            if (name != null) {
                                                str = "TrackingEvents";
                                                if (name.equals("TrackingEvents")) {
                                                    xmlPullParser.require(2, null, "TrackingEvents");
                                                    this.f42734q = new e1(xmlPullParser).c();
                                                }
                                            }
                                            a(xmlPullParser);
                                        }
                                    } else if (name != null) {
                                        str = "CompanionClickTracking";
                                        if (name.equals("CompanionClickTracking")) {
                                            xmlPullParser.require(2, null, "CompanionClickTracking");
                                            this.f42733p = new o(xmlPullParser);
                                        } else {
                                            if (name != null) {
                                                str = "TrackingEvents";
                                                if (name.equals("TrackingEvents")) {
                                                    xmlPullParser.require(2, null, "TrackingEvents");
                                                    this.f42734q = new e1(xmlPullParser).c();
                                                }
                                            }
                                            a(xmlPullParser);
                                        }
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else if (name != null) {
                                    str = "CompanionClickThrough";
                                    if (name.equals("CompanionClickThrough")) {
                                        xmlPullParser.require(2, null, "CompanionClickThrough");
                                        this.f42732o = new n(xmlPullParser);
                                    } else if (name != null) {
                                        str = "CompanionClickTracking";
                                        if (name.equals("CompanionClickTracking")) {
                                            xmlPullParser.require(2, null, "CompanionClickTracking");
                                            this.f42733p = new o(xmlPullParser);
                                        } else {
                                            if (name != null) {
                                                str = "TrackingEvents";
                                                if (name.equals("TrackingEvents")) {
                                                    xmlPullParser.require(2, null, "TrackingEvents");
                                                    this.f42734q = new e1(xmlPullParser).c();
                                                }
                                            }
                                            a(xmlPullParser);
                                        }
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else if (name != null) {
                                    str = "CompanionClickTracking";
                                    if (name.equals("CompanionClickTracking")) {
                                        xmlPullParser.require(2, null, "CompanionClickTracking");
                                        this.f42733p = new o(xmlPullParser);
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else if (name != null) {
                                str = "AltText";
                                if (name.equals("AltText")) {
                                    xmlPullParser.require(2, null, "AltText");
                                    this.f42731n = new d0(xmlPullParser);
                                } else if (name != null) {
                                    str = "CompanionClickThrough";
                                    if (name.equals("CompanionClickThrough")) {
                                        xmlPullParser.require(2, null, "CompanionClickThrough");
                                        this.f42732o = new n(xmlPullParser);
                                    } else if (name != null) {
                                        str = "CompanionClickTracking";
                                        if (name.equals("CompanionClickTracking")) {
                                            xmlPullParser.require(2, null, "CompanionClickTracking");
                                            this.f42733p = new o(xmlPullParser);
                                        } else {
                                            if (name != null) {
                                                str = "TrackingEvents";
                                                if (name.equals("TrackingEvents")) {
                                                    xmlPullParser.require(2, null, "TrackingEvents");
                                                    this.f42734q = new e1(xmlPullParser).c();
                                                }
                                            }
                                            a(xmlPullParser);
                                        }
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else if (name != null) {
                                    str = "CompanionClickTracking";
                                    if (name.equals("CompanionClickTracking")) {
                                        xmlPullParser.require(2, null, "CompanionClickTracking");
                                        this.f42733p = new o(xmlPullParser);
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else if (name != null) {
                                str = "CompanionClickThrough";
                                if (name.equals("CompanionClickThrough")) {
                                    xmlPullParser.require(2, null, "CompanionClickThrough");
                                    this.f42732o = new n(xmlPullParser);
                                } else if (name != null) {
                                    str = "CompanionClickTracking";
                                    if (name.equals("CompanionClickTracking")) {
                                        xmlPullParser.require(2, null, "CompanionClickTracking");
                                        this.f42733p = new o(xmlPullParser);
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else if (name != null) {
                                str = "CompanionClickTracking";
                                if (name.equals("CompanionClickTracking")) {
                                    xmlPullParser.require(2, null, "CompanionClickTracking");
                                    this.f42733p = new o(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "AdParameters";
                            if (name.equals("AdParameters")) {
                                xmlPullParser.require(2, null, "AdParameters");
                                this.f42730m = new y(xmlPullParser);
                            } else if (name != null) {
                                str = "AltText";
                                if (name.equals("AltText")) {
                                    xmlPullParser.require(2, null, "AltText");
                                    this.f42731n = new d0(xmlPullParser);
                                } else if (name != null) {
                                    str = "CompanionClickThrough";
                                    if (name.equals("CompanionClickThrough")) {
                                        xmlPullParser.require(2, null, "CompanionClickThrough");
                                        this.f42732o = new n(xmlPullParser);
                                    } else if (name != null) {
                                        str = "CompanionClickTracking";
                                        if (name.equals("CompanionClickTracking")) {
                                            xmlPullParser.require(2, null, "CompanionClickTracking");
                                            this.f42733p = new o(xmlPullParser);
                                        } else {
                                            if (name != null) {
                                                str = "TrackingEvents";
                                                if (name.equals("TrackingEvents")) {
                                                    xmlPullParser.require(2, null, "TrackingEvents");
                                                    this.f42734q = new e1(xmlPullParser).c();
                                                }
                                            }
                                            a(xmlPullParser);
                                        }
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else if (name != null) {
                                    str = "CompanionClickTracking";
                                    if (name.equals("CompanionClickTracking")) {
                                        xmlPullParser.require(2, null, "CompanionClickTracking");
                                        this.f42733p = new o(xmlPullParser);
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else if (name != null) {
                                str = "CompanionClickThrough";
                                if (name.equals("CompanionClickThrough")) {
                                    xmlPullParser.require(2, null, "CompanionClickThrough");
                                    this.f42732o = new n(xmlPullParser);
                                } else if (name != null) {
                                    str = "CompanionClickTracking";
                                    if (name.equals("CompanionClickTracking")) {
                                        xmlPullParser.require(2, null, "CompanionClickTracking");
                                        this.f42733p = new o(xmlPullParser);
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else if (name != null) {
                                str = "CompanionClickTracking";
                                if (name.equals("CompanionClickTracking")) {
                                    xmlPullParser.require(2, null, "CompanionClickTracking");
                                    this.f42733p = new o(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "AltText";
                            if (name.equals("AltText")) {
                                xmlPullParser.require(2, null, "AltText");
                                this.f42731n = new d0(xmlPullParser);
                            } else if (name != null) {
                                str = "CompanionClickThrough";
                                if (name.equals("CompanionClickThrough")) {
                                    xmlPullParser.require(2, null, "CompanionClickThrough");
                                    this.f42732o = new n(xmlPullParser);
                                } else if (name != null) {
                                    str = "CompanionClickTracking";
                                    if (name.equals("CompanionClickTracking")) {
                                        xmlPullParser.require(2, null, "CompanionClickTracking");
                                        this.f42733p = new o(xmlPullParser);
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else if (name != null) {
                                str = "CompanionClickTracking";
                                if (name.equals("CompanionClickTracking")) {
                                    xmlPullParser.require(2, null, "CompanionClickTracking");
                                    this.f42733p = new o(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "CompanionClickThrough";
                            if (name.equals("CompanionClickThrough")) {
                                xmlPullParser.require(2, null, "CompanionClickThrough");
                                this.f42732o = new n(xmlPullParser);
                            } else if (name != null) {
                                str = "CompanionClickTracking";
                                if (name.equals("CompanionClickTracking")) {
                                    xmlPullParser.require(2, null, "CompanionClickTracking");
                                    this.f42733p = new o(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "CompanionClickTracking";
                            if (name.equals("CompanionClickTracking")) {
                                xmlPullParser.require(2, null, "CompanionClickTracking");
                                this.f42733p = new o(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "HTMLResource";
                        if (name.equals("HTMLResource")) {
                            xmlPullParser.require(2, null, "HTMLResource");
                            this.f42729l = new i0(xmlPullParser);
                        } else if (name != null) {
                            str = "AdParameters";
                            if (name.equals("AdParameters")) {
                                xmlPullParser.require(2, null, "AdParameters");
                                this.f42730m = new y(xmlPullParser);
                            } else if (name != null) {
                                str = "AltText";
                                if (name.equals("AltText")) {
                                    xmlPullParser.require(2, null, "AltText");
                                    this.f42731n = new d0(xmlPullParser);
                                } else if (name != null) {
                                    str = "CompanionClickThrough";
                                    if (name.equals("CompanionClickThrough")) {
                                        xmlPullParser.require(2, null, "CompanionClickThrough");
                                        this.f42732o = new n(xmlPullParser);
                                    } else if (name != null) {
                                        str = "CompanionClickTracking";
                                        if (name.equals("CompanionClickTracking")) {
                                            xmlPullParser.require(2, null, "CompanionClickTracking");
                                            this.f42733p = new o(xmlPullParser);
                                        } else {
                                            if (name != null) {
                                                str = "TrackingEvents";
                                                if (name.equals("TrackingEvents")) {
                                                    xmlPullParser.require(2, null, "TrackingEvents");
                                                    this.f42734q = new e1(xmlPullParser).c();
                                                }
                                            }
                                            a(xmlPullParser);
                                        }
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else if (name != null) {
                                    str = "CompanionClickTracking";
                                    if (name.equals("CompanionClickTracking")) {
                                        xmlPullParser.require(2, null, "CompanionClickTracking");
                                        this.f42733p = new o(xmlPullParser);
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else if (name != null) {
                                str = "CompanionClickThrough";
                                if (name.equals("CompanionClickThrough")) {
                                    xmlPullParser.require(2, null, "CompanionClickThrough");
                                    this.f42732o = new n(xmlPullParser);
                                } else if (name != null) {
                                    str = "CompanionClickTracking";
                                    if (name.equals("CompanionClickTracking")) {
                                        xmlPullParser.require(2, null, "CompanionClickTracking");
                                        this.f42733p = new o(xmlPullParser);
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else if (name != null) {
                                str = "CompanionClickTracking";
                                if (name.equals("CompanionClickTracking")) {
                                    xmlPullParser.require(2, null, "CompanionClickTracking");
                                    this.f42733p = new o(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "AltText";
                            if (name.equals("AltText")) {
                                xmlPullParser.require(2, null, "AltText");
                                this.f42731n = new d0(xmlPullParser);
                            } else if (name != null) {
                                str = "CompanionClickThrough";
                                if (name.equals("CompanionClickThrough")) {
                                    xmlPullParser.require(2, null, "CompanionClickThrough");
                                    this.f42732o = new n(xmlPullParser);
                                } else if (name != null) {
                                    str = "CompanionClickTracking";
                                    if (name.equals("CompanionClickTracking")) {
                                        xmlPullParser.require(2, null, "CompanionClickTracking");
                                        this.f42733p = new o(xmlPullParser);
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else if (name != null) {
                                str = "CompanionClickTracking";
                                if (name.equals("CompanionClickTracking")) {
                                    xmlPullParser.require(2, null, "CompanionClickTracking");
                                    this.f42733p = new o(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "CompanionClickThrough";
                            if (name.equals("CompanionClickThrough")) {
                                xmlPullParser.require(2, null, "CompanionClickThrough");
                                this.f42732o = new n(xmlPullParser);
                            } else if (name != null) {
                                str = "CompanionClickTracking";
                                if (name.equals("CompanionClickTracking")) {
                                    xmlPullParser.require(2, null, "CompanionClickTracking");
                                    this.f42733p = new o(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "CompanionClickTracking";
                            if (name.equals("CompanionClickTracking")) {
                                xmlPullParser.require(2, null, "CompanionClickTracking");
                                this.f42733p = new o(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "AdParameters";
                        if (name.equals("AdParameters")) {
                            xmlPullParser.require(2, null, "AdParameters");
                            this.f42730m = new y(xmlPullParser);
                        } else if (name != null) {
                            str = "AltText";
                            if (name.equals("AltText")) {
                                xmlPullParser.require(2, null, "AltText");
                                this.f42731n = new d0(xmlPullParser);
                            } else if (name != null) {
                                str = "CompanionClickThrough";
                                if (name.equals("CompanionClickThrough")) {
                                    xmlPullParser.require(2, null, "CompanionClickThrough");
                                    this.f42732o = new n(xmlPullParser);
                                } else if (name != null) {
                                    str = "CompanionClickTracking";
                                    if (name.equals("CompanionClickTracking")) {
                                        xmlPullParser.require(2, null, "CompanionClickTracking");
                                        this.f42733p = new o(xmlPullParser);
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else if (name != null) {
                                str = "CompanionClickTracking";
                                if (name.equals("CompanionClickTracking")) {
                                    xmlPullParser.require(2, null, "CompanionClickTracking");
                                    this.f42733p = new o(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "CompanionClickThrough";
                            if (name.equals("CompanionClickThrough")) {
                                xmlPullParser.require(2, null, "CompanionClickThrough");
                                this.f42732o = new n(xmlPullParser);
                            } else if (name != null) {
                                str = "CompanionClickTracking";
                                if (name.equals("CompanionClickTracking")) {
                                    xmlPullParser.require(2, null, "CompanionClickTracking");
                                    this.f42733p = new o(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "CompanionClickTracking";
                            if (name.equals("CompanionClickTracking")) {
                                xmlPullParser.require(2, null, "CompanionClickTracking");
                                this.f42733p = new o(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "AltText";
                        if (name.equals("AltText")) {
                            xmlPullParser.require(2, null, "AltText");
                            this.f42731n = new d0(xmlPullParser);
                        } else if (name != null) {
                            str = "CompanionClickThrough";
                            if (name.equals("CompanionClickThrough")) {
                                xmlPullParser.require(2, null, "CompanionClickThrough");
                                this.f42732o = new n(xmlPullParser);
                            } else if (name != null) {
                                str = "CompanionClickTracking";
                                if (name.equals("CompanionClickTracking")) {
                                    xmlPullParser.require(2, null, "CompanionClickTracking");
                                    this.f42733p = new o(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "CompanionClickTracking";
                            if (name.equals("CompanionClickTracking")) {
                                xmlPullParser.require(2, null, "CompanionClickTracking");
                                this.f42733p = new o(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "CompanionClickThrough";
                        if (name.equals("CompanionClickThrough")) {
                            xmlPullParser.require(2, null, "CompanionClickThrough");
                            this.f42732o = new n(xmlPullParser);
                        } else if (name != null) {
                            str = "CompanionClickTracking";
                            if (name.equals("CompanionClickTracking")) {
                                xmlPullParser.require(2, null, "CompanionClickTracking");
                                this.f42733p = new o(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "CompanionClickTracking";
                        if (name.equals("CompanionClickTracking")) {
                            xmlPullParser.require(2, null, "CompanionClickTracking");
                            this.f42733p = new o(xmlPullParser);
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "TrackingEvents";
                            if (name.equals("TrackingEvents")) {
                                xmlPullParser.require(2, null, "TrackingEvents");
                                this.f42734q = new e1(xmlPullParser).c();
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "IFrameResource";
                    if (name.equals("IFrameResource")) {
                        xmlPullParser.require(2, null, "IFrameResource");
                        this.f42728k = new j0(xmlPullParser);
                    } else if (name != null) {
                        str = "HTMLResource";
                        if (name.equals("HTMLResource")) {
                            xmlPullParser.require(2, null, "HTMLResource");
                            this.f42729l = new i0(xmlPullParser);
                        } else if (name != null) {
                            str = "AdParameters";
                            if (name.equals("AdParameters")) {
                                xmlPullParser.require(2, null, "AdParameters");
                                this.f42730m = new y(xmlPullParser);
                            } else if (name != null) {
                                str = "AltText";
                                if (name.equals("AltText")) {
                                    xmlPullParser.require(2, null, "AltText");
                                    this.f42731n = new d0(xmlPullParser);
                                } else if (name != null) {
                                    str = "CompanionClickThrough";
                                    if (name.equals("CompanionClickThrough")) {
                                        xmlPullParser.require(2, null, "CompanionClickThrough");
                                        this.f42732o = new n(xmlPullParser);
                                    } else if (name != null) {
                                        str = "CompanionClickTracking";
                                        if (name.equals("CompanionClickTracking")) {
                                            xmlPullParser.require(2, null, "CompanionClickTracking");
                                            this.f42733p = new o(xmlPullParser);
                                        } else {
                                            if (name != null) {
                                                str = "TrackingEvents";
                                                if (name.equals("TrackingEvents")) {
                                                    xmlPullParser.require(2, null, "TrackingEvents");
                                                    this.f42734q = new e1(xmlPullParser).c();
                                                }
                                            }
                                            a(xmlPullParser);
                                        }
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else if (name != null) {
                                    str = "CompanionClickTracking";
                                    if (name.equals("CompanionClickTracking")) {
                                        xmlPullParser.require(2, null, "CompanionClickTracking");
                                        this.f42733p = new o(xmlPullParser);
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else if (name != null) {
                                str = "CompanionClickThrough";
                                if (name.equals("CompanionClickThrough")) {
                                    xmlPullParser.require(2, null, "CompanionClickThrough");
                                    this.f42732o = new n(xmlPullParser);
                                } else if (name != null) {
                                    str = "CompanionClickTracking";
                                    if (name.equals("CompanionClickTracking")) {
                                        xmlPullParser.require(2, null, "CompanionClickTracking");
                                        this.f42733p = new o(xmlPullParser);
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else if (name != null) {
                                str = "CompanionClickTracking";
                                if (name.equals("CompanionClickTracking")) {
                                    xmlPullParser.require(2, null, "CompanionClickTracking");
                                    this.f42733p = new o(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "AltText";
                            if (name.equals("AltText")) {
                                xmlPullParser.require(2, null, "AltText");
                                this.f42731n = new d0(xmlPullParser);
                            } else if (name != null) {
                                str = "CompanionClickThrough";
                                if (name.equals("CompanionClickThrough")) {
                                    xmlPullParser.require(2, null, "CompanionClickThrough");
                                    this.f42732o = new n(xmlPullParser);
                                } else if (name != null) {
                                    str = "CompanionClickTracking";
                                    if (name.equals("CompanionClickTracking")) {
                                        xmlPullParser.require(2, null, "CompanionClickTracking");
                                        this.f42733p = new o(xmlPullParser);
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else if (name != null) {
                                str = "CompanionClickTracking";
                                if (name.equals("CompanionClickTracking")) {
                                    xmlPullParser.require(2, null, "CompanionClickTracking");
                                    this.f42733p = new o(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "CompanionClickThrough";
                            if (name.equals("CompanionClickThrough")) {
                                xmlPullParser.require(2, null, "CompanionClickThrough");
                                this.f42732o = new n(xmlPullParser);
                            } else if (name != null) {
                                str = "CompanionClickTracking";
                                if (name.equals("CompanionClickTracking")) {
                                    xmlPullParser.require(2, null, "CompanionClickTracking");
                                    this.f42733p = new o(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "CompanionClickTracking";
                            if (name.equals("CompanionClickTracking")) {
                                xmlPullParser.require(2, null, "CompanionClickTracking");
                                this.f42733p = new o(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "AdParameters";
                        if (name.equals("AdParameters")) {
                            xmlPullParser.require(2, null, "AdParameters");
                            this.f42730m = new y(xmlPullParser);
                        } else if (name != null) {
                            str = "AltText";
                            if (name.equals("AltText")) {
                                xmlPullParser.require(2, null, "AltText");
                                this.f42731n = new d0(xmlPullParser);
                            } else if (name != null) {
                                str = "CompanionClickThrough";
                                if (name.equals("CompanionClickThrough")) {
                                    xmlPullParser.require(2, null, "CompanionClickThrough");
                                    this.f42732o = new n(xmlPullParser);
                                } else if (name != null) {
                                    str = "CompanionClickTracking";
                                    if (name.equals("CompanionClickTracking")) {
                                        xmlPullParser.require(2, null, "CompanionClickTracking");
                                        this.f42733p = new o(xmlPullParser);
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else if (name != null) {
                                str = "CompanionClickTracking";
                                if (name.equals("CompanionClickTracking")) {
                                    xmlPullParser.require(2, null, "CompanionClickTracking");
                                    this.f42733p = new o(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "CompanionClickThrough";
                            if (name.equals("CompanionClickThrough")) {
                                xmlPullParser.require(2, null, "CompanionClickThrough");
                                this.f42732o = new n(xmlPullParser);
                            } else if (name != null) {
                                str = "CompanionClickTracking";
                                if (name.equals("CompanionClickTracking")) {
                                    xmlPullParser.require(2, null, "CompanionClickTracking");
                                    this.f42733p = new o(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "CompanionClickTracking";
                            if (name.equals("CompanionClickTracking")) {
                                xmlPullParser.require(2, null, "CompanionClickTracking");
                                this.f42733p = new o(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "AltText";
                        if (name.equals("AltText")) {
                            xmlPullParser.require(2, null, "AltText");
                            this.f42731n = new d0(xmlPullParser);
                        } else if (name != null) {
                            str = "CompanionClickThrough";
                            if (name.equals("CompanionClickThrough")) {
                                xmlPullParser.require(2, null, "CompanionClickThrough");
                                this.f42732o = new n(xmlPullParser);
                            } else if (name != null) {
                                str = "CompanionClickTracking";
                                if (name.equals("CompanionClickTracking")) {
                                    xmlPullParser.require(2, null, "CompanionClickTracking");
                                    this.f42733p = new o(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "CompanionClickTracking";
                            if (name.equals("CompanionClickTracking")) {
                                xmlPullParser.require(2, null, "CompanionClickTracking");
                                this.f42733p = new o(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "CompanionClickThrough";
                        if (name.equals("CompanionClickThrough")) {
                            xmlPullParser.require(2, null, "CompanionClickThrough");
                            this.f42732o = new n(xmlPullParser);
                        } else if (name != null) {
                            str = "CompanionClickTracking";
                            if (name.equals("CompanionClickTracking")) {
                                xmlPullParser.require(2, null, "CompanionClickTracking");
                                this.f42733p = new o(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "CompanionClickTracking";
                        if (name.equals("CompanionClickTracking")) {
                            xmlPullParser.require(2, null, "CompanionClickTracking");
                            this.f42733p = new o(xmlPullParser);
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "TrackingEvents";
                            if (name.equals("TrackingEvents")) {
                                xmlPullParser.require(2, null, "TrackingEvents");
                                this.f42734q = new e1(xmlPullParser).c();
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "HTMLResource";
                    if (name.equals("HTMLResource")) {
                        xmlPullParser.require(2, null, "HTMLResource");
                        this.f42729l = new i0(xmlPullParser);
                    } else if (name != null) {
                        str = "AdParameters";
                        if (name.equals("AdParameters")) {
                            xmlPullParser.require(2, null, "AdParameters");
                            this.f42730m = new y(xmlPullParser);
                        } else if (name != null) {
                            str = "AltText";
                            if (name.equals("AltText")) {
                                xmlPullParser.require(2, null, "AltText");
                                this.f42731n = new d0(xmlPullParser);
                            } else if (name != null) {
                                str = "CompanionClickThrough";
                                if (name.equals("CompanionClickThrough")) {
                                    xmlPullParser.require(2, null, "CompanionClickThrough");
                                    this.f42732o = new n(xmlPullParser);
                                } else if (name != null) {
                                    str = "CompanionClickTracking";
                                    if (name.equals("CompanionClickTracking")) {
                                        xmlPullParser.require(2, null, "CompanionClickTracking");
                                        this.f42733p = new o(xmlPullParser);
                                    } else {
                                        if (name != null) {
                                            str = "TrackingEvents";
                                            if (name.equals("TrackingEvents")) {
                                                xmlPullParser.require(2, null, "TrackingEvents");
                                                this.f42734q = new e1(xmlPullParser).c();
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else if (name != null) {
                                str = "CompanionClickTracking";
                                if (name.equals("CompanionClickTracking")) {
                                    xmlPullParser.require(2, null, "CompanionClickTracking");
                                    this.f42733p = new o(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "CompanionClickThrough";
                            if (name.equals("CompanionClickThrough")) {
                                xmlPullParser.require(2, null, "CompanionClickThrough");
                                this.f42732o = new n(xmlPullParser);
                            } else if (name != null) {
                                str = "CompanionClickTracking";
                                if (name.equals("CompanionClickTracking")) {
                                    xmlPullParser.require(2, null, "CompanionClickTracking");
                                    this.f42733p = new o(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "CompanionClickTracking";
                            if (name.equals("CompanionClickTracking")) {
                                xmlPullParser.require(2, null, "CompanionClickTracking");
                                this.f42733p = new o(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "AltText";
                        if (name.equals("AltText")) {
                            xmlPullParser.require(2, null, "AltText");
                            this.f42731n = new d0(xmlPullParser);
                        } else if (name != null) {
                            str = "CompanionClickThrough";
                            if (name.equals("CompanionClickThrough")) {
                                xmlPullParser.require(2, null, "CompanionClickThrough");
                                this.f42732o = new n(xmlPullParser);
                            } else if (name != null) {
                                str = "CompanionClickTracking";
                                if (name.equals("CompanionClickTracking")) {
                                    xmlPullParser.require(2, null, "CompanionClickTracking");
                                    this.f42733p = new o(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "CompanionClickTracking";
                            if (name.equals("CompanionClickTracking")) {
                                xmlPullParser.require(2, null, "CompanionClickTracking");
                                this.f42733p = new o(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "CompanionClickThrough";
                        if (name.equals("CompanionClickThrough")) {
                            xmlPullParser.require(2, null, "CompanionClickThrough");
                            this.f42732o = new n(xmlPullParser);
                        } else if (name != null) {
                            str = "CompanionClickTracking";
                            if (name.equals("CompanionClickTracking")) {
                                xmlPullParser.require(2, null, "CompanionClickTracking");
                                this.f42733p = new o(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "CompanionClickTracking";
                        if (name.equals("CompanionClickTracking")) {
                            xmlPullParser.require(2, null, "CompanionClickTracking");
                            this.f42733p = new o(xmlPullParser);
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "TrackingEvents";
                            if (name.equals("TrackingEvents")) {
                                xmlPullParser.require(2, null, "TrackingEvents");
                                this.f42734q = new e1(xmlPullParser).c();
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "AdParameters";
                    if (name.equals("AdParameters")) {
                        xmlPullParser.require(2, null, "AdParameters");
                        this.f42730m = new y(xmlPullParser);
                    } else if (name != null) {
                        str = "AltText";
                        if (name.equals("AltText")) {
                            xmlPullParser.require(2, null, "AltText");
                            this.f42731n = new d0(xmlPullParser);
                        } else if (name != null) {
                            str = "CompanionClickThrough";
                            if (name.equals("CompanionClickThrough")) {
                                xmlPullParser.require(2, null, "CompanionClickThrough");
                                this.f42732o = new n(xmlPullParser);
                            } else if (name != null) {
                                str = "CompanionClickTracking";
                                if (name.equals("CompanionClickTracking")) {
                                    xmlPullParser.require(2, null, "CompanionClickTracking");
                                    this.f42733p = new o(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "TrackingEvents";
                                        if (name.equals("TrackingEvents")) {
                                            xmlPullParser.require(2, null, "TrackingEvents");
                                            this.f42734q = new e1(xmlPullParser).c();
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "CompanionClickTracking";
                            if (name.equals("CompanionClickTracking")) {
                                xmlPullParser.require(2, null, "CompanionClickTracking");
                                this.f42733p = new o(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "CompanionClickThrough";
                        if (name.equals("CompanionClickThrough")) {
                            xmlPullParser.require(2, null, "CompanionClickThrough");
                            this.f42732o = new n(xmlPullParser);
                        } else if (name != null) {
                            str = "CompanionClickTracking";
                            if (name.equals("CompanionClickTracking")) {
                                xmlPullParser.require(2, null, "CompanionClickTracking");
                                this.f42733p = new o(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "CompanionClickTracking";
                        if (name.equals("CompanionClickTracking")) {
                            xmlPullParser.require(2, null, "CompanionClickTracking");
                            this.f42733p = new o(xmlPullParser);
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "TrackingEvents";
                            if (name.equals("TrackingEvents")) {
                                xmlPullParser.require(2, null, "TrackingEvents");
                                this.f42734q = new e1(xmlPullParser).c();
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "AltText";
                    if (name.equals("AltText")) {
                        xmlPullParser.require(2, null, "AltText");
                        this.f42731n = new d0(xmlPullParser);
                    } else if (name != null) {
                        str = "CompanionClickThrough";
                        if (name.equals("CompanionClickThrough")) {
                            xmlPullParser.require(2, null, "CompanionClickThrough");
                            this.f42732o = new n(xmlPullParser);
                        } else if (name != null) {
                            str = "CompanionClickTracking";
                            if (name.equals("CompanionClickTracking")) {
                                xmlPullParser.require(2, null, "CompanionClickTracking");
                                this.f42733p = new o(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "TrackingEvents";
                                    if (name.equals("TrackingEvents")) {
                                        xmlPullParser.require(2, null, "TrackingEvents");
                                        this.f42734q = new e1(xmlPullParser).c();
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "CompanionClickTracking";
                        if (name.equals("CompanionClickTracking")) {
                            xmlPullParser.require(2, null, "CompanionClickTracking");
                            this.f42733p = new o(xmlPullParser);
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "TrackingEvents";
                            if (name.equals("TrackingEvents")) {
                                xmlPullParser.require(2, null, "TrackingEvents");
                                this.f42734q = new e1(xmlPullParser).c();
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "CompanionClickThrough";
                    if (name.equals("CompanionClickThrough")) {
                        xmlPullParser.require(2, null, "CompanionClickThrough");
                        this.f42732o = new n(xmlPullParser);
                    } else if (name != null) {
                        str = "CompanionClickTracking";
                        if (name.equals("CompanionClickTracking")) {
                            xmlPullParser.require(2, null, "CompanionClickTracking");
                            this.f42733p = new o(xmlPullParser);
                        } else {
                            if (name != null) {
                                str = "TrackingEvents";
                                if (name.equals("TrackingEvents")) {
                                    xmlPullParser.require(2, null, "TrackingEvents");
                                    this.f42734q = new e1(xmlPullParser).c();
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "TrackingEvents";
                            if (name.equals("TrackingEvents")) {
                                xmlPullParser.require(2, null, "TrackingEvents");
                                this.f42734q = new e1(xmlPullParser).c();
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "CompanionClickTracking";
                    if (name.equals("CompanionClickTracking")) {
                        xmlPullParser.require(2, null, "CompanionClickTracking");
                        this.f42733p = new o(xmlPullParser);
                    } else {
                        if (name != null) {
                            str = "TrackingEvents";
                            if (name.equals("TrackingEvents")) {
                                xmlPullParser.require(2, null, "TrackingEvents");
                                this.f42734q = new e1(xmlPullParser).c();
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else {
                    if (name != null) {
                        str = "TrackingEvents";
                        if (name.equals("TrackingEvents")) {
                            xmlPullParser.require(2, null, "TrackingEvents");
                            this.f42734q = new e1(xmlPullParser).c();
                            xmlPullParser.require(3, null, str);
                        }
                    }
                    a(xmlPullParser);
                }
            }
        }
    }

    public o c() {
        return this.f42733p;
    }

    public String d() {
        return this.f42720c;
    }

    public i0 e() {
        return this.f42729l;
    }

    public j0 f() {
        return this.f42728k;
    }

    public b1 g() {
        return this.f42727j;
    }

    public ArrayList h() {
        return this.f42734q;
    }

    public String i() {
        return this.f42719b;
    }

    public n j() {
        return this.f42732o;
    }
}
