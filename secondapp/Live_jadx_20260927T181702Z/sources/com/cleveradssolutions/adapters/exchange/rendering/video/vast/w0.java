package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class w0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f42796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f42797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f42798h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f42799i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b1 f42800j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j0 f42801k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i0 f42802l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public y f42803m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y0 f42804n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public z0 f42805o;

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
    /* JADX WARN: Code duplicated, block: B:38:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00da A[SYNTHETIC] */
    public w0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        xmlPullParser.require(2, null, "NonLinear");
        this.f42791a = xmlPullParser.getAttributeValue(null, "id");
        this.f42792b = xmlPullParser.getAttributeValue(null, "width");
        this.f42793c = xmlPullParser.getAttributeValue(null, "height");
        this.f42794d = xmlPullParser.getAttributeValue(null, "expandedWidth");
        this.f42795e = xmlPullParser.getAttributeValue(null, "expandedHeight");
        this.f42796f = xmlPullParser.getAttributeValue(null, "scalable");
        this.f42797g = xmlPullParser.getAttributeValue(null, "maintainAspectRatio");
        this.f42798h = xmlPullParser.getAttributeValue(null, "minSuggestedDuration");
        this.f42799i = xmlPullParser.getAttributeValue(null, "apiFramework");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null) {
                    str = "StaticResource";
                    if (name.equals("StaticResource")) {
                        xmlPullParser.require(2, null, "StaticResource");
                        this.f42800j = new b1(xmlPullParser);
                    } else if (name != null) {
                        str = "IFrameResource";
                        if (name.equals("IFrameResource")) {
                            xmlPullParser.require(2, null, "IFrameResource");
                            this.f42801k = new j0(xmlPullParser);
                        } else if (name != null) {
                            str = "HTMLResource";
                            if (name.equals("HTMLResource")) {
                                xmlPullParser.require(2, null, "HTMLResource");
                                this.f42802l = new i0(xmlPullParser);
                            } else if (name != null) {
                                str = "AdParameters";
                                if (name.equals("AdParameters")) {
                                    xmlPullParser.require(2, null, "AdParameters");
                                    this.f42803m = new y(xmlPullParser);
                                } else if (name != null) {
                                    str = "NonLinearClickThrough";
                                    if (name.equals("NonLinearClickThrough")) {
                                        xmlPullParser.require(2, null, "NonLinearClickThrough");
                                        this.f42804n = new y0(xmlPullParser);
                                    } else {
                                        if (name != null) {
                                            str = "NonLinearClickTracking";
                                            if (name.equals("NonLinearClickTracking")) {
                                                xmlPullParser.require(2, null, "NonLinearClickTracking");
                                                this.f42805o = new z0(xmlPullParser);
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else {
                                    if (name != null) {
                                        str = "NonLinearClickTracking";
                                        if (name.equals("NonLinearClickTracking")) {
                                            xmlPullParser.require(2, null, "NonLinearClickTracking");
                                            this.f42805o = new z0(xmlPullParser);
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else if (name != null) {
                                str = "NonLinearClickThrough";
                                if (name.equals("NonLinearClickThrough")) {
                                    xmlPullParser.require(2, null, "NonLinearClickThrough");
                                    this.f42804n = new y0(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "NonLinearClickTracking";
                                        if (name.equals("NonLinearClickTracking")) {
                                            xmlPullParser.require(2, null, "NonLinearClickTracking");
                                            this.f42805o = new z0(xmlPullParser);
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "NonLinearClickTracking";
                                    if (name.equals("NonLinearClickTracking")) {
                                        xmlPullParser.require(2, null, "NonLinearClickTracking");
                                        this.f42805o = new z0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "AdParameters";
                            if (name.equals("AdParameters")) {
                                xmlPullParser.require(2, null, "AdParameters");
                                this.f42803m = new y(xmlPullParser);
                            } else if (name != null) {
                                str = "NonLinearClickThrough";
                                if (name.equals("NonLinearClickThrough")) {
                                    xmlPullParser.require(2, null, "NonLinearClickThrough");
                                    this.f42804n = new y0(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "NonLinearClickTracking";
                                        if (name.equals("NonLinearClickTracking")) {
                                            xmlPullParser.require(2, null, "NonLinearClickTracking");
                                            this.f42805o = new z0(xmlPullParser);
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "NonLinearClickTracking";
                                    if (name.equals("NonLinearClickTracking")) {
                                        xmlPullParser.require(2, null, "NonLinearClickTracking");
                                        this.f42805o = new z0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "NonLinearClickThrough";
                            if (name.equals("NonLinearClickThrough")) {
                                xmlPullParser.require(2, null, "NonLinearClickThrough");
                                this.f42804n = new y0(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "NonLinearClickTracking";
                                    if (name.equals("NonLinearClickTracking")) {
                                        xmlPullParser.require(2, null, "NonLinearClickTracking");
                                        this.f42805o = new z0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "NonLinearClickTracking";
                                if (name.equals("NonLinearClickTracking")) {
                                    xmlPullParser.require(2, null, "NonLinearClickTracking");
                                    this.f42805o = new z0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "HTMLResource";
                        if (name.equals("HTMLResource")) {
                            xmlPullParser.require(2, null, "HTMLResource");
                            this.f42802l = new i0(xmlPullParser);
                        } else if (name != null) {
                            str = "AdParameters";
                            if (name.equals("AdParameters")) {
                                xmlPullParser.require(2, null, "AdParameters");
                                this.f42803m = new y(xmlPullParser);
                            } else if (name != null) {
                                str = "NonLinearClickThrough";
                                if (name.equals("NonLinearClickThrough")) {
                                    xmlPullParser.require(2, null, "NonLinearClickThrough");
                                    this.f42804n = new y0(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "NonLinearClickTracking";
                                        if (name.equals("NonLinearClickTracking")) {
                                            xmlPullParser.require(2, null, "NonLinearClickTracking");
                                            this.f42805o = new z0(xmlPullParser);
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "NonLinearClickTracking";
                                    if (name.equals("NonLinearClickTracking")) {
                                        xmlPullParser.require(2, null, "NonLinearClickTracking");
                                        this.f42805o = new z0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "NonLinearClickThrough";
                            if (name.equals("NonLinearClickThrough")) {
                                xmlPullParser.require(2, null, "NonLinearClickThrough");
                                this.f42804n = new y0(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "NonLinearClickTracking";
                                    if (name.equals("NonLinearClickTracking")) {
                                        xmlPullParser.require(2, null, "NonLinearClickTracking");
                                        this.f42805o = new z0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "NonLinearClickTracking";
                                if (name.equals("NonLinearClickTracking")) {
                                    xmlPullParser.require(2, null, "NonLinearClickTracking");
                                    this.f42805o = new z0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "AdParameters";
                        if (name.equals("AdParameters")) {
                            xmlPullParser.require(2, null, "AdParameters");
                            this.f42803m = new y(xmlPullParser);
                        } else if (name != null) {
                            str = "NonLinearClickThrough";
                            if (name.equals("NonLinearClickThrough")) {
                                xmlPullParser.require(2, null, "NonLinearClickThrough");
                                this.f42804n = new y0(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "NonLinearClickTracking";
                                    if (name.equals("NonLinearClickTracking")) {
                                        xmlPullParser.require(2, null, "NonLinearClickTracking");
                                        this.f42805o = new z0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "NonLinearClickTracking";
                                if (name.equals("NonLinearClickTracking")) {
                                    xmlPullParser.require(2, null, "NonLinearClickTracking");
                                    this.f42805o = new z0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "NonLinearClickThrough";
                        if (name.equals("NonLinearClickThrough")) {
                            xmlPullParser.require(2, null, "NonLinearClickThrough");
                            this.f42804n = new y0(xmlPullParser);
                        } else {
                            if (name != null) {
                                str = "NonLinearClickTracking";
                                if (name.equals("NonLinearClickTracking")) {
                                    xmlPullParser.require(2, null, "NonLinearClickTracking");
                                    this.f42805o = new z0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "NonLinearClickTracking";
                            if (name.equals("NonLinearClickTracking")) {
                                xmlPullParser.require(2, null, "NonLinearClickTracking");
                                this.f42805o = new z0(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "IFrameResource";
                    if (name.equals("IFrameResource")) {
                        xmlPullParser.require(2, null, "IFrameResource");
                        this.f42801k = new j0(xmlPullParser);
                    } else if (name != null) {
                        str = "HTMLResource";
                        if (name.equals("HTMLResource")) {
                            xmlPullParser.require(2, null, "HTMLResource");
                            this.f42802l = new i0(xmlPullParser);
                        } else if (name != null) {
                            str = "AdParameters";
                            if (name.equals("AdParameters")) {
                                xmlPullParser.require(2, null, "AdParameters");
                                this.f42803m = new y(xmlPullParser);
                            } else if (name != null) {
                                str = "NonLinearClickThrough";
                                if (name.equals("NonLinearClickThrough")) {
                                    xmlPullParser.require(2, null, "NonLinearClickThrough");
                                    this.f42804n = new y0(xmlPullParser);
                                } else {
                                    if (name != null) {
                                        str = "NonLinearClickTracking";
                                        if (name.equals("NonLinearClickTracking")) {
                                            xmlPullParser.require(2, null, "NonLinearClickTracking");
                                            this.f42805o = new z0(xmlPullParser);
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "NonLinearClickTracking";
                                    if (name.equals("NonLinearClickTracking")) {
                                        xmlPullParser.require(2, null, "NonLinearClickTracking");
                                        this.f42805o = new z0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "NonLinearClickThrough";
                            if (name.equals("NonLinearClickThrough")) {
                                xmlPullParser.require(2, null, "NonLinearClickThrough");
                                this.f42804n = new y0(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "NonLinearClickTracking";
                                    if (name.equals("NonLinearClickTracking")) {
                                        xmlPullParser.require(2, null, "NonLinearClickTracking");
                                        this.f42805o = new z0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "NonLinearClickTracking";
                                if (name.equals("NonLinearClickTracking")) {
                                    xmlPullParser.require(2, null, "NonLinearClickTracking");
                                    this.f42805o = new z0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "AdParameters";
                        if (name.equals("AdParameters")) {
                            xmlPullParser.require(2, null, "AdParameters");
                            this.f42803m = new y(xmlPullParser);
                        } else if (name != null) {
                            str = "NonLinearClickThrough";
                            if (name.equals("NonLinearClickThrough")) {
                                xmlPullParser.require(2, null, "NonLinearClickThrough");
                                this.f42804n = new y0(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "NonLinearClickTracking";
                                    if (name.equals("NonLinearClickTracking")) {
                                        xmlPullParser.require(2, null, "NonLinearClickTracking");
                                        this.f42805o = new z0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "NonLinearClickTracking";
                                if (name.equals("NonLinearClickTracking")) {
                                    xmlPullParser.require(2, null, "NonLinearClickTracking");
                                    this.f42805o = new z0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "NonLinearClickThrough";
                        if (name.equals("NonLinearClickThrough")) {
                            xmlPullParser.require(2, null, "NonLinearClickThrough");
                            this.f42804n = new y0(xmlPullParser);
                        } else {
                            if (name != null) {
                                str = "NonLinearClickTracking";
                                if (name.equals("NonLinearClickTracking")) {
                                    xmlPullParser.require(2, null, "NonLinearClickTracking");
                                    this.f42805o = new z0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "NonLinearClickTracking";
                            if (name.equals("NonLinearClickTracking")) {
                                xmlPullParser.require(2, null, "NonLinearClickTracking");
                                this.f42805o = new z0(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "HTMLResource";
                    if (name.equals("HTMLResource")) {
                        xmlPullParser.require(2, null, "HTMLResource");
                        this.f42802l = new i0(xmlPullParser);
                    } else if (name != null) {
                        str = "AdParameters";
                        if (name.equals("AdParameters")) {
                            xmlPullParser.require(2, null, "AdParameters");
                            this.f42803m = new y(xmlPullParser);
                        } else if (name != null) {
                            str = "NonLinearClickThrough";
                            if (name.equals("NonLinearClickThrough")) {
                                xmlPullParser.require(2, null, "NonLinearClickThrough");
                                this.f42804n = new y0(xmlPullParser);
                            } else {
                                if (name != null) {
                                    str = "NonLinearClickTracking";
                                    if (name.equals("NonLinearClickTracking")) {
                                        xmlPullParser.require(2, null, "NonLinearClickTracking");
                                        this.f42805o = new z0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "NonLinearClickTracking";
                                if (name.equals("NonLinearClickTracking")) {
                                    xmlPullParser.require(2, null, "NonLinearClickTracking");
                                    this.f42805o = new z0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "NonLinearClickThrough";
                        if (name.equals("NonLinearClickThrough")) {
                            xmlPullParser.require(2, null, "NonLinearClickThrough");
                            this.f42804n = new y0(xmlPullParser);
                        } else {
                            if (name != null) {
                                str = "NonLinearClickTracking";
                                if (name.equals("NonLinearClickTracking")) {
                                    xmlPullParser.require(2, null, "NonLinearClickTracking");
                                    this.f42805o = new z0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "NonLinearClickTracking";
                            if (name.equals("NonLinearClickTracking")) {
                                xmlPullParser.require(2, null, "NonLinearClickTracking");
                                this.f42805o = new z0(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "AdParameters";
                    if (name.equals("AdParameters")) {
                        xmlPullParser.require(2, null, "AdParameters");
                        this.f42803m = new y(xmlPullParser);
                    } else if (name != null) {
                        str = "NonLinearClickThrough";
                        if (name.equals("NonLinearClickThrough")) {
                            xmlPullParser.require(2, null, "NonLinearClickThrough");
                            this.f42804n = new y0(xmlPullParser);
                        } else {
                            if (name != null) {
                                str = "NonLinearClickTracking";
                                if (name.equals("NonLinearClickTracking")) {
                                    xmlPullParser.require(2, null, "NonLinearClickTracking");
                                    this.f42805o = new z0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "NonLinearClickTracking";
                            if (name.equals("NonLinearClickTracking")) {
                                xmlPullParser.require(2, null, "NonLinearClickTracking");
                                this.f42805o = new z0(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "NonLinearClickThrough";
                    if (name.equals("NonLinearClickThrough")) {
                        xmlPullParser.require(2, null, "NonLinearClickThrough");
                        this.f42804n = new y0(xmlPullParser);
                    } else {
                        if (name != null) {
                            str = "NonLinearClickTracking";
                            if (name.equals("NonLinearClickTracking")) {
                                xmlPullParser.require(2, null, "NonLinearClickTracking");
                                this.f42805o = new z0(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else {
                    if (name != null) {
                        str = "NonLinearClickTracking";
                        if (name.equals("NonLinearClickTracking")) {
                            xmlPullParser.require(2, null, "NonLinearClickTracking");
                            this.f42805o = new z0(xmlPullParser);
                            xmlPullParser.require(3, null, str);
                        }
                    }
                    a(xmlPullParser);
                }
            }
        }
    }
}
