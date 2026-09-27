package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdmn implements zzimi {
    private final zzdlr zza;
    private final zzimr zzb;

    private zzdmn(zzdlr zzdlrVar, zzimr zzimrVar) {
        this.zza = zzdlrVar;
        this.zzb = zzimrVar;
    }

    public static zzdmn zza(zzdlr zzdlrVar, zzimr zzimrVar) {
        return new zzdmn(zzdlrVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzg((Executor) this.zzb.zzb());
    }
}
