package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzggm implements zzimi {
    private final zzimr zza;

    private zzggm(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzggm zza(zzimr zzimrVar) {
        return new zzggm(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        DisplayMetrics displayMetrics = ((Context) this.zza.zzb()).getResources().getDisplayMetrics();
        zzimq.zzb(displayMetrics);
        return displayMetrics;
    }
}
