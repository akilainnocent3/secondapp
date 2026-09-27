package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfok implements zzhbf {
    final /* synthetic */ zzfof zza;
    final /* synthetic */ zzfop zzb;

    public zzfok(zzfop zzfopVar, zzfof zzfofVar) {
        this.zza = zzfofVar;
        Objects.requireNonNull(zzfopVar);
        this.zzb = zzfopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th2) {
        this.zzb.zza.zzg().zzc(this.zza, th2);
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zzb(Object obj) {
        this.zzb.zza.zzg().zzd(this.zza);
    }
}
