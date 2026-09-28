package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class e4l0 extends thl0 implements nkl0 {
    private static final e4l0 zzh;
    private int zzb;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        e4l0 e4l0Var = new e4l0();
        zzh = e4l0Var;
        thl0.n(e4l0.class, e4l0Var);
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new e4l0();
        }
        if (i2 == 4) {
            return new c4l0(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final String q() {
        return this.zzd;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final boolean s() {
        return this.zze;
    }

    public final boolean t() {
        return (this.zzb & 4) != 0;
    }

    public final boolean u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final int w() {
        return this.zzg;
    }

    public final /* synthetic */ void x(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
