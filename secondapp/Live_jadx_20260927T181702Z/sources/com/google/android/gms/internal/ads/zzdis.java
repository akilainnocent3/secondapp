package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdis implements zzimi {
    private final zzdif zza;

    private zzdis(zzdif zzdifVar) {
        this.zza = zzdifVar;
    }

    public static zzdis zza(zzdif zzdifVar) {
        return new zzdis(zzdifVar);
    }

    public static Set zzc(zzdif zzdifVar) {
        return zzdifVar.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return this.zza.zzm();
    }
}
