package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class z6l0 extends thl0 implements nkl0 {
    private static final z6l0 zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static {
        z6l0 z6l0Var = new z6l0();
        zzf = z6l0Var;
        thl0.n(z6l0.class, z6l0Var);
    }

    public static x6l0 u() {
        return (x6l0) zzf.j();
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new z6l0();
        }
        if (i2 == 4) {
            return new x6l0(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean q() {
        return (this.zzb & 1) != 0;
    }

    public final int r() {
        return this.zzd;
    }

    public final boolean s() {
        return (this.zzb & 2) != 0;
    }

    public final long t() {
        return this.zze;
    }

    public final /* synthetic */ void v(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final /* synthetic */ void w(long j) {
        this.zzb |= 2;
        this.zze = j;
    }
}
