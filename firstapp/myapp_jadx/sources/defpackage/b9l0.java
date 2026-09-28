package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b9l0 extends thl0 implements nkl0 {
    private static final b9l0 zzf;
    private int zzb;
    private int zzd;
    private gil0 zze = njl0.e;

    static {
        b9l0 b9l0Var = new b9l0();
        zzf = b9l0Var;
        thl0.n(b9l0.class, b9l0Var);
    }

    public static z8l0 v() {
        return (z8l0) zzf.j();
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new b9l0();
        }
        if (i2 == 4) {
            return new z8l0(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean q() {
        return (this.zzb & 1) != 0;
    }

    public final int r() {
        return this.zzd;
    }

    public final List s() {
        return this.zze;
    }

    public final int t() {
        return ((njl0) this.zze).size();
    }

    public final long u(int i) {
        return ((njl0) this.zze).b(i);
    }

    public final /* synthetic */ void w(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final void x(List list) {
        List list2 = this.zze;
        boolean z = ((fel0) list2).a;
        List list3 = list2;
        if (!z) {
            njl0 njl0Var = (njl0) list2;
            int i = njl0Var.c;
            njl0 njl0VarZzg = njl0Var.zzg(i + i);
            this.zze = njl0VarZzg;
            list3 = njl0VarZzg;
        }
        zdl0.f(list, list3);
    }
}
