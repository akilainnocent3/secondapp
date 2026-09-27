package com.bytedance.sdk.openadsdk.core.ny.hww.hww;

import android.content.Context;
import android.text.TextUtils;
import android.util.Xml;
import com.bytedance.sdk.openadsdk.core.model.kub;
import com.bytedance.sdk.openadsdk.core.ny.nod;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv extends com.bytedance.sdk.openadsdk.core.ny.hww.tq {
    public static final String vgm = null;

    public hv(Context context, int i10, int i11) {
        super(context, i10, i11);
    }

    private void sd(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ny.tq.sd.hww(com.bytedance.sdk.openadsdk.core.ny.tq.sd.hww((kub) null, (List<com.bytedance.sdk.openadsdk.core.ny.tq.sd>) Collections.singletonList(new com.bytedance.sdk.openadsdk.core.ny.tq.sd.hww(str).hww()), this.hww > 0 ? com.bytedance.sdk.openadsdk.core.ny.hww.hww.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.ny.hww.hww.UNDEFINED_ERROR, -1L, (String) null, (String) null), (com.bytedance.sdk.openadsdk.core.ny.tq.sd.tq) null);
    }

    public static int tq(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.ny.hww.tq
    public com.bytedance.sdk.openadsdk.core.ny.hww hww(String str, File file, List<com.bytedance.sdk.openadsdk.core.ny.tq.sd> list) throws Throwable {
        InputStream byteArrayInputStream;
        this.f36531hv = 0;
        InputStream inputStream = null;
        if (this.f36533tq == null) {
            this.f36531hv = -1;
            return null;
        }
        if (TextUtils.isEmpty(str) && file == null) {
            this.f36531hv = -2;
            return null;
        }
        try {
            byteArrayInputStream = !TextUtils.isEmpty(str) ? new ByteArrayInputStream(str.getBytes("UTF-8")) : new FileInputStream(file);
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    xmlPullParserNewPullParser.setInput(byteArrayInputStream, "UTF-8");
                    xmlPullParserNewPullParser.nextTag();
                    com.bytedance.sdk.openadsdk.core.ny.hww hwwVarHww = hww(xmlPullParserNewPullParser, list);
                    hww(hwwVarHww);
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused) {
                    }
                    return hwwVarHww;
                } catch (Exception unused2) {
                    this.f36531hv = -3;
                    hww((com.bytedance.sdk.openadsdk.core.ny.hww) null);
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = byteArrayInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            byteArrayInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        String hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        com.bytedance.sdk.openadsdk.core.ny.sd.hww.tq f36528sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        com.bytedance.sdk.openadsdk.core.ny.sd.hww.EnumC0352hww f36529tq;
        String vy;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        final List<com.bytedance.sdk.openadsdk.core.ny.tq.sd> f36527hv = new ArrayList();

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        final List<com.bytedance.sdk.openadsdk.core.ny.tq.sd> f36526hu = new ArrayList();
        float vgm = Float.MIN_VALUE;

        public hww() {
        }

        public void hww(String str, com.bytedance.sdk.openadsdk.core.ny.sd.hww.EnumC0352hww enumC0352hww, com.bytedance.sdk.openadsdk.core.ny.sd.hww.tq tqVar) {
            this.hww = str;
            this.f36529tq = enumC0352hww;
            this.f36528sd = tqVar;
        }

        public void tq(String str) {
            this.f36526hu.add(new com.bytedance.sdk.openadsdk.core.ny.tq.sd.hww(str).hww());
        }

        public void hww(String str) {
            this.f36527hv.add(new com.bytedance.sdk.openadsdk.core.ny.tq.sd.hww(str).hww());
        }

        public hww(String str, com.bytedance.sdk.openadsdk.core.ny.sd.hww.EnumC0352hww enumC0352hww, com.bytedance.sdk.openadsdk.core.ny.sd.hww.tq tqVar) {
            hww(str, enumC0352hww, tqVar);
        }
    }

    public static String tq(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strTrim;
        String str2 = vgm;
        xmlPullParser.require(2, str2, str);
        if (xmlPullParser.next() == 4) {
            strTrim = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            strTrim = "";
        }
        xmlPullParser.require(3, str2, str);
        return strTrim;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [com.bytedance.sdk.openadsdk.core.ny.hww] */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.bytedance.sdk.openadsdk.core.ny.hww.hww.hv, com.bytedance.sdk.openadsdk.core.ny.hww.tq] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v2 */
    private com.bytedance.sdk.openadsdk.core.ny.hww tq(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.ny.tq.sd> list) throws Throwable {
        ?? r16;
        ?? r10 = 0;
        if (this.hww >= 5) {
            hww(xmlPullParser);
            return null;
        }
        com.bytedance.sdk.openadsdk.core.ny.vy vyVar = new com.bytedance.sdk.openadsdk.core.ny.vy();
        String str = null;
        com.bytedance.sdk.openadsdk.core.ny.sd sdVarHww = null;
        Set<nod> setHww = null;
        while (true) {
            if (xmlPullParser.getEventType() == 3 && "Wrapper".equals(xmlPullParser.getName())) {
                com.bytedance.sdk.openadsdk.core.ny.hww hwwVarHww = hww(str, r10, list);
                if (hwwVarHww != null) {
                    if (hwwVarHww.sd() == null) {
                        hwwVarHww.hww(sdVarHww);
                    }
                    hwwVarHww.hww().hww(vyVar);
                    if (setHww != null) {
                        hwwVarHww.hww(setHww);
                    }
                }
                return hwwVarHww;
            }
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                r16 = r10;
                switch (name) {
                    case "VASTAdTagURI":
                        String strHww = hww(tq(xmlPullParser, "VASTAdTagURI"), list);
                        if (!TextUtils.isEmpty(strHww)) {
                            str = strHww;
                            continue;
                            break;
                        } else {
                            hww(xmlPullParser, "Wrapper", 3);
                            this.f36531hv = -2;
                            return r16;
                        }
                        break;
                    case "Error":
                        list.add(new com.bytedance.sdk.openadsdk.core.ny.tq.sd.hww(tq(xmlPullParser, "Error")).hww());
                        continue;
                        break;
                    case "Extensions":
                        break;
                    case "TrackingEvents":
                        sd.hww(xmlPullParser, vyVar);
                        continue;
                        break;
                    case "CompanionAds":
                        sdVarHww = com.bytedance.sdk.openadsdk.core.ny.hww.hww.hww.hww(this.f36533tq, xmlPullParser);
                        continue;
                        break;
                    case "ClickTracking":
                        vyVar.vgm(hww(xmlPullParser, "ClickTracking"));
                        continue;
                        break;
                    case "Impression":
                        vyVar.hww(hww(xmlPullParser, name));
                        continue;
                        break;
                    default:
                        continue;
                        break;
                }
                while (true) {
                    if (xmlPullParser.getEventType() != 3 || !"Extensions".equals(xmlPullParser.getName())) {
                        xmlPullParser.next();
                        if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                            setHww = vy.hww(xmlPullParser);
                        }
                    }
                }
            } else {
                r16 = r10;
            }
            r10 = r16;
        }
    }

    private void hww(com.bytedance.sdk.openadsdk.core.ny.hww hwwVar) {
        if (this.f36530hu == null) {
            this.f36530hu = new com.bytedance.sdk.openadsdk.core.ny.hww.tq.hww();
        }
        com.bytedance.sdk.openadsdk.core.ny.hww.tq.hww hwwVar2 = this.f36530hu;
        hwwVar2.hww = this.f36531hv;
        hwwVar2.f36535tq = this.hww;
        if (hwwVar != null) {
            hwwVar2.f36534sd = hwwVar.hww().f36606tq.size() <= 0;
        }
    }

    private com.bytedance.sdk.openadsdk.core.ny.hww hww(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.ny.tq.sd> list) throws Throwable {
        XmlPullParser xmlPullParser2;
        List<com.bytedance.sdk.openadsdk.core.ny.tq.sd> list2;
        XmlPullParser xmlPullParser3;
        List<com.bytedance.sdk.openadsdk.core.ny.tq.sd> list3;
        xmlPullParser.require(2, vgm, "VAST");
        boolean z10 = false;
        String strTq = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    strTq = tq(xmlPullParser, name);
                } else {
                    if ("Ad".equals(name)) {
                        if (hww(xmlPullParser.getAttributeValue(vgm, "sequence"))) {
                            while (true) {
                                if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                    xmlPullParser2 = xmlPullParser;
                                    list2 = list;
                                    z10 = true;
                                    break;
                                }
                                if (xmlPullParser.getEventType() == 2) {
                                    String name2 = xmlPullParser.getName();
                                    if ("InLine".equals(name2)) {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        com.bytedance.sdk.openadsdk.core.ny.hww hwwVarHww = tq.hww(this.f36533tq, xmlPullParser3, list3, this.f36532sd, this.vy);
                                        if (hwwVarHww != null) {
                                            if (!TextUtils.isEmpty(hwwVarHww.vgm())) {
                                                return hwwVarHww;
                                            }
                                            this.f36531hv = -6;
                                            return null;
                                        }
                                    } else {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        if ("Wrapper".equals(name2)) {
                                            com.bytedance.sdk.openadsdk.core.ny.hww hwwVarTq = tq(xmlPullParser3, list3);
                                            if (hwwVarTq != null) {
                                                return hwwVarTq;
                                            }
                                        } else {
                                            hww(xmlPullParser3);
                                        }
                                    }
                                    xmlPullParser = xmlPullParser3;
                                    list = list3;
                                }
                            }
                        } else {
                            hww(xmlPullParser);
                            z10 = true;
                        }
                    } else {
                        xmlPullParser2 = xmlPullParser;
                        list2 = list;
                        hww(xmlPullParser2);
                    }
                    xmlPullParser = xmlPullParser2;
                    list = list2;
                }
            }
        }
        if (!z10) {
            this.f36531hv = -4;
            sd(strTq);
        }
        if (this.f36531hv == 0) {
            this.f36531hv = -5;
        }
        return null;
    }

    public static List<com.bytedance.sdk.openadsdk.core.ny.tq.sd> hww(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        return hww(xmlPullParser, str, false);
    }

    public static List<com.bytedance.sdk.openadsdk.core.ny.tq.sd> hww(XmlPullParser xmlPullParser, String str, boolean z10) throws XmlPullParserException, IOException {
        return hww(tq(xmlPullParser, str), z10);
    }

    public static void hww(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static void hww(XmlPullParser xmlPullParser, String str, int i10) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i10) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.ny.tq.sd> hww(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new com.bytedance.sdk.openadsdk.core.ny.tq.sd.hww(str).hww(z10).hww());
    }
}
