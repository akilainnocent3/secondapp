package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.signals.SignalKey;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzas {
    public static final /* synthetic */ int zza = 0;
    private static final ArrayList zzb = new ArrayList();
    private static final Pattern zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean zza(@Nullable String str) {
        return "audio".equals(zzj(str));
    }

    public static boolean zzb(@Nullable String str) {
        return "video".equals(zzj(str));
    }

    public static boolean zzc(@Nullable String str) {
        return "image".equals(zzj(str)) || u4.l1.Z0.equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec A[RETURN] */
    public static boolean zzd(@Nullable String str, @Nullable String str2) {
        zzar zzarVarZzi;
        int iZza;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    return true;
                }
                return false;
            case -1354451219:
                if (str.equals("application/vnd.dvb.ait")) {
                    return true;
                }
                return false;
            case -1348231605:
                if (str.equals("application/x-icy")) {
                    return true;
                }
                return false;
            case -1265048566:
                if (str.equals("application/x-camera-motion")) {
                    return true;
                }
                return false;
            case -1248341703:
                if (str.equals("application/id3")) {
                    return true;
                }
                return false;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    return true;
                }
                return false;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    return true;
                }
                return false;
            case -53558318:
                return (!str.equals("audio/mp4a-latm") || str2 == null || (zzarVarZzi = zzi(str2)) == null || (iZza = zzarVarZzi.zza()) == 0 || iZza == 16) ? false : true;
            case -43764892:
                if (str.equals(u4.l1.P0)) {
                    return true;
                }
                return false;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    return true;
                }
                return false;
            case 187094639:
                if (str.equals("audio/raw")) {
                    return true;
                }
                return false;
            case 469933706:
                if (str.equals(u4.l1.Y0)) {
                    return true;
                }
                return false;
            case 1054472807:
                if (str.equals(u4.l1.Q0)) {
                    return true;
                }
                return false;
            case 1154383568:
                if (str.equals("application/x-emsg")) {
                    return true;
                }
                return false;
            case 1331836563:
                if (str.equals(u4.l1.f138675l)) {
                    return true;
                }
                return false;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    return true;
                }
                return false;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    return true;
                }
                return false;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    return true;
                }
                return false;
            case 1652648887:
                if (str.equals("application/x-scte35")) {
                    return true;
                }
                return false;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    return true;
                }
                return false;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    @Nullable
    public static String zze(int i10) {
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

    public static int zzf(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zza(str)) {
            return 1;
        }
        if (zzb(str)) {
            return 2;
        }
        if ("text".equals(zzj(str)) || u4.l1.Y0.equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if (zzc(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || u4.l1.P0.equals(str) || u4.l1.Q0.equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = zzb;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = ((zzaq) arrayList.get(i10)).zza;
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0 A[RETURN] */
    public static int zzg(String str, @Nullable String str2) {
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (!str.equals("audio/mp4a-latm") || str2 == null || (r3 = zzi(str2)) == null) {
                    return 0;
                }
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/dsd":
                return 31;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String zzh(String str) {
        if (str == null) {
            return null;
        }
        String strZza = zzgsf.zza(str);
        switch (strZza.hashCode()) {
            case -1833600100:
                return strZza.equals("video/x-mvhevc") ? u4.l1.F : strZza;
            case -1007807498:
                return strZza.equals("audio/x-flac") ? "audio/flac" : strZza;
            case -979095690:
                return strZza.equals("application/x-mpegurl") ? "application/x-mpegURL" : strZza;
            case -586683234:
                return strZza.equals("audio/x-wav") ? "audio/wav" : strZza;
            case -432836268:
                return strZza.equals("audio/mpeg-l1") ? "audio/mpeg-L1" : strZza;
            case -432836267:
                return strZza.equals("audio/mpeg-l2") ? "audio/mpeg-L2" : strZza;
            case 187090231:
                return strZza.equals("audio/mp3") ? "audio/mpeg" : strZza;
            default:
                return strZza;
        }
    }

    @Nullable
    @k.h1
    public static zzar zzi(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new zzar(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    private static String zzj(@Nullable String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
