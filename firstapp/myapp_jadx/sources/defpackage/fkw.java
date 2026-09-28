package defpackage;

import com.google.protobuf.Reader;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fkw {
    public nk0 a;
    public f8i.a b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List<nk0.d<ji10>> g;
    public if1 h;
    public iqv i;
    public long j;
    public mmd k;
    public imf0 l;
    public ckw m;
    public asr n;
    public ukf0 o;
    public int p;
    public int q;
    public a r;
    public long s;

    public final class a implements mmd {
        public ukf0 a;

        public a() {
        }

        @Override // defpackage.mmd
        public final float D0(long j) {
            if (!omf0.d(j)) {
                return getDensity() * X(j);
            }
            fkw fkwVar = fkw.this;
            if (omf0.d(fkwVar.l.a.b)) {
                ib5.a("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
                return 0.0f;
            }
            if (omf0.a(fkwVar.l.a.b, omf0.c)) {
                ib5.a("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
                return 0.0f;
            }
            return omf0.c(j) * D0(fkwVar.l.a.b);
        }

        public final ukf0 e(long j, long j2) {
            long jH;
            fkw fkwVar = fkw.this;
            imf0 imf0Var = fkwVar.l;
            long jA = omf0.d(j2) ? hkw.a(fkwVar.l.a.b, j2) : j2;
            if (!omf0.a(jA, fkwVar.l.a.b)) {
                fkwVar.f(imf0.b(fkwVar.l, 0L, jA, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213));
            }
            if (fkwVar.f > 1) {
                asr asrVar = fkwVar.n;
                asrVar.getClass();
                jH = fkwVar.h(j, asrVar);
            } else {
                jH = j;
            }
            asr asrVar2 = fkwVar.n;
            asrVar2.getClass();
            zjw zjwVarB = fkwVar.b(jH, asrVar2);
            asr asrVar3 = fkwVar.n;
            asrVar3.getClass();
            ukf0 ukf0VarG = fkwVar.g(asrVar3, jH, zjwVarB);
            this.a = ukf0VarG;
            fkwVar.f(imf0Var);
            return ukf0VarG;
        }

        @Override // defpackage.mmd
        public final float getDensity() {
            mmd mmdVar = fkw.this.k;
            mmdVar.getClass();
            return mmdVar.getDensity();
        }

        @Override // defpackage.mmd
        public final float y1() {
            mmd mmdVar = fkw.this.k;
            mmdVar.getClass();
            return mmdVar.y1();
        }
    }

    public fkw(nk0 nk0Var, imf0 imf0Var, f8i.a aVar, int i, boolean z, int i2, int i3, List<nk0.d<ji10>> list, if1 if1Var) {
        this.a = nk0Var;
        this.b = aVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.h = if1Var;
        int i4 = aln.b;
        this.j = aln.a;
        this.l = imf0Var;
        this.p = -1;
        this.q = -1;
    }

    public final int a(int i, asr asrVar) {
        int i2 = this.p;
        int i3 = this.q;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = oxa.a(0, i, 0, Reader.READ_DONE);
        if (this.f > 1) {
            jA = h(jA, asrVar);
        }
        int iA = cff0.a(b(jA, asrVar).e);
        int iJ = kxa.j(jA);
        if (iA < iJ) {
            iA = iJ;
        }
        this.p = i;
        this.q = iA;
        return iA;
    }

    public final zjw b(long j, asr asrVar) {
        ckw ckwVarE = e(asrVar);
        long jA = otr.a(ckwVarE.b(), this.c, j, this.d);
        boolean z = this.d;
        int i = this.c;
        int i2 = this.e;
        return new zjw(ckwVarE, jA, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final boolean c(long j, asr asrVar) {
        this.s = (this.s << 2) | 3;
        long jH = this.f > 1 ? h(j, asrVar) : j;
        ukf0 ukf0Var = this.o;
        if (ukf0Var != null) {
            zjw zjwVar = ukf0Var.b;
            tkf0 tkf0Var = ukf0Var.a;
            if (!zjwVar.a.a()) {
                asr asrVar2 = tkf0Var.h;
                long j2 = tkf0Var.j;
                if (asrVar == asrVar2 && (kxa.c(jH, j2) || (kxa.i(jH) == kxa.i(j2) && kxa.k(jH) == kxa.k(j2) && kxa.h(jH) >= zjwVar.e && !zjwVar.c))) {
                    ukf0 ukf0Var2 = this.o;
                    ukf0Var2.getClass();
                    if (kxa.c(jH, ukf0Var2.a.j)) {
                        return false;
                    }
                    ukf0 ukf0Var3 = this.o;
                    ukf0Var3.getClass();
                    this.o = g(asrVar, jH, ukf0Var3.b);
                    return true;
                }
            }
        }
        if1 if1Var = this.h;
        if (if1Var != null) {
            this.n = asrVar;
            long j3 = this.l.a.b;
            a aVar = this.r;
            if (aVar == null) {
                aVar = new a();
                this.r = aVar;
            }
            float fD0 = aVar.D0(if1Var.c);
            float fD1 = aVar.D0(if1Var.a);
            float fD2 = aVar.D0(if1Var.b);
            float f = 2.0f;
            float f2 = (fD1 + fD2) / 2.0f;
            float f3 = fD2;
            float f4 = fD1;
            while (f3 - f4 >= fD0) {
                float f5 = f;
                float f6 = f3;
                if (if1.a(aVar.e(j, aVar.g0(f2)))) {
                    f3 = f2;
                } else {
                    f4 = f2;
                    f3 = f6;
                }
                f2 = (f4 + f3) / f5;
                f = f5;
            }
            float fFloor = (((float) Math.floor((f4 - fD1) / fD0)) * fD0) + fD1;
            float f7 = fD0 + fFloor;
            if (f7 <= fD2 && !if1.a(aVar.e(j, aVar.g0(f7)))) {
                fFloor = f7;
            }
            long jG0 = aVar.g0(fFloor);
            if (omf0.d(jG0)) {
                jG0 = hkw.a(j3, jG0);
            }
            long j4 = jG0;
            a aVar2 = this.r;
            if (aVar2 == null) {
                aVar2 = new a();
                this.r = aVar2;
            }
            ukf0 ukf0Var4 = aVar2.a;
            if (ukf0Var4 != null) {
                tkf0 tkf0Var2 = ukf0Var4.a;
                if (omf0.a(j4, tkf0Var2.b.a.b) && tkf0Var2.f == this.c) {
                    this.o = ukf0Var4;
                    return true;
                }
            }
            f(imf0.b(this.l, 0L, j4, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213));
        }
        this.o = g(asrVar, jH, b(jH, asrVar));
        return true;
    }

    public final void d(mmd mmdVar) {
        long jA;
        mmd mmdVar2 = this.k;
        if (mmdVar != null) {
            int i = aln.b;
            jA = aln.a(mmdVar.getDensity(), mmdVar.y1());
        } else {
            jA = aln.a;
        }
        if (mmdVar2 == null) {
            this.k = mmdVar;
            this.j = jA;
            return;
        }
        if (mmdVar == null || this.j != jA) {
            this.k = mmdVar;
            this.j = jA;
            this.s = (this.s << 2) | 1;
            this.m = null;
            this.o = null;
            this.q = -1;
            this.p = -1;
            this.r = null;
        }
    }

    public final ckw e(asr asrVar) {
        ckw ckwVar = this.m;
        if (ckwVar == null || asrVar != this.n || ckwVar.a()) {
            this.n = asrVar;
            nk0 nk0Var = this.a;
            imf0 imf0VarC = ib30.c(this.l, asrVar);
            mmd mmdVar = this.k;
            mmdVar.getClass();
            f8i.a aVar = this.b;
            List list = this.g;
            if (list == null) {
                list = m2g.a;
            }
            ckwVar = new ckw(nk0Var, imf0VarC, list, mmdVar, aVar);
        }
        this.m = ckwVar;
        return ckwVar;
    }

    public final void f(imf0 imf0Var) {
        boolean zD = imf0Var.d(this.l);
        this.l = imf0Var;
        if (zD) {
            return;
        }
        this.s <<= 2;
        this.m = null;
        this.o = null;
        this.q = -1;
        this.p = -1;
    }

    public final ukf0 g(asr asrVar, long j, zjw zjwVar) {
        float fMin = Math.min(zjwVar.a.b(), zjwVar.d);
        nk0 nk0Var = this.a;
        imf0 imf0Var = this.l;
        List list = this.g;
        if (list == null) {
            list = m2g.a;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        mmd mmdVar = this.k;
        mmdVar.getClass();
        return new ukf0(new tkf0(nk0Var, imf0Var, list, i, z, i2, mmdVar, asrVar, this.b, j), zjwVar, oxa.d(j, (((long) cff0.a(fMin)) << 32) | (((long) cff0.a(zjwVar.e)) & 4294967295L)));
    }

    public final long h(long j, asr asrVar) {
        iqv iqvVar = this.i;
        imf0 imf0Var = this.l;
        mmd mmdVar = this.k;
        mmdVar.getClass();
        iqv iqvVarA = iqv.a.a(iqvVar, asrVar, imf0Var, mmdVar, this.b);
        this.i = iqvVarA;
        return iqvVarA.a(this.f, j);
    }

    public final String toString() {
        tkf0 tkf0Var;
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object kxaVar = "null";
        sb.append(this.o != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) aln.b(this.j));
        sb.append(", history=");
        sb.append(this.s);
        sb.append(", constraints=");
        ukf0 ukf0Var = this.o;
        if (ukf0Var != null && (tkf0Var = ukf0Var.a) != null) {
            kxaVar = new kxa(tkf0Var.j);
        }
        return ekw.a(sb, kxaVar, ')');
    }
}
