package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u1l0 extends thl0 implements nkl0 {
    private static final u1l0 zzi;
    private int zzb;
    private int zzd;
    private iil0 zze;
    private iil0 zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        u1l0 u1l0Var = new u1l0();
        zzi = u1l0Var;
        thl0.n(u1l0.class, u1l0Var);
    }

    public u1l0() {
        ell0 ell0Var = ell0.e;
        this.zze = ell0Var;
        this.zzf = ell0Var;
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", g2l0.class, "zzf", w1l0.class, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new u1l0();
        }
        if (i2 == 4) {
            return new t1l0(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean q() {
        return (this.zzb & 1) != 0;
    }

    public final int r() {
        return this.zzd;
    }

    public final List s() {
        return this.zze;
    }

    public final int t() {
        return this.zze.size();
    }

    public final g2l0 u(int i) {
        return (g2l0) this.zze.get(i);
    }

    public final iil0 v() {
        return this.zzf;
    }

    public final int w() {
        return this.zzf.size();
    }

    public final w1l0 x(int i) {
        return (w1l0) this.zzf.get(i);
    }

    public final void y(int i, g2l0 g2l0Var) {
        iil0 iil0Var = this.zze;
        if (!iil0Var.zza()) {
            int size = iil0Var.size();
            this.zze = iil0Var.zzg(size + size);
        }
        this.zze.set(i, g2l0Var);
    }

    public final void z(int i, w1l0 w1l0Var) {
        iil0 iil0Var = this.zzf;
        if (!iil0Var.zza()) {
            int size = iil0Var.size();
            this.zzf = iil0Var.zzg(size + size);
        }
        this.zzf.set(i, w1l0Var);
    }
}
