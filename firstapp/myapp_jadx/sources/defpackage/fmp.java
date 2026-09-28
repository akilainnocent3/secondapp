package defpackage;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class fmp implements Interpolator {
    public final PathInterpolator a;
    public float[] b;

    public fmp(PathInterpolator pathInterpolator, float... fArr) {
        this.a = pathInterpolator;
        this.b = fArr;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int length = this.b.length;
        PathInterpolator pathInterpolator = this.a;
        if (length > 1) {
            int i = 0;
            while (true) {
                float[] fArr = this.b;
                if (i >= fArr.length - 1) {
                    break;
                }
                float f2 = fArr[i];
                i++;
                float f3 = fArr[i];
                float f4 = f3 - f2;
                if (f >= f2 && f <= f3) {
                    return (pathInterpolator.getInterpolation((f - f2) / f4) * f4) + f2;
                }
            }
        }
        return pathInterpolator.getInterpolation(f);
    }
}
