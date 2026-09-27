package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcyy implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzcyy(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzcyy zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzcyy(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcyx((Clock) this.zza.zzb(), (zzcel) this.zzb.zzb());
    }
}
