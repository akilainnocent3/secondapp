package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iqv {
    public static iqv h;
    public final asr a;
    public final imf0 b;
    public final nmd c;
    public final f8i.a d;
    public final imf0 e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public static final class a {
        public static iqv a(iqv iqvVar, asr asrVar, imf0 imf0Var, mmd mmdVar, f8i.a aVar) {
            if (iqvVar != null && asrVar == iqvVar.a && ib30.c(imf0Var, asrVar).equals(iqvVar.b) && mmdVar.getDensity() == iqvVar.c.a && aVar == iqvVar.d) {
                return iqvVar;
            }
            iqv iqvVar2 = iqv.h;
            if (iqvVar2 != null && asrVar == iqvVar2.a && ib30.c(imf0Var, asrVar).equals(iqvVar2.b) && mmdVar.getDensity() == iqvVar2.c.a && aVar == iqvVar2.d) {
                return iqvVar2;
            }
            iqv iqvVar3 = new iqv(asrVar, ib30.c(imf0Var, asrVar), new nmd(mmdVar.getDensity(), mmdVar.y1()), aVar);
            iqv.h = iqvVar3;
            return iqvVar3;
        }
    }

    public iqv(asr asrVar, imf0 imf0Var, nmd nmdVar, f8i.a aVar) {
        this.a = asrVar;
        this.b = imf0Var;
        this.c = nmdVar;
        this.d = aVar;
        this.e = ib30.c(imf0Var, asrVar);
    }

    public final long a(int i, long j) {
        int iJ;
        float f = this.g;
        float f2 = this.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = jqv.a;
            long jB = oxa.b(0, 0, 0, 15);
            imf0 imf0Var = this.e;
            nmd nmdVar = this.c;
            float fD = mrz.a(str, imf0Var, jB, nmdVar, this.d, null, 1, 96).d();
            float fD2 = mrz.a(jqv.b, imf0Var, oxa.b(0, 0, 0, 15), nmdVar, this.d, null, 2, 96).d() - fD;
            this.g = fD;
            this.f = fD2;
            f2 = fD2;
            f = fD;
        }
        if (i != 1) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            iJ = iRound >= 0 ? iRound : 0;
            int iH = kxa.h(j);
            if (iJ > iH) {
                iJ = iH;
            }
        } else {
            iJ = kxa.j(j);
        }
        return oxa.a(kxa.k(j), kxa.i(j), iJ, kxa.h(j));
    }
}
