package nf;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import eh.l0;
import eh.o1;
import java.util.List;
import k.h1;
import k.t0;
import o5.f0;
import o5.h0;
import o5.i0;
import re.n2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f116623l = "MediaCodecInfo";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f116624m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f116625n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f116626o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f116627p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final MediaCodecInfo.CodecCapabilities f116631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f116632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f116633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f116634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f116635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f116636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f116637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f116638k;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(29)
    public static final class a {
        @k.t
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty() || n.F()) {
                return 0;
            }
            i0.a();
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointA = h0.a(i10, i11, (int) d10);
            for (int i12 = 0; i12 < supportedPerformancePoints.size(); i12++) {
                if (f0.a(supportedPerformancePoints.get(i12)).covers(performancePointA)) {
                    return 2;
                }
            }
            return 1;
        }
    }

    @h1
    public n(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f116628a = (String) eh.a.g(str);
        this.f116629b = str2;
        this.f116630c = str3;
        this.f116631d = codecCapabilities;
        this.f116635h = z10;
        this.f116636i = z11;
        this.f116637j = z12;
        this.f116632e = z13;
        this.f116633f = z14;
        this.f116634g = z15;
        this.f116638k = l0.t(str2);
    }

    public static boolean C(String str) {
        return "audio/opus".equals(str);
    }

    public static boolean D(String str) {
        return o1.f81145d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public static boolean E(String str) {
        if (o1.f81142a > 22) {
            return false;
        }
        String str2 = o1.f81145d;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    public static boolean F() {
        String str = o1.f81143b;
        if (str.equals("sabrina") || str.equals("boreal")) {
            return true;
        }
        String str2 = o1.f81145d;
        return str2.startsWith("Lenovo TB-X605") || str2.startsWith("Lenovo TB-X606") || str2.startsWith("Lenovo TB-X616");
    }

    public static boolean G(String str, int i10) {
        if (!"video/hevc".equals(str) || 2 != i10) {
            return false;
        }
        String str2 = o1.f81143b;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    public static boolean H(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(o1.f81143b)) ? false : true;
    }

    public static n I(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new n(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !k(codecCapabilities) || E(str)) ? false : true, codecCapabilities != null && x(codecCapabilities), z14 || (codecCapabilities != null && v(codecCapabilities)));
    }

    public static int b(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || ((o1.f81142a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        if ("audio/ac3".equals(str2)) {
            i11 = 6;
        } else {
            i11 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        eh.h0.n("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + C4235d4.j.f61462e);
        return i11;
    }

    @t0(21)
    public static Point d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(o1.q(i10, widthAlignment) * widthAlignment, o1.q(i11, heightAlignment) * heightAlignment);
    }

    @t0(21)
    public static boolean e(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointD = d(videoCapabilities, i10, i11);
        int i12 = pointD.x;
        int i13 = pointD.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    public static MediaCodecInfo.CodecProfileLevel[] g(@Nullable MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i10;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        if (iIntValue >= 180000000) {
            i10 = 1024;
        } else if (iIntValue >= 120000000) {
            i10 = 512;
        } else if (iIntValue >= 60000000) {
            i10 = 256;
        } else if (iIntValue >= 30000000) {
            i10 = 128;
        } else if (iIntValue >= 18000000) {
            i10 = 64;
        } else if (iIntValue >= 12000000) {
            i10 = 32;
        } else if (iIntValue >= 7200000) {
            i10 = 16;
        } else if (iIntValue >= 3600000) {
            i10 = 8;
        } else if (iIntValue >= 1800000) {
            i10 = 4;
        } else {
            i10 = iIntValue >= 800000 ? 2 : 1;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    @t0(23)
    public static int i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    public static boolean k(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return o1.f81142a >= 19 && l(codecCapabilities);
    }

    @t0(19)
    public static boolean l(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean v(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return o1.f81142a >= 21 && w(codecCapabilities);
    }

    @t0(21)
    public static boolean w(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean x(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return o1.f81142a >= 21 && y(codecCapabilities);
    }

    @t0(21)
    public static boolean y(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public final void A(String str) {
        eh.h0.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f116628a + ", " + this.f116629b + "] [" + o1.f81146e + C4235d4.j.f61462e);
    }

    public final void B(String str) {
        eh.h0.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f116628a + ", " + this.f116629b + "] [" + o1.f81146e + C4235d4.j.f61462e);
    }

    @Nullable
    @t0(21)
    public Point c(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f116631d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return d(videoCapabilities, i10, i11);
    }

    public ye.k f(n2 n2Var, n2 n2Var2) {
        n2 n2Var3;
        n2 n2Var4;
        int i10 = !o1.g(n2Var.f126249m, n2Var2.f126249m) ? 8 : 0;
        if (this.f116638k) {
            if (n2Var.f126257u != n2Var2.f126257u) {
                i10 |= 1024;
            }
            if (!this.f116632e && (n2Var.f126254r != n2Var2.f126254r || n2Var.f126255s != n2Var2.f126255s)) {
                i10 |= 512;
            }
            if (!o1.g(n2Var.f126261y, n2Var2.f126261y)) {
                i10 |= 2048;
            }
            if (D(this.f116628a) && !n2Var.g(n2Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new ye.k(this.f116628a, n2Var, n2Var2, n2Var.g(n2Var2) ? 3 : 2, 0);
            }
            n2Var3 = n2Var;
            n2Var4 = n2Var2;
        } else {
            n2Var3 = n2Var;
            n2Var4 = n2Var2;
            if (n2Var3.f126262z != n2Var4.f126262z) {
                i10 |= 4096;
            }
            if (n2Var3.A != n2Var4.A) {
                i10 |= 8192;
            }
            if (n2Var3.B != n2Var4.B) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f116629b)) {
                Pair<Integer, Integer> pairS = v.s(n2Var3);
                Pair<Integer, Integer> pairS2 = v.s(n2Var4);
                if (pairS != null && pairS2 != null) {
                    int iIntValue = ((Integer) pairS.first).intValue();
                    int iIntValue2 = ((Integer) pairS2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new ye.k(this.f116628a, n2Var3, n2Var4, 3, 0);
                    }
                }
            }
            if (!n2Var3.g(n2Var4)) {
                i10 |= 32;
            }
            if (C(this.f116629b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new ye.k(this.f116628a, n2Var3, n2Var4, 1, 0);
            }
        }
        return new ye.k(this.f116628a, n2Var3, n2Var4, 0, i10);
    }

    public int h() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (o1.f81142a < 23 || (codecCapabilities = this.f116631d) == null) {
            return -1;
        }
        return i(codecCapabilities);
    }

    public MediaCodecInfo.CodecProfileLevel[] j() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f116631d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    @t0(21)
    public boolean m(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f116631d;
        if (codecCapabilities == null) {
            B("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            B("channelCount.aCaps");
            return false;
        }
        if (b(this.f116628a, this.f116629b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        B("channelCount.support, " + i10);
        return false;
    }

    @t0(21)
    public boolean n(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f116631d;
        if (codecCapabilities == null) {
            B("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            B("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        B("sampleRate.support, " + i10);
        return false;
    }

    public final boolean o(n2 n2Var, boolean z10) {
        Pair<Integer, Integer> pairS = v.s(n2Var);
        if (pairS == null) {
            return true;
        }
        int iIntValue = ((Integer) pairS.first).intValue();
        int iIntValue2 = ((Integer) pairS.second).intValue();
        if ("video/dolby-vision".equals(n2Var.f126249m)) {
            if (!"video/avc".equals(this.f116629b)) {
                iIntValue = "video/hevc".equals(this.f116629b) ? 2 : 8;
            }
            iIntValue2 = 0;
        }
        if (!this.f116638k && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrJ = j();
        if (o1.f81142a <= 23 && "video/x-vnd.on2.vp9".equals(this.f116629b) && codecProfileLevelArrJ.length == 0) {
            codecProfileLevelArrJ = g(this.f116631d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrJ) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z10) && !G(this.f116629b, iIntValue))) {
                return true;
            }
        }
        B("codec.profileLevel, " + n2Var.f126246j + ", " + this.f116630c);
        return false;
    }

    public boolean p(n2 n2Var) {
        return s(n2Var) && o(n2Var, false);
    }

    public boolean q(n2 n2Var) throws v.c {
        int i10;
        int i11;
        int i12;
        if (!s(n2Var) || !o(n2Var, true)) {
            return false;
        }
        if (!this.f116638k) {
            return o1.f81142a < 21 || (((i10 = n2Var.A) == -1 || n(i10)) && ((i11 = n2Var.f126262z) == -1 || m(i11)));
        }
        int i13 = n2Var.f126254r;
        if (i13 <= 0 || (i12 = n2Var.f126255s) <= 0) {
            return true;
        }
        if (o1.f81142a >= 21) {
            return z(i13, i12, n2Var.f126256t);
        }
        boolean z10 = i13 * i12 <= v.M();
        if (!z10) {
            B("legacyFrameSize, " + n2Var.f126254r + "x" + n2Var.f126255s);
        }
        return z10;
    }

    public boolean r() {
        if (o1.f81142a >= 29 && "video/x-vnd.on2.vp9".equals(this.f116629b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : j()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean s(n2 n2Var) {
        return this.f116629b.equals(n2Var.f126249m) || this.f116629b.equals(v.n(n2Var));
    }

    public boolean t(n2 n2Var) {
        if (this.f116638k) {
            return this.f116632e;
        }
        Pair<Integer, Integer> pairS = v.s(n2Var);
        return pairS != null && ((Integer) pairS.first).intValue() == 42;
    }

    public String toString() {
        return this.f116628a;
    }

    @Deprecated
    public boolean u(n2 n2Var, n2 n2Var2, boolean z10) {
        if (!z10 && n2Var.f126261y != null && n2Var2.f126261y == null) {
            n2Var2 = n2Var2.b().L(n2Var.f126261y).G();
        }
        int i10 = f(n2Var, n2Var2).f159231d;
        return i10 == 2 || i10 == 3;
    }

    @t0(21)
    public boolean z(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f116631d;
        if (codecCapabilities == null) {
            B("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            B("sizeAndRate.vCaps");
            return false;
        }
        if (o1.f81142a >= 29) {
            int iA = a.a(videoCapabilities, i10, i11, d10);
            if (iA == 2) {
                return true;
            }
            if (iA == 1) {
                B("sizeAndRate.cover, " + i10 + "x" + i11 + to.c.phraseDel + d10);
                return false;
            }
        }
        if (!e(videoCapabilities, i10, i11, d10)) {
            if (i10 >= i11 || !H(this.f116628a) || !e(videoCapabilities, i11, i10, d10)) {
                B("sizeAndRate.support, " + i10 + "x" + i11 + to.c.phraseDel + d10);
                return false;
            }
            A("sizeAndRate.rotated, " + i10 + "x" + i11 + to.c.phraseDel + d10);
        }
        return true;
    }
}
