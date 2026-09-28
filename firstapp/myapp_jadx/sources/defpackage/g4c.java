package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes4.dex */
public final class g4c implements Interpolator {
    public static final g4c f = new g4c(0.33d, 0.19d, 0.23d, 1.01d);
    public final PointF a;
    public final PointF b;
    public final PointF c;
    public final PointF d;
    public final PointF e;

    static {
        new g4c(0.755d, 0.05d, 0.855d, 0.06d);
    }

    public g4c(double d, double d2, double d3, double d4) {
        PointF pointF = new PointF((float) d, (float) d2);
        PointF pointF2 = new PointF((float) d3, (float) d4);
        this.c = new PointF();
        this.d = new PointF();
        this.e = new PointF();
        float f2 = pointF.x;
        if (f2 < 0.0f || f2 > 1.0f) {
            hb5.a("startX value must be in the range [0, 1]");
            throw null;
        }
        float f3 = pointF2.x;
        if (f3 < 0.0f || f3 > 1.0f) {
            hb5.a("endX value must be in the range [0, 1]");
            throw null;
        }
        this.a = pointF;
        this.b = pointF2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        PointF pointF5;
        int i = 1;
        float f3 = f2;
        while (true) {
            pointF = this.b;
            pointF2 = this.a;
            pointF3 = this.c;
            pointF4 = this.d;
            pointF5 = this.e;
            if (i >= 14) {
                break;
            }
            float f4 = pointF2.x * 3.0f;
            pointF5.x = f4;
            float f5 = ((pointF.x - pointF2.x) * 3.0f) - f4;
            pointF4.x = f5;
            float f6 = (1.0f - pointF5.x) - f5;
            pointF3.x = f6;
            float f7 = (((((f6 * f3) + pointF4.x) * f3) + pointF5.x) * f3) - f2;
            if (Math.abs(f7) < 0.001d) {
                break;
            }
            f3 -= f7 / (((((pointF3.x * 3.0f) * f3) + (pointF4.x * 2.0f)) * f3) + pointF5.x);
            i++;
        }
        float f8 = pointF2.y * 3.0f;
        pointF5.y = f8;
        float f9 = ((pointF.y - pointF2.y) * 3.0f) - f8;
        pointF4.y = f9;
        float f10 = (1.0f - pointF5.y) - f9;
        pointF3.y = f10;
        return ((((f10 * f3) + pointF4.y) * f3) + pointF5.y) * f3;
    }
}
