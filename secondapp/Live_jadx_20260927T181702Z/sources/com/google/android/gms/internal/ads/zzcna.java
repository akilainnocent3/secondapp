package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcna implements zzimi {
    private final zzimr zza;

    private zzcna(zzcmz zzcmzVar, zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzcna zzc(zzcmz zzcmzVar, zzimr zzimrVar) {
        return new zzcna(zzcmzVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.ads.internal.util.zzg zzb() {
        return ((zzcer) this.zza.zzb()).zzo();
    }
}
