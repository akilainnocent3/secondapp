package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class aai0 implements Interpolator {
    public final /* synthetic */ skf a;

    public aai0(skf skfVar) {
        this.a = skfVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) this.a.a(f);
    }
}
