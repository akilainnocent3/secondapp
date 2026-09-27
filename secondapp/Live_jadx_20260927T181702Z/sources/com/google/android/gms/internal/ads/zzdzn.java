package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdzn implements zzimi {
    private final zzimr zza;

    private zzdzn(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdzn zza(zzimr zzimrVar) {
        return new zzdzn(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdzm((Clock) this.zza.zzb());
    }
}
