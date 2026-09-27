package com.google.android.gms.internal.cast;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzog extends zztp implements zzuy {
    private static final zzog zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private long zzg;

    static {
        zzog zzogVar = new zzog();
        zzb = zzogVar;
        zztp.zzH(zzog.class, zzogVar);
    }

    private zzog() {
    }

    @Override // com.google.android.gms.internal.cast.zztp
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zztp.zzE(zzb, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001စ\u0000\u0002:\u0000\u00035\u0000\u00048\u0000", new Object[]{"zzf", "zze", "zzd", "zzg"});
        }
        if (i11 == 3) {
            return new zzog();
        }
        zzms zzmsVar = null;
        if (i11 == 4) {
            return new zzof(zzmsVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
