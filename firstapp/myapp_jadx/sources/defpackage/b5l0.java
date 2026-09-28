package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class b5l0 extends thl0 implements nkl0 {
    private static final b5l0 zzi;
    private int zzb;
    private int zzg;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        b5l0 b5l0Var = new b5l0();
        zzi = b5l0Var;
        thl0.n(b5l0.class, b5l0Var);
    }

    public static b5l0 s() {
        return zzi;
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new b5l0();
        }
        if (i2 == 4) {
            return new z4l0(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final int q() {
        return this.zzg;
    }

    public final String r() {
        return this.zzh;
    }
}
