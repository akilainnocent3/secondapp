package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdwf implements zzimi {
    private final zzimr zza;

    private zzdwf(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdwf zzc(zzimr zzimrVar) {
        return new zzdwf(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdwe zzb() {
        return new zzdwe((zzcki) this.zza.zzb());
    }
}
