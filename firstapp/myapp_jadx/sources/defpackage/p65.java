package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p65 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;

    public p65(mx90 mx90Var) {
        float[] fArrD;
        int i;
        owh owhVar = new owh();
        mw0<g1a0> mw0Var = mx90Var.d;
        g1a0[] g1a0VarArr = mw0Var.a;
        int i2 = mw0Var.b;
        float fMax = -2.1474836E9f;
        float fMin = 2.1474836E9f;
        float fMin2 = 2.1474836E9f;
        float fMax2 = -2.1474836E9f;
        for (int i3 = 0; i3 < i2; i3++) {
            g1a0 g1a0Var = g1a0VarArr[i3];
            if (g1a0Var.b.A) {
                b21 b21Var = g1a0Var.e;
                if (b21Var instanceof qs40) {
                    i = 8;
                    fArrD = owhVar.d(8);
                    ((qs40) b21Var).g(g1a0Var, fArrD, 0);
                } else if (b21Var instanceof pnv) {
                    pnv pnvVar = (pnv) b21Var;
                    int i4 = pnvVar.g;
                    float[] fArrD2 = owhVar.d(i4);
                    pnvVar.g(g1a0Var, 0, i4, fArrD2, 0);
                    i = i4;
                    fArrD = fArrD2;
                } else {
                    fArrD = null;
                    i = 0;
                }
                if (fArrD != null) {
                    for (int i5 = 0; i5 < i; i5 += 2) {
                        float f = fArrD[i5];
                        float f2 = fArrD[i5 + 1];
                        fMin = Math.min(fMin, f);
                        fMin2 = Math.min(fMin2, f2);
                        fMax = Math.max(fMax, f);
                        fMax2 = Math.max(fMax2, f2);
                    }
                }
            }
        }
        this.a = fMin;
        this.b = fMin2;
        this.c = fMax - fMin;
        this.d = fMax2 - fMin2;
    }

    public p65(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public p65() {
        this.a = 0.0d;
        this.b = 0.0d;
        this.c = 0.0d;
        this.d = 0.0d;
    }
}
