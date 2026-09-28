package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class s2l0 extends thl0 implements nkl0 {
    private static final s2l0 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        s2l0 s2l0Var = new s2l0();
        zzf = s2l0Var;
        thl0.n(s2l0.class, s2l0Var);
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            x2l0 x2l0Var = x2l0.a;
            return new gll0(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", x2l0Var, "zze", x2l0Var});
        }
        if (i2 == 3) {
            return new s2l0();
        }
        if (i2 == 4) {
            return new q2l0(zzf);
        }
        if (i2 == 5) {
            return zzf;
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
        int iA = n3l0.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
