package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class v6l0 extends thl0 implements nkl0 {
    private static final v6l0 zzd;
    private iil0 zzb = ell0.e;

    static {
        v6l0 v6l0Var = new v6l0();
        zzd = v6l0Var;
        thl0.n(v6l0.class, v6l0Var);
    }

    public static k6l0 r() {
        return (k6l0) zzd.j();
    }

    public static v6l0 s() {
        return zzd;
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", q6l0.class});
        }
        if (i2 == 3) {
            return new v6l0();
        }
        if (i2 == 4) {
            return new k6l0(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List q() {
        return this.zzb;
    }

    public final void t(ArrayList arrayList) {
        iil0 iil0Var = this.zzb;
        if (!iil0Var.zza()) {
            int size = iil0Var.size();
            this.zzb = iil0Var.zzg(size + size);
        }
        zdl0.f(arrayList, this.zzb);
    }
}
