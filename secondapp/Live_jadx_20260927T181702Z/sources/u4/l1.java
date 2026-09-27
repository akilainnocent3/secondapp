package u4;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.signals.SignalKey;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {
    public static final String A = "video/ogg";
    public static final String A0 = "application/vnd.ms-sstr+xml";
    public static final String B = "video/x-msvideo";
    public static final String B0 = "application/id3";
    public static final String C = "video/mjpeg";
    public static final String C0 = "application/cea-608";
    public static final String D = "video/mp42";
    public static final String D0 = "application/cea-708";
    public static final String E = "video/mp43";
    public static final String E0 = "application/x-subrip";

    @x4.m1
    public static final String F = "video/mv-hevc";
    public static final String F0 = "application/ttml+xml";

    @x4.m1
    public static final String G = "video/raw";
    public static final String G0 = "application/x-quicktime-tx3g";

    @x4.m1
    public static final String H = "video/x-unknown";
    public static final String H0 = "application/x-mp4-vtt";
    public static final String I = "audio/mp4";
    public static final String I0 = "application/x-mp4-cea-608";
    public static final String J = "audio/mp4a-latm";

    @Deprecated
    public static final String J0 = "application/x-rawcc";

    @x4.m1
    public static final String K = "audio/x-matroska";
    public static final String K0 = "application/vobsub";
    public static final String L = "audio/webm";
    public static final String L0 = "application/pgs";
    public static final String M = "audio/mpeg";

    @x4.m1
    public static final String M0 = "application/x-scte35";
    public static final String N = "audio/mpeg-L1";
    public static final String N0 = "application/sdp";
    public static final String O = "audio/mpeg-L2";

    @x4.m1
    public static final String O0 = "application/x-camera-motion";
    public static final String P = "audio/mha1";

    @x4.m1
    public static final String P0 = "application/meta";
    public static final String Q = "audio/mhm1";

    @x4.m1
    public static final String Q0 = "application/x-itut-t35";
    public static final String R = "audio/raw";

    @x4.m1
    public static final String R0 = "application/x-depth-metadata";
    public static final String S = "audio/g711-alaw";

    @x4.m1
    public static final String S0 = "application/x-emsg";
    public static final String T = "audio/g711-mlaw";
    public static final String T0 = "application/dvbsubs";
    public static final String U = "audio/ac3";

    @x4.m1
    public static final String U0 = "application/x-exif";
    public static final String V = "audio/eac3";

    @x4.m1
    public static final String V0 = "application/x-icy";
    public static final String W = "audio/eac3-joc";
    public static final String W0 = "application/vnd.dvb.ait";
    public static final String X = "audio/ac4";
    public static final String X0 = "application/x-rtsp";
    public static final String Y = "audio/true-hd";

    @x4.m1
    public static final String Y0 = "application/x-media3-cues";

    @x4.m1
    public static final String Z = "audio/dsd";

    @x4.m1
    public static final String Z0 = "application/x-image-uri";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @x4.m1
    public static final String f138642a = "video";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f138643a0 = "audio/vnd.dts";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final String f138644a1 = "image/jpeg";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @x4.m1
    public static final String f138645b = "audio";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f138646b0 = "audio/vnd.dts.hd";

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    @x4.m1
    public static final String f138647b1 = "image/jpeg_r";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @x4.m1
    public static final String f138648c = "text";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f138649c0 = "audio/vnd.dts.hd;profile=lbr";

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    @x4.m1
    public static final String f138650c1 = "image/png";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @x4.m1
    public static final String f138651d = "image";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @x4.m1
    public static final String f138652d0 = "audio/vnd.dts.uhd;profile=p2";

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    @x4.m1
    public static final String f138653d1 = "image/heif";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @x4.m1
    public static final String f138654e = "application";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f138655e0 = "audio/vorbis";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    @x4.m1
    public static final String f138656e1 = "image/heic";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f138657f = "video/mp4";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f138658f0 = "audio/opus";

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    @x4.m1
    public static final String f138659f1 = "image/avif";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @x4.m1
    public static final String f138660g = "video/quicktime";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f138661g0 = "audio/amr";

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    @x4.m1
    public static final String f138662g1 = "image/bmp";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @x4.m1
    public static final String f138663h = "video/x-matroska";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f138664h0 = "audio/3gpp";

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    @x4.m1
    public static final String f138665h1 = "image/webp";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f138666i = "video/webm";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f138667i0 = "audio/amr-wb";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    @x4.m1
    public static final String f138668i1 = "image/raw";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f138669j = "video/3gpp";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f138670j0 = "audio/flac";

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    @x4.m1
    public static final String f138671j1 = "ec+3";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f138672k = "video/avc";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f138673k0 = "audio/alac";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @x4.m1
    public static final String f138675l = "video/apv";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f138676l0 = "audio/gsm";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f138678m = "video/hevc";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f138679m0 = "audio/ogg";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @x4.m1
    public static final String f138680n = "video/vvc";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f138681n0 = "audio/wav";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @x4.m1
    public static final String f138682o = "video/x-vnd.on2.vp8";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f138683o0 = "audio/midi";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @x4.m1
    public static final String f138684p = "video/x-vnd.on2.vp9";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @x4.m1
    public static final String f138685p0 = "audio/iamf";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f138686q = "video/av01";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @x4.m1
    public static final String f138687q0 = "audio/x-exoplayer-midi";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f138688r = "video/mp2t";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @x4.m1
    public static final String f138689r0 = "audio/x-unknown";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f138690s = "video/mp4v-es";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f138691s0 = "text/vtt";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f138692t = "video/mpeg";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f138693t0 = "text/x-ssa";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f138694u = "video/mp2p";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @x4.m1
    public static final String f138695u0 = "text/x-unknown";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f138696v = "video/mpeg2";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f138697v0 = "application/mp4";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f138698w = "video/wvc1";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f138699w0 = "application/webm";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f138700x = "video/divx";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f138701x0 = "application/x-matroska";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @x4.m1
    public static final String f138702y = "video/x-flv";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f138703y0 = "application/dash+xml";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f138704z = "video/dolby-vision";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f138705z0 = "application/x-mpegURL";

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final ArrayList<a> f138674k1 = new ArrayList<>();

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final Pattern f138677l1 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f138706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f138707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f138708c;

        public a(String str, String str2, int i10) {
            this.f138706a = str;
            this.f138707b = str2;
            this.f138708c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.h1
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f138709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f138710b;

        public b(int i10, int i11) {
            this.f138709a = i10;
            this.f138710b = i11;
        }

        public int a() {
            int i10 = this.f138710b;
            if (i10 == 2) {
                return 10;
            }
            if (i10 == 5) {
                return 11;
            }
            if (i10 == 29) {
                return 12;
            }
            if (i10 == 42) {
                return 16;
            }
            if (i10 != 22) {
                return i10 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @x4.m1
    public static boolean a(@Nullable String str, @Nullable String str2) {
        b bVarK;
        int iA;
        if (str == null) {
            return false;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    b10 = 0;
                }
                break;
            case -1354451219:
                if (str.equals("application/vnd.dvb.ait")) {
                    b10 = 1;
                }
                break;
            case -1348231605:
                if (str.equals("application/x-icy")) {
                    b10 = 2;
                }
                break;
            case -1265048566:
                if (str.equals("application/x-camera-motion")) {
                    b10 = 3;
                }
                break;
            case -1248341703:
                if (str.equals("application/id3")) {
                    b10 = 4;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    b10 = 5;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    b10 = 6;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    b10 = 7;
                }
                break;
            case -43764892:
                if (str.equals(P0)) {
                    b10 = 8;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    b10 = 9;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    b10 = 10;
                }
                break;
            case 469933706:
                if (str.equals(Y0)) {
                    b10 = zi.c.f161635m;
                }
                break;
            case 1054472807:
                if (str.equals(Q0)) {
                    b10 = zi.c.f161636n;
                }
                break;
            case 1154383568:
                if (str.equals("application/x-emsg")) {
                    b10 = 13;
                }
                break;
            case 1331836563:
                if (str.equals(f138675l)) {
                    b10 = zi.c.f161638p;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    b10 = zi.c.f161639q;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    b10 = 16;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    b10 = 17;
                }
                break;
            case 1652648887:
                if (str.equals("application/x-scte35")) {
                    b10 = zi.c.f161643u;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    b10 = 19;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    b10 = zi.c.f161646x;
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
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return true;
            case 7:
                return (str2 == null || (bVarK = k(str2)) == null || (iA = bVarK.a()) == 0 || iA == 16) ? false : true;
            default:
                return false;
        }
    }

    @k.h1
    @x4.m1
    public static void b() {
        f138674k1.clear();
    }

    @x4.m1
    public static boolean c(@Nullable String str, String str2) {
        return e(str, str2) != null;
    }

    @Nullable
    @x4.m1
    public static String d(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : x4.b2.B2(str)) {
            String strH = h(str2);
            if (strH != null && r(strH)) {
                return strH;
            }
        }
        return null;
    }

    @Nullable
    @x4.m1
    public static String e(@Nullable String str, @Nullable String str2) {
        if (str != null && str2 != null) {
            String[] strArrB2 = x4.b2.B2(str);
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : strArrB2) {
                if (str2.equals(h(str3))) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(str3);
                }
            }
            if (sb2.length() > 0) {
                return sb2.toString();
            }
        }
        return null;
    }

    @Nullable
    public static String f(String str) {
        int size = f138674k1.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f138674k1.get(i10);
            if (str.startsWith(aVar.f138707b)) {
                return aVar.f138706a;
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @x4.m1
    public static int g(String str, @Nullable String str2) {
        b bVarK;
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    b10 = 0;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    b10 = 1;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    b10 = 2;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    b10 = 3;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    b10 = 4;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    b10 = 5;
                }
                break;
            case 187081724:
                if (str.equals(Z)) {
                    b10 = 6;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    b10 = 7;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    b10 = 8;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    b10 = 9;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    b10 = 10;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    b10 = zi.c.f161635m;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    b10 = zi.c.f161636n;
                }
                break;
        }
        switch (b10) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (bVarK = k(str2)) == null) {
                    return 0;
                }
                return bVarK.a();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 31;
            case 7:
                return 30;
            case 8:
                return 6;
            case 9:
                return 9;
            case 10:
                return 20;
            case 11:
                return 8;
            case 12:
                return 14;
            default:
                return 0;
        }
    }

    @Nullable
    @x4.m1
    public static String h(@Nullable String str) {
        b bVarK;
        String strI = null;
        if (str == null) {
            return null;
        }
        String strG = zi.c.g(str.trim());
        if (strG.startsWith("avc1") || strG.startsWith("avc3")) {
            return "video/avc";
        }
        if (strG.startsWith("hev1") || strG.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strG.startsWith(x4.m.f144367o) || strG.startsWith(x4.m.f144368p)) {
            return f138680n;
        }
        if (strG.startsWith("dvav") || strG.startsWith("dva1") || strG.startsWith("dvhe") || strG.startsWith("dvh1") || strG.startsWith("dav1")) {
            return "video/dolby-vision";
        }
        if (strG.startsWith("av01")) {
            return "video/av01";
        }
        if (strG.startsWith("vp9") || strG.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strG.startsWith("vp8") || strG.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strG.startsWith("mp4a")) {
            if (strG.startsWith("mp4a.") && (bVarK = k(strG)) != null) {
                strI = i(bVarK.f138709a);
            }
            return strI == null ? "audio/mp4a-latm" : strI;
        }
        if (strG.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strG.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strG.startsWith("ac-3") || strG.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strG.startsWith("ec-3") || strG.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strG.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strG.startsWith(x4.m.f144372t) || strG.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strG.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strG.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strG.startsWith("dtsh") || strG.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strG.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strG.startsWith("opus")) {
            return "audio/opus";
        }
        if (strG.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strG.startsWith("flac")) {
            return "audio/flac";
        }
        if (strG.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strG.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strG.contains("cea708")) {
            return "application/cea-708";
        }
        return (strG.contains("eia608") || strG.contains("cea608")) ? "application/cea-608" : f(strG);
    }

    @Nullable
    @x4.m1
    public static String i(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 221) {
            return "audio/vorbis";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case androidx.constraintlayout.widget.g.R1 /* 97 */:
            case androidx.constraintlayout.widget.g.S1 /* 98 */:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case SignalKey.EVENT_ID /* 107 */:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case jj.c.f100514f /* 170 */:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173 /* 173 */:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    @Nullable
    @x4.m1
    public static Byte j(String str) {
        str.getClass();
        switch (str) {
            case "audio/vorbis":
                return (byte) -35;
            case "audio/mp4a-latm":
                return (byte) 64;
            case "video/mp4v-es":
                return (byte) 32;
            default:
                return null;
        }
    }

    @Nullable
    @k.h1
    public static b k(String str) {
        Matcher matcher = f138677l1.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) zi.l0.E(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new b(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    @x4.m1
    public static String l(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : x4.b2.B2(str)) {
            String strH = h(str2);
            if (strH != null && v(strH)) {
                return strH;
            }
        }
        return null;
    }

    @Nullable
    @x4.m1
    public static String m(@Nullable String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    @x4.m1
    public static int n(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (r(str)) {
            return 1;
        }
        if (w(str)) {
            return 2;
        }
        if (v(str)) {
            return 3;
        }
        if (t(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || P0.equals(str) || Q0.equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return o(str);
    }

    public static int o(String str) {
        int size = f138674k1.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f138674k1.get(i10);
            if (str.equals(aVar.f138706a)) {
                return aVar.f138708c;
            }
        }
        return -1;
    }

    @x4.m1
    public static int p(String str) {
        return n(h(str));
    }

    @Nullable
    @x4.m1
    public static String q(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : x4.b2.B2(str)) {
            String strH = h(str2);
            if (strH != null && w(strH)) {
                return strH;
            }
        }
        return null;
    }

    @x4.m1
    public static boolean r(@Nullable String str) {
        return "audio".equals(m(str));
    }

    @x4.m1
    public static boolean s(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1") || str.startsWith("dav1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    @x4.m1
    public static boolean t(@Nullable String str) {
        return "image".equals(m(str)) || Z0.equals(str);
    }

    @x4.m1
    public static boolean u(@Nullable String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    @x4.m1
    @ky.d
    public static boolean v(@Nullable String str) {
        return "text".equals(m(str)) || Y0.equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    @x4.m1
    public static boolean w(@Nullable String str) {
        return "video".equals(m(str));
    }

    @x4.m1
    public static String x(String str) {
        if (str == null) {
            return null;
        }
        String strG = zi.c.g(str);
        strG.getClass();
        switch (strG) {
            case "video/x-mvhevc":
                return F;
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strG;
        }
    }

    @x4.m1
    public static void y(String str, String str2, int i10) {
        a aVar = new a(str, str2, i10);
        int size = f138674k1.size();
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList<a> arrayList = f138674k1;
            if (str.equals(arrayList.get(i11).f138706a)) {
                arrayList.remove(i11);
                break;
            }
        }
        f138674k1.add(aVar);
    }
}
