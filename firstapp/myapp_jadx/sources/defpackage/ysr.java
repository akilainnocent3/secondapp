package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ysr {
    public final tsr a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public blt q;
    public tsr.d d = tsr.d.e;
    public final zhv p = new zhv(this);

    public ysr(tsr tsrVar) {
        this.a = tsrVar;
    }

    public final ywx a() {
        return this.a.U.d;
    }

    public final void b() {
        tsr.d dVar = this.a.V.d;
        if (dVar == tsr.d.c || dVar == tsr.d.d) {
            if (this.p.Q) {
                g(true);
            } else {
                f(true);
            }
        }
        if (dVar == tsr.d.d) {
            blt bltVar = this.q;
            if (bltVar == null || !bltVar.K) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        blt bltVar = this.q;
        if (bltVar != null) {
            tsr.d dVar = tsr.d.b;
            ysr ysrVar = bltVar.f;
            ysrVar.d = dVar;
            tsr tsrVar = ysrVar.a;
            ysrVar.e = false;
            ghz snapshotObserver = xsr.a(tsrVar).getSnapshotObserver();
            elt eltVar = new elt(bltVar, j);
            snapshotObserver.getClass();
            if (tsrVar.v != null) {
                snapshotObserver.a(tsrVar, snapshotObserver.b, eltVar);
            } else {
                snapshotObserver.a(tsrVar, snapshotObserver.c, eltVar);
            }
            ysrVar.f = true;
            ysrVar.g = true;
            boolean zA = zsr.a(tsrVar);
            zhv zhvVar = ysrVar.p;
            if (zA) {
                zhvVar.L = true;
                zhvVar.M = true;
            } else {
                zhvVar.K = true;
            }
            ysrVar.d = tsr.d.e;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            tsr tsrVarH = this.a.H();
            ysr ysrVar = tsrVarH != null ? tsrVarH.V : null;
            if (ysrVar != null) {
                int i3 = ysrVar.l;
                if (i == 0) {
                    ysrVar.d(i3 - 1);
                } else {
                    ysrVar.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            tsr tsrVarH = this.a.H();
            ysr ysrVar = tsrVarH != null ? tsrVarH.V : null;
            if (ysrVar != null) {
                int i3 = ysrVar.o;
                if (i == 0) {
                    ysrVar.e(i3 - 1);
                } else {
                    ysrVar.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        zhv zhvVar = this.p;
        ysr ysrVar = zhvVar.f;
        Object obj = zhvVar.H;
        tsr tsrVar = this.a;
        if ((obj != null || ysrVar.a().g() != null) && zhvVar.G) {
            zhvVar.G = false;
            zhvVar.H = ysrVar.a().g();
            tsr tsrVarH = tsrVar.H();
            if (tsrVarH != null) {
                tsr.h0(tsrVarH, false, 7);
            }
        }
        blt bltVar = this.q;
        if (bltVar != null) {
            ysr ysrVar2 = bltVar.f;
            if (bltVar.M == null) {
                ykt yktVarX1 = ysrVar2.a().x1();
                yktVarX1.getClass();
                if (yktVarX1.E.g() == null) {
                    return;
                }
            }
            if (bltVar.L) {
                bltVar.L = false;
                ykt yktVarX2 = ysrVar2.a().x1();
                yktVarX2.getClass();
                bltVar.M = yktVarX2.E.g();
                if (zsr.a(tsrVar)) {
                    tsr tsrVarH2 = tsrVar.H();
                    if (tsrVarH2 != null) {
                        tsr.h0(tsrVarH2, false, 7);
                        return;
                    }
                    return;
                }
                tsr tsrVarH3 = tsrVar.H();
                if (tsrVarH3 != null) {
                    tsr.f0(tsrVarH3, false, 7);
                }
            }
        }
    }
}
