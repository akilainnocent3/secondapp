package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class xef extends nx80 {
    public final hx80 i;
    public final b90 j;
    public t70 k;

    public xef(hx80 hx80Var, b9z b9zVar) {
        super(b9zVar);
        this.i = hx80Var;
        this.j = c90.a();
    }

    @Override // defpackage.nx80
    public final void a(tcf tcfVar, long j, long j2, bxz bxzVar) {
        t70 t70VarA;
        hx80 hx80Var = this.i;
        float fC1 = tcfVar.C1(hx80Var.a);
        float fC2 = tcfVar.C1(hx80Var.b);
        b90 b90Var = this.j;
        if (bxzVar != null) {
            float f = 2.0f * fC2;
            float f2 = (fC1 * 2.0f) + f;
            t70VarA = e8n.a((int) Math.ceil(Float.intBitsToFloat((int) (j >> 32)) + f2), (int) Math.ceil(Float.intBitsToFloat((int) (j & 4294967295L)) + f2), 1, 24);
            h40 h40VarA = i40.a(t70VarA);
            if (fC2 > 0.0f) {
                float f3 = fC2 + fC1;
                h40VarA.e(f3, f3);
                h40VarA.m(bxzVar, b90Var);
                kg4.a(b90Var, 0, fC1 > 0.0f ? og4.a(fC1) : null, 3);
                b90Var.r(f);
                Unit unit = Unit.a;
                h40VarA.m(bxzVar, b90Var);
            } else {
                kg4.a(b90Var, 0, fC1 > 0.0f ? og4.a(fC1) : null, 11);
                h40VarA.e(fC1, fC1);
                h40VarA.m(bxzVar, b90Var);
            }
        } else {
            float f4 = (fC2 * 2.0f) + (fC1 * 2.0f);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + f4;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + f4;
            t70VarA = e8n.a((int) Math.ceil(fIntBitsToFloat), (int) Math.ceil(fIntBitsToFloat2), 1, 24);
            h40 h40VarA2 = i40.a(t70VarA);
            float f5 = fIntBitsToFloat - fC1;
            float f6 = fIntBitsToFloat2 - fC1;
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            kg4.a(b90Var, 0, fC1 > 0.0f ? og4.a(fC1) : null, 11);
            h40VarA2.a.drawRoundRect(fC1, fC1, f5, f6, fIntBitsToFloat3, fIntBitsToFloat4, b90Var.a);
        }
        this.k = t70VarA;
    }

    @Override // defpackage.nx80
    public final void c(tcf tcfVar, long j, bxz bxzVar, float f, l58 l58Var, int i) {
        t70 t70Var = this.k;
        if (t70Var != null) {
            hx80 hx80Var = this.i;
            float f2 = -(tcfVar.C1(hx80Var.b) + tcfVar.C1(hx80Var.a));
            tcf.b1(tcfVar, t70Var, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), f, l58Var, i, 8);
        }
    }
}
