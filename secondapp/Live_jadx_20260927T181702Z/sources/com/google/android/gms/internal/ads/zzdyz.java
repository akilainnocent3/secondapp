package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdyz {
    private final zzdze zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdyz(zzdze zzdzeVar, Executor executor) {
        this.zza = zzdzeVar;
        this.zzc = zzdzeVar.zza();
        this.zzb = executor;
    }

    public final zzdyy zza() {
        zzdyy zzdyyVar = new zzdyy(this);
        zzdyyVar.zzj();
        return zzdyyVar;
    }

    public final void zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzna)).booleanValue()) {
            zzdyy zzdyyVarZza = zza();
            zzdyyVarZza.zzc("action", "pecr");
            zzdyyVarZza.zzd();
        }
    }

    public final /* synthetic */ zzdze zzc() {
        return this.zza;
    }

    public final /* synthetic */ Executor zzd() {
        return this.zzb;
    }

    public final /* synthetic */ Map zze() {
        return this.zzc;
    }
}
