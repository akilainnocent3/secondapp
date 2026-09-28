package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes8.dex */
public final class soc extends nxf0<roc> {
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final fw h;
    public final fw i;
    public final tu50 j;
    public final PathMeasure k;
    public final LinearInterpolator l;

    public soc(long j, long j2, float f, float f2, float f3, float f4, float f5, float f6) {
        super(j, j2);
        this.d = f;
        this.e = f2;
        this.f = f5;
        this.g = f6;
        Path path = new Path();
        path.moveTo(f, f2);
        path.quadTo(f3, f4, f5, f6);
        this.k = new PathMeasure(path, false);
        this.h = new fw(0.5f, 1.0f, j, j + 35);
        this.i = new fw(1.0f, 0.0f, j2 - 35, j2);
        this.j = new tu50(j, j2);
        this.l = new LinearInterpolator();
    }

    @Override // defpackage.q12
    public final Object b(long j, long j2) {
        long j3 = this.b;
        float fFloatValue = 1.0f;
        if (j < j3) {
            return new roc(this.d, this.e, 1.0f, 0.0f);
        }
        long j4 = this.c;
        if (j > j4) {
            return new roc(this.f, this.g, 0.0f, 0.0f);
        }
        float f = (j - j3) / (j4 - j3);
        float[] fArr = new float[2];
        float interpolation = this.l.getInterpolation(f);
        PathMeasure pathMeasure = this.k;
        pathMeasure.getPosTan(pathMeasure.getLength() * interpolation, fArr, null);
        fw fwVar = this.h;
        if (fwVar.b > j || j > fwVar.c) {
            fw fwVar2 = this.i;
            if (fwVar2.b <= j && j <= fwVar2.c) {
                fFloatValue = fwVar2.a(j).floatValue();
            }
        } else {
            fFloatValue = fwVar.a(j).floatValue();
        }
        return new roc(fArr[0], fArr[1], fFloatValue, this.j.a(j).floatValue());
    }
}
