package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class o2l0 extends thl0 implements nkl0 {
    private static final o2l0 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        o2l0 o2l0Var = new o2l0();
        zzg = o2l0Var;
        thl0.n(o2l0.class, o2l0Var);
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", x2l0.a, "zze", u2l0.a, "zzf", t3l0.a});
        }
        if (i2 == 3) {
            return new o2l0();
        }
        if (i2 == 4) {
            return new m2l0(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int q() {
        int iA = n3l0.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int r() {
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

    public final int s() {
        int i;
        int i2 = this.zzf;
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
}
