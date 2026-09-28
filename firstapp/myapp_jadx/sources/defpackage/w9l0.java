package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w9l0 extends thl0 implements nkl0 {
    private static final w9l0 zzd;
    private iil0 zzb = ell0.e;

    static {
        w9l0 w9l0Var = new w9l0();
        zzd = w9l0Var;
        thl0.n(w9l0.class, w9l0Var);
    }

    public static w9l0 s() {
        return zzd;
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", aal0.class});
        }
        if (i2 == 3) {
            return new w9l0();
        }
        if (i2 == 4) {
            return new u9l0(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List q() {
        return this.zzb;
    }

    public final int r() {
        return this.zzb.size();
    }
}
