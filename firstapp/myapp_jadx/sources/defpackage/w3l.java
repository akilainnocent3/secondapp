package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class w3l extends tkd implements qcf {
    public final d70 F;
    public final dlf G;
    public final umz H;

    public w3l(cke0 cke0Var, d70 d70Var, dlf dlfVar, umz umzVar) {
        this.F = d70Var;
        this.G = dlfVar;
        this.H = umzVar;
        p2(cke0Var);
    }

    public static boolean s2(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.qcf
    public final void A(wsr wsrVar) {
        boolean zS2;
        char c;
        long j;
        qc6 qc6Var = wsrVar.a;
        long jD = qc6Var.d();
        d70 d70Var = this.F;
        d70Var.l(jD);
        if (yw90.e(qc6Var.d())) {
            wsrVar.b2();
            return;
        }
        wsrVar.b2();
        ((x5a0) d70Var.d).getValue();
        Canvas canvasC = i40.c(qc6Var.b.a());
        dlf dlfVar = this.G;
        boolean zF = dlf.f(dlfVar.f);
        umz umzVar = this.H;
        if (zF) {
            zS2 = s2(270.0f, (((long) Float.floatToRawIntBits(wsrVar.C1(umzVar.b(wsrVar.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (qc6Var.d() & 4294967295L)))) << 32), dlfVar.c(), canvasC);
        } else {
            zS2 = false;
        }
        if (dlf.f(dlfVar.d)) {
            c = ' ';
            j = 4294967295L;
            zS2 = s2(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(wsrVar.C1(umzVar.b))) & 4294967295L), dlfVar.e(), canvasC) || zS2;
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if (dlf.f(dlfVar.g)) {
            zS2 = s2(90.0f, (((long) Float.floatToRawIntBits(wsrVar.C1(umzVar.c(wsrVar.getLayoutDirection())) + (-((float) ycv.b(Float.intBitsToFloat((int) (qc6Var.d() >> c))))))) & j) | (((long) Float.floatToRawIntBits(0.0f)) << c), dlfVar.d(), canvasC) || zS2;
        }
        if (dlf.f(dlfVar.e)) {
            EdgeEffect edgeEffectB = dlfVar.b();
            zS2 = s2(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (qc6Var.d() >> c)))) << c) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (qc6Var.d() & j))) + wsrVar.C1(umzVar.d))) & j), edgeEffectB, canvasC) || zS2;
        }
        if (zS2) {
            d70Var.f();
        }
    }
}
