package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class pal0 extends thl0 implements nkl0 {
    private static final pal0 zzf;
    private int zzb;
    private iil0 zzd = ell0.e;
    private w9l0 zze;

    static {
        pal0 pal0Var = new pal0();
        zzf = pal0Var;
        thl0.n(pal0.class, pal0Var);
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", wal0.class, "zze"});
        }
        if (i2 == 3) {
            return new pal0();
        }
        if (i2 == 4) {
            return new cal0(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final List q() {
        return this.zzd;
    }

    public final w9l0 r() {
        w9l0 w9l0Var = this.zze;
        return w9l0Var == null ? w9l0.s() : w9l0Var;
    }
}
