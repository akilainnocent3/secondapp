package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class w5l0 extends thl0 implements nkl0 {
    private static final w5l0 zzn;
    private int zzb;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private long zzk;
    private zjl0 zzl;
    private zjl0 zzm;

    static {
        w5l0 w5l0Var = new w5l0();
        zzn = w5l0Var;
        thl0.n(w5l0.class, w5l0Var);
    }

    public w5l0() {
        zjl0 zjl0Var = zjl0.b;
        this.zzl = zjl0Var;
        this.zzm = zjl0Var;
        this.zzd = "";
        this.zze = "";
        this.zzf = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
    }

    public static f5l0 P() {
        return (f5l0) zzn.j();
    }

    public static w5l0 Q() {
        return zzn;
    }

    public final String A() {
        return this.zzd;
    }

    public final boolean B() {
        return (this.zzb & 2) != 0;
    }

    public final String C() {
        return this.zze;
    }

    public final boolean D() {
        return (this.zzb & 4) != 0;
    }

    public final String E() {
        return this.zzf;
    }

    public final boolean F() {
        return (this.zzb & 8) != 0;
    }

    public final long G() {
        return this.zzg;
    }

    public final boolean H() {
        return (this.zzb & 16) != 0;
    }

    public final String I() {
        return this.zzh;
    }

    public final boolean J() {
        return (this.zzb & 32) != 0;
    }

    public final String K() {
        return this.zzi;
    }

    public final boolean L() {
        return (this.zzb & 64) != 0;
    }

    public final String M() {
        return this.zzj;
    }

    public final boolean N() {
        return (this.zzb & 128) != 0;
    }

    public final long O() {
        return this.zzk;
    }

    public final /* synthetic */ void R(String str) {
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void S() {
        this.zzb &= -2;
        this.zzd = zzn.zzd;
    }

    public final /* synthetic */ void T(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void U() {
        this.zzb &= -3;
        this.zze = zzn.zze;
    }

    public final /* synthetic */ void V(String str) {
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void W() {
        this.zzb &= -5;
        this.zzf = zzn.zzf;
    }

    public final /* synthetic */ void X(long j) {
        this.zzb |= 8;
        this.zzg = j;
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", h5l0.a, "zzm", j5l0.a});
        }
        if (i2 == 3) {
            return new w5l0();
        }
        if (i2 == 4) {
            return new f5l0(zzn);
        }
        if (i2 == 5) {
            return zzn;
        }
        throw null;
    }

    public final /* synthetic */ void q(String str) {
        this.zzb |= 16;
        this.zzh = str;
    }

    public final /* synthetic */ void r() {
        this.zzb &= -17;
        this.zzh = zzn.zzh;
    }

    public final /* synthetic */ void s(String str) {
        this.zzb |= 32;
        this.zzi = str;
    }

    public final /* synthetic */ void t() {
        this.zzb &= -33;
        this.zzi = zzn.zzi;
    }

    public final /* synthetic */ void u(String str) {
        this.zzb |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void v() {
        this.zzb &= -65;
        this.zzj = zzn.zzj;
    }

    public final /* synthetic */ void w(long j) {
        this.zzb |= 128;
        this.zzk = j;
    }

    public final zjl0 x() {
        zjl0 zjl0Var = this.zzl;
        if (zjl0Var.a) {
            return zjl0Var;
        }
        zjl0 zjl0VarB = zjl0Var.b();
        this.zzl = zjl0VarB;
        return zjl0VarB;
    }

    public final zjl0 y() {
        zjl0 zjl0Var = this.zzm;
        if (zjl0Var.a) {
            return zjl0Var;
        }
        zjl0 zjl0VarB = zjl0Var.b();
        this.zzm = zjl0VarB;
        return zjl0VarB;
    }

    public final boolean z() {
        return (this.zzb & 1) != 0;
    }
}
