package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class o9l0 extends thl0 implements nkl0 {
    private static final o9l0 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        o9l0 o9l0Var = new o9l0();
        zzg = o9l0Var;
        thl0.n(o9l0.class, o9l0Var);
    }

    public static d9l0 r() {
        return (d9l0) zzg.j();
    }

    public static o9l0 s() {
        return zzg;
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", l9l0.a, "zze", f9l0.a, "zzf", i9l0.a});
        }
        if (i2 == 3) {
            return new o9l0();
        }
        if (i2 == 4) {
            return new d9l0(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int q() {
        int iA = fl40.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final void t(int i) {
        this.zze = fl40.b(i);
        this.zzb |= 2;
    }

    public final int u() {
        int i;
        int i2 = this.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0017 A[PHI: r2
      0x0017: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    public final int v() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                int i3 = 3;
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i3 = 5;
                        if (i2 != 4) {
                            i = i2 != 5 ? 0 : 6;
                        } else {
                            i = i3;
                        }
                    }
                } else {
                    i = i3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void w(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void x(int i) {
        this.zzf = i - 1;
        this.zzb |= 4;
    }
}
