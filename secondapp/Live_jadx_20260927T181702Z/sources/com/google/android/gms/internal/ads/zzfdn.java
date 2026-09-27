package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfdn implements zzimi {
    private final zzimr zza;

    private zzfdn(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        this.zza = zzimrVar3;
    }

    public static zzfdn zzc(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        return new zzfdn(zzimrVar, zzimrVar2, zzimrVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfdl zzb() {
        return new zzfdl(zzcqu.zza(), zzfno.zzc(), ((zzcng) this.zza).zza());
    }
}
