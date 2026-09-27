package jg;

import androidx.annotation.Nullable;
import cj.x6;
import java.util.Map;
import re.n2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f100381f = "AC3";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f100382g = "AMR";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f100383h = "AMR-WB";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f100384i = "MPEG4-GENERIC";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f100385j = "MP4A-LATM";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f100386k = "MP4V-ES";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f100387l = "H263-1998";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f100388m = "H263-2000";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f100389n = "H264";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f100390o = "H265";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f100391p = "OPUS";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f100392q = "L8";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f100393r = "L16";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f100394s = "PCMA";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f100395t = "PCMU";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f100396u = "VP8";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f100397v = "VP9";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f100398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f100399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n2 f100400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x6<String, String> f100401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f100402e;

    public j(n2 n2Var, int i10, int i11, Map<String, String> map, String str) {
        this.f100398a = i10;
        this.f100399b = i11;
        this.f100400c = n2Var;
        this.f100401d = x6.m(map);
        this.f100402e = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String a(String str) {
        String strJ = zi.c.j(str);
        strJ.getClass();
        byte b10 = -1;
        switch (strJ.hashCode()) {
            case -1922091719:
                if (strJ.equals(f100384i)) {
                    b10 = 0;
                }
                break;
            case 2412:
                if (strJ.equals(f100392q)) {
                    b10 = 1;
                }
                break;
            case 64593:
                if (strJ.equals(f100381f)) {
                    b10 = 2;
                }
                break;
            case 64934:
                if (strJ.equals(f100382g)) {
                    b10 = 3;
                }
                break;
            case 74609:
                if (strJ.equals(f100393r)) {
                    b10 = 4;
                }
                break;
            case 85182:
                if (strJ.equals(f100396u)) {
                    b10 = 5;
                }
                break;
            case 85183:
                if (strJ.equals(f100397v)) {
                    b10 = 6;
                }
                break;
            case 2194728:
                if (strJ.equals(f100389n)) {
                    b10 = 7;
                }
                break;
            case 2194729:
                if (strJ.equals(f100390o)) {
                    b10 = 8;
                }
                break;
            case 2433087:
                if (strJ.equals(f100391p)) {
                    b10 = 9;
                }
                break;
            case 2450119:
                if (strJ.equals(f100394s)) {
                    b10 = 10;
                }
                break;
            case 2450139:
                if (strJ.equals(f100395t)) {
                    b10 = zi.c.f161635m;
                }
                break;
            case 1061166827:
                if (strJ.equals(f100385j)) {
                    b10 = zi.c.f161636n;
                }
                break;
            case 1934494802:
                if (strJ.equals(f100383h)) {
                    b10 = 13;
                }
                break;
            case 1959269366:
                if (strJ.equals(f100386k)) {
                    b10 = zi.c.f161638p;
                }
                break;
            case 2137188397:
                if (strJ.equals(f100387l)) {
                    b10 = zi.c.f161639q;
                }
                break;
            case 2137209252:
                if (strJ.equals(f100388m)) {
                    b10 = zi.c.f161640r;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 12:
                return "audio/mp4a-latm";
            case 1:
            case 4:
                return "audio/raw";
            case 2:
                return "audio/ac3";
            case 3:
                return "audio/3gpp";
            case 5:
                return "video/x-vnd.on2.vp8";
            case 6:
                return "video/x-vnd.on2.vp9";
            case 7:
                return "video/avc";
            case 8:
                return "video/hevc";
            case 9:
                return "audio/opus";
            case 10:
                return "audio/g711-alaw";
            case 11:
                return "audio/g711-mlaw";
            case 13:
                return "audio/amr-wb";
            case 14:
                return "video/mp4v-es";
            case 15:
            case 16:
                return "video/3gpp";
            default:
                throw new IllegalArgumentException(str);
        }
    }

    public static int b(String str) {
        eh.a.a(str.equals(f100392q) || str.equals(f100393r));
        return str.equals(f100392q) ? 3 : 268435456;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean c(b bVar) {
        String strJ = zi.c.j(bVar.f100141j.f100157b);
        strJ.getClass();
        byte b10 = -1;
        switch (strJ.hashCode()) {
            case -1922091719:
                if (strJ.equals(f100384i)) {
                    b10 = 0;
                }
                break;
            case 2412:
                if (strJ.equals(f100392q)) {
                    b10 = 1;
                }
                break;
            case 64593:
                if (strJ.equals(f100381f)) {
                    b10 = 2;
                }
                break;
            case 64934:
                if (strJ.equals(f100382g)) {
                    b10 = 3;
                }
                break;
            case 74609:
                if (strJ.equals(f100393r)) {
                    b10 = 4;
                }
                break;
            case 85182:
                if (strJ.equals(f100396u)) {
                    b10 = 5;
                }
                break;
            case 85183:
                if (strJ.equals(f100397v)) {
                    b10 = 6;
                }
                break;
            case 2194728:
                if (strJ.equals(f100389n)) {
                    b10 = 7;
                }
                break;
            case 2194729:
                if (strJ.equals(f100390o)) {
                    b10 = 8;
                }
                break;
            case 2433087:
                if (strJ.equals(f100391p)) {
                    b10 = 9;
                }
                break;
            case 2450119:
                if (strJ.equals(f100394s)) {
                    b10 = 10;
                }
                break;
            case 2450139:
                if (strJ.equals(f100395t)) {
                    b10 = zi.c.f161635m;
                }
                break;
            case 1061166827:
                if (strJ.equals(f100385j)) {
                    b10 = zi.c.f161636n;
                }
                break;
            case 1934494802:
                if (strJ.equals(f100383h)) {
                    b10 = 13;
                }
                break;
            case 1959269366:
                if (strJ.equals(f100386k)) {
                    b10 = zi.c.f161638p;
                }
                break;
            case 2137188397:
                if (strJ.equals(f100387l)) {
                    b10 = zi.c.f161639q;
                }
                break;
            case 2137209252:
                if (strJ.equals(f100388m)) {
                    b10 = zi.c.f161640r;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return true;
            default:
                return false;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f100398a == jVar.f100398a && this.f100399b == jVar.f100399b && this.f100400c.equals(jVar.f100400c) && this.f100401d.equals(jVar.f100401d) && this.f100402e.equals(jVar.f100402e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((217 + this.f100398a) * 31) + this.f100399b) * 31) + this.f100400c.hashCode()) * 31) + this.f100401d.hashCode()) * 31) + this.f100402e.hashCode();
    }
}
