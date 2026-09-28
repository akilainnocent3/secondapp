package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class aal0 extends thl0 implements nkl0 {
    private static final aal0 zzf;
    private int zzb;
    private String zzd = "";
    private iil0 zze = ell0.e;

    static {
        aal0 aal0Var = new aal0();
        zzf = aal0Var;
        thl0.n(aal0.class, aal0Var);
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", wal0.class});
        }
        if (i2 == 3) {
            return new aal0();
        }
        if (i2 == 4) {
            return new y9l0(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String q() {
        return this.zzd;
    }

    public final List r() {
        return this.zze;
    }
}
