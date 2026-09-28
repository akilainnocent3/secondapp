package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class i4l0 extends thl0 implements nkl0 {
    private static final i4l0 zzu;
    private int zzb;
    private long zzd;
    private String zze = "";
    private int zzf;
    private iil0 zzg;
    private iil0 zzh;
    private iil0 zzi;
    private String zzj;
    private boolean zzk;
    private iil0 zzl;
    private iil0 zzm;
    private String zzn;
    private String zzo;
    private w3l0 zzp;
    private p4l0 zzq;
    private b5l0 zzr;
    private t4l0 zzs;
    private l4l0 zzt;

    static {
        i4l0 i4l0Var = new i4l0();
        zzu = i4l0Var;
        thl0.n(i4l0.class, i4l0Var);
    }

    public i4l0() {
        ell0 ell0Var = ell0.e;
        this.zzg = ell0Var;
        this.zzh = ell0Var;
        this.zzi = ell0Var;
        this.zzj = "";
        this.zzl = ell0Var;
        this.zzm = ell0Var;
        this.zzn = "";
        this.zzo = "";
    }

    public static g4l0 G() {
        return (g4l0) zzu.j();
    }

    public static i4l0 H() {
        return zzu;
    }

    public final List A() {
        return this.zzm;
    }

    public final String B() {
        return this.zzn;
    }

    public final boolean C() {
        return (this.zzb & 128) != 0;
    }

    public final w3l0 D() {
        w3l0 w3l0Var = this.zzp;
        return w3l0Var == null ? w3l0.w() : w3l0Var;
    }

    public final boolean E() {
        return (this.zzb & 512) != 0;
    }

    public final b5l0 F() {
        b5l0 b5l0Var = this.zzr;
        return b5l0Var == null ? b5l0.s() : b5l0Var;
    }

    public final void I(int i, e4l0 e4l0Var) {
        iil0 iil0Var = this.zzh;
        if (!iil0Var.zza()) {
            int size = iil0Var.size();
            this.zzh = iil0Var.zzg(size + size);
        }
        this.zzh.set(i, e4l0Var);
    }

    public final void J() {
        this.zzi = ell0.e;
    }

    public final void K() {
        this.zzl = ell0.e;
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", x4l0.class, "zzh", e4l0.class, "zzi", u1l0.class, "zzj", "zzk", "zzl", pal0.class, "zzm", a4l0.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i2 == 3) {
            return new i4l0();
        }
        if (i2 == 4) {
            return new g4l0(zzu);
        }
        if (i2 == 5) {
            return zzu;
        }
        throw null;
    }

    public final boolean q() {
        return (this.zzb & 1) != 0;
    }

    public final long r() {
        return this.zzd;
    }

    public final boolean s() {
        return (this.zzb & 2) != 0;
    }

    public final String t() {
        return this.zze;
    }

    public final iil0 u() {
        return this.zzg;
    }

    public final int v() {
        return this.zzh.size();
    }

    public final e4l0 w(int i) {
        return (e4l0) this.zzh.get(i);
    }

    public final iil0 x() {
        return this.zzi;
    }

    public final iil0 y() {
        return this.zzl;
    }

    public final int z() {
        return this.zzl.size();
    }
}
