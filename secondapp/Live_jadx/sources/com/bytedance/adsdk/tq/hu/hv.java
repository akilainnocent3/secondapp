package com.bytedance.adsdk.tq.hu;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.tq.sd.tq.khx;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hv {
    private static final PointF hww = new PointF();

    public static float hww(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static boolean sd(float f10, float f11, float f12) {
        return f10 >= f11 && f10 <= f12;
    }

    private static int tq(int i10, int i11) {
        int i12 = i10 / i11;
        return (((i10 ^ i11) >= 0) || i10 % i11 == 0) ? i12 : i12 - 1;
    }

    public static int hww(int i10, int i11, float f10) {
        return (int) (i10 + (f10 * (i11 - i10)));
    }

    public static PointF hww(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float tq(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static void hww(khx khxVar, Path path) {
        Path path2;
        path.reset();
        PointF pointFHww = khxVar.hww();
        path.moveTo(pointFHww.x, pointFHww.y);
        hww.set(pointFHww.x, pointFHww.y);
        int i10 = 0;
        while (i10 < khxVar.sd().size()) {
            com.bytedance.adsdk.tq.sd.hww hwwVar = khxVar.sd().get(i10);
            PointF pointFHww2 = hwwVar.hww();
            PointF pointFTq = hwwVar.tq();
            PointF pointFSd = hwwVar.sd();
            PointF pointF = hww;
            if (pointFHww2.equals(pointF) && pointFTq.equals(pointFSd)) {
                path.lineTo(pointFSd.x, pointFSd.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFHww2.x, pointFHww2.y, pointFTq.x, pointFTq.y, pointFSd.x, pointFSd.y);
            }
            pointF.set(pointFSd.x, pointFSd.y);
            i10++;
            path = path2;
        }
        Path path3 = path;
        if (khxVar.tq()) {
            path3.close();
        }
    }

    public static int hww(float f10, float f11) {
        return hww((int) f10, (int) f11);
    }

    private static int hww(int i10, int i11) {
        return i10 - (i11 * tq(i10, i11));
    }

    public static int hww(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }
}
