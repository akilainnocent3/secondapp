package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w3l0 extends thl0 implements nkl0 {
    private static final w3l0 zzi;
    private int zzb;
    private iil0 zzd;
    private iil0 zze;
    private iil0 zzf;
    private boolean zzg;
    private iil0 zzh;

    static {
        w3l0 w3l0Var = new w3l0();
        zzi = w3l0Var;
        thl0.n(w3l0.class, w3l0Var);
    }

    public w3l0() {
        ell0 ell0Var = ell0.e;
        this.zzd = ell0Var;
        this.zze = ell0Var;
        this.zzf = ell0Var;
        this.zzh = ell0Var;
    }

    public static w3l0 w() {
        return zzi;
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", o2l0.class, "zze", s2l0.class, "zzf", r3l0.class, "zzg", "zzh", o2l0.class});
        }
        if (i2 == 3) {
            return new w3l0();
        }
        if (i2 == 4) {
            return new l2l0(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final List q() {
        return this.zzd;
    }

    public final List r() {
        return this.zze;
    }

    public final List s() {
        return this.zzf;
    }

    public final boolean t() {
        return (this.zzb & 1) != 0;
    }

    public final boolean u() {
        return this.zzg;
    }

    public final iil0 v() {
        return this.zzh;
    }
}
