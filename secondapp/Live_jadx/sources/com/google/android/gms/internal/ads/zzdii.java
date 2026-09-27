package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdii implements zzimi {
    private final zzdif zza;

    private zzdii(zzdif zzdifVar) {
        this.zza = zzdifVar;
    }

    public static zzdii zza(zzdif zzdifVar) {
        return new zzdii(zzdifVar);
    }

    public static Set zzc(zzdif zzdifVar) {
        Set set = Collections.EMPTY_SET;
        zzimq.zzb(set);
        return set;
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
