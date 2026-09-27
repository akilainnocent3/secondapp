package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdyc implements zzfoz {
    private final Map zza;
    private final zzbhd zzb;

    public zzdyc(zzbhd zzbhdVar, Map map) {
        this.zza = map;
        this.zzb = zzbhdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdM(zzfos zzfosVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfosVar)) {
            this.zzb.zzc(((zzdyb) map.get(zzfosVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdN(zzfos zzfosVar, String str, Throwable th2) {
        Map map = this.zza;
        if (map.containsKey(zzfosVar)) {
            this.zzb.zzc(((zzdyb) map.get(zzfosVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdO(zzfos zzfosVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfosVar)) {
            this.zzb.zzc(((zzdyb) map.get(zzfosVar)).zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdL(zzfos zzfosVar, String str) {
    }
}
