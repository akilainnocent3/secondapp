package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class toa0 extends w12 {
    public final RectF D;
    public final klr E;
    public final float[] F;
    public final Path G;
    public final drr H;
    public vuh0 I;
    public vuh0 J;

    public toa0(iot iotVar, drr drrVar) {
        super(iotVar, drrVar);
        this.D = new RectF();
        klr klrVar = new klr();
        this.E = klrVar;
        this.F = new float[8];
        this.G = new Path();
        this.H = drrVar;
        klrVar.setAlpha(0);
        klrVar.setStyle(Paint.Style.FILL);
        klrVar.setColor(drrVar.l);
    }

    @Override // defpackage.w12, defpackage.jef
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        super.f(rectF, matrix, z);
        drr drrVar = this.H;
        float f = drrVar.j;
        float f2 = drrVar.k;
        RectF rectF2 = this.D;
        rectF2.set(0.0f, 0.0f, f, f2);
        this.n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // defpackage.w12, defpackage.smp
    public final void i(cpt cptVar, Object obj) {
        super.i(cptVar, obj);
        if (obj == vot.I) {
            this.I = new vuh0(cptVar, null);
        } else if (obj == 1) {
            this.J = new vuh0(cptVar, null);
        }
    }

    @Override // defpackage.w12
    public final void m(Canvas canvas, Matrix matrix, int i, sef sefVar) {
        drr drrVar = this.H;
        int iAlpha = Color.alpha(drrVar.l);
        if (iAlpha == 0) {
            return;
        }
        vuh0 vuh0Var = this.J;
        Integer num = vuh0Var == null ? null : (Integer) vuh0Var.e();
        klr klrVar = this.E;
        if (num != null) {
            klrVar.setColor(num.intValue());
        } else {
            klrVar.setColor(drrVar.l);
        }
        u12<Integer, Integer> u12Var = this.w.p;
        int iIntValue = (int) ((((iAlpha / 255.0f) * (u12Var == null ? 100 : u12Var.e().intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        klrVar.setAlpha(iIntValue);
        if (sefVar == null || Color.alpha(sefVar.d) <= 0) {
            klrVar.clearShadowLayer();
        } else {
            klrVar.setShadowLayer(Math.max(sefVar.a, Float.MIN_VALUE), sefVar.b, sefVar.c, sefVar.d);
        }
        vuh0 vuh0Var2 = this.I;
        if (vuh0Var2 != null) {
            klrVar.setColorFilter((ColorFilter) vuh0Var2.e());
        }
        if (iIntValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = drrVar.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = drrVar.k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, klrVar);
        }
    }
}
