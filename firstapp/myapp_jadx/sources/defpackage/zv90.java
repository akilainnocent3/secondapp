package defpackage;

import androidx.media3.common.a;

/* JADX INFO: loaded from: classes.dex */
public final class zv90 implements k4h {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public m4h f;
    public njg0 g;

    public zv90(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.k4h
    public final int a(l4h l4hVar, k620 k620Var) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            fm20.a();
            return 0;
        }
        njg0 njg0Var = this.g;
        njg0Var.getClass();
        int iC = njg0Var.c(l4hVar, 1024, true);
        if (iC != -1) {
            this.d += iC;
            return 0;
        }
        this.e = 2;
        this.g.a(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // defpackage.k4h
    public final boolean b(l4h l4hVar) {
        int i = this.b;
        int i2 = this.a;
        ly0.f((i2 == -1 || i == -1) ? false : true);
        nsz nszVar = new nsz(i);
        ((jcd) l4hVar).c(nszVar.a, 0, i, false);
        return nszVar.C() == i2;
    }

    @Override // defpackage.k4h
    public final void c(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.k4h
    public final void l(m4h m4hVar) {
        this.f = m4hVar;
        njg0 njg0VarR = m4hVar.r(1024, 4);
        this.g = njg0VarR;
        a.C0062a c0062a = new a.C0062a();
        String str = this.c;
        c0062a.l = gqv.m(str);
        c0062a.m = gqv.m(str);
        p0j0.a(c0062a, njg0VarR);
        this.f.n();
        this.f.k(new aw90());
        this.e = 1;
    }

    @Override // defpackage.k4h
    public final void release() {
    }
}
