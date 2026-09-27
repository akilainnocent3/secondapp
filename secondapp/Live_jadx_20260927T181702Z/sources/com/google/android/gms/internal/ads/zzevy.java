package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzevy implements zzimi {
    private final zzimr zza;

    private zzevy(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar2;
    }

    public static zzevy zzc(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzevy(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzevw zzb() {
        return new zzevw(zzfno.zzc(), ((zzcng) this.zza).zza());
    }
}
