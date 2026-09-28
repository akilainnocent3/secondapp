package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class q6l0 extends thl0 implements nkl0 {
    private static final q6l0 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        q6l0 q6l0Var = new q6l0();
        zzf = q6l0Var;
        thl0.n(q6l0.class, q6l0Var);
    }

    public static p6l0 q() {
        return (p6l0) zzf.j();
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", m6l0.a, "zze", s6l0.a});
        }
        if (i2 == 3) {
            return new q6l0();
        }
        if (i2 == 4) {
            return new p6l0(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int r() {
        int i;
        int i2 = this.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int s() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void t(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void u(int i) {
        this.zze = i - 1;
        this.zzb |= 2;
    }
}
