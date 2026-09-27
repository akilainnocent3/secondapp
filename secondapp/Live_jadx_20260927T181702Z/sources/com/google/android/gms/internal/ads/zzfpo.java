package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfpo implements zzhbf {
    final /* synthetic */ zzfps zza;
    final /* synthetic */ zzfpi zzb;
    final /* synthetic */ boolean zzc;

    public zzfpo(zzfps zzfpsVar, zzfpi zzfpiVar, boolean z10) {
        this.zza = zzfpsVar;
        this.zzb = zzfpiVar;
        this.zzc = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th2) {
        zzfpi zzfpiVar = this.zzb;
        if (zzfpiVar.zzb()) {
            zzfps zzfpsVar = this.zza;
            zzfpiVar.zzj(th2);
            zzfpiVar.zzd(false);
            zzfpsVar.zza(zzfpiVar);
            if (this.zzc) {
                zzfpsVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zzb(Object obj) {
        zzfpi zzfpiVar = this.zzb;
        zzfpiVar.zzd(true);
        zzfps zzfpsVar = this.zza;
        zzfpsVar.zza(zzfpiVar);
        if (this.zzc) {
            zzfpsVar.zzh();
        }
    }
}
