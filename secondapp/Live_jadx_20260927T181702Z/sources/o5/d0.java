package o5;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import java.util.Objects;
import k.h1;
import r7.i1;
import u4.l1;
import x4.b2;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class d0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f118648p = "MediaCodecInfo";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f118649q = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f118652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final MediaCodecInfo.CodecCapabilities f118653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f118654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f118655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f118656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f118657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f118658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f118659j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f118660k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f118661l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f118664o = -3.4028235E38f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f118662m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f118663n = -1;

    @h1
    public d0(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f118650a = (String) zi.l0.E(str);
        this.f118651b = str2;
        this.f118652c = str3;
        this.f118653d = codecCapabilities;
        this.f118657h = z10;
        this.f118658i = z11;
        this.f118659j = z12;
        this.f118654e = z13;
        this.f118655f = z14;
        this.f118656g = z15;
        this.f118660k = z16;
        this.f118661l = l1.w(str2);
    }

    public static boolean B(String str) {
        return "audio/opus".equals(str);
    }

    public static boolean C(String str) {
        return Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public static boolean D() {
        String str = Build.MANUFACTURER;
        return str.equals("Xiaomi") || str.equals("OPPO") || str.equals("realme") || str.equals("motorola") || str.equals("LENOVO");
    }

    public static boolean E(String str, int i10) {
        if (!"video/hevc".equals(str) || 2 != i10) {
            return false;
        }
        String str2 = Build.DEVICE;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    public static boolean F(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Build.DEVICE)) ? false : true;
    }

    public static d0 G(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new d0(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !l(codecCapabilities)) ? false : true, codecCapabilities != null && x(codecCapabilities), z14 || (codecCapabilities != null && w(codecCapabilities)), q(codecCapabilities));
    }

    public static int a(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || ((Build.VERSION.SDK_INT >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        if ("audio/ac3".equals(str2)) {
            i11 = 6;
        } else {
            i11 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        x4.d0.n("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + C4235d4.j.f61462e);
        return i11;
    }

    public static Point b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(b2.q(i10, widthAlignment) * widthAlignment, b2.q(i11, heightAlignment) * heightAlignment);
    }

    public static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Range<Double> achievableFrameRatesFor;
        Point pointB = b(videoCapabilities, i10, i11);
        int i12 = pointB.x;
        int i13 = pointB.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        double dFloor = Math.floor(d10);
        if (videoCapabilities.areSizeAndRateSupported(i12, i13, dFloor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i12, i13)) == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
        }
        return false;
    }

    public static MediaCodecInfo.CodecProfileLevel[] g(Context context, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        int i10 = ((codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null) ? 2 : audioCapabilities.getMaxInputChannelCount()) > 18 ? 16 : 8;
        return b2.m1(context) ? new MediaCodecInfo.CodecProfileLevel[]{a1.i(1026, i10)} : new MediaCodecInfo.CodecProfileLevel[]{a1.i(257, i10), a1.i(513, i10), a1.i(i1.d.HandlerC1208d.f123902q, i10), a1.i(1026, i10), a1.i(1028, i10)};
    }

    public static MediaCodecInfo.CodecProfileLevel[] h(@Nullable MediaCodecInfo.CodecCapabilities codecCapabilities) {
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
        return new MediaCodecInfo.CodecProfileLevel[]{a1.i(1, i10)};
    }

    public static boolean l(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean q(@Nullable MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !D();
    }

    public static boolean w(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean x(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public final void A(String str) {
        x4.d0.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f118650a + ", " + this.f118651b + "] [" + b2.f144213e + C4235d4.j.f61462e);
    }

    @Nullable
    public Point c(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f118653d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return b(videoCapabilities, i10, i11);
    }

    public d5.d e(androidx.media3.common.a aVar, androidx.media3.common.a aVar2) {
        androidx.media3.common.a aVar3;
        androidx.media3.common.a aVar4;
        int i10;
        int i11 = !Objects.equals(aVar.f13642p, aVar2.f13642p) ? 8 : 0;
        if (this.f118661l) {
            if (aVar.B != aVar2.B) {
                i11 |= 1024;
            }
            boolean z10 = (aVar.f13649w == aVar2.f13649w && aVar.f13650x == aVar2.f13650x) ? false : true;
            if (!this.f118654e && z10) {
                i11 |= 512;
            }
            if ((!u4.b0.l(aVar.F) || !u4.b0.l(aVar2.F)) && !Objects.equals(aVar.F, aVar2.F)) {
                i11 |= 2048;
            }
            if (C(this.f118650a) && !aVar.h(aVar2)) {
                i11 |= 2;
            }
            int i12 = aVar.f13651y;
            if (i12 != -1 && (i10 = aVar.f13652z) != -1 && i12 == aVar2.f13651y && i10 == aVar2.f13652z && z10) {
                i11 |= 2;
            }
            if (i11 == 0 && Objects.equals(aVar2.f13642p, "video/dolby-vision")) {
                Pair<Integer, Integer> pairZ = x4.m.z(aVar);
                Pair<Integer, Integer> pairZ2 = x4.m.z(aVar2);
                if (pairZ == null || pairZ2 == null || !((Integer) pairZ.first).equals(pairZ2.first)) {
                    i11 |= 2;
                }
            }
            if (i11 == 0) {
                return new d5.d(this.f118650a, aVar, aVar2, aVar.h(aVar2) ? 3 : 2, 0);
            }
            aVar3 = aVar;
            aVar4 = aVar2;
        } else {
            aVar3 = aVar;
            aVar4 = aVar2;
            if (aVar3.H != aVar4.H) {
                i11 |= 4096;
            }
            if (aVar3.I != aVar4.I) {
                i11 |= 8192;
            }
            if (aVar3.J != aVar4.J) {
                i11 |= 16384;
            }
            if (i11 == 0 && (this.f118651b.equals("audio/mp4a-latm") || this.f118651b.equals("audio/ac4"))) {
                Pair<Integer, Integer> pairZ3 = x4.m.z(aVar3);
                Pair<Integer, Integer> pairZ4 = x4.m.z(aVar4);
                if (pairZ3 != null && pairZ4 != null) {
                    int iIntValue = ((Integer) pairZ3.first).intValue();
                    int iIntValue2 = ((Integer) pairZ4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new d5.d(this.f118650a, aVar3, aVar4, 3, 0);
                    }
                    if (this.f118651b.equals("audio/ac4") && pairZ3.equals(pairZ4)) {
                        return new d5.d(this.f118650a, aVar3, aVar4, 3, 0);
                    }
                }
            }
            if (i11 == 0 && (this.f118651b.equals("audio/eac3-joc") || this.f118651b.equals("audio/eac3"))) {
                return new d5.d(this.f118650a, aVar3, aVar4, 3, 0);
            }
            if (!aVar3.h(aVar4)) {
                i11 |= 32;
            }
            if (B(this.f118651b)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new d5.d(this.f118650a, aVar3, aVar4, 1, 0);
            }
        }
        return new d5.d(this.f118650a, aVar3, aVar4, 0, i11);
    }

    public final float f(int i10, int i11) {
        float f10 = 1024.0f;
        if (y(i10, i11, 1024.0f)) {
            return 1024.0f;
        }
        float f11 = 0.0f;
        while (true) {
            float f12 = f10 - f11;
            if (Math.abs(f12) <= 5.0f) {
                return f11;
            }
            float f13 = (f12 / 2.0f) + f11;
            if (y(i10, i11, f13)) {
                f11 = f13;
            } else {
                f10 = f13;
            }
        }
    }

    public float i(int i10, int i11) {
        if (!this.f118661l) {
            return -3.4028235E38f;
        }
        float f10 = this.f118664o;
        if (f10 != -3.4028235E38f && this.f118662m == i10 && this.f118663n == i11) {
            return f10;
        }
        float f11 = f(i10, i11);
        this.f118664o = f11;
        this.f118662m = i10;
        this.f118663n = i11;
        return f11;
    }

    public int j() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f118653d;
        if (codecCapabilities == null) {
            return -1;
        }
        return codecCapabilities.getMaxSupportedInstances();
    }

    public MediaCodecInfo.CodecProfileLevel[] k() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f118653d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean m(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f118653d;
        if (codecCapabilities == null) {
            A("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            A("channelCount.aCaps");
            return false;
        }
        if (a(this.f118650a, this.f118651b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        A("channelCount.support, " + i10);
        return false;
    }

    public boolean n(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f118653d;
        if (codecCapabilities == null) {
            A("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            A("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        A("sampleRate.support, " + i10);
        return false;
    }

    public final boolean o(Context context, androidx.media3.common.a aVar, boolean z10) {
        Pair<Integer, Integer> pairZ = x4.m.z(aVar);
        String str = aVar.f13642p;
        if (str != null && str.equals(l1.F)) {
            String strX = l1.x(this.f118652c);
            if (strX.equals(l1.F)) {
                return true;
            }
            if (strX.equals("video/hevc")) {
                pairZ = a1.v(aVar);
            }
        }
        if (pairZ == null) {
            return true;
        }
        int iIntValue = ((Integer) pairZ.first).intValue();
        int iIntValue2 = ((Integer) pairZ.second).intValue();
        if ("video/dolby-vision".equals(aVar.f13642p)) {
            String str2 = this.f118651b;
            str2.getClass();
            switch (str2) {
                case "video/av01":
                case "video/hevc":
                    iIntValue2 = 0;
                    iIntValue = 2;
                    break;
                case "video/avc":
                    iIntValue = 8;
                    iIntValue2 = 0;
                    break;
            }
        }
        if (!this.f118661l && !this.f118651b.equals("audio/ac4") && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrK = k();
        if (this.f118651b.equals("audio/ac4") && codecProfileLevelArrK.length == 0) {
            codecProfileLevelArrK = g(context, this.f118653d);
        }
        if (Build.VERSION.SDK_INT == 23 && "video/x-vnd.on2.vp9".equals(this.f118651b) && codecProfileLevelArrK.length == 0) {
            codecProfileLevelArrK = h(this.f118653d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrK) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z10) && !E(this.f118651b, iIntValue))) {
                return true;
            }
        }
        A("codec.profileLevel, " + aVar.f13637k + ", " + this.f118652c);
        return false;
    }

    public final boolean p(androidx.media3.common.a aVar) {
        return (Objects.equals(aVar.f13642p, "audio/flac") && aVar.J == 22 && Build.VERSION.SDK_INT < 34 && this.f118650a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public boolean r(Context context, androidx.media3.common.a aVar) {
        return u(aVar) && o(context, aVar, false) && p(aVar);
    }

    public boolean s(Context context, androidx.media3.common.a aVar) {
        int i10;
        int i11;
        if (!u(aVar) || !o(context, aVar, true) || !p(aVar)) {
            return false;
        }
        if (!this.f118661l) {
            int i12 = aVar.I;
            return (i12 == -1 || n(i12)) && ((i10 = aVar.H) == -1 || m(i10));
        }
        int i13 = aVar.f13649w;
        if (i13 <= 0 || (i11 = aVar.f13650x) <= 0) {
            return true;
        }
        return y(i13, i11, aVar.A);
    }

    public boolean t() {
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(this.f118651b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : k()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        return this.f118650a;
    }

    public final boolean u(androidx.media3.common.a aVar) {
        return this.f118651b.equals(aVar.f13642p) || this.f118651b.equals(a1.j(aVar));
    }

    public boolean v(androidx.media3.common.a aVar) {
        if (this.f118661l) {
            return this.f118654e;
        }
        Pair<Integer, Integer> pairZ = x4.m.z(aVar);
        return pairZ != null && ((Integer) pairZ.first).intValue() == 42;
    }

    public boolean y(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f118653d;
        if (codecCapabilities == null) {
            A("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            A("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int iC = j0.c(videoCapabilities, i10, i11, d10);
            if (iC == 2) {
                return true;
            }
            if (iC == 1) {
                A("sizeAndRate.cover, " + i10 + "x" + i11 + to.c.phraseDel + d10);
                return false;
            }
        }
        if (!d(videoCapabilities, i10, i11, d10)) {
            if (i10 >= i11 || !F(this.f118650a) || !d(videoCapabilities, i11, i10, d10)) {
                A("sizeAndRate.support, " + i10 + "x" + i11 + to.c.phraseDel + d10);
                return false;
            }
            z("sizeAndRate.rotated, " + i10 + "x" + i11 + to.c.phraseDel + d10);
        }
        return true;
    }

    public final void z(String str) {
        x4.d0.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f118650a + ", " + this.f118651b + "] [" + b2.f144213e + C4235d4.j.f61462e);
    }
}
