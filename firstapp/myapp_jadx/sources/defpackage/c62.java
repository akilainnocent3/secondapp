package defpackage;

import defpackage.c62;

/* JADX INFO: loaded from: classes.dex */
public abstract class c62<T extends c62<T>> {
    public final nk0 a;
    public final long b;
    public final ukf0 c;
    public final mly d;
    public final tlf0 e;
    public long f;
    public final nk0 g;

    public c62(nk0 nk0Var, long j, ukf0 ukf0Var, mly mlyVar, tlf0 tlf0Var) {
        this.a = nk0Var;
        this.b = j;
        this.c = ukf0Var;
        this.d = mlyVar;
        this.e = tlf0Var;
        this.f = j;
        this.g = nk0Var;
    }

    public final Integer a() {
        ukf0 ukf0Var = this.c;
        if (ukf0Var == null) {
            return null;
        }
        zjw zjwVar = ukf0Var.b;
        int iE = ulf0.e(this.f);
        mly mlyVar = this.d;
        return Integer.valueOf(mlyVar.a(zjwVar.c(zjwVar.d(mlyVar.b(iE)), true)));
    }

    public final Integer b() {
        ukf0 ukf0Var = this.c;
        if (ukf0Var == null) {
            return null;
        }
        int iF = ulf0.f(this.f);
        mly mlyVar = this.d;
        return Integer.valueOf(mlyVar.a(ukf0Var.i(ukf0Var.b.d(mlyVar.b(iF)))));
    }

    public final Integer c() {
        int length;
        ukf0 ukf0Var = this.c;
        if (ukf0Var == null) {
            return null;
        }
        int iP = p();
        while (true) {
            nk0 nk0Var = this.a;
            if (iP < nk0Var.b.length()) {
                int length2 = this.g.b.length() - 1;
                if (iP <= length2) {
                    length2 = iP;
                }
                long jL = ukf0Var.l(length2);
                int i = ulf0.c;
                int i2 = (int) (jL & 4294967295L);
                if (i2 > iP) {
                    length = this.d.a(i2);
                    break;
                }
                iP++;
            } else {
                length = nk0Var.b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer d() {
        int iA;
        ukf0 ukf0Var = this.c;
        if (ukf0Var == null) {
            return null;
        }
        for (int iP = p(); iP > 0; iP--) {
            int length = this.g.b.length() - 1;
            if (iP <= length) {
                length = iP;
            }
            long jL = ukf0Var.l(length);
            int i = ulf0.c;
            int i2 = (int) (jL >> 32);
            if (i2 < iP) {
                iA = this.d.a(i2);
                return Integer.valueOf(iA);
            }
        }
        iA = 0;
        return Integer.valueOf(iA);
    }

    public final boolean e() {
        ukf0 ukf0Var = this.c;
        return (ukf0Var != null ? ukf0Var.j(p()) : null) != lg50.b;
    }

    public final int f(ukf0 ukf0Var, int i) {
        int iP = p();
        tlf0 tlf0Var = this.e;
        if (tlf0Var.a == null) {
            tlf0Var.a = Float.valueOf(ukf0Var.c(iP).a);
        }
        zjw zjwVar = ukf0Var.b;
        int iD = zjwVar.d(iP) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= zjwVar.f) {
            return this.g.b.length();
        }
        float fB = zjwVar.b(iD) - 1.0f;
        Float f = tlf0Var.a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((e() && fFloatValue >= ukf0Var.h(iD)) || (!e() && fFloatValue <= ukf0Var.g(iD))) {
            return zjwVar.c(iD, true);
        }
        return this.d.a(zjwVar.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    public final void g() {
        tlf0 tlf0Var = this.e;
        tlf0Var.a = null;
        nk0 nk0Var = this.g;
        if (nk0Var.b.length() > 0) {
            if (e()) {
                i();
                return;
            }
            tlf0Var.a = null;
            if (nk0Var.b.length() > 0) {
                String str = nk0Var.b;
                long j = this.f;
                int i = ulf0.c;
                int iA = j020.a((int) (j & 4294967295L), str);
                if (iA != -1) {
                    o(iA, iA);
                }
            }
        }
    }

    public final void h() {
        this.e.a = null;
        nk0 nk0Var = this.g;
        String str = nk0Var.b;
        String str2 = nk0Var.b;
        if (str.length() > 0) {
            int iA = h020.a(ulf0.e(this.f), str2);
            if (iA == ulf0.e(this.f) && iA != str2.length()) {
                iA = h020.a(iA + 1, str2);
            }
            o(iA, iA);
        }
    }

    public final void i() {
        this.e.a = null;
        nk0 nk0Var = this.g;
        if (nk0Var.b.length() > 0) {
            String str = nk0Var.b;
            long j = this.f;
            int i = ulf0.c;
            int iB = j020.b((int) (j & 4294967295L), str);
            if (iB != -1) {
                o(iB, iB);
            }
        }
    }

    public final void j() {
        this.e.a = null;
        nk0 nk0Var = this.g;
        String str = nk0Var.b;
        String str2 = nk0Var.b;
        if (str.length() > 0) {
            int iB = h020.b(ulf0.f(this.f), str2);
            if (iB == ulf0.f(this.f) && iB != 0) {
                iB = h020.b(iB - 1, str2);
            }
            o(iB, iB);
        }
    }

    public final void k() {
        tlf0 tlf0Var = this.e;
        tlf0Var.a = null;
        nk0 nk0Var = this.g;
        if (nk0Var.b.length() > 0) {
            if (!e()) {
                i();
                return;
            }
            tlf0Var.a = null;
            if (nk0Var.b.length() > 0) {
                String str = nk0Var.b;
                long j = this.f;
                int i = ulf0.c;
                int iA = j020.a((int) (j & 4294967295L), str);
                if (iA != -1) {
                    o(iA, iA);
                }
            }
        }
    }

    public final void l() {
        Integer numA;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (numA = a()) == null) {
            return;
        }
        int iIntValue = numA.intValue();
        o(iIntValue, iIntValue);
    }

    public final void m() {
        Integer numB;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        o(iIntValue, iIntValue);
    }

    public final void n() {
        if (this.g.b.length() > 0) {
            int i = ulf0.c;
            this.f = vlf0.a((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void o(int i, int i2) {
        this.f = vlf0.a(i, i2);
    }

    public final int p() {
        long j = this.f;
        int i = ulf0.c;
        return this.d.b((int) (j & 4294967295L));
    }
}
