package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class i6l0 extends thl0 implements nkl0 {
    private static final i6l0 zzh;
    private int zzb;
    private int zzd;
    private x8l0 zze;
    private x8l0 zzf;
    private boolean zzg;

    static {
        i6l0 i6l0Var = new i6l0();
        zzh = i6l0Var;
        thl0.n(i6l0.class, i6l0Var);
    }

    public static g6l0 x() {
        return (g6l0) zzh.j();
    }

    public final /* synthetic */ void A(x8l0 x8l0Var) {
        this.zzf = x8l0Var;
        this.zzb |= 4;
    }

    public final /* synthetic */ void B(boolean z) {
        this.zzb |= 8;
        this.zzg = z;
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new i6l0();
        }
        if (i2 == 4) {
            return new g6l0(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean q() {
        return (this.zzb & 1) != 0;
    }

    public final int r() {
        return this.zzd;
    }

    public final x8l0 s() {
        x8l0 x8l0Var = this.zze;
        return x8l0Var == null ? x8l0.z() : x8l0Var;
    }

    public final boolean t() {
        return (this.zzb & 4) != 0;
    }

    public final x8l0 u() {
        x8l0 x8l0Var = this.zzf;
        return x8l0Var == null ? x8l0.z() : x8l0Var;
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final boolean w() {
        return this.zzg;
    }

    public final /* synthetic */ void y(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final /* synthetic */ void z(x8l0 x8l0Var) {
        this.zze = x8l0Var;
        this.zzb |= 2;
    }
}
