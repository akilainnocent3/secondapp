package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzca implements zzth {
    private final zztk zza;

    private zzca(zztk zztkVar) {
        this.zza = zztkVar;
    }

    public static zzca zza(zztk zztkVar) {
        return new zzca(zztkVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbz((Application) this.zza.zzb());
    }
}
