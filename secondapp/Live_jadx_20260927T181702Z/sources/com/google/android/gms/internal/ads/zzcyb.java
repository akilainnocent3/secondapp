package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcyb implements zzimi {
    private final zzcxx zza;

    private zzcyb(zzcxx zzcxxVar) {
        this.zza = zzcxxVar;
    }

    public static zzcyb zzc(zzcxx zzcxxVar) {
        return new zzcyb(zzcxxVar);
    }

    public static zzfke zzd(zzcxx zzcxxVar) {
        zzfke zzfkeVarZza = zzcxxVar.zza();
        zzimq.zzb(zzfkeVarZza);
        return zzfkeVarZza;
    }

    public final zzfke zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
