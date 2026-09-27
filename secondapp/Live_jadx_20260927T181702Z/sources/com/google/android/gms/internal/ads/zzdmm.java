package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdmm implements zzimi {
    private final zzimr zza;

    private zzdmm(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdmm zza(zzimr zzimrVar) {
        return new zzdmm(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdke((zzdnf) this.zza.zzb(), zzcff.zzh));
        zzimq.zzb(setSingleton);
        return setSingleton;
    }
}
