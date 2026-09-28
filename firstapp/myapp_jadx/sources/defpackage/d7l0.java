package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d7l0 extends thl0 implements nkl0 {
    private static final d7l0 zzj;
    private int zzb;
    private iil0 zzd = ell0.e;
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        d7l0 d7l0Var = new d7l0();
        zzj = d7l0Var;
        thl0.n(d7l0.class, d7l0Var);
    }

    public static b7l0 A() {
        return (b7l0) zzj.j();
    }

    public final /* synthetic */ void B(int i, k7l0 k7l0Var) {
        K();
        this.zzd.set(i, k7l0Var);
    }

    public final /* synthetic */ void C(k7l0 k7l0Var) {
        k7l0Var.getClass();
        K();
        this.zzd.add(k7l0Var);
    }

    public final void D(Iterable iterable) {
        K();
        zdl0.f(iterable, this.zzd);
    }

    public final void E() {
        this.zzd = ell0.e;
    }

    public final /* synthetic */ void F(int i) {
        K();
        this.zzd.remove(i);
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    public final /* synthetic */ void I(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void J(long j) {
        this.zzb |= 16;
        this.zzi = j;
    }

    public final void K() {
        iil0 iil0Var = this.zzd;
        if (iil0Var.zza()) {
            return;
        }
        int size = iil0Var.size();
        this.zzd = iil0Var.zzg(size + size);
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", k7l0.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new d7l0();
        }
        if (i2 == 4) {
            return new b7l0(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List q() {
        return this.zzd;
    }

    public final int r() {
        return this.zzd.size();
    }

    public final k7l0 s(int i) {
        return (k7l0) this.zzd.get(i);
    }

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    public final long v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zzb & 4) != 0;
    }

    public final long x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zzb & 8) != 0;
    }

    public final int z() {
        return this.zzh;
    }
}
