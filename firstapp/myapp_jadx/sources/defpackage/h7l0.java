package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class h7l0 extends thl0 implements nkl0 {
    private static final h7l0 zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    static {
        h7l0 h7l0Var = new h7l0();
        zzf = h7l0Var;
        thl0.n(h7l0.class, h7l0Var);
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new h7l0();
        }
        if (i2 == 4) {
            return new f7l0(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
