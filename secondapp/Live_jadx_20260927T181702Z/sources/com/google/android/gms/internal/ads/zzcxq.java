package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzcxq implements zzhbf {
    final /* synthetic */ zzhbf zza;
    final /* synthetic */ zzcxw zzb;

    public zzcxq(zzcxw zzcxwVar, zzhbf zzhbfVar) {
        this.zza = zzhbfVar;
        Objects.requireNonNull(zzcxwVar);
        this.zzb = zzcxwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th2) {
        this.zza.zza(th2);
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zze(((zzcxp) obj).zza, this.zza);
    }
}
