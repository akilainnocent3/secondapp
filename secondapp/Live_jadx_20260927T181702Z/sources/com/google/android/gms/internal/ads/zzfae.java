package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfae implements zzimi {
    private final zzimr zza;

    private zzfae(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar2;
    }

    public static zzfae zzc(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzfae(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfac zzb() {
        return new zzfac(zzfno.zzc(), ((zzcng) this.zza).zza());
    }
}
