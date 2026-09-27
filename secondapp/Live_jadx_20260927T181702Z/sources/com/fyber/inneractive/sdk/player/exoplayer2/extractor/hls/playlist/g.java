package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.c0;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f45942a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f45943b = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f45944c = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f45945d = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f45946e = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f45947f = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f45948g = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f45949h = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f45950i = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f45951j = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f45952k = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f45953l = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f45954m = Pattern.compile("METHOD=(NONE|AES-128)");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f45955n = Pattern.compile("URI=\"(.+?)\"");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f45956o = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f45957p = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f45958q = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f45959r = Pattern.compile("NAME=\"(.+?)\"");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f45960s = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f45961t = Pattern.compile("AUTOSELECT".concat("=(NO|YES)"));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f45962u = Pattern.compile("DEFAULT".concat("=(NO|YES)"));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f45963v = Pattern.compile("FORCED".concat("=(NO|YES)"));

    public static d b(f fVar, String str) throws r {
        String str2;
        int i10;
        String hexString;
        fVar = fVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str3 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean zEquals = false;
        long j10 = -9223372036854775807L;
        c cVar = null;
        String strB = null;
        String strA = null;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = -1;
        int i14 = 1;
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        boolean z11 = false;
        long j16 = -9223372036854775807L;
        while (fVar.a()) {
            if (fVar.a()) {
                str2 = fVar.f45941c;
                fVar.f45941c = str3;
            } else {
                str2 = str3;
            }
            if (str2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strB2 = b(str2, f45948g);
                if ("VOD".equals(strB2)) {
                    fVar = fVar;
                    str3 = null;
                    i11 = 1;
                } else if ("EVENT".equals(strB2)) {
                    fVar = fVar;
                    str3 = null;
                    i11 = 2;
                } else {
                    j16 = j16;
                    j16 = j16;
                    str3 = null;
                }
            } else {
                if (str2.startsWith("#EXT-X-START")) {
                    j16 = (long) (Double.parseDouble(b(str2, f45951j)) * 1000000.0d);
                } else {
                    if (str2.startsWith("#EXT-X-MAP")) {
                        String strB3 = b(str2, f45955n);
                        String strA2 = a(str2, f45953l);
                        if (strA2 != null) {
                            String[] strArrSplit = strA2.split(to.c.phraseDel);
                            j15 = Long.parseLong(strArrSplit[0]);
                            if (strArrSplit.length > 1) {
                                j12 = Long.parseLong(strArrSplit[1]);
                            }
                        }
                        c cVar2 = new c(strB3, 0L, -1, -9223372036854775807L, false, null, null, j12, j15);
                        fVar = fVar;
                        j12 = 0;
                        j15 = -1;
                        cVar = cVar2;
                    } else if (str2.startsWith("#EXT-X-TARGETDURATION")) {
                        j10 = 1000000 * ((long) Integer.parseInt(b(str2, f45946e)));
                    } else if (str2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        i12 = Integer.parseInt(b(str2, f45949h));
                        fVar = fVar;
                        i16 = i12;
                    } else if (str2.startsWith("#EXT-X-VERSION")) {
                        i14 = Integer.parseInt(b(str2, f45947f));
                    } else if (str2.startsWith("#EXTINF")) {
                        fVar = fVar;
                        j13 = (long) (Double.parseDouble(b(str2, f45950i)) * 1000000.0d);
                    } else if (str2.startsWith("#EXT-X-KEY")) {
                        zEquals = "AES-128".equals(b(str2, f45954m));
                        if (zEquals) {
                            strB = b(str2, f45955n);
                            strA = a(str2, f45956o);
                        } else {
                            fVar = fVar;
                            str3 = null;
                            strB = null;
                            strA = null;
                        }
                    } else if (str2.startsWith("#EXT-X-BYTERANGE")) {
                        String[] strArrSplit2 = b(str2, f45952k).split(to.c.phraseDel);
                        j15 = Long.parseLong(strArrSplit2[0]);
                        if (strArrSplit2.length > 1) {
                            j12 = Long.parseLong(strArrSplit2[1]);
                        }
                    } else if (str2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                        i15 = Integer.parseInt(str2.substring(str2.indexOf(58) + 1));
                        z10 = true;
                    } else if (str2.equals("#EXT-X-DISCONTINUITY")) {
                        i13++;
                    } else {
                        if (!str2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                            j16 = j16;
                            if (str2.startsWith(m5.k.G)) {
                                arrayList2.add(str2);
                            } else if (str2.startsWith("#")) {
                                if (str2.equals("#EXT-X-ENDLIST")) {
                                    z11 = true;
                                }
                                j16 = j16;
                            } else {
                                if (zEquals) {
                                    hexString = strA != null ? strA : Integer.toHexString(i12);
                                } else {
                                    hexString = null;
                                }
                                int i17 = i12 + 1;
                                long j17 = j15 == -1 ? 0L : j12;
                                arrayList.add(new c(str2, j13, i13, j14, zEquals, strB, hexString, j17, j15));
                                j14 += j13;
                                if (j15 != -1) {
                                    j17 += j15;
                                }
                                j12 = j17;
                                i12 = i17;
                                j13 = 0;
                                j15 = -1;
                                j16 = j16;
                                str3 = null;
                                fVar = fVar;
                            }
                        } else if (j11 == 0) {
                            String strSubstring = str2.substring(str2.indexOf(58) + 1);
                            Matcher matcher = z.f47163f.matcher(strSubstring);
                            if (!matcher.matches()) {
                                throw new r("Invalid date/time format: " + strSubstring);
                            }
                            if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                                i10 = 0;
                            } else {
                                i10 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                                if (matcher.group(11).equals(TokenBuilder.TOKEN_DELIMITER)) {
                                    i10 *= -1;
                                }
                            }
                            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                            gregorianCalendar.clear();
                            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                            if (!TextUtils.isEmpty(matcher.group(8))) {
                                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                            }
                            long timeInMillis = gregorianCalendar.getTimeInMillis();
                            if (i10 != 0) {
                                timeInMillis -= (long) (i10 * 60000);
                            }
                            int i18 = com.fyber.inneractive.sdk.player.exoplayer2.b.f45699a;
                            j11 = (timeInMillis == -9223372036854775807L ? -9223372036854775807L : timeInMillis * 1000) - j14;
                        } else {
                            j16 = j16;
                        }
                        j16 = j16;
                    }
                    str3 = null;
                }
                fVar = fVar;
                str3 = null;
            }
        }
        return new d(i11, str, j16, j11, z10, i15, i16, i14, j10, z11, j11 != 0, cVar, arrayList, arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:3:0x000f, B:5:0x0017, B:7:0x001f, B:9:0x0027, B:36:0x006f, B:37:0x0076, B:14:0x0032, B:16:0x0038, B:20:0x0041, B:22:0x0049, B:25:0x0056, B:27:0x005c, B:31:0x0063, B:32:0x0068, B:38:0x0077, B:40:0x007d, B:43:0x0088, B:45:0x0090, B:46:0x00a1, B:48:0x00a9, B:50:0x00b1, B:52:0x00b9, B:54:0x00c1, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:63:0x00e2, B:64:0x00e6), top: B:71:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0049 A[Catch: all -> 0x002c, LOOP:1: B:18:0x003e->B:22:0x0049, LOOP_END, TryCatch #0 {all -> 0x002c, blocks: (B:3:0x000f, B:5:0x0017, B:7:0x001f, B:9:0x0027, B:36:0x006f, B:37:0x0076, B:14:0x0032, B:16:0x0038, B:20:0x0041, B:22:0x0049, B:25:0x0056, B:27:0x005c, B:31:0x0063, B:32:0x0068, B:38:0x0077, B:40:0x007d, B:43:0x0088, B:45:0x0090, B:46:0x00a1, B:48:0x00a9, B:50:0x00b1, B:52:0x00b9, B:54:0x00c1, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:63:0x00e2, B:64:0x00e6), top: B:71:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:76:0x006f A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:24:0x0054
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e a(android.net.Uri r7, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r8) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.g.a(android.net.Uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j):com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e");
    }

    /* JADX WARN: Code duplicated, block: B:73:0x021d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static b a(f fVar, String str) throws r {
        String str2;
        int i10;
        String str3;
        int i11;
        int i12;
        String str4;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        o oVar = null;
        List arrayList4 = null;
        boolean zContains = false;
        while (fVar.a()) {
            if (fVar.a()) {
                str2 = fVar.f45941c;
                fVar.f45941c = null;
            } else {
                str2 = null;
            }
            if (str2.startsWith("#EXT-X-MEDIA")) {
                Matcher matcher = f45962u.matcher(str2);
                boolean zEquals = matcher.find() ? matcher.group(1).equals("YES") : 0;
                Matcher matcher2 = f45963v.matcher(str2);
                int i13 = zEquals | (matcher2.find() ? matcher2.group(1).equals("YES") : false ? 2 : 0);
                Matcher matcher3 = f45961t.matcher(str2);
                int i14 = i13 | (matcher3.find() ? matcher3.group(1).equals("YES") : false ? 4 : 0);
                String strA = a(str2, f45955n);
                String strB = b(str2, f45959r);
                String strA2 = a(str2, f45958q);
                String strB2 = b(str2, f45957p);
                strB2.getClass();
                switch (strB2) {
                    case "SUBTITLES":
                        arrayList3.add(new a(strA, new o(strB, "application/x-mpegURL", "text/vtt", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i14, strA2, -1, Long.MAX_VALUE, null, null, null)));
                        break;
                    case "CLOSED-CAPTIONS":
                        String strB3 = b(str2, f45960s);
                        if (strB3.startsWith("CC")) {
                            i10 = Integer.parseInt(strB3.substring(2));
                            str3 = "application/cea-608";
                        } else {
                            i10 = Integer.parseInt(strB3.substring(7));
                            str3 = "application/cea-708";
                        }
                        int i15 = i10;
                        String str5 = str3;
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(new o(strB, null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i14, strA2, i15, Long.MAX_VALUE, null, null, null));
                        break;
                    case "AUDIO":
                        o oVar2 = new o(strB, "application/x-mpegURL", null, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i14, strA2, -1, Long.MAX_VALUE, null, null, null);
                        if (strA != null) {
                            arrayList2.add(new a(strA, oVar2));
                            break;
                        } else {
                            oVar = oVar2;
                            break;
                        }
                        break;
                }
            } else if (str2.startsWith("#EXT-X-STREAM-INF")) {
                int i16 = Integer.parseInt(b(str2, f45943b));
                String strA3 = a(str2, f45942a);
                if (strA3 != null) {
                    i16 = Integer.parseInt(strA3);
                }
                int i17 = i16;
                String strA4 = a(str2, f45944c);
                String strA5 = a(str2, f45945d);
                zContains |= str2.contains("CLOSED-CAPTIONS=NONE");
                if (strA5 != null) {
                    String[] strArrSplit = strA5.split("x");
                    int i18 = Integer.parseInt(strArrSplit[0]);
                    int i19 = Integer.parseInt(strArrSplit[1]);
                    if (i18 <= 0 || i19 <= 0) {
                        i11 = -1;
                        i12 = -1;
                    } else {
                        i12 = i19;
                        i11 = i18;
                    }
                } else {
                    i11 = -1;
                    i12 = -1;
                }
                if (fVar.a()) {
                    str4 = fVar.f45941c;
                    fVar.f45941c = null;
                } else {
                    str4 = null;
                }
                if (hashSet.add(str4)) {
                    arrayList.add(new a(str4, new o(Integer.toString(arrayList.size()), "application/x-mpegURL", null, strA4, i17, -1, i11, i12, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null)));
                }
            }
        }
        if (zContains) {
            arrayList4 = Collections.EMPTY_LIST;
        }
        return new b(str, arrayList, arrayList2, arrayList3, oVar, arrayList4);
    }

    public static String b(String str, Pattern pattern) throws r {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        throw new r("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String a(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}
