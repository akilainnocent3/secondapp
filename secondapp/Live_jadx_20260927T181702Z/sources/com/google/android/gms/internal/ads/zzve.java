package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzve {
    public final String zza;
    public final String zzb;
    public final String zzc;

    @Nullable
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;
    private int zzj;
    private int zzk;
    private float zzl;

    @k.h1
    public zzve(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z10;
        this.zze = z13;
        this.zzf = z15;
        this.zzh = z16;
        this.zzi = zzas.zzb(str2);
        this.zzl = -3.4028235E38f;
        this.zzj = -1;
        this.zzk = -1;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    public static zzve zza(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        boolean z16 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        boolean z17 = codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback");
        boolean z18 = z14 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z15 = false;
        } else {
            String str4 = Build.MANUFACTURER;
            if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO")) {
                z15 = false;
            } else {
                z15 = true;
            }
        }
        return new zzve(str, str2, str3, codecCapabilities, z10, z11, z12, z16, z17, z18, z15);
    }

    private final boolean zzj(zzv zzvVar) {
        String str = this.zzb;
        return str.equals(zzvVar.zzp) || str.equals(zzvx.zzg(zzvVar));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0185  */
    /* JADX WARN: Code duplicated, block: B:101:0x0187  */
    /* JADX WARN: Code duplicated, block: B:105:0x0194  */
    /* JADX WARN: Code duplicated, block: B:107:0x019a  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ba A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad A[PHI: r6
      0x00ad: PHI (r6v4 int) = (r6v3 int), (r6v3 int), (r6v5 int) binds: [B:36:0x009e, B:38:0x00a6, B:41:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:67:0x0126  */
    /* JADX WARN: Code duplicated, block: B:70:0x013b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0141  */
    /* JADX WARN: Code duplicated, block: B:74:0x0144  */
    /* JADX WARN: Code duplicated, block: B:76:0x0149  */
    /* JADX WARN: Code duplicated, block: B:77:0x014c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0151  */
    /* JADX WARN: Code duplicated, block: B:80:0x0154  */
    /* JADX WARN: Code duplicated, block: B:82:0x0159  */
    /* JADX WARN: Code duplicated, block: B:83:0x015c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0161  */
    /* JADX WARN: Code duplicated, block: B:86:0x0164  */
    /* JADX WARN: Code duplicated, block: B:88:0x0169  */
    /* JADX WARN: Code duplicated, block: B:89:0x016c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0171  */
    /* JADX WARN: Code duplicated, block: B:92:0x0173  */
    /* JADX WARN: Code duplicated, block: B:95:0x0179  */
    /* JADX WARN: Code duplicated, block: B:97:0x017e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0180  */
    private final boolean zzk(Context context, zzv zzvVar, boolean z10) {
        int iIntValue;
        int iIntValue2;
        int i10;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzb;
        String str;
        int length;
        int i11;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        int iIntValue3;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        int i12;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        String str2;
        int iHashCode;
        Pair pairZze = zzdp.zze(zzvVar);
        String str3 = zzvVar.zzp;
        if (str3 != null && str3.equals(u4.l1.F)) {
            String strZzh = zzas.zzh(this.zzc);
            if (!strZzh.equals(u4.l1.F)) {
                if (strZzh.equals("video/hevc")) {
                    int i13 = zzvx.zza;
                    String strZzk = zzgo.zzk(zzvVar.zzs);
                    if (strZzk == null) {
                        pairZze = null;
                    } else {
                        String strTrim = strZzk.trim();
                        String str4 = zzfk.zza;
                        pairZze = zzdp.zzf(strZzk, strTrim.split("\\.", -1), zzvVar.zzF);
                    }
                }
                if (pairZze != null) {
                    iIntValue = ((Integer) pairZze.first).intValue();
                    iIntValue2 = ((Integer) pairZze.second).intValue();
                    i10 = 8;
                    if ("video/dolby-vision".equals(str3)) {
                        str2 = this.zzb;
                        iHashCode = str2.hashCode();
                        if (iHashCode != -1662735862) {
                            if (iHashCode != -1662541442) {
                                if (iHashCode == 1331836730) {
                                    iIntValue = 8;
                                    iIntValue2 = 0;
                                }
                            } else if (str2.equals("video/hevc")) {
                                iIntValue = 2;
                                iIntValue2 = 0;
                            }
                        } else if (str2.equals("video/av01")) {
                            iIntValue = 2;
                            iIntValue2 = 0;
                        }
                    }
                    if (this.zzi) {
                        codecProfileLevelArrZzb = zzb();
                        str = this.zzb;
                        if (str.equals("audio/ac4")) {
                            codecCapabilities2 = this.zzd;
                            if (codecCapabilities2 != null) {
                                i12 = 8;
                            } else {
                                i12 = 8;
                            }
                            if (zzfk.zzP(context)) {
                                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(1026, i12)};
                            } else {
                                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(257, i12), zzvx.zzf(513, i12), zzvx.zzf(r7.i1.d.HandlerC1208d.f123902q, i12), zzvx.zzf(1026, i12), zzvx.zzf(1028, i12)};
                            }
                            codecProfileLevelArrZzb = codecProfileLevelArr;
                        }
                        if (Build.VERSION.SDK_INT == 23) {
                            codecCapabilities = this.zzd;
                            if (codecCapabilities != null) {
                                iIntValue3 = 0;
                            } else {
                                iIntValue3 = 0;
                            }
                            if (iIntValue3 >= 180000000) {
                                i10 = 1024;
                            } else if (iIntValue3 >= 120000000) {
                                i10 = 512;
                            } else if (iIntValue3 >= 60000000) {
                                i10 = 256;
                            } else if (iIntValue3 >= 30000000) {
                                i10 = 128;
                            } else if (iIntValue3 >= 18000000) {
                                i10 = 64;
                            } else if (iIntValue3 >= 12000000) {
                                i10 = 32;
                            } else if (iIntValue3 >= 7200000) {
                                i10 = 16;
                            } else if (iIntValue3 < 3600000) {
                                if (iIntValue3 >= 1800000) {
                                    i10 = 4;
                                } else if (iIntValue3 >= 800000) {
                                    i10 = 2;
                                } else {
                                    i10 = 1;
                                }
                            }
                            codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(1, i10)};
                        }
                        length = codecProfileLevelArrZzb.length;
                        for (i11 = 0; i11 < length; i11++) {
                            codecProfileLevel = codecProfileLevelArrZzb[i11];
                            if (codecProfileLevel.profile != iIntValue) {
                            }
                        }
                        String str5 = zzvVar.zzk;
                        String str6 = this.zzc;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 22 + str6.length());
                        sb2.append("codec.profileLevel, ");
                        sb2.append(str5);
                        sb2.append(", ");
                        sb2.append(str6);
                        zzm(sb2.toString());
                        return false;
                    }
                    codecProfileLevelArrZzb = zzb();
                    str = this.zzb;
                    if (str.equals("audio/ac4")) {
                        codecCapabilities2 = this.zzd;
                        if (codecCapabilities2 != null) {
                            i12 = 8;
                        } else {
                            i12 = 8;
                        }
                        if (zzfk.zzP(context)) {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(1026, i12)};
                        } else {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(257, i12), zzvx.zzf(513, i12), zzvx.zzf(r7.i1.d.HandlerC1208d.f123902q, i12), zzvx.zzf(1026, i12), zzvx.zzf(1028, i12)};
                        }
                        codecProfileLevelArrZzb = codecProfileLevelArr;
                    }
                    if (Build.VERSION.SDK_INT == 23) {
                        codecCapabilities = this.zzd;
                        if (codecCapabilities != null) {
                            iIntValue3 = 0;
                        } else {
                            iIntValue3 = 0;
                        }
                        if (iIntValue3 >= 180000000) {
                            i10 = 1024;
                        } else if (iIntValue3 >= 120000000) {
                            i10 = 512;
                        } else if (iIntValue3 >= 60000000) {
                            i10 = 256;
                        } else if (iIntValue3 >= 30000000) {
                            i10 = 128;
                        } else if (iIntValue3 >= 18000000) {
                            i10 = 64;
                        } else if (iIntValue3 >= 12000000) {
                            i10 = 32;
                        } else if (iIntValue3 >= 7200000) {
                            i10 = 16;
                        } else if (iIntValue3 < 3600000) {
                            if (iIntValue3 >= 1800000) {
                                i10 = 4;
                            } else if (iIntValue3 >= 800000) {
                                i10 = 2;
                            } else {
                                i10 = 1;
                            }
                        }
                        codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(1, i10)};
                    }
                    length = codecProfileLevelArrZzb.length;
                    while (i11 < length) {
                        codecProfileLevel = codecProfileLevelArrZzb[i11];
                        if (codecProfileLevel.profile != iIntValue) {
                        }
                    }
                    String str7 = zzvVar.zzk;
                    String str8 = this.zzc;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str7).length() + 22 + str8.length());
                    sb3.append("codec.profileLevel, ");
                    sb3.append(str7);
                    sb3.append(", ");
                    sb3.append(str8);
                    zzm(sb3.toString());
                    return false;
                }
            }
        } else if (pairZze != null) {
            iIntValue = ((Integer) pairZze.first).intValue();
            iIntValue2 = ((Integer) pairZze.second).intValue();
            i10 = 8;
            if ("video/dolby-vision".equals(str3)) {
                str2 = this.zzb;
                iHashCode = str2.hashCode();
                if (iHashCode != -1662735862) {
                    if (iHashCode != -1662541442) {
                        if (iHashCode == 1331836730 && str2.equals("video/avc")) {
                            iIntValue = 8;
                            iIntValue2 = 0;
                        }
                    } else if (str2.equals("video/hevc")) {
                        iIntValue = 2;
                        iIntValue2 = 0;
                    }
                } else if (str2.equals("video/av01")) {
                    iIntValue = 2;
                    iIntValue2 = 0;
                }
            }
            if (this.zzi || this.zzb.equals("audio/ac4")) {
                codecProfileLevelArrZzb = zzb();
                str = this.zzb;
                if (str.equals("audio/ac4") && codecProfileLevelArrZzb.length == 0) {
                    codecCapabilities2 = this.zzd;
                    if (codecCapabilities2 != null || (audioCapabilities = codecCapabilities2.getAudioCapabilities()) == null || audioCapabilities.getMaxInputChannelCount() <= 18) {
                        i12 = 8;
                    } else {
                        i12 = 16;
                    }
                    if (zzfk.zzP(context)) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(1026, i12)};
                    } else {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(257, i12), zzvx.zzf(513, i12), zzvx.zzf(r7.i1.d.HandlerC1208d.f123902q, i12), zzvx.zzf(1026, i12), zzvx.zzf(1028, i12)};
                    }
                    codecProfileLevelArrZzb = codecProfileLevelArr;
                }
                if (Build.VERSION.SDK_INT == 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArrZzb.length == 0) {
                    codecCapabilities = this.zzd;
                    if (codecCapabilities != null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        iIntValue3 = 0;
                    } else {
                        iIntValue3 = ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    }
                    if (iIntValue3 >= 180000000) {
                        i10 = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i10 = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i10 = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i10 = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i10 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i10 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i10 = 16;
                    } else if (iIntValue3 < 3600000) {
                        if (iIntValue3 >= 1800000) {
                            i10 = 4;
                        } else if (iIntValue3 >= 800000) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                    }
                    codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(1, i10)};
                }
                length = codecProfileLevelArrZzb.length;
                while (i11 < length) {
                    codecProfileLevel = codecProfileLevelArrZzb[i11];
                    if (codecProfileLevel.profile != iIntValue && (codecProfileLevel.level >= iIntValue2 || !z10)) {
                        if ("video/hevc".equals(str) && iIntValue == 2) {
                            String str9 = Build.DEVICE;
                            if ("sailfish".equals(str9) || "marlin".equals(str9)) {
                            }
                        }
                    }
                }
                String str10 = zzvVar.zzk;
                String str11 = this.zzc;
                StringBuilder sb4 = new StringBuilder(String.valueOf(str10).length() + 22 + str11.length());
                sb4.append("codec.profileLevel, ");
                sb4.append(str10);
                sb4.append(", ");
                sb4.append(str11);
                zzm(sb4.toString());
                return false;
            }
            if (iIntValue == 42) {
                iIntValue = 42;
                codecProfileLevelArrZzb = zzb();
                str = this.zzb;
                if (str.equals("audio/ac4")) {
                    codecCapabilities2 = this.zzd;
                    if (codecCapabilities2 != null) {
                        i12 = 8;
                    } else {
                        i12 = 8;
                    }
                    if (zzfk.zzP(context)) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(1026, i12)};
                    } else {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(257, i12), zzvx.zzf(513, i12), zzvx.zzf(r7.i1.d.HandlerC1208d.f123902q, i12), zzvx.zzf(1026, i12), zzvx.zzf(1028, i12)};
                    }
                    codecProfileLevelArrZzb = codecProfileLevelArr;
                }
                if (Build.VERSION.SDK_INT == 23) {
                    codecCapabilities = this.zzd;
                    if (codecCapabilities != null) {
                        iIntValue3 = 0;
                    } else {
                        iIntValue3 = 0;
                    }
                    if (iIntValue3 >= 180000000) {
                        i10 = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i10 = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i10 = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i10 = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i10 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i10 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i10 = 16;
                    } else if (iIntValue3 < 3600000) {
                        if (iIntValue3 >= 1800000) {
                            i10 = 4;
                        } else if (iIntValue3 >= 800000) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                    }
                    codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(1, i10)};
                }
                length = codecProfileLevelArrZzb.length;
                while (i11 < length) {
                    codecProfileLevel = codecProfileLevelArrZzb[i11];
                    if (codecProfileLevel.profile != iIntValue) {
                    }
                }
                String str12 = zzvVar.zzk;
                String str13 = this.zzc;
                StringBuilder sb5 = new StringBuilder(String.valueOf(str12).length() + 22 + str13.length());
                sb5.append("codec.profileLevel, ");
                sb5.append(str12);
                sb5.append(", ");
                sb5.append(str13);
                zzm(sb5.toString());
                return false;
            }
        }
        return true;
    }

    private final boolean zzl(zzv zzvVar) {
        return (Objects.equals(zzvVar.zzp, "audio/flac") && zzvVar.zzJ == 22 && Build.VERSION.SDK_INT < 34 && this.zza.equals("c2.android.flac.decoder")) ? false : true;
    }

    private final void zzm(String str) {
        String str2 = zzfk.zza;
        String str3 = this.zzb;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length();
        String str4 = this.zza;
        StringBuilder sb2 = new StringBuilder(length3 + 14 + str4.length() + 2 + length + 3 + length2 + 1);
        sb2.append("NoSupport [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(str4);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append("] [");
        sb2.append(str2);
        sb2.append(C4235d4.j.f61462e);
        zzef.zza("MediaCodecInfo", sb2.toString());
    }

    private static boolean zzn(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Range<Double> achievableFrameRatesFor;
        Point pointZzo = zzo(videoCapabilities, i10, i11);
        int i12 = pointZzo.x;
        int i13 = pointZzo.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        double dFloor = Math.floor(d10);
        if (videoCapabilities.areSizeAndRateSupported(i12, i13, dFloor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i12, i13)) == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
        }
        return false;
    }

    private static Point zzo(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzfk.zza;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final String toString() {
        return this.zza;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzb() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean zzc(Context context, zzv zzvVar) {
        int i10;
        int i11;
        if (!zzj(zzvVar) || !zzk(context, zzvVar, true) || !zzl(zzvVar)) {
            return false;
        }
        if (this.zzi) {
            int i12 = zzvVar.zzw;
            if (i12 <= 0 || (i11 = zzvVar.zzx) <= 0) {
                return true;
            }
            return zzg(i12, i11, zzvVar.zzA);
        }
        int i13 = zzvVar.zzI;
        if (i13 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzm("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzm("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i13)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + 20);
                sb2.append("sampleRate.support, ");
                sb2.append(i13);
                zzm(sb2.toString());
                return false;
            }
        }
        int i14 = zzvVar.zzH;
        if (i14 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                zzm("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                zzm("channelCount.aCaps");
                return false;
            }
            String str = this.zza;
            String str2 = this.zzb;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                if ("audio/ac3".equals(str2)) {
                    i10 = 6;
                } else {
                    i10 = "audio/eac3".equals(str2) ? 16 : 30;
                }
                StringBuilder sb3 = new StringBuilder(str.length() + 32 + String.valueOf(maxInputChannelCount).length() + 4 + String.valueOf(i10).length() + 1);
                sb3.append("AssumedMaxChannelAdjustment: ");
                sb3.append(str);
                sb3.append(", [");
                sb3.append(maxInputChannelCount);
                sb3.append(" to ");
                sb3.append(i10);
                sb3.append(C4235d4.j.f61462e);
                zzef.zzc("MediaCodecInfo", sb3.toString());
                maxInputChannelCount = i10;
            }
            if (maxInputChannelCount < i14) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(i14).length() + 22);
                sb4.append("channelCount.support, ");
                sb4.append(i14);
                zzm(sb4.toString());
                return false;
            }
        }
        return true;
    }

    public final boolean zzd(Context context, zzv zzvVar) {
        return zzj(zzvVar) && zzk(context, zzvVar, false) && zzl(zzvVar);
    }

    public final boolean zze(zzv zzvVar) {
        if (this.zzi) {
            return this.zze;
        }
        Pair pairZze = zzdp.zze(zzvVar);
        return pairZze != null && ((Integer) pairZze.first).intValue() == 42;
    }

    public final zziw zzf(zzv zzvVar, zzv zzvVar2) {
        zzv zzvVar3;
        zzv zzvVar4;
        int i10;
        String str = zzvVar.zzp;
        String str2 = zzvVar2.zzp;
        int i11 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.zzi) {
            if (zzvVar.zzB != zzvVar2.zzB) {
                i11 |= 1024;
            }
            boolean z10 = (zzvVar.zzw == zzvVar2.zzw && zzvVar.zzx == zzvVar2.zzx) ? false : true;
            if (!this.zze && z10) {
                i11 |= 512;
            }
            zzi zziVar = zzvVar.zzF;
            if ((!zzi.zza(zziVar) || !zzi.zza(zzvVar2.zzF)) && !Objects.equals(zziVar, zzvVar2.zzF)) {
                i11 |= 2048;
            }
            String str3 = this.zza;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !zzvVar.zzd(zzvVar2)) {
                i11 |= 2;
            }
            int i12 = zzvVar.zzy;
            if (i12 != -1 && (i10 = zzvVar.zzz) != -1 && i12 == zzvVar2.zzy && i10 == zzvVar2.zzz && z10) {
                i11 |= 2;
            }
            if (i11 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair pairZze = zzdp.zze(zzvVar);
                Pair pairZze2 = zzdp.zze(zzvVar2);
                if (pairZze == null || pairZze2 == null || !((Integer) pairZze.first).equals(pairZze2.first)) {
                    i11 = 2;
                }
            }
            if (i11 == 0) {
                return new zziw(str3, zzvVar, zzvVar2, true == zzvVar.zzd(zzvVar2) ? 3 : 2, 0);
            }
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
        } else {
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
            if (zzvVar3.zzH != zzvVar4.zzH) {
                i11 |= 4096;
            }
            if (zzvVar3.zzI != zzvVar4.zzI) {
                i11 |= 8192;
            }
            if (zzvVar3.zzJ != zzvVar4.zzJ) {
                i11 |= 16384;
            }
            if (i11 == 0) {
                String str4 = this.zzb;
                if (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4")) {
                    Pair pairZze3 = zzdp.zze(zzvVar3);
                    Pair pairZze4 = zzdp.zze(zzvVar4);
                    if (pairZze3 != null && pairZze4 != null) {
                        int iIntValue = ((Integer) pairZze3.first).intValue();
                        int iIntValue2 = ((Integer) pairZze4.first).intValue();
                        if (iIntValue == 42 && iIntValue2 == 42) {
                            return new zziw(this.zza, zzvVar3, zzvVar4, 3, 0);
                        }
                        if (str4.equals("audio/ac4") && pairZze3.equals(pairZze4)) {
                            return new zziw(this.zza, zzvVar3, zzvVar4, 3, 0);
                        }
                    }
                }
            }
            if (i11 == 0) {
                String str5 = this.zzb;
                if (str5.equals("audio/eac3-joc") || str5.equals("audio/eac3")) {
                    return new zziw(this.zza, zzvVar3, zzvVar4, 3, 0);
                }
            }
            if (!zzvVar3.zzd(zzvVar4)) {
                i11 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new zziw(this.zza, zzvVar3, zzvVar4, 1, 0);
            }
        }
        return new zziw(this.zza, zzvVar3, zzvVar4, 0, i11);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    public final boolean zzg(int i10, int i11, double d10) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzm("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzm("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int iZza = zzvg.zza(videoCapabilities, i10, i11, d10);
            if (iZza != 2) {
                if (iZza == 1) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20 + String.valueOf(i11).length() + 1 + String.valueOf(d10).length());
                    sb2.append("sizeAndRate.cover, ");
                    sb2.append(i10);
                    sb2.append("x");
                    sb2.append(i11);
                    sb2.append(to.c.phraseDel);
                    sb2.append(d10);
                    zzm(sb2.toString());
                    return false;
                }
                if (!zzn(videoCapabilities, i10, i11, d10)) {
                    if (i10 < i11) {
                        str = this.zza;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 22 + String.valueOf(i11).length() + 1 + String.valueOf(d10).length());
                            sb3.append("sizeAndRate.rotated, ");
                            sb3.append(i10);
                            sb3.append("x");
                            sb3.append(i11);
                            sb3.append(to.c.phraseDel);
                            sb3.append(d10);
                            String string = sb3.toString();
                            String str2 = this.zzb;
                            int length = str.length();
                            String str3 = zzfk.zza;
                            int length2 = String.valueOf(str2).length();
                            StringBuilder sb4 = new StringBuilder(string.length() + 19 + length + 2 + length2 + 3 + String.valueOf(str3).length() + 1);
                            sb4.append("AssumedSupport [");
                            sb4.append(string);
                            sb4.append("] [");
                            sb4.append(str);
                            sb4.append(", ");
                            sb4.append(str2);
                            sb4.append("] [");
                            sb4.append(str3);
                            sb4.append(C4235d4.j.f61462e);
                            zzef.zza("MediaCodecInfo", sb4.toString());
                        } else {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(i10).length() + 22 + String.valueOf(i11).length() + 1 + String.valueOf(d10).length());
                            sb5.append("sizeAndRate.rotated, ");
                            sb5.append(i10);
                            sb5.append("x");
                            sb5.append(i11);
                            sb5.append(to.c.phraseDel);
                            sb5.append(d10);
                            String string2 = sb5.toString();
                            String str4 = this.zzb;
                            int length3 = str.length();
                            String str5 = zzfk.zza;
                            int length4 = String.valueOf(str4).length();
                            StringBuilder sb6 = new StringBuilder(string2.length() + 19 + length3 + 2 + length4 + 3 + String.valueOf(str5).length() + 1);
                            sb6.append("AssumedSupport [");
                            sb6.append(string2);
                            sb6.append("] [");
                            sb6.append(str);
                            sb6.append(", ");
                            sb6.append(str4);
                            sb6.append("] [");
                            sb6.append(str5);
                            sb6.append(C4235d4.j.f61462e);
                            zzef.zza("MediaCodecInfo", sb6.toString());
                        }
                    }
                    StringBuilder sb7 = new StringBuilder(String.valueOf(i10).length() + 22 + String.valueOf(i11).length() + 1 + String.valueOf(d10).length());
                    sb7.append("sizeAndRate.support, ");
                    sb7.append(i10);
                    sb7.append("x");
                    sb7.append(i11);
                    sb7.append(to.c.phraseDel);
                    sb7.append(d10);
                    zzm(sb7.toString());
                    return false;
                }
            }
        } else if (!zzn(videoCapabilities, i10, i11, d10)) {
            if (i10 < i11) {
                str = this.zza;
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && zzn(videoCapabilities, i11, i10, d10)) {
                    StringBuilder sb8 = new StringBuilder(String.valueOf(i10).length() + 22 + String.valueOf(i11).length() + 1 + String.valueOf(d10).length());
                    sb8.append("sizeAndRate.rotated, ");
                    sb8.append(i10);
                    sb8.append("x");
                    sb8.append(i11);
                    sb8.append(to.c.phraseDel);
                    sb8.append(d10);
                    String string3 = sb8.toString();
                    String str6 = this.zzb;
                    int length5 = str.length();
                    String str7 = zzfk.zza;
                    int length6 = String.valueOf(str6).length();
                    StringBuilder sb9 = new StringBuilder(string3.length() + 19 + length5 + 2 + length6 + 3 + String.valueOf(str7).length() + 1);
                    sb9.append("AssumedSupport [");
                    sb9.append(string3);
                    sb9.append("] [");
                    sb9.append(str);
                    sb9.append(", ");
                    sb9.append(str6);
                    sb9.append("] [");
                    sb9.append(str7);
                    sb9.append(C4235d4.j.f61462e);
                    zzef.zza("MediaCodecInfo", sb9.toString());
                }
            }
            StringBuilder sb10 = new StringBuilder(String.valueOf(i10).length() + 22 + String.valueOf(i11).length() + 1 + String.valueOf(d10).length());
            sb10.append("sizeAndRate.support, ");
            sb10.append(i10);
            sb10.append("x");
            sb10.append(i11);
            sb10.append(to.c.phraseDel);
            sb10.append(d10);
            zzm(sb10.toString());
            return false;
        }
        return true;
    }

    public final float zzh(int i10, int i11) {
        if (!this.zzi) {
            return -3.4028235E38f;
        }
        float f10 = this.zzl;
        if (f10 != -3.4028235E38f && this.zzj == i10 && this.zzk == i11) {
            return f10;
        }
        float f11 = 1024.0f;
        if (!zzg(i10, i11, 1024.0d)) {
            float f12 = 0.0f;
            while (true) {
                float f13 = f11 - f12;
                if (Math.abs(f13) <= 5.0f) {
                    break;
                }
                float f14 = (f13 / 2.0f) + f12;
                boolean zZzg = zzg(i10, i11, f14);
                if (true == zZzg) {
                    f12 = f14;
                }
                if (true != zZzg) {
                    f11 = f14;
                }
            }
            f11 = f12;
        }
        this.zzl = f11;
        this.zzj = i10;
        this.zzk = i11;
        return f11;
    }

    @Nullable
    public final Point zzi(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzo(videoCapabilities, i10, i11);
    }
}
