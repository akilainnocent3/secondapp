package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes7.dex */
public final class l1a0 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) (1.0d - Math.pow(Math.abs(f - 1.0f), 1.0d));
    }
}
