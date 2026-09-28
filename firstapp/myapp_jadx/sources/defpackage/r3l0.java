package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class r3l0 extends thl0 implements nkl0 {
    private static final r3l0 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        r3l0 r3l0Var = new r3l0();
        zzf = r3l0Var;
        thl0.n(r3l0.class, r3l0Var);
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new r3l0();
        }
        if (i2 == 4) {
            return new p3l0(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String q() {
        return this.zzd;
    }
}
