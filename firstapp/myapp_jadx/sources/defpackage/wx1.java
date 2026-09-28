package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wx1 extends wil {
    public rwd0.c n0;
    public int o0;
    public vx1 p0;

    public wx1(rwd0 rwd0Var) {
        super(rwd0Var, rwd0.d.d);
    }

    @Override // defpackage.wil, defpackage.rwa, defpackage.eq40, defpackage.e6h
    public final void apply() {
        s();
        int iOrdinal = this.n0.ordinal();
        int i = 1;
        if (iOrdinal != 1 && iOrdinal != 3) {
            if (iOrdinal != 4) {
                i = iOrdinal != 5 ? 0 : 3;
            } else {
                i = 2;
            }
        }
        vx1 vx1Var = this.p0;
        vx1Var.x0 = i;
        vx1Var.z0 = this.o0;
    }

    @Override // defpackage.rwa
    public final rwa k(int i) {
        this.o0 = i;
        return this;
    }

    @Override // defpackage.rwa
    public final rwa l(Float f) {
        this.o0 = this.k0.c(f);
        return this;
    }

    @Override // defpackage.wil
    public final yil s() {
        vx1 vx1Var = this.p0;
        if (vx1Var != null) {
            return vx1Var;
        }
        vx1 vx1Var2 = new vx1();
        this.p0 = vx1Var2;
        return vx1Var2;
    }
}
