package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class j8l0 extends thl0 implements nkl0 {
    private static final j8l0 zzh;
    private int zzb;
    private iil0 zzd = ell0.e;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        j8l0 j8l0Var = new j8l0();
        zzh = j8l0Var;
        thl0.n(j8l0.class, j8l0Var);
    }

    public static q7l0 x() {
        return (q7l0) zzh.j();
    }

    public static q7l0 y(j8l0 j8l0Var) {
        lhl0 lhl0VarJ = zzh.j();
        lhl0VarJ.j(j8l0Var);
        return (q7l0) lhl0VarJ;
    }

    public final /* synthetic */ void A(n8l0 n8l0Var) {
        F();
        this.zzd.add(n8l0Var);
    }

    public final void B(ArrayList arrayList) {
        F();
        zdl0.f(arrayList, this.zzd);
    }

    public final void C() {
        this.zzd = ell0.e;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void F() {
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
            return new gll0(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", n8l0.class, "zze", "zzf", "zzg", h8l0.a});
        }
        if (i2 == 3) {
            return new j8l0();
        }
        if (i2 == 4) {
            return new q7l0(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final List q() {
        return this.zzd;
    }

    public final int r() {
        return this.zzd.size();
    }

    public final n8l0 s(int i) {
        return (n8l0) this.zzd.get(i);
    }

    public final boolean t() {
        return (this.zzb & 1) != 0;
    }

    public final String u() {
        return this.zze;
    }

    public final boolean v() {
        return (this.zzb & 2) != 0;
    }

    public final String w() {
        return this.zzf;
    }

    public final /* synthetic */ void z(int i, n8l0 n8l0Var) {
        F();
        this.zzd.set(i, n8l0Var);
    }
}
