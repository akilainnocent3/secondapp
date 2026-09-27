package yads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Base64;
import android.util.Pair;
import com.ironsource.C4235d4;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ik1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f150659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f150660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f150661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f150662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f150663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f150664h;

    public ik1(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        this.f150657a = (String) ni.a((Object) str);
        this.f150658b = str2;
        this.f150659c = str3;
        this.f150660d = codecCapabilities;
        this.f150663g = z10;
        this.f150661e = z11;
        this.f150662f = z12;
        this.f150664h = ht1.f(str2);
    }

    public final Point a(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f150660d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = ib3.f150516a;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean b(mx0 mx0Var) {
        if (this.f150664h) {
            return this.f150661e;
        }
        Pair pairB = wk1.b(mx0Var);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    public final String toString() {
        return this.f150657a;
    }

    public final va0 a(mx0 mx0Var, mx0 mx0Var2) {
        mx0 mx0Var3;
        mx0 mx0Var4;
        int i10 = !ib3.a(mx0Var.f152729m, mx0Var2.f152729m) ? 8 : 0;
        if (this.f150664h) {
            if (mx0Var.f152737u != mx0Var2.f152737u) {
                i10 |= 1024;
            }
            if (!this.f150661e && (mx0Var.f152734r != mx0Var2.f152734r || mx0Var.f152735s != mx0Var2.f152735s)) {
                i10 |= 512;
            }
            if (!ib3.a(mx0Var.f152741y, mx0Var2.f152741y)) {
                i10 |= 2048;
            }
            String str = this.f150657a;
            String str2 = ib3.f150519d;
            jk1 jk1Var = pk2.f153970c;
            if (str2.startsWith(jk1Var.b()) && jk1Var.a().equals(str) && !mx0Var.a(mx0Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new va0(this.f150657a, mx0Var, mx0Var2, mx0Var.a(mx0Var2) ? 3 : 2, 0);
            }
            mx0Var3 = mx0Var;
            mx0Var4 = mx0Var2;
        } else {
            mx0Var3 = mx0Var;
            mx0Var4 = mx0Var2;
            if (mx0Var3.f152742z != mx0Var4.f152742z) {
                i10 |= 4096;
            }
            if (mx0Var3.A != mx0Var4.A) {
                i10 |= 8192;
            }
            if (mx0Var3.B != mx0Var4.B) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f150658b)) {
                Pair pairB = wk1.b(mx0Var3);
                Pair pairB2 = wk1.b(mx0Var4);
                if (pairB != null && pairB2 != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    int iIntValue2 = ((Integer) pairB2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new va0(this.f150657a, mx0Var3, mx0Var4, 3, 0);
                    }
                }
            }
            if (!mx0Var3.a(mx0Var4)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(this.f150658b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new va0(this.f150657a, mx0Var3, mx0Var4, 1, 0);
            }
        }
        return new va0(this.f150657a, mx0Var3, mx0Var4, 0, i10);
    }

    public final boolean a(mx0 mx0Var) {
        int i10;
        Pair pairB;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (!this.f150658b.equals(mx0Var.f152729m) && !this.f150658b.equals(wk1.a(mx0Var))) {
            return false;
        }
        int i11 = 16;
        if (mx0Var.f152726j != null && (pairB = wk1.b(mx0Var)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            int iIntValue2 = ((Integer) pairB.second).intValue();
            int i12 = 8;
            if ("video/dolby-vision".equals(mx0Var.f152729m)) {
                if ("video/avc".equals(this.f150658b)) {
                    iIntValue2 = 0;
                    iIntValue = 8;
                } else if ("video/hevc".equals(this.f150658b)) {
                    iIntValue2 = 0;
                    iIntValue = 2;
                }
            }
            if (this.f150664h || iIntValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f150660d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (ib3.f150516a <= 23 && "video/x-vnd.on2.vp9".equals(this.f150658b) && codecProfileLevelArr.length == 0) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f150660d;
                    int iIntValue3 = (codecCapabilities2 == null || (videoCapabilities = codecCapabilities2.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    if (iIntValue3 >= 180000000) {
                        i12 = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i12 = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i12 = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i12 = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i12 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i12 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i12 = 16;
                    } else if (iIntValue3 < 3600000) {
                        if (iIntValue3 >= 1800000) {
                            i12 = 4;
                        } else {
                            i12 = iIntValue3 >= 800000 ? 2 : 1;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i12;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                int length = codecProfileLevelArr.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = codecProfileLevelArr[i13];
                        if (codecProfileLevel2.profile == iIntValue && codecProfileLevel2.level >= iIntValue2) {
                            if (!"video/hevc".equals(this.f150658b) || 2 != iIntValue) {
                                break;
                            }
                            byte[] bArrDecode = Base64.decode("c2FpbGZpc2g=", 0);
                            Charset charset = cv.g.f77202b;
                            String str = new String(bArrDecode, charset);
                            String str2 = ib3.f150517b;
                            if (!str.equals(str2) && !new String(Base64.decode("bWFybGlu", 0), charset).equals(str2)) {
                                break;
                            }
                        }
                        i13++;
                    } else {
                        a("codec.profileLevel, " + mx0Var.f152726j + ", " + this.f150659c);
                        return false;
                    }
                }
            }
        }
        if (this.f150664h) {
            int i14 = mx0Var.f152734r;
            if (i14 <= 0 || (i10 = mx0Var.f152735s) <= 0) {
                return true;
            }
            if (ib3.f150516a >= 21) {
                return a(i14, i10, mx0Var.f152736t);
            }
            boolean z10 = i14 * i10 <= wk1.a();
            if (!z10) {
                a("legacyFrameSize, " + mx0Var.f152734r + "x" + mx0Var.f152735s);
            }
            return z10;
        }
        int i15 = ib3.f150516a;
        if (i15 >= 21) {
            int i16 = mx0Var.A;
            if (i16 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.f150660d;
                if (codecCapabilities3 == null) {
                    a("sampleRate.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities3.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        a("sampleRate.aCaps");
                    } else if (!audioCapabilities.isSampleRateSupported(i16)) {
                        a("sampleRate.support, " + i16);
                    }
                }
                return false;
            }
            int i17 = mx0Var.f152742z;
            if (i17 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities4 = this.f150660d;
                if (codecCapabilities4 == null) {
                    a("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities4.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        a("channelCount.aCaps");
                    } else {
                        String str3 = this.f150657a;
                        String str4 = this.f150658b;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i15 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str4) && !"audio/3gpp".equals(str4) && !"audio/amr-wb".equals(str4) && !"audio/mp4a-latm".equals(str4) && !"audio/vorbis".equals(str4) && !"audio/opus".equals(str4) && !"audio/raw".equals(str4) && !"audio/flac".equals(str4) && !"audio/g711-alaw".equals(str4) && !"audio/g711-mlaw".equals(str4) && !"audio/gsm".equals(str4))) {
                            if ("audio/ac3".equals(str4)) {
                                i11 = 6;
                            } else if (!"audio/eac3".equals(str4)) {
                                i11 = 30;
                            }
                            ih1.d("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str3 + ", [" + maxInputChannelCount + " to " + i11 + C4235d4.j.f61462e);
                            maxInputChannelCount = i11;
                        }
                        if (maxInputChannelCount < i17) {
                            a("channelCount.support, " + i17);
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean a(int i10, int i11, double d10) {
        boolean zIsSizeSupported;
        boolean zIsSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f150660d;
        if (codecCapabilities == null) {
            a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            a("sizeAndRate.vCaps");
            return false;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = ib3.f150516a;
        Point point = new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i13 = point.x;
        int i14 = point.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            zIsSizeSupported = videoCapabilities.areSizeAndRateSupported(i13, i14, Math.floor(d10));
        } else {
            zIsSizeSupported = videoCapabilities.isSizeSupported(i13, i14);
        }
        if (!zIsSizeSupported) {
            if (i10 < i11) {
                String str = this.f150657a;
                byte[] bArrDecode = Base64.decode("T01YLk1USy5WSURFTy5ERUNPREVSLkhFVkM=", 0);
                Charset charset = cv.g.f77202b;
                if (!new String(bArrDecode, charset).equals(str) || !new String(Base64.decode("bWN2NWE=", 0), charset).equals(ib3.f150517b)) {
                    int widthAlignment2 = videoCapabilities.getWidthAlignment();
                    int heightAlignment2 = videoCapabilities.getHeightAlignment();
                    Point point2 = new Point((((i11 + widthAlignment2) - 1) / widthAlignment2) * widthAlignment2, (((i10 + heightAlignment2) - 1) / heightAlignment2) * heightAlignment2);
                    int i15 = point2.x;
                    int i16 = point2.y;
                    if (d10 != -1.0d && d10 >= 1.0d) {
                        zIsSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i15, i16, Math.floor(d10));
                    } else {
                        zIsSizeSupported2 = videoCapabilities.isSizeSupported(i15, i16);
                    }
                    if (zIsSizeSupported2) {
                        ih1.a("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i10 + "x" + i11 + "x" + d10) + "] [" + this.f150657a + ", " + this.f150658b + "] [" + ib3.f150520e + C4235d4.j.f61462e);
                    }
                }
            }
            a("sizeAndRate.support, " + i10 + "x" + i11 + "x" + d10);
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0068  */
    public static ik1 a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        int i10;
        if (codecCapabilities != null && (i10 = ib3.f150516a) >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (i10 <= 22) {
                byte[] bArrDecode = Base64.decode("T0RST0lELVhVMw==", 0);
                Charset charset = cv.g.f77202b;
                String str4 = new String(bArrDecode, charset);
                String str5 = ib3.f150519d;
                z14 = ((str4.equals(str5) || new String(Base64.decode("TmV4dXMgMTA=", 0), charset).equals(str5)) && (new String(Base64.decode("T01YLkV4eW5vcy5BVkMuRGVjb2Rlcg==", 0), charset).equals(str) || new String(Base64.decode("T01YLkV4eW5vcy5BVkMuRGVjb2Rlci5zZWN1cmU=", 0), charset).equals(str))) ? false : true;
            }
        }
        if (codecCapabilities != null && ib3.f150516a >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new ik1(str, str2, str3, codecCapabilities, z10, z14, z13 || (codecCapabilities != null && ib3.f150516a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    public final boolean a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (ib3.f150516a >= 29 && "video/x-vnd.on2.vp9".equals(this.f150658b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f150660d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(String str) {
        ih1.a("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f150657a + ", " + this.f150658b + "] [" + ib3.f150520e + C4235d4.j.f61462e);
    }
}
