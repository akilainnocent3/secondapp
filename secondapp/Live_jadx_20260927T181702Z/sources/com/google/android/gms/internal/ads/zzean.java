package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzean implements zzimi {
    private final zzimr zza;

    private zzean(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzean zzc(zzimr zzimrVar) {
        return new zzean(zzimrVar);
    }

    public static zzeam zzd(zzbqe zzbqeVar) {
        return new zzeam(zzbqeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeam zzb() {
        return new zzeam((zzbqe) this.zza.zzb());
    }
}
