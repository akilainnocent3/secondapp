package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class jva {
    public final h68 a;
    public final h68 b;
    public final h68 c;
    public final float[] d;

    public static final class a extends jva {
        public final ws50 e;
        public final ws50 f;
        public final float[] g;

        public a(ws50 ws50Var, ws50 ws50Var2) {
            float[] fArrF;
            super(ws50Var2, ws50Var, ws50Var2, null);
            this.e = ws50Var;
            this.f = ws50Var2;
            float[] fArr = of.b.a;
            r6j0 r6j0Var = ws50Var.d;
            float[] fArr2 = ws50Var.i;
            r6j0 r6j0Var2 = ws50Var2.d;
            float[] fArr3 = ws50Var2.j;
            if (i68.c(r6j0Var, r6j0Var2)) {
                fArrF = i68.f(fArr3, fArr2);
            } else {
                float[] fArrA = r6j0Var.a();
                float[] fArrA2 = r6j0Var2.a();
                r6j0 r6j0Var3 = s7n.b;
                fArrF = i68.f(i68.c(r6j0Var2, r6j0Var3) ? fArr3 : i68.e(i68.f(i68.b(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), ws50Var2.i)), i68.c(r6j0Var, r6j0Var3) ? fArr2 : i68.f(i68.b(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
            }
            this.g = fArrF;
        }

        @Override // defpackage.jva
        public final long a(long j) {
            float fH = j58.h(j);
            float fG = j58.g(j);
            float fE = j58.e(j);
            float fD = j58.d(j);
            js50 js50Var = this.e.p;
            float fA = (float) js50Var.a(fH);
            float fA2 = (float) js50Var.a(fG);
            float fA3 = (float) js50Var.a(fE);
            float[] fArr = this.g;
            float f = (fArr[6] * fA3) + (fArr[3] * fA2) + (fArr[0] * fA);
            float f2 = (fArr[7] * fA3) + (fArr[4] * fA2) + (fArr[1] * fA);
            float f3 = (fArr[8] * fA3) + (fArr[5] * fA2) + (fArr[2] * fA);
            ws50 ws50Var = this.f;
            is50 is50Var = ws50Var.m;
            return r58.a((float) is50Var.a(f), (float) is50Var.a(f2), (float) is50Var.a(f3), fD, ws50Var);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jva(h68 h68Var, h68 h68Var2, int i) {
        h68 h68VarA = w58.a(h68Var.b, 12884901888L) ? i68.a(h68Var) : h68Var;
        h68 h68VarA2 = w58.a(h68Var2.b, 12884901888L) ? i68.a(h68Var2) : h68Var2;
        float[] fArr = null;
        if (i == 3) {
            boolean zA = w58.a(h68Var.b, 12884901888L);
            boolean zA2 = w58.a(h68Var2.b, 12884901888L);
            if ((!zA || !zA2) && (zA || zA2)) {
                r6j0 r6j0Var = ((ws50) (zA ? h68Var : h68Var2)).d;
                float[] fArrA = s7n.e;
                float[] fArrA2 = zA ? r6j0Var.a() : fArrA;
                fArrA = zA2 ? r6j0Var.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            }
        }
        this(h68Var2, h68VarA, h68VarA2, fArr);
    }

    public long a(long j) {
        float fH = j58.h(j);
        float fG = j58.g(j);
        float fE = j58.e(j);
        float fD = j58.d(j);
        h68 h68Var = this.b;
        long jE = h68Var.e(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & 4294967295L));
        float fG2 = h68Var.g(fH, fG, fE);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fG2 *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.c.h(f, f2, fG2, fD, this.a);
    }

    public jva(h68 h68Var, h68 h68Var2, h68 h68Var3, float[] fArr) {
        this.a = h68Var;
        this.b = h68Var2;
        this.c = h68Var3;
        this.d = fArr;
    }
}
