package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class z1l0 extends thl0 implements nkl0 {
    private static final z1l0 zzh;
    private int zzb;
    private k2l0 zzd;
    private d2l0 zze;
    private boolean zzf;
    private String zzg = "";

    static {
        z1l0 z1l0Var = new z1l0();
        zzh = z1l0Var;
        thl0.n(z1l0.class, z1l0Var);
    }

    public static z1l0 y() {
        return zzh;
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new z1l0();
        }
        if (i2 == 4) {
            return new x1l0(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean q() {
        return (this.zzb & 1) != 0;
    }

    public final k2l0 r() {
        k2l0 k2l0Var = this.zzd;
        return k2l0Var == null ? k2l0.x() : k2l0Var;
    }

    public final boolean s() {
        return (this.zzb & 2) != 0;
    }

    public final d2l0 t() {
        d2l0 d2l0Var = this.zze;
        return d2l0Var == null ? d2l0.z() : d2l0Var;
    }

    public final boolean u() {
        return (this.zzb & 4) != 0;
    }

    public final boolean v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zzb & 8) != 0;
    }

    public final String x() {
        return this.zzg;
    }

    public final /* synthetic */ void z(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
