package com.yandex.div.core.animation;

import android.view.animation.Interpolator;
import fr.a0;
import ms.u;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class LookupTableInterpolator implements Interpolator {
    private final float stepSize;

    @l
    private final float[] values;

    public LookupTableInterpolator(@l float[] fArr) {
        this.values = fArr;
        this.stepSize = 1.0f / a0.Ce(fArr);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int iB = u.B((int) (a0.Ce(this.values) * f10), this.values.length - 2);
        float f11 = this.stepSize;
        float f12 = (f10 - (iB * f11)) / f11;
        float[] fArr = this.values;
        float f13 = fArr[iB];
        return f13 + (f12 * (fArr[iB + 1] - f13));
    }
}
