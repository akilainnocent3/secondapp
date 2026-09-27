package eh;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.signals.SignalKey;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l0 {
    public static final String A = "video/mp42";
    public static final String A0 = "application/ttml+xml";
    public static final String B = "video/mp43";
    public static final String B0 = "application/x-quicktime-tx3g";
    public static final String C = "video/raw";
    public static final String C0 = "application/x-mp4-vtt";
    public static final String D = "video/x-unknown";
    public static final String D0 = "application/x-mp4-cea-608";
    public static final String E = "audio/mp4";

    @Deprecated
    public static final String E0 = "application/x-rawcc";
    public static final String F = "audio/mp4a-latm";
    public static final String F0 = "application/vobsub";
    public static final String G = "audio/x-matroska";
    public static final String G0 = "application/pgs";
    public static final String H = "audio/webm";
    public static final String H0 = "application/x-scte35";
    public static final String I = "audio/mpeg";
    public static final String I0 = "application/x-camera-motion";
    public static final String J = "audio/mpeg-L1";
    public static final String J0 = "application/x-emsg";
    public static final String K = "audio/mpeg-L2";
    public static final String K0 = "application/dvbsubs";
    public static final String L = "audio/mha1";
    public static final String L0 = "application/x-exif";
    public static final String M = "audio/mhm1";
    public static final String M0 = "application/x-icy";
    public static final String N = "audio/raw";
    public static final String N0 = "application/vnd.dvb.ait";
    public static final String O = "audio/g711-alaw";
    public static final String O0 = "application/x-rtsp";
    public static final String P = "audio/g711-mlaw";
    public static final String P0 = "image/png";
    public static final String Q = "audio/ac3";
    public static final String Q0 = "image/webp";
    public static final String R = "audio/eac3";
    public static final String R0 = "image/jpeg";
    public static final String S = "audio/eac3-joc";
    public static final String S0 = "image/heic";
    public static final String T = "audio/ac4";
    public static final String T0 = "image/heif";
    public static final String U = "audio/true-hd";
    public static final String U0 = "ec+3";
    public static final String V = "audio/vnd.dts";
    public static final String W = "audio/vnd.dts.hd";
    public static final String X = "audio/vnd.dts.hd;profile=lbr";
    public static final String Y = "audio/vnd.dts.uhd;profile=p2";
    public static final String Z = "audio/vorbis";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f81007a = "video";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f81008a0 = "audio/opus";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f81009b = "audio";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f81010b0 = "audio/amr";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f81011c = "text";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f81012c0 = "audio/3gpp";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f81013d = "image";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f81014d0 = "audio/amr-wb";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f81015e = "application";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f81016e0 = "audio/flac";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f81017f = "video/mp4";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f81018f0 = "audio/alac";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f81019g = "video/x-matroska";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f81020g0 = "audio/gsm";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f81021h = "video/webm";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f81022h0 = "audio/ogg";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f81023i = "video/3gpp";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f81024i0 = "audio/wav";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f81025j = "video/avc";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f81026j0 = "audio/midi";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f81027k = "video/hevc";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f81028k0 = "audio/x-exoplayer-midi";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f81029l = "video/x-vnd.on2.vp8";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f81030l0 = "audio/x-unknown";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f81031m = "video/x-vnd.on2.vp9";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f81032m0 = "text/vtt";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f81033n = "video/av01";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f81034n0 = "text/x-ssa";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f81035o = "video/mp2t";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f81036o0 = "text/x-exoplayer-cues";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f81037p = "video/mp4v-es";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f81038p0 = "text/x-unknown";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f81039q = "video/mpeg";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f81040q0 = "application/mp4";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f81041r = "video/mp2p";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f81042r0 = "application/webm";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f81043s = "video/mpeg2";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f81044s0 = "application/x-matroska";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f81045t = "video/wvc1";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f81046t0 = "application/dash+xml";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f81047u = "video/divx";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f81048u0 = "application/x-mpegURL";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f81049v = "video/x-flv";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f81050v0 = "application/vnd.ms-sstr+xml";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f81051w = "video/dolby-vision";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f81052w0 = "application/id3";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f81053x = "video/ogg";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f81054x0 = "application/cea-608";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f81055y = "video/x-msvideo";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f81056y0 = "application/cea-708";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f81057z = "video/mjpeg";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f81058z0 = "application/x-subrip";
    public static final ArrayList<a> V0 = new ArrayList<>();
    public static final Pattern W0 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f81061c;

        public a(String str, String str2, int i10) {
            this.f81059a = str;
            this.f81060b = str2;
            this.f81061c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.h1
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81063b;

        public b(int i10, int i11) {
            this.f81062a = i10;
            this.f81063b = i11;
        }

        public int a() {
            int i10 = this.f81063b;
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

    public static boolean a(@Nullable String str, @Nullable String str2) {
        b bVarI;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (bVarI = i(str2)) == null || (iA = bVarI.a()) == 0 || iA == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean b(@Nullable String str, String str2) {
        return d(str, str2) != null;
    }

    @Nullable
    public static String c(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : o1.L1(str)) {
            String strG = g(str2);
            if (strG != null && p(strG)) {
                return strG;
            }
        }
        return null;
    }

    @Nullable
    public static String d(@Nullable String str, @Nullable String str2) {
        if (str != null && str2 != null) {
            String[] strArrL1 = o1.L1(str);
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : strArrL1) {
                if (str2.equals(g(str3))) {
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
    public static String e(String str) {
        int size = V0.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = V0.get(i10);
            if (str.startsWith(aVar.f81060b)) {
                return aVar.f81059a;
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int f(String str, @Nullable String str2) {
        b bVarI;
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
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    b10 = 6;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    b10 = 7;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    b10 = 8;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    b10 = 9;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    b10 = 10;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    b10 = zi.c.f161635m;
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
                if (str2 == null || (bVarI = i(str2)) == null) {
                    return 0;
                }
                return bVarI.a();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 30;
            case 7:
                return 6;
            case 8:
                return 9;
            case 9:
                return 20;
            case 10:
                return 8;
            case 11:
                return 14;
            default:
                return 0;
        }
    }

    @Nullable
    public static String g(@Nullable String str) {
        b bVarI;
        String strH = null;
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
        if (strG.startsWith("dvav") || strG.startsWith("dva1") || strG.startsWith("dvhe") || strG.startsWith("dvh1")) {
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
            if (strG.startsWith("mp4a.") && (bVarI = i(strG)) != null) {
                strH = h(bVarI.f81062a);
            }
            return strH == null ? "audio/mp4a-latm" : strH;
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
        return (strG.contains("eia608") || strG.contains("cea608")) ? "application/cea-608" : e(strG);
    }

    @Nullable
    public static String h(int i10) {
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
    @k.h1
    public static b i(String str) {
        Matcher matcher = W0.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) eh.a.g(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new b(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    public static String j(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : o1.L1(str)) {
            String strG = g(str2);
            if (strG != null && s(strG)) {
                return strG;
            }
        }
        return null;
    }

    @Nullable
    public static String k(@Nullable String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int l(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (p(str)) {
            return 1;
        }
        if (t(str)) {
            return 2;
        }
        if (s(str)) {
            return 3;
        }
        if (q(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return m(str);
    }

    public static int m(String str) {
        int size = V0.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = V0.get(i10);
            if (str.equals(aVar.f81059a)) {
                return aVar.f81061c;
            }
        }
        return -1;
    }

    public static int n(String str) {
        return l(g(str));
    }

    @Nullable
    public static String o(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : o1.L1(str)) {
            String strG = g(str2);
            if (strG != null && t(strG)) {
                return strG;
            }
        }
        return null;
    }

    public static boolean p(@Nullable String str) {
        return "audio".equals(k(str));
    }

    public static boolean q(@Nullable String str) {
        return "image".equals(k(str));
    }

    public static boolean r(@Nullable String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    public static boolean s(@Nullable String str) {
        return "text".equals(k(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean t(@Nullable String str) {
        return "video".equals(k(str));
    }

    public static String u(String str) {
        str.getClass();
        switch (str) {
            case "audio/x-flac":
                return "audio/flac";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return str;
        }
    }

    public static void v(String str, String str2, int i10) {
        a aVar = new a(str, str2, i10);
        int size = V0.size();
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList<a> arrayList = V0;
            if (str.equals(arrayList.get(i11).f81059a)) {
                arrayList.remove(i11);
                break;
            }
        }
        V0.add(aVar);
    }
}
