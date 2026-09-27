package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcng;
import com.google.android.gms.internal.ads.zzimi;
import com.google.android.gms.internal.ads.zzimr;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class zzca implements zzimi {
    private final zzimr zza;

    private zzca(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzca zza(zzimr zzimrVar) {
        return new zzca(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbz(((zzcng) this.zza).zza());
    }
}
