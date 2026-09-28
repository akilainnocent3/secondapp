package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class a4l0 extends thl0 implements nkl0 {
    private static final a4l0 zzg;
    private int zzb;
    private String zzd = "";
    private iil0 zze = ell0.e;
    private boolean zzf;

    static {
        a4l0 a4l0Var = new a4l0();
        zzg = a4l0Var;
        thl0.n(a4l0.class, a4l0Var);
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", t4l0.class, "zzf"});
        }
        if (i2 == 3) {
            return new a4l0();
        }
        if (i2 == 4) {
            return new y3l0(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final String q() {
        return this.zzd;
    }
}
