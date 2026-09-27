package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.C4235d4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f46715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f46717e;

    public a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10) {
        str.getClass();
        this.f46713a = str;
        this.f46716d = str2;
        this.f46717e = codecCapabilities;
        boolean z11 = false;
        this.f46714b = !z10 && codecCapabilities != null && z.f47158a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null && z.f47158a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback")) {
            z11 = true;
        }
        this.f46715c = z11;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean a(String str) {
        String strA;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Integer numValueOf;
        Integer numValueOf2;
        if (str == null || this.f46716d == null || (strA = com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str)) == null) {
            return true;
        }
        if (!this.f46716d.equals(strA)) {
            b("codec.mime " + str + ", " + strA);
            return false;
        }
        Pattern pattern = j.f46742a;
        String[] strArrSplit = str.split("\\.");
        String str2 = strArrSplit[0];
        str2.getClass();
        int i10 = 2;
        byte b10 = -1;
        switch (str2.hashCode()) {
            case 3006243:
                if (str2.equals("avc1")) {
                    b10 = 0;
                }
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    b10 = 1;
                }
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    b10 = 2;
                }
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    b10 = 3;
                }
                break;
        }
        Pair pair = null;
        switch (b10) {
            case 0:
            case 1:
                if (strArrSplit.length < 2) {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                } else {
                    try {
                        if (strArrSplit[1].length() == 6) {
                            numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1].substring(0, 2), 16));
                            numValueOf2 = Integer.valueOf(Integer.parseInt(strArrSplit[1].substring(4), 16));
                        } else if (strArrSplit.length < 3) {
                            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                        } else {
                            numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
                            numValueOf2 = Integer.valueOf(Integer.parseInt(strArrSplit[2]));
                        }
                        pair = new Pair(Integer.valueOf(j.f46744c.get(numValueOf.intValue())), Integer.valueOf(j.f46745d.get(numValueOf2.intValue())));
                    } catch (NumberFormatException unused) {
                        Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                    }
                }
                break;
            case 2:
            case 3:
                if (strArrSplit.length < 4) {
                    Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                } else {
                    Matcher matcher = pattern.matcher(strArrSplit[1]);
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        if ("1".equals(strGroup)) {
                            i10 = 1;
                        } else if (!"2".equals(strGroup)) {
                            Log.w("MediaCodecUtil", "Unknown HEVC profile string: " + strGroup);
                            break;
                        }
                        Integer num = (Integer) j.f46746e.get(strArrSplit[3]);
                        if (num == null) {
                            Log.w("MediaCodecUtil", "Unknown HEVC level string: " + matcher.group(1));
                        } else {
                            pair = new Pair(Integer.valueOf(i10), num);
                        }
                    } else {
                        Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                    }
                }
                break;
        }
        if (pair == null) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f46717e;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == ((Integer) pair.first).intValue() && codecProfileLevel.level >= ((Integer) pair.second).intValue()) {
                return true;
            }
        }
        b("codec.profileLevel, " + str + ", " + strA);
        return false;
    }

    public final boolean b(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f46717e;
        if (codecCapabilities == null) {
            b("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        b("sampleRate.support, " + i10);
        return false;
    }

    public final void b(String str) {
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f46713a + ", " + this.f46716d + "] [" + z.f47162e + C4235d4.j.f61462e);
    }

    public final boolean a(int i10, int i11, double d10) {
        boolean zIsSizeSupported;
        boolean zIsSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f46717e;
        if (codecCapabilities == null) {
            b("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("sizeAndRate.vCaps");
            return false;
        }
        if (d10 != -1.0d && d10 > 0.0d) {
            zIsSizeSupported = videoCapabilities.areSizeAndRateSupported(i10, i11, d10);
        } else {
            zIsSizeSupported = videoCapabilities.isSizeSupported(i10, i11);
        }
        if (zIsSizeSupported) {
            return true;
        }
        if (i10 < i11) {
            if (d10 != -1.0d && d10 > 0.0d) {
                zIsSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i11, i10, d10);
            } else {
                zIsSizeSupported2 = videoCapabilities.isSizeSupported(i11, i10);
            }
            if (zIsSizeSupported2) {
                Log.d("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i10 + "x" + i11 + "x" + d10) + "] [" + this.f46713a + ", " + this.f46716d + "] [" + z.f47162e + C4235d4.j.f61462e);
                return true;
            }
        }
        b("sizeAndRate.support, " + i10 + "x" + i11 + "x" + d10);
        return false;
    }

    public final Point a(int i10, int i11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f46717e;
        if (codecCapabilities == null) {
            b("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = z.f47158a;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean a(int i10) {
        int i11;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f46717e;
        if (codecCapabilities == null) {
            b("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("channelCount.aCaps");
            return false;
        }
        String str = this.f46713a;
        String str2 = this.f46716d;
        int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((z.f47158a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
            if ("audio/ac3".equals(str2)) {
                i11 = 6;
            } else {
                i11 = "audio/eac3".equals(str2) ? 16 : 30;
            }
            Log.w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i11 + C4235d4.j.f61462e);
            maxInputChannelCount = i11;
        }
        if (maxInputChannelCount >= i10) {
            return true;
        }
        b("channelCount.support, " + i10);
        return false;
    }
}
