package defpackage;

import androidx.window.layout.oKr.TEFcJcMqR;

/* JADX INFO: loaded from: classes4.dex */
public final class g2l0 extends thl0 implements nkl0 {
    private static final g2l0 zzj;
    private int zzb;
    private int zzd;
    private String zze = "";
    private z1l0 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        g2l0 g2l0Var = new g2l0();
        zzj = g2l0Var;
        thl0.n(g2l0.class, g2l0Var);
    }

    public static f2l0 y() {
        return (f2l0) zzj.j();
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

    public final z1l0 t() {
        z1l0 z1l0Var = this.zzf;
        return z1l0Var == null ? z1l0.y() : z1l0Var;
    }

    public final boolean u() {
        return this.zzg;
    }

    public final boolean v() {
        return this.zzh;
    }

    public final boolean w() {
        return (this.zzb & 32) != 0;
    }

    public final boolean x() {
        return this.zzi;
    }

    public final /* synthetic */ void z(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", TEFcJcMqR.vTJDFQXvcXhyi, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new g2l0();
        }
        if (i2 == 4) {
            return new f2l0(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }
}
