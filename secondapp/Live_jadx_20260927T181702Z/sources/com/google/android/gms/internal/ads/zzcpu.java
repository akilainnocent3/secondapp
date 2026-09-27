package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcpu implements zzimi {
    private final zzcpt zza;

    private zzcpu(zzcpt zzcptVar) {
        this.zza = zzcptVar;
    }

    public static zzcpu zzc(zzcpt zzcptVar) {
        return new zzcpu(zzcptVar);
    }

    public static com.google.android.gms.ads.internal.zza zzd(zzcpt zzcptVar) {
        return new com.google.android.gms.ads.internal.zza(new zzchy(), new zzcgt());
    }

    public final com.google.android.gms.ads.internal.zza zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
