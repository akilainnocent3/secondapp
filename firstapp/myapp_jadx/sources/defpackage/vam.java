package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.common.DrmInitData;
import androidx.window.layout.oKr.TEFcJcMqR;
import com.sporty.android.permission.location.KN.qUnCRF;
import com.twilio.voice.VoiceURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class vam implements tsz.a<uam> {
    public final tam a;
    public final ram b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern g = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern i = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern k = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern l = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern p = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern v = b("CAN-SKIP-DATERANGES");
    public static final Pattern w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern z = b("CAN-BLOCK-RELOAD");
    public static final Pattern A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern D = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern E = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern L = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern M = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern N = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern O = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern P = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern Q = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern R = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern S = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern T = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern U = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern V = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern W = b("AUTOSELECT");
    public static final Pattern X = b("DEFAULT");
    public static final Pattern Y = b("FORCED");
    public static final Pattern Z = b("INDEPENDENT");
    public static final Pattern a0 = b("GAP");
    public static final Pattern b0 = b("PRECISE");
    public static final Pattern c0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern d0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern e0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern f0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern g0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern h0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern i0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern j0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern k0 = b("END-ON-NEXT");
    public static final Pattern l0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern m0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern n0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern o0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern p0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern q0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern r0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern s0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern t0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern u0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern v0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public static final class a extends IOException {
    }

    public static class b {
        public final BufferedReader a;
        public final ArrayDeque b;
        public String c;

        public b(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
            this.b = arrayDeque;
            this.a = bufferedReader;
        }

        public final boolean a() throws IOException {
            String strTrim;
            if (this.c == null) {
                ArrayDeque arrayDeque = this.b;
                if (!arrayDeque.isEmpty()) {
                    String str = (String) arrayDeque.poll();
                    str.getClass();
                    this.c = str;
                    return true;
                }
                do {
                    String line = this.a.readLine();
                    this.c = line;
                    if (line == null) {
                        return false;
                    }
                    strTrim = line.trim();
                    this.c = strTrim;
                } while (strTrim.isEmpty());
            }
            return true;
        }

        public final String b() {
            if (!a()) {
                lrh0.a();
                return null;
            }
            String str = this.c;
            this.c = null;
            return str;
        }
    }

    public vam(tam tamVar, ram ramVar) {
        this.a = tamVar;
        this.b = ramVar;
    }

    public static Pattern b(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static DrmInitData c(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i2 = 0; i2 < schemeDataArr.length; i2++) {
            DrmInitData.SchemeData schemeData = schemeDataArr[i2];
            schemeDataArr2[i2] = new DrmInitData.SchemeData(schemeData.b, schemeData.c, schemeData.d, null);
        }
        return new DrmInitData(str, true, schemeDataArr2);
    }

    /* JADX WARN: Code duplicated, block: B:275:0x07a4 A[PHI: r34
      0x07a4: PHI (r34v7 int) = (r34v3 int), (r34v4 int), (r34v5 int), (r34v8 int) binds: [B:285:0x07c9, B:281:0x07bc, B:277:0x07ae, B:274:0x07a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:342:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:351:0x090f  */
    /* JADX WARN: Code duplicated, block: B:358:0x093b A[PHI: r31
      0x093b: PHI (r31v20 java.lang.String) = 
      (r31v10 java.lang.String)
      (r31v11 java.lang.String)
      (r31v12 java.lang.String)
      (r31v13 java.lang.String)
      (r31v14 java.lang.String)
      (r31v15 java.lang.String)
      (r31v16 java.lang.String)
      (r31v17 java.lang.String)
      (r31v18 java.lang.String)
      (r31v21 java.lang.String)
     binds: [B:392:0x09b4, B:388:0x09a7, B:384:0x0999, B:380:0x098c, B:376:0x097f, B:372:0x0972, B:368:0x0965, B:364:0x0956, B:360:0x0946, B:357:0x0939] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:673:0x1088  */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 43981. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:61)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:298)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static ram e(tam tamVar, ram ramVar, b bVar, String str) throws a, ssz {
        Uri uri;
        String str2;
        ram.b bVar2;
        ArrayList arrayList;
        String str3;
        TreeMap treeMap;
        ram.e eVar;
        ArrayList arrayList2;
        int i2;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList3;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList4;
        ArrayList arrayList5;
        String str4;
        ram.e eVar2;
        int i6;
        DrmInitData drmInitDataC;
        DrmInitData drmInitData;
        String str5;
        String str6;
        ArrayList arrayList6;
        long j2;
        long j3;
        long j4;
        long j5;
        String str7;
        byte b2;
        int i7;
        byte b3;
        long j6;
        DrmInitData drmInitData2;
        DrmInitData drmInitData3;
        tam tamVar2 = tamVar;
        ram ramVar2 = ramVar;
        boolean z2 = tamVar2.c;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ram.g gVar = new ram.g(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap2 = new TreeMap();
        String str8 = "";
        boolean z3 = z2;
        String strJ = "";
        long j7 = -9223372036854775807L;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long jO = 0;
        long j11 = 0;
        long jLongValue = 0;
        long j12 = 0;
        long j13 = -1;
        ram.c cVar = null;
        String str9 = null;
        DrmInitData drmInitDataC2 = null;
        String str10 = null;
        DrmInitData drmInitData4 = null;
        int i8 = 0;
        int i9 = 1;
        boolean z4 = false;
        boolean z5 = false;
        int i10 = 0;
        ram.e eVar3 = null;
        int i11 = 0;
        String strK = null;
        int i12 = 0;
        boolean z6 = false;
        int i13 = 0;
        long j14 = -9223372036854775807L;
        long j15 = -9223372036854775807L;
        long j16 = 0;
        boolean zG = false;
        while (true) {
            gVar = gVar;
            if (!bVar.a()) {
                ram.c cVar2 = cVar;
                ArrayList arrayList11 = arrayList7;
                ArrayList arrayList12 = arrayList9;
                ArrayList arrayList13 = arrayList10;
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                String str11 = "POINT";
                ArrayList arrayList14 = arrayList8;
                HashMap map3 = new HashMap();
                int i14 = i12;
                while (i14 < arrayList12.size()) {
                    ArrayList arrayList15 = arrayList12;
                    ram.d dVar = (ram.d) arrayList15.get(i14);
                    long size = dVar.b;
                    if (size == -1) {
                        size = (j16 + ((long) arrayList11.size())) - (arrayList14.isEmpty() ? 1L : 0L);
                    }
                    int size2 = dVar.c;
                    if (size2 == -1 && j15 != -9223372036854775807L) {
                        size2 = (arrayList14.isEmpty() ? ((ram.e) t3p.a(arrayList11)).B : arrayList14).size() - 1;
                    }
                    Uri uri2 = dVar.a;
                    map3.put(uri2, new ram.d(uri2, size, size2));
                    i14++;
                    arrayList12 = arrayList15;
                }
                if (cVar2 != null) {
                    arrayList14.add(cVar2);
                }
                ArrayList arrayList16 = new ArrayList();
                Iterator it = linkedHashMap3.values().iterator();
                while (it.hasNext()) {
                    ram.b.a aVar = (ram.b.a) it.next();
                    Uri uri3 = aVar.d;
                    if ((uri3 != null || (uri = aVar.c) == null) && (uri3 == null || (uri = aVar.c) != null)) {
                        str2 = str11;
                        bVar2 = null;
                    } else {
                        Uri uri4 = uri;
                        long j17 = aVar.e;
                        if (j17 != -9223372036854775807L) {
                            String str12 = aVar.a;
                            long j18 = aVar.f;
                            long j19 = aVar.g;
                            str2 = str11;
                            long j20 = aVar.h;
                            ArrayList arrayList17 = aVar.i;
                            boolean z7 = aVar.j;
                            long j21 = aVar.k;
                            long j22 = aVar.l;
                            ArrayList arrayList18 = aVar.m;
                            ArrayList arrayList19 = aVar.n;
                            ArrayList arrayList20 = new ArrayList(aVar.b.values());
                            Boolean bool = aVar.o;
                            boolean z8 = bool == null || bool.booleanValue();
                            String str13 = aVar.p;
                            String str14 = str13 != null ? str13 : str2;
                            String str15 = aVar.q;
                            bVar2 = new ram.b(str12, uri4, uri3, j17, j18, j19, j20, arrayList17, z7, j21, j22, arrayList18, arrayList19, arrayList20, z8, str14, str15 != null ? str15 : "HIGHLIGHT");
                        } else {
                            str2 = str11;
                            bVar2 = null;
                        }
                    }
                    if (bVar2 != null) {
                        arrayList16.add(bVar2);
                    }
                    map3 = map3;
                    it = it;
                    str11 = str2;
                    arrayList14 = arrayList14;
                    arrayList11 = arrayList11;
                }
                return new ram(i8, str, arrayList13, j7, zG, jO, z5, i10, j16, i9, j14, j15, z3, z4, jO != 0, drmInitDataC2, arrayList11, arrayList14, gVar, map3, arrayList16);
            }
            String strB = bVar.b();
            cVar = cVar;
            if (strB.startsWith("#EXT")) {
                arrayList10.add(strB);
            }
            if (strB.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strK2 = k(strB, t, map);
                if ("VOD".equals(strK2)) {
                    i8 = 1;
                } else if ("EVENT".equals(strK2)) {
                    i8 = 2;
                }
            } else if (strB.equals("#EXT-X-I-FRAMES-ONLY")) {
                gVar = gVar;
                cVar = cVar;
                z6 = true;
            } else if (strB.startsWith("#EXT-X-START")) {
                long j23 = (long) (Double.parseDouble(k(strB, F, Collections.EMPTY_MAP)) * 1000000.0d);
                zG = g(strB, b0);
                j7 = j23;
            } else if (strB.startsWith("#EXT-X-SERVER-CONTROL")) {
                double dH = h(strB, u, -9.223372036854776E18d);
                long j24 = dH == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH * 1000000.0d);
                boolean zG2 = g(strB, v);
                double dH2 = h(strB, x, -9.223372036854776E18d);
                long j25 = dH2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH2 * 1000000.0d);
                double dH3 = h(strB, y, -9.223372036854776E18d);
                cVar = cVar;
                gVar = new ram.g(j24, zG2, j25, dH3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH3 * 1000000.0d), g(strB, z));
            } else if (strB.startsWith("#EXT-X-PART-INF")) {
                j15 = (long) (Double.parseDouble(k(strB, r, Collections.EMPTY_MAP)) * 1000000.0d);
            } else {
                boolean zStartsWith = strB.startsWith("#EXT-X-MAP");
                Pattern pattern = H;
                arrayList10 = arrayList10;
                map2 = map2;
                Pattern pattern2 = N;
                if (zStartsWith) {
                    String strK3 = k(strB, pattern2, map);
                    String strJ2 = j(strB, pattern, null, map);
                    if (strJ2 != null) {
                        String str16 = jrh0.a;
                        String[] strArrSplit = strJ2.split("@", -1);
                        j13 = Long.parseLong(strArrSplit[i12]);
                        if (strArrSplit.length > 1) {
                            j8 = Long.parseLong(strArrSplit[1]);
                        }
                    }
                    long j26 = j13;
                    long j27 = j26 == -1 ? 0L : j8;
                    if (strK != null && str10 == null) {
                        throw ssz.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                    }
                    ram.e eVar4 = new ram.e(strK3, strK, str10, j27, j26);
                    String str17 = str10;
                    if (j26 != -1) {
                        j27 += j26;
                    }
                    j8 = j27;
                    eVar3 = eVar4;
                    j13 = -1;
                    gVar = gVar;
                    cVar = cVar;
                    arrayList10 = arrayList10;
                    map2 = map2;
                    str10 = str17;
                } else {
                    LinkedHashMap linkedHashMap4 = linkedHashMap2;
                    String str18 = str10;
                    if (strB.startsWith("#EXT-X-TARGETDURATION")) {
                        j14 = ((long) Integer.parseInt(k(strB, o, Collections.EMPTY_MAP))) * 1000000;
                    } else if (strB.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        j10 = Long.parseLong(k(strB, A, Collections.EMPTY_MAP));
                        j16 = j10;
                    } else if (strB.startsWith("#EXT-X-VERSION")) {
                        i9 = Integer.parseInt(k(strB, s, Collections.EMPTY_MAP));
                    } else {
                        if (strB.startsWith("#EXT-X-DEFINE")) {
                            String strJ3 = j(strB, d0, null, map);
                            if (strJ3 != null) {
                                String str19 = tamVar2.l.get(strJ3);
                                if (str19 != null) {
                                    map.put(strJ3, str19);
                                }
                            } else {
                                map.put(k(strB, S, map), k(strB, c0, map));
                            }
                        } else if (strB.startsWith("#EXTINF")) {
                            jLongValue = new BigDecimal(k(strB, B, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                            strJ = j(strB, C, str8, map);
                        } else {
                            if (strB.startsWith("#EXT-X-SKIP")) {
                                int i15 = Integer.parseInt(k(strB, w, Collections.EMPTY_MAP));
                                ly0.f((ramVar2 == null || !arrayList7.isEmpty()) ? i12 : 1);
                                String str20 = jrh0.a;
                                long j28 = ramVar2.k;
                                pcn pcnVar = ramVar2.r;
                                int i16 = (int) (j16 - j28);
                                int i17 = i15 + i16;
                                if (i16 < 0 || i17 > pcnVar.size()) {
                                    throw new a();
                                }
                                long j29 = j11;
                                str10 = str18;
                                long j30 = j9;
                                while (i16 < i17) {
                                    ram.e eVar5 = (ram.e) pcnVar.get(i16);
                                    if (j16 != ramVar2.k) {
                                        int i18 = (ramVar2.j - i10) + eVar5.d;
                                        pcn pcnVar2 = eVar5.B;
                                        ArrayList arrayList21 = new ArrayList();
                                        long j31 = j30;
                                        int i19 = i12;
                                        while (i19 < pcnVar2.size()) {
                                            ram.c cVar3 = (ram.c) pcnVar2.get(i19);
                                            arrayList21.add(new ram.c(cVar3.a, cVar3.b, cVar3.c, i18, j31, cVar3.f, cVar3.i, cVar3.v, cVar3.w, cVar3.y, cVar3.z, cVar3.A, cVar3.B));
                                            j31 += cVar3.c;
                                            i19++;
                                            i17 = i17;
                                        }
                                        i3 = i17;
                                        eVar5 = new ram.e(eVar5.a, eVar5.b, eVar5.A, eVar5.c, i18, j30, eVar5.f, eVar5.i, eVar5.v, eVar5.w, eVar5.y, eVar5.z, arrayList21);
                                    } else {
                                        i3 = i17;
                                    }
                                    arrayList7.add(eVar5);
                                    long j32 = eVar5.c;
                                    String str21 = eVar5.v;
                                    long j33 = j30 + j32;
                                    long j34 = eVar5.y;
                                    if (j34 != -1) {
                                        j8 = eVar5.w + j34;
                                    }
                                    int i20 = eVar5.d;
                                    ram.e eVar6 = eVar5.b;
                                    DrmInitData drmInitData5 = eVar5.f;
                                    String str22 = eVar5.i;
                                    if (str21 == null || !str21.equals(Long.toHexString(j10))) {
                                        str10 = str21;
                                    }
                                    j10++;
                                    i16++;
                                    i11 = i20;
                                    eVar3 = eVar6;
                                    strK = str22;
                                    drmInitData4 = drmInitData5;
                                    i17 = i3;
                                    j29 = j33;
                                    j30 = j29;
                                    ramVar2 = ramVar;
                                }
                                tamVar2 = tamVar;
                                ramVar2 = ramVar;
                                j9 = j30;
                                j11 = j29;
                            } else if (strB.startsWith("#EXT-X-KEY")) {
                                String strK4 = k(strB, K, map);
                                String strJ4 = j(strB, L, "identity", map);
                                if ("NONE".equals(strK4)) {
                                    treeMap2.clear();
                                    str10 = null;
                                } else {
                                    String strJ5 = j(strB, O, null, map);
                                    if ("identity".equals(strJ4)) {
                                        if ("AES-128".equals(strK4)) {
                                            strK = k(strB, pattern2, map);
                                            str10 = strJ5;
                                        }
                                        tamVar2 = tamVar;
                                        ramVar2 = ramVar;
                                    } else {
                                        if (str9 == null) {
                                            str9 = ("SAMPLE-AES-CENC".equals(strK4) || "SAMPLE-AES-CTR".equals(strK4)) ? "cenc" : "cbcs";
                                        }
                                        DrmInitData.SchemeData schemeDataD = d(strB, strJ4, map);
                                        if (schemeDataD != null) {
                                            treeMap2.put(strJ4, schemeDataD);
                                            str10 = strJ5;
                                        }
                                        strK = null;
                                        tamVar2 = tamVar;
                                        ramVar2 = ramVar;
                                    }
                                    str10 = strJ5;
                                    strK = null;
                                    tamVar2 = tamVar;
                                    ramVar2 = ramVar;
                                }
                                drmInitData4 = null;
                                strK = null;
                                tamVar2 = tamVar;
                                ramVar2 = ramVar;
                            } else {
                                if (strB.startsWith("#EXT-X-BYTERANGE")) {
                                    String strK5 = k(strB, G, map);
                                    String str23 = jrh0.a;
                                    String[] strArrSplit2 = strK5.split("@", -1);
                                    j13 = Long.parseLong(strArrSplit2[i12]);
                                    if (strArrSplit2.length > 1) {
                                        j8 = Long.parseLong(strArrSplit2[1]);
                                    }
                                } else if (strB.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                    i10 = Integer.parseInt(strB.substring(strB.indexOf(58) + 1));
                                    tamVar2 = tamVar;
                                    ramVar2 = ramVar;
                                    gVar = gVar;
                                    cVar = cVar;
                                    arrayList10 = arrayList10;
                                    map2 = map2;
                                    str10 = str18;
                                    linkedHashMap2 = linkedHashMap4;
                                    z5 = true;
                                } else if (strB.equals("#EXT-X-DISCONTINUITY")) {
                                    i11++;
                                } else if (strB.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                    if (jO == 0) {
                                        jO = jrh0.O(jrh0.R(strB.substring(strB.indexOf(58) + 1))) - j9;
                                    }
                                } else if (strB.equals("#EXT-X-GAP")) {
                                    tamVar2 = tamVar;
                                    ramVar2 = ramVar;
                                    gVar = gVar;
                                    cVar = cVar;
                                    arrayList10 = arrayList10;
                                    map2 = map2;
                                    str10 = str18;
                                    linkedHashMap2 = linkedHashMap4;
                                    i13 = 1;
                                } else if (strB.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                    tamVar2 = tamVar;
                                    ramVar2 = ramVar;
                                    gVar = gVar;
                                    cVar = cVar;
                                    arrayList10 = arrayList10;
                                    map2 = map2;
                                    str10 = str18;
                                    linkedHashMap2 = linkedHashMap4;
                                    z3 = true;
                                } else if (strB.equals("#EXT-X-ENDLIST")) {
                                    tamVar2 = tamVar;
                                    ramVar2 = ramVar;
                                    gVar = gVar;
                                    cVar = cVar;
                                    arrayList10 = arrayList10;
                                    map2 = map2;
                                    str10 = str18;
                                    linkedHashMap2 = linkedHashMap4;
                                    z4 = true;
                                } else if (strB.startsWith("#EXT-X-RENDITION-REPORT")) {
                                    long jI = i(strB, D);
                                    Matcher matcher = E.matcher(strB);
                                    if (matcher.find()) {
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        i4 = Integer.parseInt(strGroup);
                                    } else {
                                        i4 = -1;
                                    }
                                    arrayList9.add(new ram.d(Uri.parse(pmh0.c(str, k(strB, pattern2, map))), jI, i4));
                                } else if (strB.startsWith("#EXT-X-PRELOAD-HINT")) {
                                    if (cVar == null && "PART".equals(k(strB, Q, map))) {
                                        String strK6 = k(strB, pattern2, map);
                                        long jI2 = i(strB, I);
                                        long jI3 = i(strB, J);
                                        String hexString = strK == null ? null : str18 != null ? str18 : Long.toHexString(j10);
                                        if (drmInitData4 != null || treeMap2.isEmpty()) {
                                            drmInitData3 = drmInitData4;
                                        } else {
                                            DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap2.values().toArray(new DrmInitData.SchemeData[i12]);
                                            DrmInitData drmInitData6 = new DrmInitData(str9, true, schemeDataArr);
                                            if (drmInitDataC2 == null) {
                                                drmInitDataC2 = c(str9, schemeDataArr);
                                            }
                                            drmInitData3 = drmInitData6;
                                        }
                                        cVar = (jI2 == -1 || jI3 != -1) ? new ram.c(strK6, eVar3, 0L, i11, j11, drmInitData3, strK, hexString, jI2 != -1 ? jI2 : 0L, jI3, false, false, true) : cVar;
                                        tamVar2 = tamVar;
                                        ramVar2 = ramVar;
                                        drmInitData4 = drmInitData3;
                                        gVar = gVar;
                                        arrayList10 = arrayList10;
                                        map2 = map2;
                                        str10 = str18;
                                        linkedHashMap2 = linkedHashMap4;
                                        i12 = 0;
                                    }
                                } else if (strB.startsWith("#EXT-X-PART")) {
                                    String hexString2 = strK == null ? null : str18 != null ? str18 : Long.toHexString(j10);
                                    String strK7 = k(strB, pattern2, map);
                                    long j35 = (long) (Double.parseDouble(k(strB, p, Collections.EMPTY_MAP)) * 1000000.0d);
                                    boolean zG3 = g(strB, Z) | (z3 && arrayList8.isEmpty());
                                    boolean zG4 = g(strB, a0);
                                    String strJ6 = j(strB, pattern, null, map);
                                    if (strJ6 != null) {
                                        String str24 = jrh0.a;
                                        String[] strArrSplit3 = strJ6.split("@", -1);
                                        long j36 = Long.parseLong(strArrSplit3[0]);
                                        if (strArrSplit3.length > 1) {
                                            j12 = Long.parseLong(strArrSplit3[1]);
                                        }
                                        j6 = j36;
                                    } else {
                                        j6 = -1;
                                    }
                                    long j37 = j6 == -1 ? 0L : j12;
                                    if (drmInitData4 != null || treeMap2.isEmpty()) {
                                        drmInitData2 = drmInitData4;
                                    } else {
                                        DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap2.values().toArray(new DrmInitData.SchemeData[0]);
                                        DrmInitData drmInitData7 = new DrmInitData(str9, true, schemeDataArr2);
                                        if (drmInitDataC2 == null) {
                                            drmInitDataC2 = c(str9, schemeDataArr2);
                                        }
                                        drmInitData2 = drmInitData7;
                                    }
                                    ram.c cVar4 = new ram.c(strK7, eVar3, j35, i11, j11, drmInitData2, strK, hexString2, j37, j6, zG4, zG3, false);
                                    ram.e eVar7 = eVar3;
                                    int i21 = i11;
                                    arrayList8.add(cVar4);
                                    j11 += j35;
                                    if (j6 != -1) {
                                        j37 += j6;
                                    }
                                    j12 = j37;
                                    ramVar2 = ramVar;
                                    i11 = i21;
                                    eVar3 = eVar7;
                                    drmInitData4 = drmInitData2;
                                    gVar = gVar;
                                    cVar = cVar;
                                    arrayList10 = arrayList10;
                                    map2 = map2;
                                    str10 = str18;
                                    linkedHashMap2 = linkedHashMap4;
                                    i12 = 0;
                                    tamVar2 = tamVar;
                                } else {
                                    eVar = eVar3;
                                    int i22 = i11;
                                    if (strB.startsWith("#EXT-X-DATERANGE") && j(strB, f0, str8, map).equals("com.apple.hls.interstitial")) {
                                        String strK8 = k(strB, e0, map);
                                        String strJ7 = j(strB, l0, null, map);
                                        Uri uri5 = strJ7 != null ? Uri.parse(strJ7) : null;
                                        String strJ8 = j(strB, m0, null, map);
                                        Uri uri6 = strJ8 != null ? Uri.parse(strJ8) : null;
                                        String strJ9 = j(strB, g0, null, map);
                                        long jO2 = strJ9 != null ? jrh0.O(jrh0.R(strJ9)) : -9223372036854775807L;
                                        i5 = i22;
                                        String strJ10 = j(strB, i0, null, map);
                                        long jO3 = strJ10 != null ? jrh0.O(jrh0.R(strJ10)) : -9223372036854775807L;
                                        ArrayList arrayList22 = new ArrayList();
                                        arrayList5 = arrayList8;
                                        String strJ11 = j(strB, h0, null, map);
                                        if (strJ11 != null) {
                                            String str25 = jrh0.a;
                                            String[] strArrSplit4 = strJ11.split(",", -1);
                                            int length = strArrSplit4.length;
                                            int i23 = 0;
                                            while (i23 < length) {
                                                int i24 = i23;
                                                String strTrim = strArrSplit4[i23].trim();
                                                strTrim.getClass();
                                                switch (strTrim.hashCode()) {
                                                    case 79491:
                                                        i7 = length;
                                                        if (strTrim.equals("PRE")) {
                                                            b3 = 0;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2430593:
                                                        i7 = length;
                                                        if (strTrim.equals("ONCE")) {
                                                            b3 = 1;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2461856:
                                                        i7 = length;
                                                        if (strTrim.equals(VoiceURLConnection.METHOD_TYPE_POST)) {
                                                            b3 = 2;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        i7 = length;
                                                        b3 = -1;
                                                        break;
                                                }
                                                switch (b3) {
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                        arrayList22.add(strTrim);
                                                        break;
                                                }
                                                i23 = i24 + 1;
                                                length = i7;
                                            }
                                        }
                                        TreeMap treeMap3 = treeMap2;
                                        str4 = str9;
                                        double dH4 = h(strB, q, -1.0d);
                                        long j38 = dH4 >= 0.0d ? (long) (dH4 * 1000000.0d) : -9223372036854775807L;
                                        double dH5 = h(strB, j0, -1.0d);
                                        long j39 = dH5 >= 0.0d ? (long) (dH5 * 1000000.0d) : -9223372036854775807L;
                                        boolean zG5 = g(strB, k0);
                                        long j40 = j39;
                                        double dH6 = h(strB, n0, Double.MIN_VALUE);
                                        long j41 = dH6 != Double.MIN_VALUE ? (long) (dH6 * 1000000.0d) : -9223372036854775807L;
                                        double dH7 = h(strB, o0, -1.0d);
                                        long j42 = dH7 >= 0.0d ? (long) (dH7 * 1000000.0d) : -9223372036854775807L;
                                        ArrayList arrayList23 = new ArrayList();
                                        treeMap = treeMap3;
                                        str3 = str8;
                                        String strJ12 = j(strB, p0, null, map);
                                        if (strJ12 != null) {
                                            String str26 = jrh0.a;
                                            String[] strArrSplit5 = strJ12.split(",", -1);
                                            int length2 = strArrSplit5.length;
                                            int i25 = 0;
                                            while (i25 < length2) {
                                                int i26 = i25;
                                                String strTrim2 = strArrSplit5[i25].trim();
                                                strTrim2.getClass();
                                                int i27 = length2;
                                                if (strTrim2.equals("IN") || strTrim2.equals("OUT")) {
                                                    arrayList23.add(strTrim2);
                                                }
                                                i25 = i26 + 1;
                                                length2 = i27;
                                            }
                                        }
                                        ArrayList arrayList24 = new ArrayList();
                                        arrayList = arrayList9;
                                        String strJ13 = j(strB, q0, null, map);
                                        if (strJ13 != null) {
                                            String str27 = jrh0.a;
                                            String[] strArrSplit6 = strJ13.split(",", -1);
                                            int length3 = strArrSplit6.length;
                                            int i28 = 0;
                                            while (i28 < length3) {
                                                String[] strArr = strArrSplit6;
                                                String strTrim3 = strArrSplit6[i28].trim();
                                                strTrim3.getClass();
                                                int i29 = length3;
                                                if (strTrim3.equals("JUMP") || strTrim3.equals("SKIP")) {
                                                    arrayList24.add(strTrim3);
                                                }
                                                i28++;
                                                length3 = i29;
                                                strArrSplit6 = strArr;
                                            }
                                        }
                                        String strJ14 = j(strB, r0, null, map);
                                        Boolean boolValueOf = strJ14 != null ? Boolean.valueOf(!strJ14.equals("NO")) : null;
                                        String strJ15 = j(strB, s0, null, map);
                                        if (strJ15 != null) {
                                            str5 = "RANGE";
                                            if (!strJ15.equals("RANGE")) {
                                                str5 = "POINT";
                                                if (!strJ15.equals(str5)) {
                                                    str5 = null;
                                                }
                                            }
                                        } else {
                                            str5 = null;
                                        }
                                        arrayList4 = arrayList7;
                                        String strJ16 = j(strB, t0, null, map);
                                        if (strJ16 != null) {
                                            str6 = "PRIMARY";
                                            if (!strJ16.equals("PRIMARY")) {
                                                str6 = "HIGHLIGHT";
                                                if (!strJ16.equals(str6)) {
                                                    str6 = null;
                                                }
                                            }
                                        } else {
                                            str6 = null;
                                        }
                                        ArrayList arrayList25 = new ArrayList();
                                        String str28 = str6;
                                        String strSubstring = strB.substring(17);
                                        Matcher matcher2 = v0.matcher(strSubstring);
                                        while (matcher2.find()) {
                                            Matcher matcher3 = matcher2;
                                            String strGroup2 = matcher3.group();
                                            strGroup2.getClass();
                                            switch (strGroup2.hashCode()) {
                                                case -2136701954:
                                                    str7 = str5;
                                                    if (strGroup2.equals("X-SNAP=")) {
                                                        b2 = 0;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case -1843050726:
                                                    str7 = str5;
                                                    if (strGroup2.equals("X-CONTENT-MAY-VARY=")) {
                                                        b2 = 1;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case -148960310:
                                                    str7 = str5;
                                                    if (strGroup2.equals("X-PLAYOUT-LIMIT=")) {
                                                        b2 = 2;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case -36345757:
                                                    str7 = str5;
                                                    if (strGroup2.equals("X-TIMELINE-STYLE=")) {
                                                        b2 = 3;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case 397239341:
                                                    str7 = str5;
                                                    if (strGroup2.equals("X-ASSET-LIST=")) {
                                                        b2 = 4;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case 850193465:
                                                    str7 = str5;
                                                    if (strGroup2.equals("X-TIMELINE-OCCUPIES=")) {
                                                        b2 = 5;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case 1472528844:
                                                    str7 = str5;
                                                    if (strGroup2.equals("X-RESTRICT=")) {
                                                        b2 = 6;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case 1748487807:
                                                    str7 = str5;
                                                    if (strGroup2.equals("X-RESUME-OFFSET=")) {
                                                        b2 = 7;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case 1814205923:
                                                    str7 = str5;
                                                    if (strGroup2.equals("X-ASSET-URI=")) {
                                                        b2 = 8;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                default:
                                                    str7 = str5;
                                                    b2 = -1;
                                                    break;
                                            }
                                            switch (b2) {
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                    j42 = j42;
                                                    break;
                                                default:
                                                    String strSubstring2 = strGroup2.substring(0, strGroup2.length() - 1);
                                                    String strConcat = strSubstring2.concat("=");
                                                    int length4 = strConcat.length() + strSubstring.indexOf(strConcat);
                                                    String strSubstring3 = strSubstring.substring(length4, (strSubstring.length() == length4 + 1 ? 1 : 2) + length4);
                                                    arrayList25.add(strSubstring3.startsWith("\"") ? new ram.a(strSubstring2, k(strSubstring, Pattern.compile(strSubstring2.concat("=\"((?:.|\f)+?)\"")), map), 0) : (strSubstring3.equals("0x") || strSubstring3.equals("0X")) ? new ram.a(strSubstring2, k(strSubstring, Pattern.compile(strSubstring2.concat("=(0[xX][A-F0-9]+)")), map), 1) : new ram.a(strSubstring2, Double.parseDouble(k(strSubstring, Pattern.compile(strSubstring2.concat("=([\\d\\.]+)\\b")), Collections.EMPTY_MAP))));
                                                    break;
                                            }
                                            matcher2 = matcher3;
                                            str5 = str7;
                                            boolValueOf = boolValueOf;
                                            arrayList24 = arrayList24;
                                            j42 = j42;
                                        }
                                        Boolean bool2 = boolValueOf;
                                        ArrayList arrayList26 = arrayList24;
                                        long j43 = j42;
                                        String str29 = str5;
                                        linkedHashMap = linkedHashMap4;
                                        ram.b.a aVar2 = linkedHashMap.containsKey(strK8) ? (ram.b.a) linkedHashMap.get(strK8) : new ram.b.a(strK8);
                                        if (uri5 == null) {
                                            aVar2.getClass();
                                        } else {
                                            Uri uri7 = aVar2.c;
                                            if (uri7 != null) {
                                                ly0.a("Can't change assetUri from " + aVar2.c + " to " + uri5, uri7.equals(uri5));
                                            }
                                            aVar2.c = uri5;
                                        }
                                        if (uri6 != null) {
                                            Uri uri8 = aVar2.d;
                                            if (uri8 != null) {
                                                ly0.a("Can't change assetListUri from " + aVar2.d + " to " + uri6, uri8.equals(uri6));
                                            }
                                            aVar2.d = uri6;
                                        }
                                        if (jO2 != -9223372036854775807L) {
                                            long j44 = aVar2.e;
                                            if (j44 != -9223372036854775807L) {
                                                ly0.a("Can't change startDateUnixUs from " + aVar2.e + " to " + jO2, j44 == jO2);
                                            }
                                            aVar2.e = jO2;
                                        }
                                        long j45 = jO3;
                                        if (j45 != -9223372036854775807L) {
                                            long j46 = aVar2.f;
                                            if (j46 != -9223372036854775807L) {
                                                ly0.a("Can't change endDateUnixUs from " + aVar2.f + " to " + j45, j46 == j45);
                                            }
                                            aVar2.f = j45;
                                        }
                                        if (j38 != -9223372036854775807L) {
                                            long j47 = aVar2.g;
                                            if (j47 != -9223372036854775807L) {
                                                boolean z9 = j47 == j38;
                                                StringBuilder sb = new StringBuilder("Can't change durationUs from ");
                                                sb.append(aVar2.g);
                                                sb.append(" to ");
                                                j5 = j38;
                                                sb.append(j5);
                                                ly0.a(sb.toString(), z9);
                                            } else {
                                                j5 = j38;
                                            }
                                            aVar2.g = j5;
                                        }
                                        if (j40 != -9223372036854775807L) {
                                            long j48 = aVar2.h;
                                            if (j48 != -9223372036854775807L) {
                                                boolean z10 = j48 == j40;
                                                StringBuilder sb2 = new StringBuilder("Can't change plannedDurationUs from ");
                                                sb2.append(aVar2.h);
                                                sb2.append(" to ");
                                                j4 = j40;
                                                sb2.append(j4);
                                                ly0.a(sb2.toString(), z10);
                                            } else {
                                                j4 = j40;
                                            }
                                            aVar2.h = j4;
                                        }
                                        if (!arrayList22.isEmpty()) {
                                            if (!aVar2.i.isEmpty()) {
                                                boolean zEquals = aVar2.i.equals(arrayList22);
                                                StringBuilder sb3 = new StringBuilder("Can't change cue from ");
                                                ArrayList arrayList27 = aVar2.i;
                                                StringBuilder sb4 = new StringBuilder();
                                                Iterator it2 = arrayList27.iterator();
                                                if (it2.hasNext()) {
                                                    while (true) {
                                                        sb4.append((CharSequence) it2.next());
                                                        if (it2.hasNext()) {
                                                            sb4.append((CharSequence) ", ");
                                                        }
                                                    }
                                                }
                                                sb3.append(sb4.toString());
                                                sb3.append(" to ");
                                                StringBuilder sb5 = new StringBuilder();
                                                Iterator it3 = arrayList22.iterator();
                                                if (it3.hasNext()) {
                                                    while (true) {
                                                        sb5.append((CharSequence) it3.next());
                                                        if (it3.hasNext()) {
                                                            sb5.append((CharSequence) ", ");
                                                        }
                                                    }
                                                }
                                                sb3.append(sb5.toString());
                                                ly0.a(sb3.toString(), zEquals);
                                            }
                                            aVar2.i = arrayList22;
                                        }
                                        if (zG5) {
                                            aVar2.j = true;
                                        }
                                        if (j41 != -9223372036854775807L) {
                                            long j49 = aVar2.k;
                                            if (j49 != -9223372036854775807L) {
                                                boolean z11 = j49 == j41;
                                                StringBuilder sb6 = new StringBuilder("Can't change resumeOffsetUs from ");
                                                sb6.append(aVar2.k);
                                                sb6.append(" to ");
                                                j3 = j41;
                                                sb6.append(j3);
                                                ly0.a(sb6.toString(), z11);
                                            } else {
                                                j3 = j41;
                                            }
                                            aVar2.k = j3;
                                        }
                                        if (j43 != -9223372036854775807L) {
                                            long j50 = aVar2.l;
                                            if (j50 != -9223372036854775807L) {
                                                boolean z12 = j50 == j43;
                                                StringBuilder sb7 = new StringBuilder("Can't change playoutLimitUs from ");
                                                sb7.append(aVar2.l);
                                                sb7.append(" to ");
                                                j2 = j43;
                                                sb7.append(j2);
                                                ly0.a(sb7.toString(), z12);
                                            } else {
                                                j2 = j43;
                                            }
                                            aVar2.l = j2;
                                        }
                                        if (!arrayList23.isEmpty()) {
                                            if (!aVar2.m.isEmpty()) {
                                                boolean zEquals2 = aVar2.m.equals(arrayList23);
                                                StringBuilder sb8 = new StringBuilder("Can't change snapTypes from ");
                                                ArrayList arrayList28 = aVar2.m;
                                                StringBuilder sb9 = new StringBuilder();
                                                Iterator it4 = arrayList28.iterator();
                                                if (it4.hasNext()) {
                                                    while (true) {
                                                        sb9.append((CharSequence) it4.next());
                                                        if (it4.hasNext()) {
                                                            sb9.append((CharSequence) ", ");
                                                        }
                                                    }
                                                }
                                                sb8.append(sb9.toString());
                                                sb8.append(" to ");
                                                StringBuilder sb10 = new StringBuilder();
                                                Iterator it5 = arrayList23.iterator();
                                                if (it5.hasNext()) {
                                                    while (true) {
                                                        sb10.append((CharSequence) it5.next());
                                                        if (it5.hasNext()) {
                                                            sb10.append((CharSequence) ", ");
                                                        }
                                                    }
                                                }
                                                sb8.append(sb10.toString());
                                                ly0.a(sb8.toString(), zEquals2);
                                            }
                                            aVar2.m = arrayList23;
                                        }
                                        if (!arrayList26.isEmpty()) {
                                            if (aVar2.n.isEmpty()) {
                                                arrayList6 = arrayList26;
                                            } else {
                                                arrayList6 = arrayList26;
                                                boolean zEquals3 = aVar2.n.equals(arrayList6);
                                                StringBuilder sb11 = new StringBuilder("Can't change restrictions from ");
                                                ArrayList arrayList29 = aVar2.n;
                                                StringBuilder sb12 = new StringBuilder();
                                                Iterator it6 = arrayList29.iterator();
                                                if (it6.hasNext()) {
                                                    while (true) {
                                                        sb12.append((CharSequence) it6.next());
                                                        if (it6.hasNext()) {
                                                            sb12.append((CharSequence) ", ");
                                                        }
                                                    }
                                                }
                                                sb11.append(sb12.toString());
                                                sb11.append(" to ");
                                                StringBuilder sb13 = new StringBuilder();
                                                Iterator it7 = arrayList6.iterator();
                                                if (it7.hasNext()) {
                                                    while (true) {
                                                        sb13.append((CharSequence) it7.next());
                                                        if (it7.hasNext()) {
                                                            sb13.append((CharSequence) ", ");
                                                        }
                                                    }
                                                }
                                                sb11.append(sb13.toString());
                                                ly0.a(sb11.toString(), zEquals3);
                                            }
                                            aVar2.n = arrayList6;
                                        }
                                        HashMap map4 = aVar2.b;
                                        if (!arrayList25.isEmpty()) {
                                            for (int i30 = 0; i30 < arrayList25.size(); i30++) {
                                                ram.a aVar3 = (ram.a) arrayList25.get(i30);
                                                String str30 = aVar3.a;
                                                ram.a aVar4 = (ram.a) map4.get(str30);
                                                if (aVar4 != null) {
                                                    boolean zEquals4 = aVar4.equals(aVar3);
                                                    StringBuilder sbA = he.a("Can't change ", str30, " from ");
                                                    sbA.append(aVar4.d);
                                                    sbA.append(" ");
                                                    sbA.append(aVar4.c);
                                                    sbA.append(" to ");
                                                    sbA.append(aVar3.d);
                                                    sbA.append(" ");
                                                    sbA.append(aVar3.c);
                                                    ly0.a(sbA.toString(), zEquals4);
                                                }
                                                map4.put(str30, aVar3);
                                            }
                                        }
                                        if (bool2 != null) {
                                            Boolean bool3 = aVar2.o;
                                            if (bool3 != null) {
                                                ly0.a("Can't change contentMayVary from " + aVar2.o + " to " + bool2, bool3.equals(bool2));
                                            }
                                            aVar2.o = bool2;
                                        }
                                        if (str29 != null) {
                                            String str31 = aVar2.p;
                                            if (str31 != null) {
                                                ly0.a("Can't change timelineOccupies from " + aVar2.p + " to " + str29, str31.equals(str29));
                                            }
                                            aVar2.p = str29;
                                        }
                                        if (str28 != null) {
                                            String str32 = aVar2.q;
                                            if (str32 != null) {
                                                ly0.a("Can't change timelineStyle from " + aVar2.q + " to " + str28, str32.equals(str28));
                                            }
                                            aVar2.q = str28;
                                        }
                                        linkedHashMap.put(strK8, aVar2);
                                    } else {
                                        i5 = i22;
                                        arrayList4 = arrayList7;
                                        arrayList5 = arrayList8;
                                        arrayList = arrayList9;
                                        treeMap = treeMap2;
                                        str4 = str9;
                                        eVar = eVar;
                                        str3 = str8;
                                        linkedHashMap = linkedHashMap4;
                                        if (!strB.startsWith("#")) {
                                            String hexString3 = strK == null ? null : str18 != null ? str18 : Long.toHexString(j10);
                                            long j51 = j10 + 1;
                                            String strL = l(strB, map);
                                            ram.e eVar8 = (ram.e) map2.get(strL);
                                            if (j13 == -1) {
                                                eVar2 = eVar8;
                                                j8 = 0;
                                            } else {
                                                if (z6 && eVar == null && eVar8 == null) {
                                                    eVar8 = new ram.e(strL, null, null, 0L, j8);
                                                    map2.put(strL, eVar8);
                                                }
                                                eVar2 = eVar8;
                                            }
                                            if (drmInitData4 != null || treeMap.isEmpty()) {
                                                str9 = str4;
                                                i6 = 0;
                                                drmInitDataC = drmInitDataC2;
                                                drmInitData = drmInitData4;
                                            } else {
                                                i6 = 0;
                                                DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                str9 = str4;
                                                drmInitData = new DrmInitData(str9, true, schemeDataArr3);
                                                drmInitDataC = drmInitDataC2 == null ? c(str9, schemeDataArr3) : drmInitDataC2;
                                            }
                                            long j52 = j8;
                                            String str33 = strK;
                                            long j53 = jLongValue;
                                            i11 = i5;
                                            strK = str33;
                                            arrayList4.add(new ram.e(strL, eVar != null ? eVar : eVar2, strJ, j53, i5, j9, drmInitData, str33, hexString3, j52, j13, i13, arrayList5));
                                            j11 = j9 + j53;
                                            ArrayList arrayList30 = new ArrayList();
                                            j8 = j13 != -1 ? j52 + j13 : j52;
                                            linkedHashMap2 = linkedHashMap;
                                            map2 = map2;
                                            arrayList8 = arrayList30;
                                            j10 = j51;
                                            drmInitDataC2 = drmInitDataC;
                                            i12 = i6;
                                            i13 = i12;
                                            drmInitData4 = drmInitData;
                                            j9 = j11;
                                            eVar3 = eVar;
                                            treeMap2 = treeMap;
                                            jLongValue = 0;
                                            j13 = -1;
                                            arrayList10 = arrayList10;
                                            str10 = str18;
                                            str8 = str3;
                                            strJ = str8;
                                            arrayList9 = arrayList;
                                            tamVar2 = tamVar;
                                            ramVar2 = ramVar;
                                            arrayList7 = arrayList4;
                                            cVar = cVar;
                                        }
                                    }
                                    i11 = i5;
                                    arrayList2 = arrayList5;
                                    str9 = str4;
                                    arrayList3 = arrayList4;
                                    i2 = 0;
                                    ArrayList arrayList31 = arrayList2;
                                    linkedHashMap2 = linkedHashMap;
                                    map2 = map2;
                                    arrayList8 = arrayList31;
                                    tamVar2 = tamVar;
                                    ramVar2 = ramVar;
                                    arrayList7 = arrayList3;
                                    i12 = i2;
                                    strJ = strJ;
                                    jLongValue = jLongValue;
                                    j9 = j9;
                                    eVar3 = eVar;
                                    treeMap2 = treeMap;
                                    gVar = gVar;
                                    cVar = cVar;
                                    arrayList10 = arrayList10;
                                    str10 = str18;
                                    str8 = str3;
                                    arrayList9 = arrayList;
                                }
                                tamVar2 = tamVar;
                                ramVar2 = ramVar;
                            }
                            linkedHashMap2 = linkedHashMap4;
                        }
                        arrayList3 = arrayList7;
                        arrayList2 = arrayList8;
                        arrayList = arrayList9;
                        treeMap = treeMap2;
                        str3 = str8;
                        eVar = eVar3;
                        i2 = i12;
                        linkedHashMap = linkedHashMap4;
                        ArrayList arrayList32 = arrayList2;
                        linkedHashMap2 = linkedHashMap;
                        map2 = map2;
                        arrayList8 = arrayList32;
                        tamVar2 = tamVar;
                        ramVar2 = ramVar;
                        arrayList7 = arrayList3;
                        i12 = i2;
                        strJ = strJ;
                        jLongValue = jLongValue;
                        j9 = j9;
                        eVar3 = eVar;
                        treeMap2 = treeMap;
                        gVar = gVar;
                        cVar = cVar;
                        arrayList10 = arrayList10;
                        str10 = str18;
                        str8 = str3;
                        arrayList9 = arrayList;
                    }
                    str10 = str18;
                    linkedHashMap2 = linkedHashMap4;
                }
            }
            cVar = cVar;
        }
    }

    public static boolean g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double h(String str, Pattern pattern, double d2) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d2;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String j(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map);
    }

    public static String k(String str, Pattern pattern, Map<String, String> map) throws ssz {
        String strJ = j(str, pattern, null, map);
        if (strJ != null) {
            return strJ;
        }
        throw ssz.b("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String l(String str, Map<String, String> map) {
        Matcher matcher = u0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:31:0x0068, B:33:0x006e, B:36:0x0079, B:38:0x0081, B:43:0x0097, B:45:0x009f, B:47:0x00a7, B:49:0x00af, B:51:0x00b7, B:53:0x00bf, B:55:0x00c7, B:57:0x00cf, B:60:0x00d8, B:61:0x00dc, B:66:0x00fe, B:67:0x0104, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:70:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[Catch: all -> 0x0095, LOOP:2: B:17:0x003c->B:22:0x0048, LOOP_END, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:31:0x0068, B:33:0x006e, B:36:0x0079, B:38:0x0081, B:43:0x0097, B:45:0x009f, B:47:0x00a7, B:49:0x00af, B:51:0x00b7, B:53:0x00bf, B:55:0x00c7, B:57:0x00cf, B:60:0x00d8, B:61:0x00dc, B:66:0x00fe, B:67:0x0104, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:70:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:89:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0047 A[SYNTHETIC] */
    @Override // tsz.a
    public final Object a(Uri uri, eqc eqcVar) throws ssz {
        int i2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(eqcVar));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int i3 = bufferedReader.read();
            boolean zM = false;
            if (i3 == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    i3 = bufferedReader.read();
                    while (i3 != -1) {
                        i3 = bufferedReader.read();
                    }
                    i2 = 0;
                    while (true) {
                        if (i2 < 7) {
                            while (i3 != -1) {
                                i3 = bufferedReader.read();
                            }
                            zM = jrh0.M(i3);
                            break;
                        }
                        if (i3 != "#EXTM3U".charAt(i2)) {
                            break;
                            break;
                        }
                        i3 = bufferedReader.read();
                        i2++;
                    }
                }
            } else {
                while (i3 != -1 && Character.isWhitespace(i3)) {
                    i3 = bufferedReader.read();
                }
                i2 = 0;
                while (true) {
                    if (i2 < 7) {
                        while (i3 != -1 && Character.isWhitespace(i3) && !jrh0.M(i3)) {
                            i3 = bufferedReader.read();
                        }
                        zM = jrh0.M(i3);
                        break;
                    }
                    if (i3 != "#EXTM3U".charAt(i2)) {
                        break;
                    }
                    i3 = bufferedReader.read();
                    i2++;
                }
            }
            if (!zM) {
                throw ssz.b("Input does not start with the #EXTM3U header.");
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    jrh0.g(bufferedReader);
                    throw ssz.b("Failed to parse the playlist, could not identify any tags.");
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        tam tamVarF = f(new b(arrayDeque, bufferedReader), uri.toString());
                        jrh0.g(bufferedReader);
                        return tamVarF;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    ram ramVarE = e(this.a, this.b, new b(arrayDeque, bufferedReader), uri.toString());
                    jrh0.g(bufferedReader);
                    return ramVarE;
                }
            }
        } catch (Throwable th) {
            jrh0.g(bufferedReader);
            throw th;
        }
    }

    public static DrmInitData.SchemeData d(String str, String str2, HashMap map) throws ssz {
        Pattern pattern = M;
        String str3 = TEFcJcMqR.LMHAAuiLydzYcr;
        String strJ = j(str, pattern, str3, map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern2 = N;
        if (zEquals) {
            String strK = k(str, pattern2, map);
            return new DrmInitData.SchemeData(vl5.d, null, "video/mp4", Base64.decode(strK.substring(strK.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = vl5.d;
            String str4 = jrh0.a;
            return new DrmInitData.SchemeData(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !str3.equals(strJ)) {
            return null;
        }
        String strK2 = k(str, pattern2, map);
        byte[] bArrDecode = Base64.decode(strK2.substring(strK2.indexOf(44)), 0);
        UUID uuid2 = vl5.e;
        int length = (bArrDecode != null ? bArrDecode.length : 0) + 32;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
        if (bArrDecode == null || bArrDecode.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArrDecode.length);
            byteBufferAllocate.put(bArrDecode);
        }
        return new DrmInitData.SchemeData(uuid2, null, "video/mp4", byteBufferAllocate.array());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x022d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0235  */
    /* JADX WARN: Code duplicated, block: B:108:0x0237  */
    /* JADX WARN: Code duplicated, block: B:110:0x0241  */
    /* JADX WARN: Code duplicated, block: B:112:0x0252  */
    /* JADX WARN: Code duplicated, block: B:114:0x0258  */
    /* JADX WARN: Code duplicated, block: B:119:0x026b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0271  */
    /* JADX WARN: Code duplicated, block: B:122:0x0277  */
    /* JADX WARN: Code duplicated, block: B:126:0x0284  */
    /* JADX WARN: Code duplicated, block: B:128:0x029b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x029d  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:136:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:138:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:140:0x02da  */
    /* JADX WARN: Code duplicated, block: B:143:0x032d  */
    /* JADX WARN: Code duplicated, block: B:193:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:282:0x0355 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x025e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0186  */
    /* JADX WARN: Code duplicated, block: B:55:0x018a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0192  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v5 */
    /* JADX WARN: Type inference failed for: r43v7 */
    public static tam f(b bVar, String str) throws IOException {
        ?? r43;
        int i2;
        ArrayList arrayList;
        tam.b bVar2;
        String strD;
        ArrayList arrayList2;
        int i3;
        String str2;
        tam.b bVar3;
        String strD2;
        tam.b bVar4;
        int i4;
        int i5;
        String str3;
        String str4;
        String strV;
        String str5;
        String[] strArrY;
        StringBuilder sb;
        int length;
        int i6;
        String string;
        String str6;
        String strA;
        String strJ;
        int i7;
        int i8;
        String strJ2;
        float f2;
        Uri uriD;
        Uri uri;
        ArrayList arrayList3;
        String str7 = str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            boolean zA = bVar.a();
            Pattern pattern = N;
            ArrayList arrayList12 = arrayList8;
            boolean z4 = z2;
            Pattern pattern2 = S;
            boolean z5 = z3;
            if (!zA) {
                ArrayList arrayList13 = arrayList9;
                ArrayList arrayList14 = arrayList5;
                ArrayList arrayList15 = arrayList6;
                ArrayList arrayList16 = arrayList7;
                ArrayList arrayList17 = arrayList11;
                ArrayList arrayList18 = arrayList10;
                ArrayList arrayList19 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i9 = 0;
                HashMap map3 = map;
                while (i9 < arrayList4.size()) {
                    tam.b bVar5 = (tam.b) arrayList4.get(i9);
                    Uri uri2 = bVar5.a;
                    androidx.media3.common.a aVar = bVar5.b;
                    if (hashSet.add(uri2)) {
                        ly0.f(aVar.l == null);
                        ArrayList arrayList20 = (ArrayList) map3.get(bVar5.a);
                        arrayList20.getClass();
                        uov uovVar = new uov(new gbm(null, null, arrayList20));
                        androidx.media3.common.a.C0062a c0062aA = aVar.a();
                        c0062aA.k = uovVar;
                        arrayList19.add(new tam.b(bVar5.a, new androidx.media3.common.a(c0062aA), bVar5.c, bVar5.d, bVar5.e, bVar5.f));
                    }
                    i9++;
                    map3 = map3;
                }
                int i10 = 0;
                List arrayList21 = null;
                androidx.media3.common.a aVar2 = null;
                while (i10 < arrayList13.size()) {
                    ArrayList arrayList22 = arrayList13;
                    String str8 = (String) arrayList22.get(i10);
                    String strK = k(str8, T, map2);
                    String strK2 = k(str8, pattern2, map2);
                    androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
                    int i11 = i10;
                    c0062a.a = tug.a(strK, ":", strK2);
                    c0062a.b = strK2;
                    c0062a.l = gqv.m("application/x-mpegURL");
                    boolean zG = g(str8, X);
                    if (g(str8, Y)) {
                        r43 = zG;
                        r43 = (zG ? 1 : 0) | 2;
                    }
                    r43 = zG;
                    c0062a.e = g(str8, W) ? r43 | 4 : r43;
                    ArrayList arrayList23 = arrayList19;
                    String strJ3 = j(str8, U, null, map2);
                    if (TextUtils.isEmpty(strJ3)) {
                        arrayList13 = arrayList22;
                        i2 = 0;
                    } else {
                        String str9 = jrh0.a;
                        String[] strArrSplit = strJ3.split(",", -1);
                        i2 = jrh0.l("public.accessibility.describes-video", strArrSplit) ? 512 : 0;
                        arrayList13 = arrayList22;
                        if (jrh0.l("public.accessibility.transcribes-spoken-dialog", strArrSplit)) {
                            i2 |= 4096;
                        }
                        if (jrh0.l("public.accessibility.describes-music-and-sound", strArrSplit)) {
                            i2 |= 1024;
                        }
                        if (jrh0.l("public.easy-to-read", strArrSplit)) {
                            i2 |= 8192;
                        }
                    }
                    c0062a.f = i2;
                    c0062a.d = j(str8, R, null, map2);
                    String strJ4 = j(str8, pattern, null, map2);
                    Uri uriD2 = strJ4 == null ? null : pmh0.d(str7, strJ4);
                    uov uovVar2 = new uov(new gbm(strK, strK2, Collections.EMPTY_LIST));
                    switch (k(str8, P, map2)) {
                        case "SUBTITLES":
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList4.size()) {
                                    bVar2 = (tam.b) arrayList4.get(i12);
                                    if (!strK.equals(bVar2.e)) {
                                        i12++;
                                    }
                                } else {
                                    bVar2 = null;
                                }
                            }
                            if (bVar2 != null) {
                                String strV2 = jrh0.v(3, bVar2.b.k);
                                c0062a.j = strV2;
                                strD = gqv.d(strV2);
                            } else {
                                strD = null;
                            }
                            if (strD == null) {
                                strD = "text/vtt";
                            }
                            c0062a.m = gqv.m(strD);
                            c0062a.k = uovVar2;
                            if (uriD2 == null) {
                                arrayList = arrayList16;
                                cft.g("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            } else {
                                tam.a aVar3 = new tam.a(uriD2, new androidx.media3.common.a(c0062a), strK2);
                                arrayList = arrayList16;
                                arrayList.add(aVar3);
                                break;
                            }
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList2 = arrayList15;
                            String strK3 = k(str8, V, map2);
                            if (strK3.startsWith("CC")) {
                                i3 = Integer.parseInt(strK3.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                i3 = Integer.parseInt(strK3.substring(7));
                                str2 = "application/cea-708";
                            }
                            if (arrayList21 == null) {
                                arrayList21 = new ArrayList();
                            }
                            c0062a.m = gqv.m(str2);
                            c0062a.J = i3;
                            arrayList21.add(new androidx.media3.common.a(c0062a));
                            arrayList15 = arrayList2;
                            arrayList = arrayList16;
                            break;
                        case "AUDIO":
                            int i13 = 0;
                            while (true) {
                                if (i13 < arrayList4.size()) {
                                    bVar3 = (tam.b) arrayList4.get(i13);
                                    int i14 = i13;
                                    if (!strK.equals(bVar3.d)) {
                                        i13 = i14 + 1;
                                    }
                                } else {
                                    bVar3 = null;
                                }
                            }
                            if (bVar3 != null) {
                                String strV3 = jrh0.v(1, bVar3.b.k);
                                c0062a.j = strV3;
                                strD2 = gqv.d(strV3);
                            } else {
                                strD2 = null;
                            }
                            tam.b bVar6 = bVar3;
                            String strJ5 = j(str8, i, null, map2);
                            if (strJ5 != null) {
                                String str10 = jrh0.a;
                                c0062a.E = Integer.parseInt(strJ5.split("/", 2)[0]);
                                if ("audio/eac3".equals(strD2) && strJ5.endsWith("/JOC")) {
                                    c0062a.j = "ec+3";
                                    strD2 = "audio/eac3-joc";
                                }
                            }
                            c0062a.m = gqv.m(strD2);
                            if (uriD2 != null) {
                                c0062a.k = uovVar2;
                                arrayList15.add(new tam.a(uriD2, new androidx.media3.common.a(c0062a), strK2));
                            } else {
                                arrayList2 = arrayList15;
                                if (bVar6 != null) {
                                    arrayList15 = arrayList2;
                                    aVar2 = new androidx.media3.common.a(c0062a);
                                } else {
                                    arrayList15 = arrayList2;
                                }
                            }
                            arrayList = arrayList16;
                            break;
                        case "VIDEO":
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList4.size()) {
                                    bVar4 = (tam.b) arrayList4.get(i15);
                                    if (!strK.equals(bVar4.c)) {
                                        i15++;
                                    }
                                } else {
                                    bVar4 = null;
                                }
                            }
                            if (bVar4 != null) {
                                androidx.media3.common.a aVar4 = bVar4.b;
                                String strV4 = jrh0.v(2, aVar4.k);
                                c0062a.j = strV4;
                                c0062a.m = gqv.m(gqv.d(strV4));
                                c0062a.t = aVar4.u;
                                c0062a.u = aVar4.v;
                                c0062a.x = aVar4.y;
                            }
                            if (uriD2 != null) {
                                c0062a.k = uovVar2;
                                arrayList14.add(new tam.a(uriD2, new androidx.media3.common.a(c0062a), strK2));
                            }
                            arrayList = arrayList16;
                            break;
                        default:
                            arrayList = arrayList16;
                            break;
                    }
                    arrayList19 = arrayList23;
                    arrayList16 = arrayList;
                    i10 = i11 + 1;
                    str7 = str;
                }
                ArrayList arrayList24 = arrayList19;
                ArrayList arrayList25 = arrayList16;
                if (z4) {
                    arrayList21 = Collections.EMPTY_LIST;
                }
                return new tam(str, arrayList17, arrayList24, arrayList14, arrayList15, arrayList25, arrayList12, aVar2, arrayList21, z5, map2, arrayList18);
            }
            String strB = bVar.b();
            if (strB.startsWith("#EXT")) {
                arrayList11.add(strB);
            }
            boolean zStartsWith = strB.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList26 = arrayList11;
            if (strB.startsWith("#EXT-X-DEFINE")) {
                map2.put(k(strB, pattern2, map2), k(strB, c0, map2));
            } else {
                if (strB.equals(qUnCRF.eLMPhDypXTdYTon)) {
                    arrayList9 = arrayList9;
                    arrayList5 = arrayList5;
                    arrayList6 = arrayList6;
                    arrayList7 = arrayList7;
                    arrayList10 = arrayList10;
                    z2 = z4;
                    z3 = true;
                } else if (strB.startsWith("#EXT-X-MEDIA")) {
                    arrayList9.add(strB);
                } else if (strB.startsWith("#EXT-X-SESSION-KEY")) {
                    DrmInitData.SchemeData schemeDataD = d(strB, j(strB, L, "identity", map2), map2);
                    if (schemeDataD != null) {
                        String strK4 = k(strB, K, map2);
                        arrayList10.add(new DrmInitData(("SAMPLE-AES-CENC".equals(strK4) || "SAMPLE-AES-CTR".equals(strK4)) ? "cenc" : "cbcs", true, schemeDataD));
                    }
                } else {
                    if (strB.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                        boolean zContains = z4 | strB.contains("CLOSED-CAPTIONS=NONE");
                        int i16 = zStartsWith ? Http2.INITIAL_MAX_FRAME_SIZE : 0;
                        z4 = zContains;
                        int i17 = Integer.parseInt(k(strB, h, Collections.EMPTY_MAP));
                        Matcher matcher = c.matcher(strB);
                        if (matcher.find()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            i4 = Integer.parseInt(strGroup);
                        } else {
                            i4 = -1;
                        }
                        String strJ6 = j(strB, j, null, map2);
                        String strJ7 = j(strB, k, null, map2);
                        String strJ8 = j(strB, l, null, map2);
                        if (strJ8 != null) {
                            String str11 = jrh0.a;
                            String[] strArrSplit2 = strJ8.split(",", 2)[0].split("/", -1);
                            str3 = strArrSplit2[0];
                            if (strArrSplit2.length > 1) {
                                str4 = strArrSplit2[1];
                                arrayList9 = arrayList9;
                                i5 = 2;
                            } else {
                                i5 = 2;
                            }
                            strV = jrh0.v(i5, strJ7);
                            ArrayList<gqv.a> arrayList27 = gqv.a;
                            if (strV == null) {
                                str5 = strJ7;
                            } else {
                                if (strV.startsWith("dvhe")) {
                                    str5 = strJ7;
                                } else {
                                    str5 = strJ7;
                                    if (strV.startsWith("dvh1") && (str3 == null || ((!str3.startsWith("dvhe") || !strV.startsWith("hev1")) && ((!str3.startsWith("dvh1") || !strV.startsWith("hvc1")) && ((!str3.startsWith("dvav") || !strV.startsWith("avc3")) && ((!str3.startsWith("dva1") || !strV.startsWith("avc1")) && (!str3.startsWith("dav1") || !strV.startsWith("av01")))))))) {
                                    }
                                    strJ = j(strB, m, null, map2);
                                    if (strJ != null) {
                                        String[] strArrSplit3 = strJ.split("x", -1);
                                        i8 = Integer.parseInt(strArrSplit3[0]);
                                        i7 = Integer.parseInt(strArrSplit3[1]);
                                        if (i8 > 0 || i7 <= 0) {
                                            i7 = -1;
                                            i8 = -1;
                                        }
                                    } else {
                                        i7 = -1;
                                        i8 = -1;
                                    }
                                    strJ2 = j(strB, n, null, map2);
                                    if (strJ2 != null) {
                                        f2 = Float.parseFloat(strJ2);
                                    } else {
                                        f2 = -1.0f;
                                    }
                                    String strJ9 = j(strB, d, null, map2);
                                    String strJ10 = j(strB, e, null, map2);
                                    String strJ11 = j(strB, f, null, map2);
                                    String strJ12 = j(strB, g, null, map2);
                                    if (zStartsWith) {
                                        uriD = pmh0.d(str7, k(strB, pattern, map2));
                                    } else {
                                        if (bVar.a()) {
                                            throw ssz.b("#EXT-X-STREAM-INF must be followed by another line");
                                        }
                                        uriD = pmh0.d(str7, l(bVar.b(), map2));
                                    }
                                    uri = uriD;
                                    androidx.media3.common.a.C0062a c0062a2 = new androidx.media3.common.a.C0062a();
                                    c0062a2.a = Integer.toString(arrayList4.size());
                                    c0062a2.l = gqv.m("application/x-mpegURL");
                                    c0062a2.j = strA;
                                    c0062a2.h = i4;
                                    c0062a2.i = i17;
                                    c0062a2.t = i8;
                                    c0062a2.u = i7;
                                    c0062a2.x = f2;
                                    c0062a2.f = i16;
                                    arrayList4.add(new tam.b(uri, new androidx.media3.common.a(c0062a2), strJ9, strJ10, strJ11, strJ12));
                                    arrayList3 = (ArrayList) map.get(uri);
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        map.put(uri, arrayList3);
                                    }
                                    arrayList3.add(new gbm.a(i4, i17, strJ9, strJ10, strJ11, strJ12));
                                }
                                if (str3 == null || (strJ6 != null && str4 != null && ((!strJ6.equals("PQ") || str4.equals("db1p")) && ((!strJ6.equals("SDR") || str4.equals("db2g")) && (!strJ6.equals("HLG") || str4.startsWith("db4")))))) {
                                    if (str3 == null) {
                                        str3 = strV;
                                    }
                                    strArrY = jrh0.Y(str5);
                                    if (strArrY.length == 0) {
                                        string = null;
                                    } else {
                                        sb = new StringBuilder();
                                        length = strArrY.length;
                                        i6 = 0;
                                        while (i6 < length) {
                                            str6 = strArrY[i6];
                                            String[] strArr = strArrY;
                                            int i18 = length;
                                            if (2 == gqv.h(gqv.d(str6))) {
                                                if (sb.length() > 0) {
                                                    sb.append(",");
                                                }
                                                sb.append(str6);
                                            }
                                            i6++;
                                            length = i18;
                                            strArrY = strArr;
                                        }
                                        if (sb.length() > 0) {
                                            string = sb.toString();
                                        } else {
                                            string = null;
                                        }
                                    }
                                    if (string != null) {
                                        strA = tug.a(str3, ",", string);
                                    } else {
                                        strA = str3;
                                    }
                                }
                                strJ = j(strB, m, null, map2);
                                if (strJ != null) {
                                    String[] strArrSplit4 = strJ.split("x", -1);
                                    i8 = Integer.parseInt(strArrSplit4[0]);
                                    i7 = Integer.parseInt(strArrSplit4[1]);
                                    if (i8 > 0) {
                                        i7 = -1;
                                        i8 = -1;
                                    } else {
                                        i7 = -1;
                                        i8 = -1;
                                    }
                                } else {
                                    i7 = -1;
                                    i8 = -1;
                                }
                                strJ2 = j(strB, n, null, map2);
                                if (strJ2 != null) {
                                    f2 = Float.parseFloat(strJ2);
                                } else {
                                    f2 = -1.0f;
                                }
                                String strJ13 = j(strB, d, null, map2);
                                String strJ14 = j(strB, e, null, map2);
                                String strJ15 = j(strB, f, null, map2);
                                String strJ16 = j(strB, g, null, map2);
                                if (zStartsWith) {
                                    uriD = pmh0.d(str7, k(strB, pattern, map2));
                                } else {
                                    if (bVar.a()) {
                                        throw ssz.b("#EXT-X-STREAM-INF must be followed by another line");
                                    }
                                    uriD = pmh0.d(str7, l(bVar.b(), map2));
                                }
                                uri = uriD;
                                androidx.media3.common.a.C0062a c0062a3 = new androidx.media3.common.a.C0062a();
                                c0062a3.a = Integer.toString(arrayList4.size());
                                c0062a3.l = gqv.m("application/x-mpegURL");
                                c0062a3.j = strA;
                                c0062a3.h = i4;
                                c0062a3.i = i17;
                                c0062a3.t = i8;
                                c0062a3.u = i7;
                                c0062a3.x = f2;
                                c0062a3.f = i16;
                                arrayList4.add(new tam.b(uri, new androidx.media3.common.a(c0062a3), strJ13, strJ14, strJ15, strJ16));
                                arrayList3 = (ArrayList) map.get(uri);
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                    map.put(uri, arrayList3);
                                }
                                arrayList3.add(new gbm.a(i4, i17, strJ13, strJ14, strJ15, strJ16));
                            }
                            strA = str5;
                            strJ = j(strB, m, null, map2);
                            if (strJ != null) {
                                String[] strArrSplit5 = strJ.split("x", -1);
                                i8 = Integer.parseInt(strArrSplit5[0]);
                                i7 = Integer.parseInt(strArrSplit5[1]);
                                if (i8 > 0) {
                                    i7 = -1;
                                    i8 = -1;
                                } else {
                                    i7 = -1;
                                    i8 = -1;
                                }
                            } else {
                                i7 = -1;
                                i8 = -1;
                            }
                            strJ2 = j(strB, n, null, map2);
                            if (strJ2 != null) {
                                f2 = Float.parseFloat(strJ2);
                            } else {
                                f2 = -1.0f;
                            }
                            String strJ17 = j(strB, d, null, map2);
                            String strJ18 = j(strB, e, null, map2);
                            String strJ19 = j(strB, f, null, map2);
                            String strJ110 = j(strB, g, null, map2);
                            if (zStartsWith) {
                                uriD = pmh0.d(str7, k(strB, pattern, map2));
                            } else {
                                if (bVar.a()) {
                                    throw ssz.b("#EXT-X-STREAM-INF must be followed by another line");
                                }
                                uriD = pmh0.d(str7, l(bVar.b(), map2));
                            }
                            uri = uriD;
                            androidx.media3.common.a.C0062a c0062a4 = new androidx.media3.common.a.C0062a();
                            c0062a4.a = Integer.toString(arrayList4.size());
                            c0062a4.l = gqv.m("application/x-mpegURL");
                            c0062a4.j = strA;
                            c0062a4.h = i4;
                            c0062a4.i = i17;
                            c0062a4.t = i8;
                            c0062a4.u = i7;
                            c0062a4.x = f2;
                            c0062a4.f = i16;
                            arrayList4.add(new tam.b(uri, new androidx.media3.common.a(c0062a4), strJ17, strJ18, strJ19, strJ110));
                            arrayList3 = (ArrayList) map.get(uri);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                                map.put(uri, arrayList3);
                            }
                            arrayList3.add(new gbm.a(i4, i17, strJ17, strJ18, strJ19, strJ110));
                        } else {
                            i5 = 2;
                            str3 = null;
                        }
                        str4 = null;
                        strV = jrh0.v(i5, strJ7);
                        ArrayList<gqv.a> arrayList28 = gqv.a;
                        if (strV == null) {
                            str5 = strJ7;
                        } else {
                            if (strV.startsWith("dvhe")) {
                                str5 = strJ7;
                                if (strV.startsWith("dvh1")) {
                                }
                                strJ = j(strB, m, null, map2);
                                if (strJ != null) {
                                    String[] strArrSplit6 = strJ.split("x", -1);
                                    i8 = Integer.parseInt(strArrSplit6[0]);
                                    i7 = Integer.parseInt(strArrSplit6[1]);
                                    if (i8 > 0) {
                                        i7 = -1;
                                        i8 = -1;
                                    } else {
                                        i7 = -1;
                                        i8 = -1;
                                    }
                                } else {
                                    i7 = -1;
                                    i8 = -1;
                                }
                                strJ2 = j(strB, n, null, map2);
                                if (strJ2 != null) {
                                    f2 = Float.parseFloat(strJ2);
                                } else {
                                    f2 = -1.0f;
                                }
                                String strJ111 = j(strB, d, null, map2);
                                String strJ112 = j(strB, e, null, map2);
                                String strJ113 = j(strB, f, null, map2);
                                String strJ114 = j(strB, g, null, map2);
                                if (zStartsWith) {
                                    uriD = pmh0.d(str7, k(strB, pattern, map2));
                                } else {
                                    if (bVar.a()) {
                                        throw ssz.b("#EXT-X-STREAM-INF must be followed by another line");
                                    }
                                    uriD = pmh0.d(str7, l(bVar.b(), map2));
                                }
                                uri = uriD;
                                androidx.media3.common.a.C0062a c0062a5 = new androidx.media3.common.a.C0062a();
                                c0062a5.a = Integer.toString(arrayList4.size());
                                c0062a5.l = gqv.m("application/x-mpegURL");
                                c0062a5.j = strA;
                                c0062a5.h = i4;
                                c0062a5.i = i17;
                                c0062a5.t = i8;
                                c0062a5.u = i7;
                                c0062a5.x = f2;
                                c0062a5.f = i16;
                                arrayList4.add(new tam.b(uri, new androidx.media3.common.a(c0062a5), strJ111, strJ112, strJ113, strJ114));
                                arrayList3 = (ArrayList) map.get(uri);
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                    map.put(uri, arrayList3);
                                }
                                arrayList3.add(new gbm.a(i4, i17, strJ111, strJ112, strJ113, strJ114));
                            } else {
                                str5 = strJ7;
                            }
                            if (str3 == null) {
                            }
                            if (str3 == null) {
                                str3 = strV;
                            }
                            strArrY = jrh0.Y(str5);
                            if (strArrY.length == 0) {
                                string = null;
                            } else {
                                sb = new StringBuilder();
                                length = strArrY.length;
                                i6 = 0;
                                while (i6 < length) {
                                    str6 = strArrY[i6];
                                    String[] strArr2 = strArrY;
                                    int i19 = length;
                                    if (2 == gqv.h(gqv.d(str6))) {
                                        if (sb.length() > 0) {
                                            sb.append(",");
                                        }
                                        sb.append(str6);
                                    }
                                    i6++;
                                    length = i19;
                                    strArrY = strArr2;
                                }
                                if (sb.length() > 0) {
                                    string = sb.toString();
                                } else {
                                    string = null;
                                }
                            }
                            if (string != null) {
                                strA = tug.a(str3, ",", string);
                            } else {
                                strA = str3;
                            }
                            strJ = j(strB, m, null, map2);
                            if (strJ != null) {
                                String[] strArrSplit7 = strJ.split("x", -1);
                                i8 = Integer.parseInt(strArrSplit7[0]);
                                i7 = Integer.parseInt(strArrSplit7[1]);
                                if (i8 > 0) {
                                    i7 = -1;
                                    i8 = -1;
                                } else {
                                    i7 = -1;
                                    i8 = -1;
                                }
                            } else {
                                i7 = -1;
                                i8 = -1;
                            }
                            strJ2 = j(strB, n, null, map2);
                            if (strJ2 != null) {
                                f2 = Float.parseFloat(strJ2);
                            } else {
                                f2 = -1.0f;
                            }
                            String strJ115 = j(strB, d, null, map2);
                            String strJ116 = j(strB, e, null, map2);
                            String strJ117 = j(strB, f, null, map2);
                            String strJ118 = j(strB, g, null, map2);
                            if (zStartsWith) {
                                uriD = pmh0.d(str7, k(strB, pattern, map2));
                            } else {
                                if (bVar.a()) {
                                    throw ssz.b("#EXT-X-STREAM-INF must be followed by another line");
                                }
                                uriD = pmh0.d(str7, l(bVar.b(), map2));
                            }
                            uri = uriD;
                            androidx.media3.common.a.C0062a c0062a6 = new androidx.media3.common.a.C0062a();
                            c0062a6.a = Integer.toString(arrayList4.size());
                            c0062a6.l = gqv.m("application/x-mpegURL");
                            c0062a6.j = strA;
                            c0062a6.h = i4;
                            c0062a6.i = i17;
                            c0062a6.t = i8;
                            c0062a6.u = i7;
                            c0062a6.x = f2;
                            c0062a6.f = i16;
                            arrayList4.add(new tam.b(uri, new androidx.media3.common.a(c0062a6), strJ115, strJ116, strJ117, strJ118));
                            arrayList3 = (ArrayList) map.get(uri);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                                map.put(uri, arrayList3);
                            }
                            arrayList3.add(new gbm.a(i4, i17, strJ115, strJ116, strJ117, strJ118));
                        }
                        strA = str5;
                        strJ = j(strB, m, null, map2);
                        if (strJ != null) {
                            String[] strArrSplit8 = strJ.split("x", -1);
                            i8 = Integer.parseInt(strArrSplit8[0]);
                            i7 = Integer.parseInt(strArrSplit8[1]);
                            if (i8 > 0) {
                                i7 = -1;
                                i8 = -1;
                            } else {
                                i7 = -1;
                                i8 = -1;
                            }
                        } else {
                            i7 = -1;
                            i8 = -1;
                        }
                        strJ2 = j(strB, n, null, map2);
                        if (strJ2 != null) {
                            f2 = Float.parseFloat(strJ2);
                        } else {
                            f2 = -1.0f;
                        }
                        String strJ119 = j(strB, d, null, map2);
                        String strJ1110 = j(strB, e, null, map2);
                        String strJ1111 = j(strB, f, null, map2);
                        String strJ1112 = j(strB, g, null, map2);
                        if (zStartsWith) {
                            uriD = pmh0.d(str7, k(strB, pattern, map2));
                        } else {
                            if (bVar.a()) {
                                throw ssz.b("#EXT-X-STREAM-INF must be followed by another line");
                            }
                            uriD = pmh0.d(str7, l(bVar.b(), map2));
                        }
                        uri = uriD;
                        androidx.media3.common.a.C0062a c0062a7 = new androidx.media3.common.a.C0062a();
                        c0062a7.a = Integer.toString(arrayList4.size());
                        c0062a7.l = gqv.m("application/x-mpegURL");
                        c0062a7.j = strA;
                        c0062a7.h = i4;
                        c0062a7.i = i17;
                        c0062a7.t = i8;
                        c0062a7.u = i7;
                        c0062a7.x = f2;
                        c0062a7.f = i16;
                        arrayList4.add(new tam.b(uri, new androidx.media3.common.a(c0062a7), strJ119, strJ1110, strJ1111, strJ1112));
                        arrayList3 = (ArrayList) map.get(uri);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            map.put(uri, arrayList3);
                        }
                        arrayList3.add(new gbm.a(i4, i17, strJ119, strJ1110, strJ1111, strJ1112));
                    }
                    z2 = z4;
                    z3 = z5;
                }
                arrayList8 = arrayList12;
                arrayList11 = arrayList26;
                arrayList10 = arrayList10;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList5 = arrayList5;
                arrayList9 = arrayList9;
            }
            arrayList9 = arrayList9;
            z2 = z4;
            z3 = z5;
            arrayList8 = arrayList12;
            arrayList11 = arrayList26;
            arrayList10 = arrayList10;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList5 = arrayList5;
            arrayList9 = arrayList9;
        }
    }
}
