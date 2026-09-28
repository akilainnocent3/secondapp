package defpackage;

import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w1l0 extends thl0 implements nkl0 {
    private static final w1l0 zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private iil0 zzf = ell0.e;
    private boolean zzg;
    private d2l0 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        w1l0 w1l0Var = new w1l0();
        zzl = w1l0Var;
        thl0.n(w1l0.class, w1l0Var);
    }

    public static v1l0 C() {
        return (v1l0) zzl.j();
    }

    public final boolean A() {
        return (this.zzb & 64) != 0;
    }

    public final boolean B() {
        return this.zzk;
    }

    public final /* synthetic */ void D(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final void E(int i, z1l0 z1l0Var) {
        iil0 iil0Var = this.zzf;
        if (!iil0Var.zza()) {
            int size = iil0Var.size();
            this.zzf = iil0Var.zzg(size + size);
        }
        this.zzf.set(i, z1l0Var);
    }

    public final boolean q() {
        return (this.zzb & 1) != 0;
    }

    public final int r() {
        return this.zzd;
    }

    public final String s() {
        return this.zze;
    }

    public final List t() {
        return this.zzf;
    }

    public final int u() {
        return this.zzf.size();
    }

    public final z1l0 v(int i) {
        return (z1l0) this.zzf.get(i);
    }

    public final boolean w() {
        return (this.zzb & 8) != 0;
    }

    public final d2l0 x() {
        d2l0 d2l0Var = this.zzh;
        return d2l0Var == null ? d2l0.z() : d2l0Var;
    }

    public final boolean y() {
        return this.zzi;
    }

    public final boolean z() {
        return this.zzj;
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", z1l0.class, "zzg", "zzh", gvQvkPPtA.SBRYQeyGAHJXt, "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new w1l0();
        }
        if (i2 == 4) {
            return new v1l0(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        throw null;
    }
}
