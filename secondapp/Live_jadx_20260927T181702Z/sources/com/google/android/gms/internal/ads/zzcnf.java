package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcnf implements zzimi {
    private final zzimr zza;

    private zzcnf(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzcnf zza(zzimr zzimrVar) {
        return new zzcnf(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = ((zzcng) this.zza).zza().getApplicationInfo();
        zzimq.zzb(applicationInfo);
        return applicationInfo;
    }
}
