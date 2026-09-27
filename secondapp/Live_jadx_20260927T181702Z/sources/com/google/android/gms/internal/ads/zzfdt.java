package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfdt implements zzfby {
    public zzfdt(zzceg zzcegVar, zzhbs zzhbsVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final nj.t1 zza() {
        final nj.t1 t1VarZza = zzhbi.zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgO)).booleanValue()) {
            t1VarZza = zzhbi.zza(null);
        }
        final nj.t1 t1VarZza2 = zzhbi.zza(null);
        return zzhbi.zzo(t1VarZza, t1VarZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfds
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfdu((String) t1VarZza.get(), (String) t1VarZza2.get());
            }
        }, zzcff.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 47;
    }
}
