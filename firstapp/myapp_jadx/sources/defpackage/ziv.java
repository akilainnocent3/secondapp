package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.media3.common.a;
import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class ziv {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public float l;

    public ziv(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z5;
        this.h = z6;
        this.i = gqv.l(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(jrh0.f(i, widthAlignment) * widthAlignment, jrh0.f(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    public static ziv i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z6 = codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback");
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z4 = false;
        } else {
            String str4 = Build.MANUFACTURER;
            if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO")) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        return new ziv(str, str2, str3, codecCapabilities, z, z2, z3, z5, z6, z4);
    }

    public final i5d b(a aVar, a aVar2) {
        a aVar3;
        a aVar4;
        int i;
        String str = aVar.n;
        n58 n58Var = aVar.D;
        String str2 = aVar2.n;
        n58 n58Var2 = aVar2.D;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (aVar.z != aVar2.z) {
                i2 |= 1024;
            }
            boolean z = (aVar.u == aVar2.u && aVar.v == aVar2.v) ? false : true;
            if (!this.e && z) {
                i2 |= 512;
            }
            if ((!n58.e(n58Var) || !n58.e(n58Var2)) && !Objects.equals(n58Var, n58Var2)) {
                i2 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !aVar.b(aVar2)) {
                i2 |= 2;
            }
            int i3 = aVar.w;
            if (i3 != -1 && (i = aVar.x) != -1 && i3 == aVar2.w && i == aVar2.x && z) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new i5d(this.a, aVar, aVar2, aVar.b(aVar2) ? 3 : 2, 0);
            }
            aVar3 = aVar;
            aVar4 = aVar2;
        } else {
            aVar3 = aVar;
            aVar4 = aVar2;
            if (aVar3.F != aVar4.F) {
                i2 |= 4096;
            }
            if (aVar3.G != aVar4.G) {
                i2 |= 8192;
            }
            if (aVar3.H != aVar4.H) {
                i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            String str3 = this.b;
            if (i2 == 0 && "audio/mp4a-latm".equals(str3)) {
                HashMap<ijv.a, List<ziv>> map = ijv.a;
                Pair<Integer, Integer> pairB = j08.b(aVar3);
                Pair<Integer, Integer> pairB2 = j08.b(aVar4);
                if (pairB != null && pairB2 != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    int iIntValue2 = ((Integer) pairB2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new i5d(this.a, aVar3, aVar4, 3, 0);
                    }
                }
            }
            if (!aVar3.b(aVar4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new i5d(this.a, aVar3, aVar4, 1, 0);
            }
        }
        return new i5d(this.a, aVar3, aVar4, 0, i2);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c3 A[PHI: r2
      0x00c3: PHI (r2v2 android.util.Pair<java.lang.Integer, java.lang.Integer>) = 
      (r2v1 android.util.Pair<java.lang.Integer, java.lang.Integer>)
      (r2v1 android.util.Pair<java.lang.Integer, java.lang.Integer>)
      (r2v1 android.util.Pair<java.lang.Integer, java.lang.Integer>)
      (r2v14 android.util.Pair<java.lang.Integer, java.lang.Integer>)
     binds: [B:3:0x0010, B:5:0x0018, B:10:0x002c, B:37:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean c(a aVar, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Pair<Integer, Integer> pair;
        String strA;
        HashMap<ijv.a, List<ziv>> map = ijv.a;
        Pair<Integer, Integer> pairB = j08.b(aVar);
        String str = aVar.n;
        String str2 = this.c;
        if (str != null && str.equals("video/mv-hevc")) {
            String strM = gqv.m(str2);
            if (strM.equals("video/mv-hevc")) {
                return true;
            }
            if (strM.equals("video/hevc")) {
                List<byte[]> list = aVar.q;
                int i = 0;
                loop0: while (true) {
                    if (i >= list.size()) {
                        pair = null;
                        strA = null;
                        break;
                    }
                    byte[] bArr = list.get(i);
                    int length = bArr.length;
                    if (length > 3) {
                        boolean[] zArr = new boolean[3];
                        pcn.b bVar = pcn.b;
                        pcn.a aVar2 = new pcn.a();
                        int i2 = 0;
                        while (i2 < bArr.length) {
                            int iB = qbx.b(bArr, i2, bArr.length, zArr);
                            if (iB != bArr.length) {
                                aVar2.c(Integer.valueOf(iB));
                            }
                            i2 = iB + 3;
                        }
                        c150 c150VarG = aVar2.g();
                        for (int i3 = 0; i3 < c150VarG.d; i3++) {
                            if (((Integer) c150VarG.get(i3)).intValue() + 3 < length) {
                                osz oszVar = new osz(bArr, ((Integer) c150VarG.get(i3)).intValue() + 3, length);
                                qbx.b bVarE = qbx.e(oszVar);
                                if (bVarE.a == 33 && bVarE.b == 0) {
                                    oszVar.j(4);
                                    int iE = oszVar.e(3);
                                    oszVar.i();
                                    pair = null;
                                    qbx.c cVarF = qbx.f(oszVar, true, iE, null);
                                    strA = j08.a(cVarF.a, cVarF.b, cVarF.c, cVarF.d, cVarF.e, cVarF.f);
                                    break loop0;
                                }
                            }
                        }
                    }
                    i++;
                }
                if (strA == null) {
                    pairB = pair;
                } else {
                    String strTrim = strA.trim();
                    String str3 = jrh0.a;
                    pairB = j08.c(strA, strTrim.split("\\.", -1), aVar.D);
                }
            }
        }
        if (pairB == null) {
            return true;
        }
        int iIntValue = ((Integer) pairB.first).intValue();
        int iIntValue2 = ((Integer) pairB.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(str);
        String str4 = this.b;
        if (zEquals) {
            str4.getClass();
            switch (str4) {
                case "video/av01":
                case "video/hevc":
                    iIntValue = 2;
                    break;
                case "video/avc":
                    iIntValue = 8;
                    break;
            }
            iIntValue2 = 0;
        }
        if (!this.i && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == iIntValue && (codecProfileLevel.level >= iIntValue2 || !z)) {
                if (!"video/hevc".equals(str4) || 2 != iIntValue) {
                    return true;
                }
                String str5 = Build.DEVICE;
                if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                    return true;
                }
            }
        }
        h("codec.profileLevel, " + aVar.k + ", " + str2);
        return false;
    }

    public final boolean d(a aVar) {
        return (Objects.equals(aVar.n, "audio/flac") && aVar.H == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(a aVar) {
        int i;
        int i2;
        String str = aVar.n;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(ijv.b(aVar))) || !c(aVar, true) || !d(aVar)) {
            return false;
        }
        if (this.i) {
            int i3 = aVar.u;
            if (i3 > 0 && (i2 = aVar.v) > 0) {
                return g(i3, i2, aVar.y);
            }
        } else {
            int i4 = aVar.G;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i4)) {
                    h("sampleRate.support, " + i4);
                    return false;
                }
            }
            int i5 = aVar.F;
            if (i5 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i = 6;
                    } else {
                        i = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    StringBuilder sbA = ml5.a(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", this.a, ", [", " to ");
                    sbA.append(i);
                    sbA.append("]");
                    cft.g("MediaCodecInfo", sbA.toString());
                    maxInputChannelCount = i;
                }
                if (maxInputChannelCount < i5) {
                    h("channelCount.support, " + i5);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(a aVar) {
        if (this.i) {
            return this.e;
        }
        HashMap<ijv.a, List<ziv>> map = ijv.a;
        Pair<Integer, Integer> pairB = j08.b(aVar);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    public final boolean g(int i, int i2, double d) {
        String str;
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            int iA = (i3 < 29 || ((bool = djv.a) != null && bool.booleanValue())) ? 0 : djv.a.a(videoCapabilities, i, i2, d);
            if (iA != 2) {
                if (iA == 1) {
                    StringBuilder sbA = dy5.a("sizeAndRate.cover, ", i, i2, "x", "@");
                    sbA.append(d);
                    h(sbA.toString());
                    return false;
                }
                if (!a(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        str = this.a;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                            StringBuilder sbA2 = dy5.a("sizeAndRate.rotated, ", i, i2, "x", "@");
                            sbA2.append(d);
                            StringBuilder sbA3 = ux5.a("AssumedSupport [", sbA2.toString(), "] [", str, ", ");
                            sbA3.append(this.b);
                            sbA3.append("] [");
                            sbA3.append(jrh0.a);
                            sbA3.append("]");
                            cft.b("MediaCodecInfo", sbA3.toString());
                            return true;
                        }
                        StringBuilder sbA4 = dy5.a("sizeAndRate.rotated, ", i, i2, "x", "@");
                        sbA4.append(d);
                        StringBuilder sbA5 = ux5.a("AssumedSupport [", sbA4.toString(), "] [", str, ", ");
                        sbA5.append(this.b);
                        sbA5.append("] [");
                        sbA5.append(jrh0.a);
                        sbA5.append("]");
                        cft.b("MediaCodecInfo", sbA5.toString());
                        return true;
                    }
                    StringBuilder sbA6 = dy5.a("sizeAndRate.support, ", i, i2, "x", "@");
                    sbA6.append(d);
                    h(sbA6.toString());
                    return false;
                }
            }
        } else if (!a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                str = this.a;
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i2, i, d)) {
                    StringBuilder sbA7 = dy5.a("sizeAndRate.rotated, ", i, i2, "x", "@");
                    sbA7.append(d);
                    StringBuilder sbA8 = ux5.a("AssumedSupport [", sbA7.toString(), "] [", str, ", ");
                    sbA8.append(this.b);
                    sbA8.append("] [");
                    sbA8.append(jrh0.a);
                    sbA8.append("]");
                    cft.b("MediaCodecInfo", sbA8.toString());
                    return true;
                }
            }
            StringBuilder sbA9 = dy5.a("sizeAndRate.support, ", i, i2, "x", "@");
            sbA9.append(d);
            h(sbA9.toString());
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.a;
    }

    public final void h(String str) {
        StringBuilder sbA = he.a("NoSupport [", str, "] [");
        sbA.append(this.a);
        sbA.append(", ");
        sbA.append(this.b);
        sbA.append("] [");
        sbA.append(jrh0.a);
        sbA.append("]");
        cft.b(ACKxwYRsuWyGz.qxvXuG, sbA.toString());
    }
}
