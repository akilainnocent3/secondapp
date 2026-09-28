package defpackage;

import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class noz implements qa5 {
    public final zpz b;
    public final qa5 c;

    public noz(zpz zpzVar, qa5 qa5Var) {
        this.b = zpzVar;
        this.c = qa5Var;
    }

    @Override // defpackage.qa5
    public final float a(float f, float f2, float f3) {
        float fA = this.c.a(f, f2, f3);
        boolean z = false;
        if (f <= 0.0f ? f + f2 <= 0.0f : f + f2 > f3) {
            z = true;
        }
        float fAbs = Math.abs(fA);
        zpz zpzVar = this.b;
        if (fAbs == 0.0f || !z) {
            if (Math.abs(zpzVar.f) < 1.0E-6d) {
                return 0.0f;
            }
            float fP = zpzVar.f * (-1.0f);
            if (((Boolean) ((x5a0) zpzVar.G).getValue()).booleanValue()) {
                fP += zpzVar.p();
            }
            return f.d(fP, -f3, f3);
        }
        float fP2 = zpzVar.f * (-1.0f);
        while (fA > 0.0f && fP2 < fA) {
            fP2 += zpzVar.p();
        }
        while (fA < 0.0f && fP2 > fA) {
            fP2 -= zpzVar.p();
        }
        return fP2;
    }
}
