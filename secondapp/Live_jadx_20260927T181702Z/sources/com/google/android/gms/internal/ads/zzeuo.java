package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeuo implements zzimi {
    private final zzimr zza;

    private zzeuo(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzeuo zza(zzimr zzimrVar) {
        return new zzeuo(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeun((Set) this.zza.zzb());
    }
}
