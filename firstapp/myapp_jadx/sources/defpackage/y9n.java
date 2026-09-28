package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y9n extends crz {
    public final u7n f;

    public y9n(u7n u7nVar) {
        this.f = u7nVar;
    }

    @Override // defpackage.crz
    public final long i() {
        u7n u7nVar = this.f;
        int iC = u7nVar.c();
        float f = iC > 0 ? iC : Float.NaN;
        int iB = u7nVar.b();
        return (((long) Float.floatToRawIntBits(iB > 0 ? iB : Float.NaN)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    @Override // defpackage.crz
    public final void j(tcf tcfVar) {
        u7n u7nVar = this.f;
        int iC = u7nVar.c();
        float fIntBitsToFloat = iC > 0 ? Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / iC : 1.0f;
        int iB = u7nVar.b();
        float fIntBitsToFloat2 = iB > 0 ? Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) / iB : 1.0f;
        qc6.b bVarF1 = tcfVar.F1();
        long jD = bVarF1.d();
        bVarF1.a().p();
        try {
            bVarF1.a.g(fIntBitsToFloat, fIntBitsToFloat2, 0L);
            u7nVar.d(i40.c(tcfVar.F1().a()));
        } finally {
            hrh.a(bVarF1, jD);
        }
    }
}
