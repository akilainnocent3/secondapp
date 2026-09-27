package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdpz implements zzimi {
    private final zzdps zza;

    private zzdpz(zzdps zzdpsVar) {
        this.zza = zzdpsVar;
    }

    public static zzdpz zzc(zzdps zzdpsVar) {
        return new zzdpz(zzdpsVar);
    }

    public static zzdph zzd(zzdps zzdpsVar) {
        zzdph zzdphVarZza = zzdpsVar.zza();
        zzimq.zzb(zzdphVarZza);
        return zzdphVarZza;
    }

    public final zzdph zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
