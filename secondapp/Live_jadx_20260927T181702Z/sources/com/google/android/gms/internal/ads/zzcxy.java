package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcxy implements zzimi {
    private final zzcxx zza;

    private zzcxy(zzcxx zzcxxVar) {
        this.zza = zzcxxVar;
    }

    public static zzcxy zzc(zzcxx zzcxxVar) {
        return new zzcxy(zzcxxVar);
    }

    public static zzfjt zzd(zzcxx zzcxxVar) {
        zzfjt zzfjtVarZzb = zzcxxVar.zzb();
        zzimq.zzb(zzfjtVarZzb);
        return zzfjtVarZzb;
    }

    public final zzfjt zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
