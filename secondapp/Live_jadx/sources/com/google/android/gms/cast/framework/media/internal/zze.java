package com.google.android.gms.cast.framework.media.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
final class zze extends zzj {
    final /* synthetic */ zzf zza;

    public /* synthetic */ zze(zzf zzfVar, zzd zzdVar) {
        this.zza = zzfVar;
    }

    @Override // com.google.android.gms.cast.framework.media.internal.zzk
    public final void zzb(long j10, long j11) {
        this.zza.publishProgress(Long.valueOf(j10), Long.valueOf(j11));
    }
}
