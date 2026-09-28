package defpackage;

import com.google.protobuf.Reader;

/* JADX INFO: loaded from: classes.dex */
public final class orz {
    public String a;
    public imf0 b;
    public f8i.a c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public long h;
    public mmd i;
    public e90 j;
    public boolean k;
    public long l;
    public iqv m;
    public lrz n;
    public asr o;
    public long p;
    public int q;
    public int r;
    public long s;

    public orz(String str, imf0 imf0Var, f8i.a aVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = imf0Var;
        this.c = aVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        int i4 = aln.b;
        this.h = aln.a;
        this.l = 0L;
        if (!(true & true)) {
            ykn.a("width and height must be >= 0");
        }
        this.p = oxa.h(0, 0, 0, 0);
        this.q = -1;
        this.r = -1;
    }

    public static long f(orz orzVar, long j, asr asrVar) {
        imf0 imf0Var = orzVar.b;
        iqv iqvVar = orzVar.m;
        mmd mmdVar = orzVar.i;
        mmdVar.getClass();
        iqv iqvVarA = iqv.a.a(iqvVar, asrVar, imf0Var, mmdVar, orzVar.c);
        orzVar.m = iqvVarA;
        return iqvVarA.a(orzVar.g, j);
    }

    public final int a(int i, asr asrVar) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = oxa.a(0, i, 0, Reader.READ_DONE);
        if (this.g > 1) {
            jA = f(this, jA, asrVar);
        }
        lrz lrzVarE = e(asrVar);
        long jA2 = otr.a(lrzVarE.b(), this.d, jA, this.e);
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int iA = cff0.a(new e90((h90) lrzVarE, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jA2).d());
        int iJ = kxa.j(jA);
        if (iA < iJ) {
            iA = iJ;
        }
        this.q = i;
        this.r = iA;
        return iA;
    }

    public final boolean b(long j, asr asrVar) {
        lrz lrzVar;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        long jF = this.g > 1 ? f(this, j, asrVar) : j;
        e90 e90Var = this.j;
        boolean z2 = false;
        if (e90Var != null && (lrzVar = this.n) != null && !lrzVar.a() && asrVar == this.o && (kxa.c(jF, this.p) || (kxa.i(jF) == kxa.i(this.p) && kxa.k(jF) == kxa.k(this.p) && kxa.h(jF) >= e90Var.d() && !e90Var.d.d))) {
            if (!kxa.c(jF, this.p)) {
                e90 e90Var2 = this.j;
                e90Var2.getClass();
                long jD = oxa.d(jF, (((long) cff0.a(Math.min(e90Var2.a.i.c(), e90Var2.h()))) << 32) | (((long) cff0.a(e90Var2.d())) & 4294967295L));
                this.l = jD;
                if (this.d == 3 || (((int) (jD >> 32)) >= e90Var2.h() && ((int) (4294967295L & jD)) >= e90Var2.d())) {
                    z = false;
                }
                this.k = z;
                this.p = jF;
            }
            return false;
        }
        lrz lrzVarE = e(asrVar);
        long jA = otr.a(lrzVarE.b(), this.d, jF, this.e);
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        e90 e90Var3 = new e90((h90) lrzVarE, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jA);
        this.p = jF;
        long jD2 = oxa.d(jF, (((long) cff0.a(e90Var3.d())) & 4294967295L) | (((long) cff0.a(e90Var3.h())) << 32));
        this.l = jD2;
        if (this.d != 3 && (((int) (jD2 >> 32)) < e90Var3.h() || ((int) (jD2 & 4294967295L)) < e90Var3.d())) {
            z2 = true;
        }
        this.k = z2;
        this.j = e90Var3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = oxa.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(mmd mmdVar) {
        long jA;
        mmd mmdVar2 = this.i;
        if (mmdVar != null) {
            int i = aln.b;
            jA = aln.a(mmdVar.getDensity(), mmdVar.y1());
        } else {
            jA = aln.a;
        }
        if (mmdVar2 == null) {
            this.i = mmdVar;
            this.h = jA;
        } else if (mmdVar == null || this.h != jA) {
            this.i = mmdVar;
            this.h = jA;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final lrz e(asr asrVar) {
        lrz h90Var = this.n;
        if (h90Var == null || asrVar != this.o || h90Var.a()) {
            this.o = asrVar;
            String str = this.a;
            imf0 imf0VarC = ib30.c(this.b, asrVar);
            m2g m2gVar = m2g.a;
            mmd mmdVar = this.i;
            mmdVar.getClass();
            h90Var = new h90(str, imf0VarC, m2gVar, m2gVar, this.c, mmdVar);
        }
        this.n = h90Var;
        return h90Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) aln.b(this.h));
        sb.append(", history=");
        return nrz.a(this.s, ", constraints=$)", sb);
    }
}
