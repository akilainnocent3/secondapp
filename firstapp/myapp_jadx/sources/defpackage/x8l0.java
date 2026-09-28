package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class x8l0 extends thl0 implements nkl0 {
    private static final x8l0 zzg;
    private gil0 zzb;
    private gil0 zzd;
    private iil0 zze;
    private iil0 zzf;

    static {
        x8l0 x8l0Var = new x8l0();
        zzg = x8l0Var;
        thl0.n(x8l0.class, x8l0Var);
    }

    public x8l0() {
        njl0 njl0Var = njl0.e;
        this.zzb = njl0Var;
        this.zzd = njl0Var;
        ell0 ell0Var = ell0.e;
        this.zze = ell0Var;
        this.zzf = ell0Var;
    }

    public static v8l0 y() {
        return (v8l0) zzg.j();
    }

    public static x8l0 z() {
        return zzg;
    }

    public final void A(Iterable iterable) {
        List list = this.zzb;
        boolean z = ((fel0) list).a;
        List list2 = list;
        if (!z) {
            njl0 njl0Var = (njl0) list;
            int i = njl0Var.c;
            njl0 njl0VarZzg = njl0Var.zzg(i + i);
            this.zzb = njl0VarZzg;
            list2 = njl0VarZzg;
        }
        zdl0.f(iterable, list2);
    }

    public final void B() {
        this.zzb = njl0.e;
    }

    public final void C(List list) {
        List list2 = this.zzd;
        boolean z = ((fel0) list2).a;
        List list3 = list2;
        if (!z) {
            njl0 njl0Var = (njl0) list2;
            int i = njl0Var.c;
            njl0 njl0VarZzg = njl0Var.zzg(i + i);
            this.zzd = njl0VarZzg;
            list3 = njl0VarZzg;
        }
        zdl0.f(list, list3);
    }

    public final void D() {
        this.zzd = njl0.e;
    }

    public final void E(ArrayList arrayList) {
        iil0 iil0Var = this.zze;
        if (!iil0Var.zza()) {
            int size = iil0Var.size();
            this.zze = iil0Var.zzg(size + size);
        }
        zdl0.f(arrayList, this.zze);
    }

    public final void F() {
        this.zze = ell0.e;
    }

    public final void G(Iterable iterable) {
        iil0 iil0Var = this.zzf;
        if (!iil0Var.zza()) {
            int size = iil0Var.size();
            this.zzf = iil0Var.zzg(size + size);
        }
        zdl0.f(iterable, this.zzf);
    }

    public final void H() {
        this.zzf = ell0.e;
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", z6l0.class, "zzf", b9l0.class});
        }
        if (i2 == 3) {
            return new x8l0();
        }
        if (i2 == 4) {
            return new v8l0(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List q() {
        return this.zzb;
    }

    public final int r() {
        return ((njl0) this.zzb).size();
    }

    public final List s() {
        return this.zzd;
    }

    public final int t() {
        return ((njl0) this.zzd).size();
    }

    public final iil0 u() {
        return this.zze;
    }

    public final int v() {
        return this.zze.size();
    }

    public final List w() {
        return this.zzf;
    }

    public final int x() {
        return this.zzf.size();
    }
}
