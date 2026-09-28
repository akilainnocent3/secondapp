package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;

/* JADX INFO: loaded from: classes4.dex */
public final class p4l0 extends thl0 implements nkl0 {
    private static final p4l0 zzi;
    private int zzb;
    private int zzd = 14;
    private int zze = 11;
    private int zzf = 60;
    private int zzg = 13;
    private int zzh = 11;

    static {
        p4l0 p4l0Var = new p4l0();
        zzi = p4l0Var;
        thl0.n(p4l0.class, p4l0Var);
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{UccrWswQGaIj.tAuXN, "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new p4l0();
        }
        if (i2 == 4) {
            return new n4l0(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
