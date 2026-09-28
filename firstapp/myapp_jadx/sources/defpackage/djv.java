package defpackage;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class djv {
    public static Boolean a;

    public static final class a {
        /* JADX WARN: Code duplicated, block: B:20:0x0040  */
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            boolean z;
            int i3;
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                bjv.a();
                MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
                int i4 = 0;
                while (true) {
                    z = true;
                    if (i4 >= supportedPerformancePoints.size()) {
                        i3 = 1;
                        break;
                    }
                    if (ajv.a(supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                        i3 = 2;
                        break;
                    }
                    i4++;
                }
                if (i3 == 1 && djv.a == null) {
                    if (Build.VERSION.SDK_INT >= 35) {
                        z = false;
                    } else {
                        int iB = b(false);
                        int iB2 = b(true);
                        if (iB != 0 && (iB2 != 0 ? !(iB != 2 || iB2 != 2) : iB == 2)) {
                            z = false;
                        }
                    }
                    djv.a = Boolean.valueOf(z);
                    if (z) {
                    }
                }
                return i3;
            }
            return 0;
        }

        public static int b(boolean z) {
            MediaCodecInfo.VideoCapabilities videoCapabilities;
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
            try {
                androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
                c0062a.m = gqv.m("video/avc");
                androidx.media3.common.a aVar = new androidx.media3.common.a(c0062a);
                if (aVar.n != null) {
                    c150 c150VarF = ijv.f(aVar, z, false);
                    for (int i = 0; i < c150VarF.d; i++) {
                        if (((ziv) c150VarF.get(i)).d != null && (videoCapabilities = ((ziv) c150VarF.get(i)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            bjv.a();
                            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                            for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                                if (ajv.a(supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                    return 2;
                                }
                            }
                            return 1;
                        }
                    }
                }
            } catch (ijv.b unused) {
            }
            return 0;
        }
    }
}
