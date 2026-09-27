package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzln extends zzhk implements zzin {
    private static final zzln zzb;
    private int zzd;
    private int zzf;
    private zzho zze = zzhk.zzs();
    private String zzg = "";

    static {
        zzln zzlnVar = new zzln();
        zzb = zzlnVar;
        zzhk.zzx(zzln.class, zzlnVar);
    }

    private zzln() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzln();
        }
        zzlm zzlmVar = null;
        if (i11 == 4) {
            return new zzll(zzlmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
