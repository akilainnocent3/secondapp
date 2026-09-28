package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k7l0 extends thl0 implements nkl0 {
    private static final k7l0 zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private iil0 zzi = ell0.e;

    static {
        k7l0 k7l0Var = new k7l0();
        zzj = k7l0Var;
        thl0.n(k7l0.class, k7l0Var);
    }

    public static i7l0 C() {
        return (i7l0) zzj.j();
    }

    public final List A() {
        return this.zzi;
    }

    public final int B() {
        return this.zzi.size();
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void F() {
        this.zzb &= -3;
        this.zze = zzj.zze;
    }

    public final /* synthetic */ void G(long j) {
        this.zzb |= 4;
        this.zzf = j;
    }

    public final /* synthetic */ void H() {
        this.zzb &= -5;
        this.zzf = 0L;
    }

    public final /* synthetic */ void I(double d) {
        this.zzb |= 16;
        this.zzh = d;
    }

    public final /* synthetic */ void J() {
        this.zzb &= -17;
        this.zzh = 0.0d;
    }

    public final void K(k7l0 k7l0Var) {
        iil0 iil0Var = this.zzi;
        if (!iil0Var.zza()) {
            int size = iil0Var.size();
            this.zzi = iil0Var.zzg(size + size);
        }
        this.zzi.add(k7l0Var);
    }

    public final void L(ArrayList arrayList) {
        iil0 iil0Var = this.zzi;
        if (!iil0Var.zza()) {
            int size = iil0Var.size();
            this.zzi = iil0Var.zzg(size + size);
        }
        zdl0.f(arrayList, this.zzi);
    }

    public final void M() {
        this.zzi = ell0.e;
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", k7l0.class});
        }
        if (i2 == 3) {
            return new k7l0();
        }
        if (i2 == 4) {
            return new i7l0(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean q() {
        return (this.zzb & 1) != 0;
    }

    public final String r() {
        return this.zzd;
    }

    public final boolean s() {
        return (this.zzb & 2) != 0;
    }

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zzb & 4) != 0;
    }

    public final long v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zzb & 8) != 0;
    }

    public final float x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zzb & 16) != 0;
    }

    public final double z() {
        return this.zzh;
    }
}
