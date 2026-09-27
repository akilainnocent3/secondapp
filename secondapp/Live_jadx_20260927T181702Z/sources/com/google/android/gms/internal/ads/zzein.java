package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzein {
    private final zzeij zza;
    private final zzhbs zzb;

    public zzein(zzeij zzeijVar, zzhbs zzhbsVar) {
        this.zza = zzeijVar;
        this.zzb = zzhbsVar;
    }

    public final void zza(zzfny zzfnyVar) {
        final zzeij zzeijVar = this.zza;
        Objects.requireNonNull(zzeijVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzeim
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzeijVar.getWritableDatabase();
            }
        };
        zzhbs zzhbsVar = this.zzb;
        zzhbi.zzr(zzhbsVar.zzc(callable), new zzeil(this, zzfnyVar), zzhbsVar);
    }
}
