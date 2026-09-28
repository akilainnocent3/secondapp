package defpackage;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public final class p8k0 {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static v5w a(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!yz7.c(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ssz.a(null, "Couldn't find xmp metadata");
        }
        pcn.b bVar = pcn.b;
        c150 c150VarB = c150.e;
        long j = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (yz7.c(xmlPullParserNewPullParser, "rdf:Description")) {
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    String strA = yz7.a(xmlPullParserNewPullParser, a[i2]);
                    if (strA != null) {
                        if (Integer.parseInt(strA) != 1) {
                            break loop0;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                String strA2 = yz7.a(xmlPullParserNewPullParser, b[i3]);
                                if (strA2 != null) {
                                    j = Long.parseLong(strA2);
                                    if (j != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i3++;
                            }
                            j = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i >= 2) {
                                pcn.b bVar2 = pcn.b;
                                c150VarB = c150.e;
                                break;
                            }
                            String strA3 = yz7.a(xmlPullParserNewPullParser, c[i]);
                            if (strA3 != null) {
                                c150VarB = pcn.o(new v5w.a("image/jpeg", 0L, 0L), new v5w.a("video/mp4", Long.parseLong(strA3), 0L));
                                break;
                            }
                            i++;
                        }
                    }
                }
                return null;
            }
            if (yz7.c(xmlPullParserNewPullParser, "Container:Directory")) {
                c150VarB = b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (yz7.c(xmlPullParserNewPullParser, "GContainer:Directory")) {
                c150VarB = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!yz7.b(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (c150VarB.isEmpty()) {
            break loop0;
        }
        return new v5w(j, c150VarB);
        return null;
    }

    public static c150 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        pcn.b bVar = pcn.b;
        pcn.a aVar = new pcn.a();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (yz7.c(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strA = yz7.a(xmlPullParser, strConcat3);
                String strA2 = yz7.a(xmlPullParser, strConcat4);
                String strA3 = yz7.a(xmlPullParser, strConcat5);
                String strA4 = yz7.a(xmlPullParser, strConcat6);
                if (strA == null || strA2 == null) {
                    return c150.e;
                }
                aVar.c(new v5w.a(strA, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!yz7.b(xmlPullParser, strConcat2));
        return aVar.g();
    }
}
