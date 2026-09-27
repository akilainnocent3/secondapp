package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcp implements zzth {
    private final zztk zza;

    private zzcp(zztk zztkVar) {
        this.zza = zztkVar;
    }

    public static zzcp zza(zztk zztkVar) {
        return new zzcp(zztkVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzco((Application) this.zza.zzb());
    }
}
