package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ttb {
    public static final jcp a;

    public interface a<T> {
        T a(JsonReader jsonReader);
    }

    static {
        kcp kcpVar = new kcp();
        ad1 ad1Var = ad1.a;
        kcpVar.a(ktb.class, ad1Var);
        kcpVar.a(xg1.class, ad1Var);
        gd1 gd1Var = gd1.a;
        kcpVar.a(ktb.e.class, gd1Var);
        kcpVar.a(eh1.class, gd1Var);
        dd1 dd1Var = dd1.a;
        kcpVar.a(ktb.e.a.class, dd1Var);
        kcpVar.a(fh1.class, dd1Var);
        ed1 ed1Var = ed1.a;
        kcpVar.a(ktb.e.a.AbstractC0784a.class, ed1Var);
        kcpVar.a(gh1.class, ed1Var);
        wd1 wd1Var = wd1.a;
        kcpVar.a(ktb.e.f.class, wd1Var);
        kcpVar.a(xh1.class, wd1Var);
        vd1 vd1Var = vd1.a;
        kcpVar.a(ktb.e.AbstractC0794e.class, vd1Var);
        kcpVar.a(wh1.class, vd1Var);
        fd1 fd1Var = fd1.a;
        kcpVar.a(ktb.e.c.class, fd1Var);
        kcpVar.a(hh1.class, fd1Var);
        qd1 qd1Var = qd1.a;
        kcpVar.a(ktb.e.d.class, qd1Var);
        kcpVar.a(ih1.class, qd1Var);
        hd1 hd1Var = hd1.a;
        kcpVar.a(ktb.e.d.a.class, hd1Var);
        kcpVar.a(jh1.class, hd1Var);
        jd1 jd1Var = jd1.a;
        kcpVar.a(ktb.e.d.a.b.class, jd1Var);
        kcpVar.a(kh1.class, jd1Var);
        md1 md1Var = md1.a;
        kcpVar.a(ktb.e.d.a.b.AbstractC0788d.class, md1Var);
        kcpVar.a(oh1.class, md1Var);
        nd1 nd1Var = nd1.a;
        kcpVar.a(ktb.e.d.a.b.AbstractC0788d.AbstractC0789a.class, nd1Var);
        kcpVar.a(ph1.class, nd1Var);
        kd1 kd1Var = kd1.a;
        kcpVar.a(ktb.e.d.a.b.AbstractC0787b.class, kd1Var);
        kcpVar.a(mh1.class, kd1Var);
        yc1 yc1Var = yc1.a;
        kcpVar.a(ktb.a.class, yc1Var);
        kcpVar.a(zg1.class, yc1Var);
        xc1 xc1Var = xc1.a;
        kcpVar.a(ktb.a.AbstractC0783a.class, xc1Var);
        kcpVar.a(ah1.class, xc1Var);
        ld1 ld1Var = ld1.a;
        kcpVar.a(ktb.e.d.a.b.c.class, ld1Var);
        kcpVar.a(nh1.class, ld1Var);
        id1 id1Var = id1.a;
        kcpVar.a(ktb.e.d.a.b.AbstractC0786a.class, id1Var);
        kcpVar.a(lh1.class, id1Var);
        zc1 zc1Var = zc1.a;
        kcpVar.a(ktb.c.class, zc1Var);
        kcpVar.a(bh1.class, zc1Var);
        od1 od1Var = od1.a;
        kcpVar.a(ktb.e.d.a.c.class, od1Var);
        kcpVar.a(qh1.class, od1Var);
        pd1 pd1Var = pd1.a;
        kcpVar.a(ktb.e.d.c.class, pd1Var);
        kcpVar.a(rh1.class, pd1Var);
        rd1 rd1Var = rd1.a;
        kcpVar.a(ktb.e.d.AbstractC0792d.class, rd1Var);
        kcpVar.a(sh1.class, rd1Var);
        ud1 ud1Var = ud1.a;
        kcpVar.a(ktb.e.d.f.class, ud1Var);
        kcpVar.a(vh1.class, ud1Var);
        sd1 sd1Var = sd1.a;
        kcpVar.a(ktb.e.d.AbstractC0793e.class, sd1Var);
        kcpVar.a(th1.class, sd1Var);
        td1 td1Var = td1.a;
        kcpVar.a(ktb.e.d.AbstractC0793e.b.class, td1Var);
        kcpVar.a(uh1.class, td1Var);
        bd1 bd1Var = bd1.a;
        kcpVar.a(ktb.d.class, bd1Var);
        kcpVar.a(ch1.class, bd1Var);
        cd1 cd1Var = cd1.a;
        kcpVar.a(ktb.d.a.class, cd1Var);
        kcpVar.a(dh1.class, cd1Var);
        kcpVar.d = true;
        a = new jcp(kcpVar);
    }

    public static zg1 a(JsonReader jsonReader) throws IOException {
        zg1.a aVar = new zg1.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    aVar.i = b(jsonReader, new otb());
                    break;
                case "pid":
                    aVar.a = jsonReader.nextInt();
                    aVar.j = (byte) (aVar.j | 1);
                    break;
                case "pss":
                    aVar.e = jsonReader.nextLong();
                    aVar.j = (byte) (aVar.j | 8);
                    break;
                case "rss":
                    aVar.f = jsonReader.nextLong();
                    aVar.j = (byte) (aVar.j | 16);
                    break;
                case "timestamp":
                    aVar.g = jsonReader.nextLong();
                    aVar.j = (byte) (aVar.j | 32);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        bmy.a("Null processName");
                        return null;
                    }
                    aVar.b = strNextString;
                    break;
                    break;
                case "reasonCode":
                    aVar.c = jsonReader.nextInt();
                    aVar.j = (byte) (aVar.j | 2);
                    break;
                case "traceFile":
                    aVar.h = jsonReader.nextString();
                    break;
                case "importance":
                    aVar.d = jsonReader.nextInt();
                    aVar.j = (byte) (aVar.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static <T> List<T> b(JsonReader jsonReader, a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    public static bh1 c(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    bmy.a("Null key");
                    return null;
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    bmy.a("Null value");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new bh1(strNextString, strNextString2);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" key");
        }
        if (strNextString2 == null) {
            sb.append(" value");
        }
        ib5.a(ltb.a(sb, "Missing required properties:"));
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:157:0x024c  */
    /* JADX WARN: Code duplicated, block: B:242:0x03be  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [mh1] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [ktb$a] */
    /* JADX WARN: Type inference failed for: r24v2, types: [zg1] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [nh1] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static ih1 d(JsonReader jsonReader) throws IOException {
        byte b;
        ih1.a aVar = new ih1.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    b = 0;
                    break;
                case "rollouts":
                    b = 1;
                    break;
                case "app":
                    b = 2;
                    break;
                case "log":
                    b = 3;
                    break;
                case "type":
                    b = 4;
                    break;
                case "timestamp":
                    b = 5;
                    break;
                default:
                    b = -1;
                    break;
            }
            ih1 ih1Var = null;
            switch (b) {
                case 0:
                    rh1.a aVar2 = new rh1.a();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                aVar2.a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case "batteryVelocity":
                                aVar2.b = jsonReader.nextInt();
                                aVar2.g = (byte) (aVar2.g | 1);
                                break;
                            case "orientation":
                                aVar2.d = jsonReader.nextInt();
                                aVar2.g = (byte) (aVar2.g | 4);
                                break;
                            case "diskUsed":
                                aVar2.f = jsonReader.nextLong();
                                aVar2.g = (byte) (aVar2.g | 16);
                                break;
                            case "ramUsed":
                                aVar2.e = jsonReader.nextLong();
                                aVar2.g = (byte) (aVar2.g | 8);
                                break;
                            case "proximityOn":
                                aVar2.c = jsonReader.nextBoolean();
                                aVar2.g = (byte) (aVar2.g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    aVar.d = aVar2.a();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List listB = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals("assignments")) {
                            listB = b(jsonReader, new qtb());
                            if (listB == null) {
                                bmy.a("Null rolloutAssignments");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (listB == null) {
                        ib5.a("Missing required properties: rolloutAssignments");
                        return null;
                    }
                    aVar.f = new vh1(listB);
                    break;
                    break;
                case 2:
                    jsonReader.beginObject();
                    kh1 kh1Var = null;
                    List listUnmodifiableList = null;
                    List listUnmodifiableList2 = null;
                    Boolean boolValueOf = null;
                    qh1 qh1VarG = null;
                    List listUnmodifiableList3 = null;
                    boolean z = false;
                    int iNextInt = 0;
                    while (true) {
                        ih1 ih1Var2 = ih1Var;
                        if (!jsonReader.hasNext()) {
                            jsonReader.endObject();
                            if (z && kh1Var != null) {
                                aVar.c = new jh1(kh1Var, listUnmodifiableList, listUnmodifiableList2, boolValueOf, qh1VarG, listUnmodifiableList3, iNextInt);
                                break;
                            }
                            StringBuilder sb = new StringBuilder();
                            if (kh1Var == null) {
                                sb.append(" execution");
                            }
                            if (!z) {
                                sb.append(" uiOrientation");
                            }
                            ib5.a(ltb.a(sb, "Missing required properties:"));
                            return ih1Var2;
                        }
                        String strNextName4 = jsonReader.nextName();
                        strNextName4.getClass();
                        switch (strNextName4) {
                            case "appProcessDetails":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList3 = Collections.unmodifiableList(arrayList);
                                ih1Var = ih1Var2;
                                break;
                            case "background":
                                boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                                ih1Var = ih1Var2;
                                break;
                            case "execution":
                                jsonReader.beginObject();
                                ?? B = ih1Var2;
                                ?? E = B;
                                ?? A = E;
                                ?? nh1Var = A;
                                ?? r26 = nh1Var;
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "appExitInfo":
                                            A = a(jsonReader);
                                            break;
                                        case "threads":
                                            B = b(jsonReader, new rtb());
                                            break;
                                        case "signal":
                                            jsonReader.beginObject();
                                            long jNextLong = 0;
                                            byte b2 = 0;
                                            ?? NextString = ih1Var2;
                                            ?? NextString2 = NextString;
                                            while (jsonReader.hasNext()) {
                                                String strNextName6 = jsonReader.nextName();
                                                strNextName6.getClass();
                                                switch (strNextName6) {
                                                    case "address":
                                                        b2 = (byte) (b2 | 1);
                                                        jNextLong = jsonReader.nextLong();
                                                        break;
                                                    case "code":
                                                        NextString2 = jsonReader.nextString();
                                                        if (NextString2 == 0) {
                                                            bmy.a("Null code");
                                                            return ih1Var2;
                                                        }
                                                        break;
                                                        break;
                                                    case "name":
                                                        NextString = jsonReader.nextString();
                                                        if (NextString == 0) {
                                                            bmy.a("Null name");
                                                            return ih1Var2;
                                                        }
                                                        break;
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            if (b2 == 1 && NextString != 0 && NextString2 != 0) {
                                                nh1Var = new nh1(jNextLong, NextString, NextString2);
                                                break;
                                            } else {
                                                StringBuilder sb2 = new StringBuilder();
                                                if (NextString == 0) {
                                                    sb2.append(" name");
                                                }
                                                if (NextString2 == 0) {
                                                    sb2.append(" code");
                                                }
                                                if ((b2 & 1) == 0) {
                                                    sb2.append(" address");
                                                }
                                                ib5.a(ltb.a(sb2, "Missing required properties:"));
                                                return ih1Var2;
                                            }
                                            break;
                                        case "binaries":
                                            List listB2 = b(jsonReader, new stb());
                                            E = E;
                                            r26 = listB2;
                                            if (listB2 == null) {
                                                bmy.a("Null binaries");
                                                return ih1Var2;
                                            }
                                            break;
                                        case "exception":
                                            E = e(jsonReader);
                                            r26 = r26;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            E = E;
                                            r26 = r26;
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (nh1Var != 0 && r26 != 0) {
                                    kh1Var = new kh1(B, E, A, nh1Var, r26);
                                    ih1Var = ih1Var2;
                                    break;
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    if (nh1Var == 0) {
                                        sb3.append(" signal");
                                    }
                                    if (r26 == 0) {
                                        sb3.append(" binaries");
                                    }
                                    ib5.a(ltb.a(sb3, "Missing required properties:"));
                                    return ih1Var2;
                                }
                                break;
                            case "internalKeys":
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(c(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
                                ih1Var = ih1Var2;
                                break;
                            case "customAttributes":
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(c(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList = Collections.unmodifiableList(arrayList3);
                                ih1Var = ih1Var2;
                                break;
                            case "uiOrientation":
                                iNextInt = jsonReader.nextInt();
                                z = true;
                                ih1Var = ih1Var2;
                                break;
                            case "currentProcessDetails":
                                qh1VarG = g(jsonReader);
                                ih1Var = ih1Var2;
                                break;
                            default:
                                jsonReader.skipValue();
                                ih1Var = ih1Var2;
                                break;
                        }
                    }
                    break;
                case 3:
                    jsonReader.beginObject();
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                bmy.a("Null content");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (strNextString == null) {
                        ib5.a("Missing required properties: content");
                        return null;
                    }
                    aVar.e = new sh1(strNextString);
                    break;
                    break;
                case 4:
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        bmy.a("Null type");
                        return null;
                    }
                    aVar.b = strNextString2;
                    break;
                    break;
                case 5:
                    aVar.a = jsonReader.nextLong();
                    aVar.g = (byte) (aVar.g | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static mh1 e(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        byte b = 0;
        int iNextInt = 0;
        String strNextString = null;
        String strNextString2 = null;
        List listB = null;
        mh1 mh1VarE = null;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b == 1 && strNextString != null && listB != null) {
                    return new mh1(strNextString, strNextString2, listB, mh1VarE, iNextInt);
                }
                StringBuilder sb = new StringBuilder();
                if (strNextString == null) {
                    sb.append(" type");
                }
                if (listB == null) {
                    sb.append(" frames");
                }
                if ((b & 1) == 0) {
                    sb.append(" overflowCount");
                }
                ib5.a(ltb.a(sb, "Missing required properties:"));
                return null;
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    listB = b(jsonReader, new ntb());
                    if (listB == null) {
                        bmy.a("Null frames");
                        return null;
                    }
                    break;
                    break;
                case "reason":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "type":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        bmy.a("Null type");
                        return null;
                    }
                    break;
                    break;
                case "causedBy":
                    mh1VarE = e(jsonReader);
                    break;
                case "overflowCount":
                    iNextInt = jsonReader.nextInt();
                    b = (byte) (b | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    public static ph1 f(JsonReader jsonReader) throws IOException {
        ph1.a aVar = new ph1.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    aVar.d = jsonReader.nextLong();
                    aVar.f = (byte) (aVar.f | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        bmy.a("Null symbol");
                        return null;
                    }
                    aVar.b = strNextString;
                    break;
                    break;
                case "pc":
                    aVar.a = jsonReader.nextLong();
                    aVar.f = (byte) (aVar.f | 1);
                    break;
                case "file":
                    aVar.c = jsonReader.nextString();
                    break;
                case "importance":
                    aVar.e = jsonReader.nextInt();
                    aVar.f = (byte) (aVar.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static qh1 g(JsonReader jsonReader) throws IOException {
        qh1.a aVar = new qh1.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    aVar.b = jsonReader.nextInt();
                    aVar.e = (byte) (aVar.e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        bmy.a("Null processName");
                        return null;
                    }
                    aVar.a = strNextString;
                    break;
                    break;
                case "defaultProcess":
                    aVar.d = jsonReader.nextBoolean();
                    aVar.e = (byte) (aVar.e | 4);
                    break;
                case "importance":
                    aVar.c = jsonReader.nextInt();
                    aVar.e = (byte) (aVar.e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0256  */
    public static xg1 h(JsonReader jsonReader) throws IOException {
        byte b;
        Charset charset = ktb.a;
        xg1.a aVar = new xg1.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    jsonReader.beginObject();
                    List listB = null;
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            listB = b(jsonReader, new ptb());
                            if (listB == null) {
                                bmy.a("Null files");
                                return null;
                            }
                        } else if (strNextName2.equals("orgId")) {
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (listB == null) {
                        ib5.a("Missing required properties: files");
                        return null;
                    }
                    aVar.k = new ch1(listB, strNextString);
                    continue;
                    break;
                    break;
                case "sdkVersion":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        bmy.a("Null sdkVersion");
                        return null;
                    }
                    aVar.a = strNextString2;
                    break;
                    break;
                case "appQualitySessionId":
                    aVar.g = jsonReader.nextString();
                    break;
                case "appExitInfo":
                    aVar.l = a(jsonReader);
                    break;
                case "buildVersion":
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        bmy.a("Null buildVersion");
                        return null;
                    }
                    aVar.h = strNextString3;
                    break;
                    break;
                case "firebaseAuthenticationToken":
                    aVar.f = jsonReader.nextString();
                    break;
                case "gmpAppId":
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        bmy.a("Null gmpAppId");
                        return null;
                    }
                    aVar.b = strNextString4;
                    break;
                    break;
                case "installationUuid":
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        bmy.a("Null installationUuid");
                        return null;
                    }
                    aVar.d = strNextString5;
                    break;
                    break;
                case "firebaseInstallationId":
                    aVar.e = jsonReader.nextString();
                    break;
                case "platform":
                    aVar.c = jsonReader.nextInt();
                    aVar.m = (byte) (aVar.m | 1);
                    break;
                case "displayVersion":
                    String strNextString6 = jsonReader.nextString();
                    if (strNextString6 == null) {
                        bmy.a("Null displayVersion");
                        return null;
                    }
                    aVar.i = strNextString6;
                    break;
                    break;
                case "session":
                    eh1.a aVar2 = new eh1.a();
                    aVar2.f = false;
                    aVar2.m = (byte) (aVar2.m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                aVar2.d = jsonReader.nextLong();
                                aVar2.m = (byte) (aVar2.m | 1);
                                break;
                            case "appQualitySessionId":
                                aVar2.c = jsonReader.nextString();
                                break;
                            case "identifier":
                                aVar2.b = new String(Base64.decode(jsonReader.nextString(), 2), ktb.a);
                                break;
                            case "endedAt":
                                aVar2.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                hh1.a aVar3 = new hh1.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            aVar3.f = jsonReader.nextBoolean();
                                            aVar3.j = (byte) (aVar3.j | 16);
                                            break;
                                        case "manufacturer":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                bmy.a("Null manufacturer");
                                                return null;
                                            }
                                            aVar3.h = strNextString7;
                                            break;
                                            break;
                                        case "ram":
                                            aVar3.d = jsonReader.nextLong();
                                            aVar3.j = (byte) (aVar3.j | 4);
                                            break;
                                        case "arch":
                                            aVar3.a = jsonReader.nextInt();
                                            aVar3.j = (byte) (aVar3.j | 1);
                                            break;
                                        case "diskSpace":
                                            aVar3.e = jsonReader.nextLong();
                                            aVar3.j = (byte) (aVar3.j | 8);
                                            break;
                                        case "cores":
                                            aVar3.c = jsonReader.nextInt();
                                            aVar3.j = (byte) (aVar3.j | 2);
                                            break;
                                        case "model":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                bmy.a("Null model");
                                                return null;
                                            }
                                            aVar3.b = strNextString8;
                                            break;
                                            break;
                                        case "state":
                                            aVar3.g = jsonReader.nextInt();
                                            aVar3.j = (byte) (aVar3.j | 32);
                                            break;
                                        case "modelClass":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                bmy.a("Null modelClass");
                                                return null;
                                            }
                                            aVar3.i = strNextString9;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                aVar2.j = aVar3.a();
                                break;
                            case "events":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(d(jsonReader));
                                }
                                jsonReader.endArray();
                                aVar2.k = Collections.unmodifiableList(arrayList);
                                break;
                            case "os":
                                wh1.a aVar4 = new wh1.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            String strNextString10 = jsonReader.nextString();
                                            if (strNextString10 == null) {
                                                bmy.a("Null buildVersion");
                                                return null;
                                            }
                                            aVar4.c = strNextString10;
                                            break;
                                            break;
                                        case "jailbroken":
                                            aVar4.d = jsonReader.nextBoolean();
                                            aVar4.e = (byte) (aVar4.e | 2);
                                            break;
                                        case "version":
                                            String strNextString11 = jsonReader.nextString();
                                            if (strNextString11 == null) {
                                                bmy.a("Null version");
                                                return null;
                                            }
                                            aVar4.b = strNextString11;
                                            break;
                                            break;
                                        case "platform":
                                            aVar4.a = jsonReader.nextInt();
                                            aVar4.e = (byte) (aVar4.e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                aVar2.i = aVar4.a();
                                break;
                            case "app":
                                jsonReader.beginObject();
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                String strNextString15 = null;
                                String strNextString16 = null;
                                String strNextString17 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6.hashCode()) {
                                        case -1618432855:
                                            if (!strNextName6.equals("identifier")) {
                                                b = -1;
                                            } else {
                                                b = 0;
                                            }
                                            break;
                                        case -519438642:
                                            if (!strNextName6.equals("developmentPlatform")) {
                                                b = -1;
                                            } else {
                                                b = 1;
                                            }
                                            break;
                                        case 213652010:
                                            if (!strNextName6.equals("developmentPlatformVersion")) {
                                                b = -1;
                                            } else {
                                                b = 2;
                                            }
                                            break;
                                        case 351608024:
                                            b = !strNextName6.equals("version") ? (byte) -1 : (byte) 3;
                                            break;
                                        case 719853845:
                                            b = !strNextName6.equals("installationUuid") ? (byte) -1 : (byte) 4;
                                            break;
                                        case 1975623094:
                                            b = !strNextName6.equals("displayVersion") ? (byte) -1 : (byte) 5;
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    switch (b) {
                                        case 0:
                                            strNextString17 = jsonReader.nextString();
                                            if (strNextString17 == null) {
                                                bmy.a("Null identifier");
                                                return null;
                                            }
                                            break;
                                            break;
                                        case 1:
                                            strNextString15 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            strNextString16 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            strNextString12 = jsonReader.nextString();
                                            if (strNextString12 == null) {
                                                bmy.a("Null version");
                                                return null;
                                            }
                                            break;
                                            break;
                                        case 4:
                                            strNextString14 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            strNextString13 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString17 != null && strNextString12 != null) {
                                    aVar2.g = new fh1(strNextString17, strNextString12, strNextString13, strNextString14, strNextString15, strNextString16);
                                    break;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    if (strNextString17 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (strNextString12 == null) {
                                        sb.append(" version");
                                    }
                                    ib5.a(ltb.a(sb, "Missing required properties:"));
                                    return null;
                                }
                                break;
                            case "user":
                                jsonReader.beginObject();
                                String strNextString18 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        strNextString18 = jsonReader.nextString();
                                        if (strNextString18 == null) {
                                            bmy.a("Null identifier");
                                            return null;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString18 == null) {
                                    ib5.a("Missing required properties: identifier");
                                    return null;
                                }
                                aVar2.h = new xh1(strNextString18);
                                break;
                                break;
                            case "generator":
                                String strNextString19 = jsonReader.nextString();
                                if (strNextString19 == null) {
                                    bmy.a("Null generator");
                                    return null;
                                }
                                aVar2.a = strNextString19;
                                break;
                                break;
                            case "crashed":
                                aVar2.f = jsonReader.nextBoolean();
                                aVar2.m = (byte) (aVar2.m | 2);
                                break;
                            case "generatorType":
                                aVar2.l = jsonReader.nextInt();
                                aVar2.m = (byte) (aVar2.m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    aVar.j = aVar2.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static xg1 i(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                xg1 xg1VarH = h(jsonReader);
                jsonReader.close();
                return xg1VarH;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
