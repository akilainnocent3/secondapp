package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbr implements zzth {
    private final zztk zza;

    private zzbr(zztk zztkVar, zztk zztkVar2) {
        this.zza = zztkVar;
    }

    public static zzbr zza(zztk zztkVar, zztk zztkVar2) {
        return new zzbr(zztkVar, zztkVar2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbq(this.zza, zzax.zza());
    }
}
