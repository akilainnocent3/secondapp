package defpackage;

import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class blf {
    public static float a(EdgeEffect edgeEffect, float f, float f2, mmd mmdVar) {
        float f3 = clf.a;
        double density = mmdVar.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) clf.a) * density;
        float fExp = (float) (Math.exp((clf.b / clf.c) * Math.log(dAbs / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? cm0.b(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iB = ycv.b(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iB);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iB);
        }
        return f;
    }
}
