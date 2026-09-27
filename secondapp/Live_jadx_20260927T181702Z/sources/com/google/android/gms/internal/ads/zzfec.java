package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfec implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzfec(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        this.zza = zzimrVar2;
        this.zzb = zzimrVar3;
    }

    public static zzfec zzc(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        return new zzfec(zzimrVar, zzimrVar2, zzimrVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfea zzb() {
        return new zzfea(zzcqy.zza(), (ScheduledExecutorService) this.zza.zzb(), ((zzcng) this.zzb).zza());
    }
}
