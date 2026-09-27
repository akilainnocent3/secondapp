package com.cleveradssolutions.adapters.exchange.rendering.video.vast;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class h extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z f42696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f42697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w f42698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f42699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f42700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h0 f42701i;

    /* JADX WARN: Code duplicated, block: B:14:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bc A[SYNTHETIC] */
    public h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        xmlPullParser.require(2, null, "Wrapper");
        this.f42693a = xmlPullParser.getAttributeValue(null, "followAdditionalWrappers");
        this.f42694b = xmlPullParser.getAttributeValue(null, "allowMultipleAds");
        this.f42695c = xmlPullParser.getAttributeValue(null, "fallbackOnNoAd");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name != null) {
                    str = "AdSystem";
                    if (name.equals("AdSystem")) {
                        xmlPullParser.require(2, null, "AdSystem");
                        this.f42696d = new z(xmlPullParser);
                    } else if (name != null) {
                        str = "Error";
                        if (name.equals("Error")) {
                            xmlPullParser.require(2, null, "Error");
                            this.f42698f = new w(xmlPullParser);
                        } else if (name != null) {
                            str = "VASTAdTagURI";
                            if (name.equals("VASTAdTagURI")) {
                                xmlPullParser.require(2, null, "VASTAdTagURI");
                                this.f42697e = new d(xmlPullParser);
                            } else if (name != null) {
                                str = "Impression";
                                if (name.equals("Impression")) {
                                    if (this.f42699g == null) {
                                        this.f42699g = new ArrayList();
                                    }
                                    xmlPullParser.require(2, null, "Impression");
                                    this.f42699g.add(new q0(xmlPullParser));
                                } else if (name != null) {
                                    str = "Creatives";
                                    if (name.equals("Creatives")) {
                                        xmlPullParser.require(2, null, "Creatives");
                                        this.f42700h = new s(xmlPullParser).c();
                                    } else {
                                        if (name != null) {
                                            str = "Extensions";
                                            if (name.equals("Extensions")) {
                                                xmlPullParser.require(2, null, "Extensions");
                                                this.f42701i = new h0(xmlPullParser);
                                            }
                                        }
                                        a(xmlPullParser);
                                    }
                                } else {
                                    if (name != null) {
                                        str = "Extensions";
                                        if (name.equals("Extensions")) {
                                            xmlPullParser.require(2, null, "Extensions");
                                            this.f42701i = new h0(xmlPullParser);
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else if (name != null) {
                                str = "Creatives";
                                if (name.equals("Creatives")) {
                                    xmlPullParser.require(2, null, "Creatives");
                                    this.f42700h = new s(xmlPullParser).c();
                                } else {
                                    if (name != null) {
                                        str = "Extensions";
                                        if (name.equals("Extensions")) {
                                            xmlPullParser.require(2, null, "Extensions");
                                            this.f42701i = new h0(xmlPullParser);
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "Extensions";
                                    if (name.equals("Extensions")) {
                                        xmlPullParser.require(2, null, "Extensions");
                                        this.f42701i = new h0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "Impression";
                            if (name.equals("Impression")) {
                                if (this.f42699g == null) {
                                    this.f42699g = new ArrayList();
                                }
                                xmlPullParser.require(2, null, "Impression");
                                this.f42699g.add(new q0(xmlPullParser));
                            } else if (name != null) {
                                str = "Creatives";
                                if (name.equals("Creatives")) {
                                    xmlPullParser.require(2, null, "Creatives");
                                    this.f42700h = new s(xmlPullParser).c();
                                } else {
                                    if (name != null) {
                                        str = "Extensions";
                                        if (name.equals("Extensions")) {
                                            xmlPullParser.require(2, null, "Extensions");
                                            this.f42701i = new h0(xmlPullParser);
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "Extensions";
                                    if (name.equals("Extensions")) {
                                        xmlPullParser.require(2, null, "Extensions");
                                        this.f42701i = new h0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "Creatives";
                            if (name.equals("Creatives")) {
                                xmlPullParser.require(2, null, "Creatives");
                                this.f42700h = new s(xmlPullParser).c();
                            } else {
                                if (name != null) {
                                    str = "Extensions";
                                    if (name.equals("Extensions")) {
                                        xmlPullParser.require(2, null, "Extensions");
                                        this.f42701i = new h0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "Extensions";
                                if (name.equals("Extensions")) {
                                    xmlPullParser.require(2, null, "Extensions");
                                    this.f42701i = new h0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "VASTAdTagURI";
                        if (name.equals("VASTAdTagURI")) {
                            xmlPullParser.require(2, null, "VASTAdTagURI");
                            this.f42697e = new d(xmlPullParser);
                        } else if (name != null) {
                            str = "Impression";
                            if (name.equals("Impression")) {
                                if (this.f42699g == null) {
                                    this.f42699g = new ArrayList();
                                }
                                xmlPullParser.require(2, null, "Impression");
                                this.f42699g.add(new q0(xmlPullParser));
                            } else if (name != null) {
                                str = "Creatives";
                                if (name.equals("Creatives")) {
                                    xmlPullParser.require(2, null, "Creatives");
                                    this.f42700h = new s(xmlPullParser).c();
                                } else {
                                    if (name != null) {
                                        str = "Extensions";
                                        if (name.equals("Extensions")) {
                                            xmlPullParser.require(2, null, "Extensions");
                                            this.f42701i = new h0(xmlPullParser);
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "Extensions";
                                    if (name.equals("Extensions")) {
                                        xmlPullParser.require(2, null, "Extensions");
                                        this.f42701i = new h0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "Creatives";
                            if (name.equals("Creatives")) {
                                xmlPullParser.require(2, null, "Creatives");
                                this.f42700h = new s(xmlPullParser).c();
                            } else {
                                if (name != null) {
                                    str = "Extensions";
                                    if (name.equals("Extensions")) {
                                        xmlPullParser.require(2, null, "Extensions");
                                        this.f42701i = new h0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "Extensions";
                                if (name.equals("Extensions")) {
                                    xmlPullParser.require(2, null, "Extensions");
                                    this.f42701i = new h0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "Impression";
                        if (name.equals("Impression")) {
                            if (this.f42699g == null) {
                                this.f42699g = new ArrayList();
                            }
                            xmlPullParser.require(2, null, "Impression");
                            this.f42699g.add(new q0(xmlPullParser));
                        } else if (name != null) {
                            str = "Creatives";
                            if (name.equals("Creatives")) {
                                xmlPullParser.require(2, null, "Creatives");
                                this.f42700h = new s(xmlPullParser).c();
                            } else {
                                if (name != null) {
                                    str = "Extensions";
                                    if (name.equals("Extensions")) {
                                        xmlPullParser.require(2, null, "Extensions");
                                        this.f42701i = new h0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "Extensions";
                                if (name.equals("Extensions")) {
                                    xmlPullParser.require(2, null, "Extensions");
                                    this.f42701i = new h0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "Creatives";
                        if (name.equals("Creatives")) {
                            xmlPullParser.require(2, null, "Creatives");
                            this.f42700h = new s(xmlPullParser).c();
                        } else {
                            if (name != null) {
                                str = "Extensions";
                                if (name.equals("Extensions")) {
                                    xmlPullParser.require(2, null, "Extensions");
                                    this.f42701i = new h0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "Extensions";
                            if (name.equals("Extensions")) {
                                xmlPullParser.require(2, null, "Extensions");
                                this.f42701i = new h0(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "Error";
                    if (name.equals("Error")) {
                        xmlPullParser.require(2, null, "Error");
                        this.f42698f = new w(xmlPullParser);
                    } else if (name != null) {
                        str = "VASTAdTagURI";
                        if (name.equals("VASTAdTagURI")) {
                            xmlPullParser.require(2, null, "VASTAdTagURI");
                            this.f42697e = new d(xmlPullParser);
                        } else if (name != null) {
                            str = "Impression";
                            if (name.equals("Impression")) {
                                if (this.f42699g == null) {
                                    this.f42699g = new ArrayList();
                                }
                                xmlPullParser.require(2, null, "Impression");
                                this.f42699g.add(new q0(xmlPullParser));
                            } else if (name != null) {
                                str = "Creatives";
                                if (name.equals("Creatives")) {
                                    xmlPullParser.require(2, null, "Creatives");
                                    this.f42700h = new s(xmlPullParser).c();
                                } else {
                                    if (name != null) {
                                        str = "Extensions";
                                        if (name.equals("Extensions")) {
                                            xmlPullParser.require(2, null, "Extensions");
                                            this.f42701i = new h0(xmlPullParser);
                                        }
                                    }
                                    a(xmlPullParser);
                                }
                            } else {
                                if (name != null) {
                                    str = "Extensions";
                                    if (name.equals("Extensions")) {
                                        xmlPullParser.require(2, null, "Extensions");
                                        this.f42701i = new h0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else if (name != null) {
                            str = "Creatives";
                            if (name.equals("Creatives")) {
                                xmlPullParser.require(2, null, "Creatives");
                                this.f42700h = new s(xmlPullParser).c();
                            } else {
                                if (name != null) {
                                    str = "Extensions";
                                    if (name.equals("Extensions")) {
                                        xmlPullParser.require(2, null, "Extensions");
                                        this.f42701i = new h0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "Extensions";
                                if (name.equals("Extensions")) {
                                    xmlPullParser.require(2, null, "Extensions");
                                    this.f42701i = new h0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "Impression";
                        if (name.equals("Impression")) {
                            if (this.f42699g == null) {
                                this.f42699g = new ArrayList();
                            }
                            xmlPullParser.require(2, null, "Impression");
                            this.f42699g.add(new q0(xmlPullParser));
                        } else if (name != null) {
                            str = "Creatives";
                            if (name.equals("Creatives")) {
                                xmlPullParser.require(2, null, "Creatives");
                                this.f42700h = new s(xmlPullParser).c();
                            } else {
                                if (name != null) {
                                    str = "Extensions";
                                    if (name.equals("Extensions")) {
                                        xmlPullParser.require(2, null, "Extensions");
                                        this.f42701i = new h0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "Extensions";
                                if (name.equals("Extensions")) {
                                    xmlPullParser.require(2, null, "Extensions");
                                    this.f42701i = new h0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "Creatives";
                        if (name.equals("Creatives")) {
                            xmlPullParser.require(2, null, "Creatives");
                            this.f42700h = new s(xmlPullParser).c();
                        } else {
                            if (name != null) {
                                str = "Extensions";
                                if (name.equals("Extensions")) {
                                    xmlPullParser.require(2, null, "Extensions");
                                    this.f42701i = new h0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "Extensions";
                            if (name.equals("Extensions")) {
                                xmlPullParser.require(2, null, "Extensions");
                                this.f42701i = new h0(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "VASTAdTagURI";
                    if (name.equals("VASTAdTagURI")) {
                        xmlPullParser.require(2, null, "VASTAdTagURI");
                        this.f42697e = new d(xmlPullParser);
                    } else if (name != null) {
                        str = "Impression";
                        if (name.equals("Impression")) {
                            if (this.f42699g == null) {
                                this.f42699g = new ArrayList();
                            }
                            xmlPullParser.require(2, null, "Impression");
                            this.f42699g.add(new q0(xmlPullParser));
                        } else if (name != null) {
                            str = "Creatives";
                            if (name.equals("Creatives")) {
                                xmlPullParser.require(2, null, "Creatives");
                                this.f42700h = new s(xmlPullParser).c();
                            } else {
                                if (name != null) {
                                    str = "Extensions";
                                    if (name.equals("Extensions")) {
                                        xmlPullParser.require(2, null, "Extensions");
                                        this.f42701i = new h0(xmlPullParser);
                                    }
                                }
                                a(xmlPullParser);
                            }
                        } else {
                            if (name != null) {
                                str = "Extensions";
                                if (name.equals("Extensions")) {
                                    xmlPullParser.require(2, null, "Extensions");
                                    this.f42701i = new h0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else if (name != null) {
                        str = "Creatives";
                        if (name.equals("Creatives")) {
                            xmlPullParser.require(2, null, "Creatives");
                            this.f42700h = new s(xmlPullParser).c();
                        } else {
                            if (name != null) {
                                str = "Extensions";
                                if (name.equals("Extensions")) {
                                    xmlPullParser.require(2, null, "Extensions");
                                    this.f42701i = new h0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "Extensions";
                            if (name.equals("Extensions")) {
                                xmlPullParser.require(2, null, "Extensions");
                                this.f42701i = new h0(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "Impression";
                    if (name.equals("Impression")) {
                        if (this.f42699g == null) {
                            this.f42699g = new ArrayList();
                        }
                        xmlPullParser.require(2, null, "Impression");
                        this.f42699g.add(new q0(xmlPullParser));
                    } else if (name != null) {
                        str = "Creatives";
                        if (name.equals("Creatives")) {
                            xmlPullParser.require(2, null, "Creatives");
                            this.f42700h = new s(xmlPullParser).c();
                        } else {
                            if (name != null) {
                                str = "Extensions";
                                if (name.equals("Extensions")) {
                                    xmlPullParser.require(2, null, "Extensions");
                                    this.f42701i = new h0(xmlPullParser);
                                }
                            }
                            a(xmlPullParser);
                        }
                    } else {
                        if (name != null) {
                            str = "Extensions";
                            if (name.equals("Extensions")) {
                                xmlPullParser.require(2, null, "Extensions");
                                this.f42701i = new h0(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else if (name != null) {
                    str = "Creatives";
                    if (name.equals("Creatives")) {
                        xmlPullParser.require(2, null, "Creatives");
                        this.f42700h = new s(xmlPullParser).c();
                    } else {
                        if (name != null) {
                            str = "Extensions";
                            if (name.equals("Extensions")) {
                                xmlPullParser.require(2, null, "Extensions");
                                this.f42701i = new h0(xmlPullParser);
                            }
                        }
                        a(xmlPullParser);
                    }
                    xmlPullParser.require(3, null, str);
                } else {
                    if (name != null) {
                        str = "Extensions";
                        if (name.equals("Extensions")) {
                            xmlPullParser.require(2, null, "Extensions");
                            this.f42701i = new h0(xmlPullParser);
                            xmlPullParser.require(3, null, str);
                        }
                    }
                    a(xmlPullParser);
                }
            }
        }
    }

    public ArrayList c() {
        return this.f42699g;
    }

    public d d() {
        return this.f42697e;
    }

    public ArrayList e() {
        return this.f42700h;
    }
}
