package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcry implements zzimi {
    private final zzimr zza;

    private zzcry(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzcry zza(zzimr zzimrVar) {
        return new zzcry(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcrx(((zzcng) this.zza).zza());
    }
}
