package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class e6l0 extends thl0 implements nkl0 {
    private static final e6l0 zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        e6l0 e6l0Var = new e6l0();
        zzk = e6l0Var;
        thl0.n(e6l0.class, e6l0Var);
    }

    public static c6l0 x() {
        return (c6l0) zzk.j();
    }

    public static e6l0 y() {
        return zzk;
    }

    public final /* synthetic */ void A(boolean z) {
        this.zzb |= 2;
        this.zze = z;
    }

    public final /* synthetic */ void B(boolean z) {
        this.zzb |= 4;
        this.zzf = z;
    }

    public final /* synthetic */ void C(boolean z) {
        this.zzb |= 8;
        this.zzg = z;
    }

    public final /* synthetic */ void D(boolean z) {
        this.zzb |= 16;
        this.zzh = z;
    }

    public final /* synthetic */ void E(boolean z) {
        this.zzb |= 32;
        this.zzi = z;
    }

    public final /* synthetic */ void F(boolean z) {
        this.zzb |= 64;
        this.zzj = z;
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new e6l0();
        }
        if (i2 == 4) {
            return new c6l0(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }

    public final boolean q() {
        return this.zzd;
    }

    public final boolean r() {
        return this.zze;
    }

    public final boolean s() {
        return this.zzf;
    }

    public final boolean t() {
        return this.zzg;
    }

    public final boolean u() {
        return this.zzh;
    }

    public final boolean v() {
        return this.zzi;
    }

    public final boolean w() {
        return this.zzj;
    }

    public final /* synthetic */ void z(boolean z) {
        this.zzb |= 1;
        this.zzd = z;
    }
}
