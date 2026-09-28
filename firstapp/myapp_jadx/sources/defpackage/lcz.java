package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class lcz implements Interpolator {
    public static final float a;
    public static final float b;

    static {
        float fA = 1.0f / a(1.0f);
        a = fA;
        b = 1.0f - (a(1.0f) * fA);
    }

    public static float a(float f) {
        float f2 = f * 8.0f;
        return f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp(-f2))) : hxa.a(1.0f, (float) Math.exp(1.0f - f2), 0.63212055f, 0.36787945f);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float fA = a(f) * a;
        return fA > 0.0f ? fA + b : fA;
    }
}
