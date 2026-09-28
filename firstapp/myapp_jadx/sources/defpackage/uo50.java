package defpackage;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public final class uo50 implements TimeInterpolator {
    public final TimeInterpolator a;

    public uo50(TimeInterpolator timeInterpolator) {
        this.a = timeInterpolator;
    }

    public static TimeInterpolator a(boolean z, TimeInterpolator timeInterpolator) {
        return z ? timeInterpolator : new uo50(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - this.a.getInterpolation(f);
    }
}
