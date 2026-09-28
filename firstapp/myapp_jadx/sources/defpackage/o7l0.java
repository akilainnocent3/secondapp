package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class o7l0 extends thl0 implements nkl0 {
    private static final o7l0 zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private a6l0 zzf;

    static {
        o7l0 o7l0Var = new o7l0();
        zzg = o7l0Var;
        thl0.n(o7l0.class, o7l0Var);
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new o7l0();
        }
        if (i2 == 4) {
            return new m7l0(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
