package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdmk implements zzimi {
    private final zzimr zza;

    private zzdmk(zzdlr zzdlrVar, zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
    }

    public static zzdmk zza(zzdlr zzdlrVar, zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzdmk(zzdlrVar, zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdke((zzdnh) this.zza.zzb(), zzfno.zzc());
    }
}
