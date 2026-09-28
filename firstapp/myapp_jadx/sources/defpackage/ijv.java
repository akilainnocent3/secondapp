package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ijv {
    public static final HashMap<a, List<ziv>> a = new HashMap<>();

    public static final class a {
        public final String a;
        public final boolean b;
        public final boolean c;

        public a(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((gmf0.a(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
        }
    }

    public static class b extends Exception {
    }

    public static final class c {
        public final int a;
        public MediaCodecInfo[] b;

        public c(boolean z, boolean z2, boolean z3) {
            this.a = (z || z2 || z3) ? 1 : 0;
        }
    }

    public interface d<T> {
        int a(T t);
    }

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((ziv) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(ziv.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false));
            }
            Collections.sort(arrayList, new hjv(new fjv()));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((ziv) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((ziv) arrayList.remove(0));
    }

    public static String b(androidx.media3.common.a aVar) {
        Pair<Integer, Integer> pairB;
        String str = aVar.n;
        String str2 = aVar.n;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairB = j08.b(aVar)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static synchronized List<ziv> d(String str, boolean z, boolean z2) {
        try {
            a aVar = new a(str, z, z2);
            HashMap<a, List<ziv>> map = a;
            List<ziv> list = map.get(aVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListE = e(aVar, new c(z, z2, str.equals("video/mv-hevc")));
            if (z) {
                arrayListE.isEmpty();
            }
            a(str, arrayListE);
            pcn pcnVarJ = pcn.j(arrayListE);
            map.put(aVar, pcnVarJ);
            return pcnVarJ;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static c150 f(androidx.media3.common.a aVar, boolean z, boolean z2) {
        Iterable iterableD;
        List<ziv> listD = d(aVar.n, z, z2);
        String strB = b(aVar);
        if (strB == null) {
            pcn.b bVar = pcn.b;
            iterableD = c150.e;
        } else {
            iterableD = d(strB, z, z2);
        }
        pcn.a aVar2 = new pcn.a();
        aVar2.e(listD);
        aVar2.e(iterableD);
        return aVar2.g();
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (gqv.i(str)) {
            return true;
        }
        String strB = fy0.b(mediaCodecInfo.getName());
        if (strB.startsWith("arc.")) {
            return false;
        }
        if (strB.startsWith("omx.google.") || strB.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strB.startsWith("omx.sec.") && strB.contains(".sw.")) || strB.equals("omx.qcom.video.decoder.hevcswvdec") || strB.startsWith("c2.android.") || strB.startsWith("c2.google.")) {
            return true;
        }
        return (strB.startsWith("omx.") || strB.startsWith("c2.")) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    public static ArrayList e(a aVar, c cVar) throws b {
        String strC;
        String str;
        int i;
        a aVar2 = aVar;
        int i2 = cVar.a;
        String str2 = dLRYz.lxPdGlJAuViMz;
        try {
            ArrayList arrayList = new ArrayList();
            String str3 = aVar2.a;
            boolean z = aVar2.b;
            MediaCodecInfo[] codecInfos = cVar.b;
            if (codecInfos == null) {
                codecInfos = new MediaCodecList(i2).getCodecInfos();
                cVar.b = codecInfos;
            }
            int length = codecInfos.length;
            int i3 = 0;
            while (i3 < length) {
                MediaCodecInfo[] codecInfos2 = cVar.b;
                if (codecInfos2 == null) {
                    codecInfos2 = new MediaCodecList(i2).getCodecInfos();
                    cVar.b = codecInfos2;
                }
                MediaCodecInfo mediaCodecInfo = codecInfos2[i3];
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 29 || !mediaCodecInfo.isAlias()) {
                    int i5 = i3;
                    String name = mediaCodecInfo.getName();
                    if (mediaCodecInfo.isEncoder() || (strC = c(mediaCodecInfo, name, str3)) == null) {
                        i = i5;
                    } else {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(strC);
                            boolean zIsFeatureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                            boolean zIsFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                            boolean z2 = aVar2.c;
                            if ((z2 || !zIsFeatureRequired) && (!z2 || zIsFeatureSupported)) {
                                boolean zIsFeatureSupported2 = capabilitiesForType.isFeatureSupported(str2);
                                boolean zIsFeatureRequired2 = capabilitiesForType.isFeatureRequired(str2);
                                if ((z || !zIsFeatureRequired2) && (!z || zIsFeatureSupported2)) {
                                    boolean zIsVendor = true;
                                    boolean zIsHardwareAccelerated = i4 >= 29 ? mediaCodecInfo.isHardwareAccelerated() : !g(mediaCodecInfo, str3);
                                    i = i5;
                                    boolean zG = g(mediaCodecInfo, str3);
                                    boolean z3 = zIsHardwareAccelerated;
                                    if (i4 >= 29) {
                                        zIsVendor = mediaCodecInfo.isVendor();
                                    } else {
                                        String strB = fy0.b(mediaCodecInfo.getName());
                                        if (strB.startsWith("omx.google.") || strB.startsWith("c2.android.") || strB.startsWith("c2.google.")) {
                                            zIsVendor = false;
                                        }
                                    }
                                    if (z != zIsFeatureSupported2) {
                                        continue;
                                    } else {
                                        str = strC;
                                        try {
                                            arrayList.add(ziv.i(name, str3, str, capabilitiesForType, z3, zG, zIsVendor));
                                        } catch (Exception e) {
                                            e = e;
                                            cft.c("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                            throw e;
                                        }
                                    }
                                } else {
                                    i = i5;
                                }
                            } else {
                                i = i5;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str = strC;
                        }
                    }
                } else {
                    i = i3;
                }
                i3 = i + 1;
                aVar2 = aVar;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new b("Failed to query underlying media codecs", e3);
        }
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || LGxrN.ZRhOAabvIIhNfT.equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }
}
