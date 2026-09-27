package com.google.android.gms.internal.cast;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqp extends zztp implements zzuy {
    private static final zzqp zzb;
    private int zzd;
    private String zze = "";

    static {
        zzqp zzqpVar = new zzqp();
        zzb = zzqpVar;
        zztp.zzH(zzqp.class, zzqpVar);
    }

    private zzqp() {
    }

    @Override // com.google.android.gms.internal.cast.zztp
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zztp.zzE(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzqp();
        }
        zzms zzmsVar = null;
        if (i11 == 4) {
            return new zzqo(zzmsVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
