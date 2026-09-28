package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class t8l0 extends thl0 implements nkl0 {
    private static final t8l0 zzf;
    private int zzb;
    private int zzd = 1;
    private iil0 zze = ell0.e;

    static {
        t8l0 t8l0Var = new t8l0();
        zzf = t8l0Var;
        thl0.n(t8l0.class, t8l0Var);
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zzd", r8l0.a, "zze", h7l0.class});
        }
        if (i2 == 3) {
            return new t8l0();
        }
        if (i2 == 4) {
            return new p8l0(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
