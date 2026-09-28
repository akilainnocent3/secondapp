package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class px90 {
    public final mw0<o65> a = new mw0<>();
    public final mw0<owh> b = new mw0<>();
    public final a c = new a();

    public class a extends q120 {
        @Override // defpackage.q120
        public final Object c() {
            return new owh();
        }
    }

    public final void a(mx90 mx90Var) {
        if (mx90Var == null) {
            hb5.a("skeleton cannot be null.");
            return;
        }
        mw0<g1a0> mw0Var = mx90Var.c;
        g1a0[] g1a0VarArr = mw0Var.a;
        int i = mw0Var.b;
        mw0<o65> mw0Var2 = this.a;
        mw0Var2.clear();
        a aVar = this.c;
        mw0<owh> mw0Var3 = this.b;
        aVar.b(mw0Var3);
        mw0Var3.clear();
        for (int i2 = 0; i2 < i; i2++) {
            g1a0 g1a0Var = g1a0VarArr[i2];
            if (g1a0Var.b.A) {
                b21 b21Var = g1a0Var.e;
                if (b21Var instanceof o65) {
                    o65 o65Var = (o65) b21Var;
                    mw0Var2.a(o65Var);
                    owh owhVar = (owh) aVar.d();
                    mw0Var3.a(owhVar);
                    int i3 = o65Var.g;
                    o65Var.g(g1a0Var, 0, i3, owhVar.d(i3), 0);
                }
            }
        }
        owh[] owhVarArr = mw0Var3.a;
        int i4 = mw0Var3.b;
        float fMax = -2.1474836E9f;
        float fMin = 2.1474836E9f;
        float fMin2 = 2.1474836E9f;
        float fMax2 = -2.1474836E9f;
        for (int i5 = 0; i5 < i4; i5++) {
            owh owhVar2 = owhVarArr[i5];
            float[] fArr = owhVar2.a;
            int i6 = owhVar2.b;
            for (int i7 = 0; i7 < i6; i7 += 2) {
                float f = fArr[i7];
                float f2 = fArr[i7 + 1];
                fMin = Math.min(fMin, f);
                fMin2 = Math.min(fMin2, f2);
                fMax = Math.max(fMax, f);
                fMax2 = Math.max(fMax2, f2);
            }
        }
    }
}
