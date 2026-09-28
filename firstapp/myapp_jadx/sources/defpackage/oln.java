package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class oln extends nx80 {
    public final hx80 i;
    public final b90 j;
    public za5 k;

    public oln(hx80 hx80Var, b9z b9zVar) {
        super(b9zVar);
        this.i = hx80Var;
        this.j = c90.a();
    }

    @Override // defpackage.nx80
    public final void a(tcf tcfVar, long j, long j2, bxz bxzVar) {
        za5 za5Var;
        t70 t70VarA;
        b90 b90Var = this.j;
        Paint paint = b90Var.a;
        hx80 hx80Var = this.i;
        float fC1 = tcfVar.C1(hx80Var.a);
        float fC2 = tcfVar.C1(hx80Var.b);
        long j3 = hx80Var.c;
        float fC3 = tcfVar.C1(j7f.c(j3));
        float fC4 = tcfVar.C1(j7f.d(j3));
        if (bxzVar != null) {
            int iCeil = (int) Math.ceil(Float.intBitsToFloat((int) (j >> 32)));
            int iCeil2 = (int) Math.ceil(Float.intBitsToFloat((int) (j & 4294967295L)));
            if (fC2 > 0.0f) {
                lk40 bounds = bxzVar.getBounds();
                float f = bounds.c - bounds.a;
                float f2 = bounds.d - bounds.b;
                t70VarA = e8n.a((int) Math.ceil(f), (int) Math.ceil(f2), 1, 24);
                h40 h40VarA = i40.a(t70VarA);
                h40VarA.m(bxzVar, b90Var);
                h40VarA.d(0.0f, 0.0f, f, f2, 1);
                kg4.a(b90Var, 0, null, 5);
                b90Var.r(fC2 * 2.0f);
                Unit unit = Unit.a;
                h40VarA.m(bxzVar, b90Var);
            } else {
                t70VarA = null;
            }
            int iCeil3 = ((int) Math.ceil(fC1)) * 2;
            t70 t70VarA2 = e8n.a(iCeil + iCeil3, iCeil2 + iCeil3, 1, 24);
            Bitmap bitmap = t70VarA2.a;
            h40 h40VarA2 = i40.a(t70VarA2);
            if (t70VarA != null) {
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                kg4.a(b90Var, 0, null, 15);
                h40VarA2.a.drawRect(0.0f, 0.0f, width, height, paint);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fC4)) & 4294967295L) | (((long) Float.floatToRawIntBits(fC3)) << 32);
                kg4.a(b90Var, 11, fC1 > 0.0f ? og4.a(fC1) : null, 9);
                h40VarA2.h(t70VarA, jFloatToRawIntBits, b90Var);
                za5Var = new za5(fx80.a(t70VarA2));
            } else {
                h40VarA2.p();
                h40VarA2.e(fC3, fC4);
                kg4.a(b90Var, 0, fC1 > 0.0f ? og4.a(fC1) : null, 11);
                h40VarA2.m(bxzVar, b90Var);
                h40VarA2.f();
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                kg4.a(b90Var, 11, null, 13);
                h40VarA2.a.drawRect(0.0f, 0.0f, width2, height2, r15);
                za5Var = new za5(fx80.a(t70VarA2));
            }
        } else {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            t70 t70VarA3 = e8n.a((int) Math.ceil(Float.intBitsToFloat(i)), (int) Math.ceil(Float.intBitsToFloat(i2)), 1, 24);
            h40 h40VarA3 = i40.a(t70VarA3);
            float f3 = fC3 + fC2;
            float f4 = fC4 + fC2;
            float fMax = Math.max(f3, (Float.intBitsToFloat(i) + fC3) - fC2);
            float fMax2 = Math.max(f4, (Float.intBitsToFloat(i2) + fC4) - fC2);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            kg4.a(b90Var, 0, fC1 > 0.0f ? og4.a(fC1) : null, 11);
            h40VarA3.a.drawRoundRect(f3, f4, fMax, fMax2, fIntBitsToFloat, fIntBitsToFloat2, paint);
            Bitmap bitmap2 = t70VarA3.a;
            float width3 = bitmap2.getWidth();
            float height3 = bitmap2.getHeight();
            kg4.a(b90Var, 11, null, 13);
            h40VarA3.a.drawRect(0.0f, 0.0f, width3, height3, paint);
            za5Var = new za5(fx80.a(t70VarA3));
        }
        this.k = za5Var;
    }

    @Override // defpackage.nx80
    public final void c(tcf tcfVar, long j, bxz bxzVar, float f, l58 l58Var, int i) {
        za5 za5Var = this.k;
        if (za5Var != null) {
            hx80 hx80Var = this.i;
            hx80Var.getClass();
            if (bxzVar != null) {
                tcf.j0(tcfVar, bxzVar, za5Var, f, null, l58Var, i, 8);
            } else if (v4b.a(j, 0L)) {
                tcf.V1(tcfVar, za5Var, 0L, 0L, f, null, l58Var, i, 22);
            } else {
                tcf.q1(tcfVar, za5Var, 0L, 0L, j, f, null, l58Var, hx80Var.d, 38);
            }
        }
    }
}
