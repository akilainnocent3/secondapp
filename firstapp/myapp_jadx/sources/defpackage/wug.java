package defpackage;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class wug {
    public static final jvg[] b;
    public static final jvg[][] c;
    public static final HashSet<String> d;
    public static final String e;
    public final ArrayList a;

    public static final class a {
        public static final Pattern b = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final Pattern c = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final Pattern d = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final ArrayList e;
        public final ArrayList a;

        /* JADX INFO: renamed from: wug$a$a, reason: collision with other inner class name */
        public class C1268a implements Enumeration<HashMap<String, jvg>> {
            public int a;

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                int i = this.a;
                jvg[] jvgVarArr = wug.b;
                return i < 4;
            }

            @Override // java.util.Enumeration
            public final HashMap<String, jvg> nextElement() {
                HashMap<String, jvg> map = new HashMap<>();
                for (jvg jvgVar : wug.c[this.a]) {
                    map.put(jvgVar.b, jvgVar);
                }
                this.a++;
                return map;
            }
        }

        public class b implements Enumeration<Map<String, vug>> {
            public int a;

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                int i = this.a;
                jvg[] jvgVarArr = wug.b;
                return i < 4;
            }

            @Override // java.util.Enumeration
            public final Map<String, vug> nextElement() {
                this.a++;
                return new HashMap();
            }
        }

        static {
            C1268a c1268a = new C1268a();
            c1268a.a = 0;
            e = Collections.list(c1268a);
        }

        public a() {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            b bVar = new b();
            bVar.a = 0;
            this.a = Collections.list(bVar);
        }

        public static Pair<Integer, Integer> a(String str) {
            if (str.contains(",")) {
                String[] strArrSplit = str.split(",", -1);
                Pair<Integer, Integer> pairA = a(strArrSplit[0]);
                if (((Integer) pairA.first).intValue() == 2) {
                    return pairA;
                }
                for (int i = 1; i < strArrSplit.length; i++) {
                    Pair<Integer, Integer> pairA2 = a(strArrSplit[i]);
                    int iIntValue = (((Integer) pairA2.first).equals(pairA.first) || ((Integer) pairA2.second).equals(pairA.first)) ? ((Integer) pairA.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairA.second).intValue() == -1 || !(((Integer) pairA2.first).equals(pairA.second) || ((Integer) pairA2.second).equals(pairA.second))) ? -1 : ((Integer) pairA.second).intValue();
                    if (iIntValue == -1 && iIntValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (iIntValue == -1) {
                        pairA = new Pair<>(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairA = new Pair<>(Integer.valueOf(iIntValue), -1);
                    }
                }
                return pairA;
            }
            if (!str.contains("/")) {
                try {
                    try {
                        long j = Long.parseLong(str);
                        if (j < 0 || j > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                            return j < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1);
                        }
                        return new Pair<>(3, 4);
                    } catch (NumberFormatException unused) {
                        return new Pair<>(2, -1);
                    }
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            }
            String[] strArrSplit2 = str.split("/", -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                    long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                    if (j2 >= 0 && j3 >= 0) {
                        if (j2 <= 2147483647L && j3 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair<>(2, -1);
        }

        public final void b(String str, String str2, ArrayList arrayList) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((Map) obj).containsKey(str)) {
                    return;
                }
            }
            c(str, str2, arrayList);
        }

        /* JADX WARN: Code duplicated, block: B:102:0x031a A[LOOP:9: B:100:0x0317->B:102:0x031a, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:104:0x0333  */
        /* JADX WARN: Code duplicated, block: B:107:0x0343 A[LOOP:10: B:105:0x0340->B:107:0x0343, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:110:0x0365 A[LOOP:11: B:109:0x0363->B:110:0x0365, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:113:0x0380  */
        /* JADX WARN: Code duplicated, block: B:114:0x03a2  */
        /* JADX WARN: Code duplicated, block: B:116:0x03b6  */
        /* JADX WARN: Code duplicated, block: B:121:0x03d6  */
        /* JADX WARN: Code duplicated, block: B:61:0x0176  */
        /* JADX WARN: Code duplicated, block: B:65:0x017f  */
        /* JADX WARN: Code duplicated, block: B:68:0x018a A[LOOP:1: B:66:0x0187->B:68:0x018a, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:71:0x01ae A[LOOP:2: B:70:0x01ac->B:71:0x01ae, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:74:0x01d2  */
        /* JADX WARN: Code duplicated, block: B:77:0x01df A[LOOP:3: B:75:0x01dc->B:77:0x01df, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:80:0x0223 A[LOOP:4: B:79:0x0221->B:80:0x0223, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:82:0x0247  */
        /* JADX WARN: Code duplicated, block: B:85:0x0257 A[LOOP:5: B:83:0x0254->B:85:0x0257, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:88:0x027b A[LOOP:6: B:87:0x0279->B:88:0x027b, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:90:0x0295  */
        /* JADX WARN: Code duplicated, block: B:93:0x02a5 A[LOOP:7: B:91:0x02a2->B:93:0x02a5, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:96:0x02e6 A[LOOP:8: B:95:0x02e4->B:96:0x02e6, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:99:0x030a  */
        public final void c(String str, String str2, List<Map<String, vug>> list) {
            int i;
            int i2;
            int i3;
            vug vugVar;
            String[] strArrSplit;
            int length;
            int[] iArr;
            int i4;
            ByteBuffer byteBufferWrap;
            int i5;
            int i6;
            String[] strArrSplit2;
            long[] jArr;
            int i7;
            int i8;
            String[] strArrSplit3;
            int length2;
            nkt[] nktVarArr;
            int i9;
            int i10;
            ByteBuffer byteBufferWrap2;
            int i11;
            String[] strArrSplit4;
            int length3;
            int[] iArr2;
            int i12;
            ByteBuffer byteBufferWrap3;
            int i13;
            int i14;
            String[] strArrSplit5;
            int length4;
            nkt[] nktVarArr2;
            int i15;
            ByteBuffer byteBufferWrap4;
            int i16;
            String[] strArrSplit6;
            int length5;
            double[] dArr;
            int i17;
            ByteBuffer byteBufferWrap5;
            int i18;
            String str3 = str;
            String strReplaceAll = str2;
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
                boolean zFind = c.matcher(strReplaceAll).find();
                boolean zFind2 = d.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                    pgt.i("ExifData", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", ":");
                }
            }
            if ("ISOSpeedRatings".equals(str3)) {
                str3 = "PhotographicSensitivity";
            }
            String str4 = str3;
            int i19 = 3;
            int i20 = 2;
            int i21 = 1;
            if (strReplaceAll != null && wug.d.contains(str4)) {
                if (str4.equals("GPSTimeStamp")) {
                    Matcher matcher = b.matcher(strReplaceAll);
                    if (!matcher.find()) {
                        pgt.i("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    sb.append(Integer.parseInt(strGroup));
                    sb.append("/1,");
                    String strGroup2 = matcher.group(2);
                    strGroup2.getClass();
                    sb.append(Integer.parseInt(strGroup2));
                    sb.append("/1,");
                    String strGroup3 = matcher.group(3);
                    strGroup3.getClass();
                    sb.append(Integer.parseInt(strGroup3));
                    sb.append("/1");
                    strReplaceAll = sb.toString();
                } else {
                    try {
                        strReplaceAll = ((long) (Double.parseDouble(strReplaceAll) * 10000.0d)) + "/10000";
                    } catch (NumberFormatException e2) {
                        pgt.j("ExifData", lx5.a("Invalid value for ", str4, " : ", strReplaceAll), e2);
                        return;
                    }
                }
            }
            int i22 = 0;
            while (true) {
                jvg[] jvgVarArr = wug.b;
                if (i22 >= 4) {
                    return;
                }
                jvg jvgVar = (jvg) ((HashMap) e.get(i22)).get(str4);
                if (jvgVar != null) {
                    int i23 = jvgVar.d;
                    int i24 = jvgVar.c;
                    if (strReplaceAll != null) {
                        Pair<Integer, Integer> pairA = a(strReplaceAll);
                        int i25 = -1;
                        if (i24 != ((Integer) pairA.first).intValue() && i24 != ((Integer) pairA.second).intValue()) {
                            if (i23 == -1 || (i23 != ((Integer) pairA.first).intValue() && i23 != ((Integer) pairA.second).intValue())) {
                                if (i24 == i21 || i24 == 7 || i24 == i20) {
                                    i23 = i24;
                                    switch (i23) {
                                        case 1:
                                            i = i20;
                                            int i26 = i21;
                                            i3 = i19;
                                            Map<String, vug> map = list.get(i22);
                                            Charset charset = vug.d;
                                            i2 = i26;
                                            if (strReplaceAll.length() == i2) {
                                                byte[] bytes = strReplaceAll.getBytes(vug.d);
                                                vugVar = new vug(bytes, i2, bytes.length);
                                            } else {
                                                byte[] bytes2 = strReplaceAll.getBytes(vug.d);
                                                vugVar = new vug(bytes2, i2, bytes2.length);
                                            }
                                            map.put(str4, vugVar);
                                            break;
                                        case 2:
                                        case 7:
                                            i3 = i19;
                                            Map<String, vug> map2 = list.get(i22);
                                            Charset charset2 = vug.d;
                                            byte[] bytes3 = strReplaceAll.concat("\u0000").getBytes(vug.d);
                                            i = 2;
                                            map2.put(str4, new vug(bytes3, 2, bytes3.length));
                                            i2 = i21;
                                            break;
                                        case 3:
                                            int i27 = i19;
                                            strArrSplit = strReplaceAll.split(",", -1);
                                            length = strArrSplit.length;
                                            iArr = new int[length];
                                            while (i4 < strArrSplit.length) {
                                                iArr[i4] = Integer.parseInt(strArrSplit[i4]);
                                            }
                                            Map<String, vug> map3 = list.get(i22);
                                            byteBufferWrap = ByteBuffer.wrap(new byte[vug.f[i27] * length]);
                                            byteBufferWrap.order(byteOrder);
                                            while (i5 < length) {
                                                byteBufferWrap.putShort((short) iArr[i5]);
                                            }
                                            i3 = i27;
                                            map3.put(str4, new vug(byteBufferWrap.array(), i3, length));
                                            i = 2;
                                            i2 = i21;
                                            break;
                                        case 4:
                                            i6 = i21;
                                            strArrSplit2 = strReplaceAll.split(",", -1);
                                            jArr = new long[strArrSplit2.length];
                                            while (i7 < strArrSplit2.length) {
                                                jArr[i7] = Long.parseLong(strArrSplit2[i7]);
                                            }
                                            list.get(i22).put(str4, vug.b(jArr, byteOrder));
                                            i = 2;
                                            i2 = i6;
                                            i3 = i19;
                                            break;
                                        case 5:
                                            i6 = i21;
                                            i8 = -1;
                                            strArrSplit3 = strReplaceAll.split(",", -1);
                                            length2 = strArrSplit3.length;
                                            nktVarArr = new nkt[length2];
                                            i9 = 0;
                                            while (i9 < strArrSplit3.length) {
                                                String[] strArrSplit7 = strArrSplit3[i9].split("/", i8);
                                                nktVarArr[i9] = new nkt((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[i6]));
                                                i9++;
                                                length2 = length2;
                                                i8 = -1;
                                            }
                                            i10 = length2;
                                            Map<String, vug> map4 = list.get(i22);
                                            byteBufferWrap2 = ByteBuffer.wrap(new byte[vug.f[5] * i10]);
                                            byteBufferWrap2.order(byteOrder);
                                            while (i11 < i10) {
                                                nkt nktVar = nktVarArr[i11];
                                                byteBufferWrap2.putInt((int) nktVar.a);
                                                byteBufferWrap2.putInt((int) nktVar.b);
                                            }
                                            map4.put(str4, new vug(byteBufferWrap2.array(), 5, i10));
                                            i = 2;
                                            i2 = i6;
                                            i3 = i19;
                                            break;
                                        case 9:
                                            int i28 = i19;
                                            int i29 = i21;
                                            strArrSplit4 = strReplaceAll.split(",", -1);
                                            length3 = strArrSplit4.length;
                                            iArr2 = new int[length3];
                                            while (i12 < strArrSplit4.length) {
                                                iArr2[i12] = Integer.parseInt(strArrSplit4[i12]);
                                            }
                                            Map<String, vug> map5 = list.get(i22);
                                            byteBufferWrap3 = ByteBuffer.wrap(new byte[vug.f[9] * length3]);
                                            byteBufferWrap3.order(byteOrder);
                                            while (i13 < length3) {
                                                byteBufferWrap3.putInt(iArr2[i13]);
                                            }
                                            map5.put(str4, new vug(byteBufferWrap3.array(), 9, length3));
                                            i2 = i29;
                                            i3 = i28;
                                            i = i20;
                                            break;
                                        case 10:
                                            i14 = i21;
                                            strArrSplit5 = strReplaceAll.split(",", -1);
                                            length4 = strArrSplit5.length;
                                            nktVarArr2 = new nkt[length4];
                                            i15 = 0;
                                            while (i15 < strArrSplit5.length) {
                                                String[] strArrSplit8 = strArrSplit5[i15].split("/", i25);
                                                nktVarArr2[i15] = new nkt((long) Double.parseDouble(strArrSplit8[0]), (long) Double.parseDouble(strArrSplit8[i14]));
                                                i15++;
                                                i19 = i19;
                                                strReplaceAll = strReplaceAll;
                                                i25 = -1;
                                            }
                                            int i30 = i19;
                                            String str5 = strReplaceAll;
                                            Map<String, vug> map6 = list.get(i22);
                                            byteBufferWrap4 = ByteBuffer.wrap(new byte[vug.f[10] * length4]);
                                            byteBufferWrap4.order(byteOrder);
                                            while (i16 < length4) {
                                                nkt nktVar2 = nktVarArr2[i16];
                                                byteBufferWrap4.putInt((int) nktVar2.a);
                                                byteBufferWrap4.putInt((int) nktVar2.b);
                                            }
                                            map6.put(str4, new vug(byteBufferWrap4.array(), 10, length4));
                                            i2 = i14;
                                            i3 = i30;
                                            strReplaceAll = str5;
                                            i = i20;
                                            break;
                                        case 12:
                                            strArrSplit6 = strReplaceAll.split(",", -1);
                                            length5 = strArrSplit6.length;
                                            dArr = new double[length5];
                                            while (i17 < strArrSplit6.length) {
                                                dArr[i17] = Double.parseDouble(strArrSplit6[i17]);
                                            }
                                            Map<String, vug> map7 = list.get(i22);
                                            byteBufferWrap5 = ByteBuffer.wrap(new byte[vug.f[12] * length5]);
                                            byteBufferWrap5.order(byteOrder);
                                            i18 = 0;
                                            while (i18 < length5) {
                                                double[] dArr2 = dArr;
                                                byteBufferWrap5.putDouble(dArr2[i18]);
                                                i18++;
                                                i21 = i21;
                                                dArr = dArr2;
                                            }
                                            map7.put(str4, new vug(byteBufferWrap5.array(), 12, length5));
                                            i2 = i21;
                                            i3 = i19;
                                            i = i20;
                                            break;
                                    }
                                }
                            } else {
                                switch (i23) {
                                    case 1:
                                        i = i20;
                                        int i210 = i21;
                                        i3 = i19;
                                        Map<String, vug> map8 = list.get(i22);
                                        Charset charset3 = vug.d;
                                        i2 = i210;
                                        if (strReplaceAll.length() == i2) {
                                            byte[] bytes4 = strReplaceAll.getBytes(vug.d);
                                            vugVar = new vug(bytes4, i2, bytes4.length);
                                        } else {
                                            byte[] bytes5 = strReplaceAll.getBytes(vug.d);
                                            vugVar = new vug(bytes5, i2, bytes5.length);
                                        }
                                        map8.put(str4, vugVar);
                                        break;
                                    case 2:
                                    case 7:
                                        i3 = i19;
                                        Map<String, vug> map9 = list.get(i22);
                                        Charset charset4 = vug.d;
                                        byte[] bytes6 = strReplaceAll.concat("\u0000").getBytes(vug.d);
                                        i = 2;
                                        map9.put(str4, new vug(bytes6, 2, bytes6.length));
                                        i2 = i21;
                                        break;
                                    case 3:
                                        int i211 = i19;
                                        strArrSplit = strReplaceAll.split(",", -1);
                                        length = strArrSplit.length;
                                        iArr = new int[length];
                                        for (i4 = 0; i4 < strArrSplit.length; i4++) {
                                            iArr[i4] = Integer.parseInt(strArrSplit[i4]);
                                        }
                                        Map<String, vug> map10 = list.get(i22);
                                        byteBufferWrap = ByteBuffer.wrap(new byte[vug.f[i211] * length]);
                                        byteBufferWrap.order(byteOrder);
                                        for (i5 = 0; i5 < length; i5++) {
                                            byteBufferWrap.putShort((short) iArr[i5]);
                                        }
                                        i3 = i211;
                                        map10.put(str4, new vug(byteBufferWrap.array(), i3, length));
                                        i = 2;
                                        i2 = i21;
                                        break;
                                    case 4:
                                        i6 = i21;
                                        strArrSplit2 = strReplaceAll.split(",", -1);
                                        jArr = new long[strArrSplit2.length];
                                        for (i7 = 0; i7 < strArrSplit2.length; i7++) {
                                            jArr[i7] = Long.parseLong(strArrSplit2[i7]);
                                        }
                                        list.get(i22).put(str4, vug.b(jArr, byteOrder));
                                        i = 2;
                                        i2 = i6;
                                        i3 = i19;
                                        break;
                                    case 5:
                                        i6 = i21;
                                        i8 = -1;
                                        strArrSplit3 = strReplaceAll.split(",", -1);
                                        length2 = strArrSplit3.length;
                                        nktVarArr = new nkt[length2];
                                        i9 = 0;
                                        while (i9 < strArrSplit3.length) {
                                            String[] strArrSplit9 = strArrSplit3[i9].split("/", i8);
                                            nktVarArr[i9] = new nkt((long) Double.parseDouble(strArrSplit9[0]), (long) Double.parseDouble(strArrSplit9[i6]));
                                            i9++;
                                            length2 = length2;
                                            i8 = -1;
                                        }
                                        i10 = length2;
                                        Map<String, vug> map11 = list.get(i22);
                                        byteBufferWrap2 = ByteBuffer.wrap(new byte[vug.f[5] * i10]);
                                        byteBufferWrap2.order(byteOrder);
                                        for (i11 = 0; i11 < i10; i11++) {
                                            nkt nktVar3 = nktVarArr[i11];
                                            byteBufferWrap2.putInt((int) nktVar3.a);
                                            byteBufferWrap2.putInt((int) nktVar3.b);
                                        }
                                        map11.put(str4, new vug(byteBufferWrap2.array(), 5, i10));
                                        i = 2;
                                        i2 = i6;
                                        i3 = i19;
                                        break;
                                    case 9:
                                        int i212 = i19;
                                        int i213 = i21;
                                        strArrSplit4 = strReplaceAll.split(",", -1);
                                        length3 = strArrSplit4.length;
                                        iArr2 = new int[length3];
                                        for (i12 = 0; i12 < strArrSplit4.length; i12++) {
                                            iArr2[i12] = Integer.parseInt(strArrSplit4[i12]);
                                        }
                                        Map<String, vug> map12 = list.get(i22);
                                        byteBufferWrap3 = ByteBuffer.wrap(new byte[vug.f[9] * length3]);
                                        byteBufferWrap3.order(byteOrder);
                                        for (i13 = 0; i13 < length3; i13++) {
                                            byteBufferWrap3.putInt(iArr2[i13]);
                                        }
                                        map12.put(str4, new vug(byteBufferWrap3.array(), 9, length3));
                                        i2 = i213;
                                        i3 = i212;
                                        i = i20;
                                        break;
                                    case 10:
                                        i14 = i21;
                                        strArrSplit5 = strReplaceAll.split(",", -1);
                                        length4 = strArrSplit5.length;
                                        nktVarArr2 = new nkt[length4];
                                        i15 = 0;
                                        while (i15 < strArrSplit5.length) {
                                            String[] strArrSplit10 = strArrSplit5[i15].split("/", i25);
                                            nktVarArr2[i15] = new nkt((long) Double.parseDouble(strArrSplit10[0]), (long) Double.parseDouble(strArrSplit10[i14]));
                                            i15++;
                                            i19 = i19;
                                            strReplaceAll = strReplaceAll;
                                            i25 = -1;
                                        }
                                        int i31 = i19;
                                        String str6 = strReplaceAll;
                                        Map<String, vug> map13 = list.get(i22);
                                        byteBufferWrap4 = ByteBuffer.wrap(new byte[vug.f[10] * length4]);
                                        byteBufferWrap4.order(byteOrder);
                                        for (i16 = 0; i16 < length4; i16++) {
                                            nkt nktVar4 = nktVarArr2[i16];
                                            byteBufferWrap4.putInt((int) nktVar4.a);
                                            byteBufferWrap4.putInt((int) nktVar4.b);
                                        }
                                        map13.put(str4, new vug(byteBufferWrap4.array(), 10, length4));
                                        i2 = i14;
                                        i3 = i31;
                                        strReplaceAll = str6;
                                        i = i20;
                                        break;
                                    case 12:
                                        strArrSplit6 = strReplaceAll.split(",", -1);
                                        length5 = strArrSplit6.length;
                                        dArr = new double[length5];
                                        for (i17 = 0; i17 < strArrSplit6.length; i17++) {
                                            dArr[i17] = Double.parseDouble(strArrSplit6[i17]);
                                        }
                                        Map<String, vug> map14 = list.get(i22);
                                        byteBufferWrap5 = ByteBuffer.wrap(new byte[vug.f[12] * length5]);
                                        byteBufferWrap5.order(byteOrder);
                                        i18 = 0;
                                        while (i18 < length5) {
                                            double[] dArr3 = dArr;
                                            byteBufferWrap5.putDouble(dArr3[i18]);
                                            i18++;
                                            i21 = i21;
                                            dArr = dArr3;
                                        }
                                        map14.put(str4, new vug(byteBufferWrap5.array(), 12, length5));
                                        i2 = i21;
                                        i3 = i19;
                                        i = i20;
                                        break;
                                }
                            }
                        } else {
                            i23 = i24;
                            switch (i23) {
                                case 1:
                                    i = i20;
                                    int i214 = i21;
                                    i3 = i19;
                                    Map<String, vug> map15 = list.get(i22);
                                    Charset charset5 = vug.d;
                                    i2 = i214;
                                    if (strReplaceAll.length() == i2 || strReplaceAll.charAt(0) < '0' || strReplaceAll.charAt(0) > '1') {
                                        byte[] bytes7 = strReplaceAll.getBytes(vug.d);
                                        vugVar = new vug(bytes7, i2, bytes7.length);
                                    } else {
                                        byte[] bArr = new byte[i2];
                                        bArr[0] = (byte) (strReplaceAll.charAt(0) - '0');
                                        vugVar = new vug(bArr, i2, i2);
                                    }
                                    map15.put(str4, vugVar);
                                    break;
                                case 2:
                                case 7:
                                    i3 = i19;
                                    Map<String, vug> map16 = list.get(i22);
                                    Charset charset6 = vug.d;
                                    byte[] bytes8 = strReplaceAll.concat("\u0000").getBytes(vug.d);
                                    i = 2;
                                    map16.put(str4, new vug(bytes8, 2, bytes8.length));
                                    i2 = i21;
                                    break;
                                case 3:
                                    int i215 = i19;
                                    strArrSplit = strReplaceAll.split(",", -1);
                                    length = strArrSplit.length;
                                    iArr = new int[length];
                                    while (i4 < strArrSplit.length) {
                                        iArr[i4] = Integer.parseInt(strArrSplit[i4]);
                                    }
                                    Map<String, vug> map17 = list.get(i22);
                                    byteBufferWrap = ByteBuffer.wrap(new byte[vug.f[i215] * length]);
                                    byteBufferWrap.order(byteOrder);
                                    while (i5 < length) {
                                        byteBufferWrap.putShort((short) iArr[i5]);
                                    }
                                    i3 = i215;
                                    map17.put(str4, new vug(byteBufferWrap.array(), i3, length));
                                    i = 2;
                                    i2 = i21;
                                    break;
                                case 4:
                                    i6 = i21;
                                    strArrSplit2 = strReplaceAll.split(",", -1);
                                    jArr = new long[strArrSplit2.length];
                                    while (i7 < strArrSplit2.length) {
                                        jArr[i7] = Long.parseLong(strArrSplit2[i7]);
                                    }
                                    list.get(i22).put(str4, vug.b(jArr, byteOrder));
                                    i = 2;
                                    i2 = i6;
                                    i3 = i19;
                                    break;
                                case 5:
                                    i6 = i21;
                                    i8 = -1;
                                    strArrSplit3 = strReplaceAll.split(",", -1);
                                    length2 = strArrSplit3.length;
                                    nktVarArr = new nkt[length2];
                                    i9 = 0;
                                    while (i9 < strArrSplit3.length) {
                                        String[] strArrSplit11 = strArrSplit3[i9].split("/", i8);
                                        nktVarArr[i9] = new nkt((long) Double.parseDouble(strArrSplit11[0]), (long) Double.parseDouble(strArrSplit11[i6]));
                                        i9++;
                                        length2 = length2;
                                        i8 = -1;
                                    }
                                    i10 = length2;
                                    Map<String, vug> map18 = list.get(i22);
                                    byteBufferWrap2 = ByteBuffer.wrap(new byte[vug.f[5] * i10]);
                                    byteBufferWrap2.order(byteOrder);
                                    while (i11 < i10) {
                                        nkt nktVar5 = nktVarArr[i11];
                                        byteBufferWrap2.putInt((int) nktVar5.a);
                                        byteBufferWrap2.putInt((int) nktVar5.b);
                                    }
                                    map18.put(str4, new vug(byteBufferWrap2.array(), 5, i10));
                                    i = 2;
                                    i2 = i6;
                                    i3 = i19;
                                    break;
                                case 9:
                                    int i216 = i19;
                                    int i217 = i21;
                                    strArrSplit4 = strReplaceAll.split(",", -1);
                                    length3 = strArrSplit4.length;
                                    iArr2 = new int[length3];
                                    while (i12 < strArrSplit4.length) {
                                        iArr2[i12] = Integer.parseInt(strArrSplit4[i12]);
                                    }
                                    Map<String, vug> map19 = list.get(i22);
                                    byteBufferWrap3 = ByteBuffer.wrap(new byte[vug.f[9] * length3]);
                                    byteBufferWrap3.order(byteOrder);
                                    while (i13 < length3) {
                                        byteBufferWrap3.putInt(iArr2[i13]);
                                    }
                                    map19.put(str4, new vug(byteBufferWrap3.array(), 9, length3));
                                    i2 = i217;
                                    i3 = i216;
                                    i = i20;
                                    break;
                                case 10:
                                    i14 = i21;
                                    strArrSplit5 = strReplaceAll.split(",", -1);
                                    length4 = strArrSplit5.length;
                                    nktVarArr2 = new nkt[length4];
                                    i15 = 0;
                                    while (i15 < strArrSplit5.length) {
                                        String[] strArrSplit12 = strArrSplit5[i15].split("/", i25);
                                        nktVarArr2[i15] = new nkt((long) Double.parseDouble(strArrSplit12[0]), (long) Double.parseDouble(strArrSplit12[i14]));
                                        i15++;
                                        i19 = i19;
                                        strReplaceAll = strReplaceAll;
                                        i25 = -1;
                                    }
                                    int i32 = i19;
                                    String str7 = strReplaceAll;
                                    Map<String, vug> map110 = list.get(i22);
                                    byteBufferWrap4 = ByteBuffer.wrap(new byte[vug.f[10] * length4]);
                                    byteBufferWrap4.order(byteOrder);
                                    while (i16 < length4) {
                                        nkt nktVar6 = nktVarArr2[i16];
                                        byteBufferWrap4.putInt((int) nktVar6.a);
                                        byteBufferWrap4.putInt((int) nktVar6.b);
                                    }
                                    map110.put(str4, new vug(byteBufferWrap4.array(), 10, length4));
                                    i2 = i14;
                                    i3 = i32;
                                    strReplaceAll = str7;
                                    i = i20;
                                    break;
                                case 12:
                                    strArrSplit6 = strReplaceAll.split(",", -1);
                                    length5 = strArrSplit6.length;
                                    dArr = new double[length5];
                                    while (i17 < strArrSplit6.length) {
                                        dArr[i17] = Double.parseDouble(strArrSplit6[i17]);
                                    }
                                    Map<String, vug> map111 = list.get(i22);
                                    byteBufferWrap5 = ByteBuffer.wrap(new byte[vug.f[12] * length5]);
                                    byteBufferWrap5.order(byteOrder);
                                    i18 = 0;
                                    while (i18 < length5) {
                                        double[] dArr4 = dArr;
                                        byteBufferWrap5.putDouble(dArr4[i18]);
                                        i18++;
                                        i21 = i21;
                                        dArr = dArr4;
                                    }
                                    map111.put(str4, new vug(byteBufferWrap5.array(), 12, length5));
                                    i2 = i21;
                                    i3 = i19;
                                    i = i20;
                                    break;
                            }
                        }
                    } else {
                        list.get(i22).remove(str4);
                    }
                    i = i20;
                    i2 = i21;
                    i3 = i19;
                } else {
                    i = i20;
                    i2 = i21;
                    i3 = i19;
                }
                i22++;
                i19 = i3;
                i20 = i;
                i21 = i2;
            }
        }

        public final void d(int i) {
            int i2;
            if (i == 0) {
                i2 = 1;
            } else if (i == 90) {
                i2 = 6;
            } else if (i == 180) {
                i2 = 3;
            } else if (i != 270) {
                pgt.i("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
                i2 = 0;
            } else {
                i2 = 8;
            }
            c("Orientation", String.valueOf(i2), this.a);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final /* synthetic */ b[] c;

        static {
            b bVar = new b("AUTO", 0);
            a = bVar;
            b bVar2 = new b("MANUAL", 1);
            b = bVar2;
            c = new b[]{bVar, bVar2};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }
    }

    static {
        jvg[] jvgVarArr = {new jvg(256, 3, 4, "ImageWidth"), new jvg(257, 3, 4, "ImageLength"), new jvg("Make", 271, 2), new jvg("Model", 272, 2), new jvg("Orientation", 274, 3), new jvg("XResolution", 282, 5), new jvg("YResolution", 283, 5), new jvg("ResolutionUnit", 296, 3), new jvg("Software", 305, 2), new jvg("DateTime", 306, 2), new jvg("YCbCrPositioning", 531, 3), new jvg("SubIFDPointer", 330, 4), new jvg("ExifIFDPointer", 34665, 4), new jvg("GPSInfoIFDPointer", 34853, 4)};
        jvg[] jvgVarArr2 = {new jvg("ExposureTime", 33434, 5), new jvg("FNumber", 33437, 5), new jvg("ExposureProgram", 34850, 3), new jvg("PhotographicSensitivity", 34855, 3), new jvg("SensitivityType", 34864, 3), new jvg("ExifVersion", 36864, 2), new jvg("DateTimeOriginal", 36867, 2), new jvg("DateTimeDigitized", 36868, 2), new jvg("ComponentsConfiguration", 37121, 7), new jvg("ShutterSpeedValue", 37377, 10), new jvg("ApertureValue", 37378, 5), new jvg("BrightnessValue", 37379, 10), new jvg("ExposureBiasValue", 37380, 10), new jvg("MaxApertureValue", 37381, 5), new jvg("MeteringMode", 37383, 3), new jvg("LightSource", 37384, 3), new jvg("Flash", 37385, 3), new jvg("FocalLength", 37386, 5), new jvg("SubSecTime", 37520, 2), new jvg("SubSecTimeOriginal", 37521, 2), new jvg("SubSecTimeDigitized", 37522, 2), new jvg("FlashpixVersion", 40960, 7), new jvg("ColorSpace", 40961, 3), new jvg(40962, 3, 4, "PixelXDimension"), new jvg(40963, 3, 4, "PixelYDimension"), new jvg("InteroperabilityIFDPointer", 40965, 4), new jvg("FocalPlaneResolutionUnit", 41488, 3), new jvg("SensingMethod", 41495, 3), new jvg("FileSource", 41728, 7), new jvg("SceneType", 41729, 7), new jvg("CustomRendered", 41985, 3), new jvg("ExposureMode", 41986, 3), new jvg("WhiteBalance", 41987, 3), new jvg("SceneCaptureType", 41990, 3), new jvg("Contrast", 41992, 3), new jvg("Saturation", 41993, 3), new jvg("Sharpness", 41994, 3)};
        jvg[] jvgVarArr3 = {new jvg("GPSVersionID", 0, 1), new jvg("GPSLatitudeRef", 1, 2), new jvg(2, 5, 10, "GPSLatitude"), new jvg("GPSLongitudeRef", 3, 2), new jvg(4, 5, 10, "GPSLongitude"), new jvg("GPSAltitudeRef", 5, 1), new jvg("GPSAltitude", 6, 5), new jvg("GPSTimeStamp", 7, 5), new jvg("GPSSpeedRef", 12, 2), new jvg("GPSTrackRef", 14, 2), new jvg("GPSImgDirectionRef", 16, 2), new jvg("GPSDestBearingRef", 23, 2), new jvg("GPSDestDistanceRef", 25, 2)};
        b = new jvg[]{new jvg("SubIFDPointer", 330, 4), new jvg("ExifIFDPointer", 34665, 4), new jvg("GPSInfoIFDPointer", 34853, 4), new jvg("InteroperabilityIFDPointer", 40965, 4)};
        c = new jvg[][]{jvgVarArr, jvgVarArr2, jvgVarArr3, new jvg[]{new jvg("InteroperabilityIndex", 1, 2)}};
        d = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        e = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    public wug(ArrayList arrayList) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        km20.g("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.a = arrayList;
    }

    public final Map<String, vug> a(int i) {
        km20.d(i, 0, 4, pe4.b(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "));
        return (Map) this.a.get(i);
    }
}
