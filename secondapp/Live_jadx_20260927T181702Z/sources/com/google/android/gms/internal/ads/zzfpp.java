package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfpp implements zzhbf {
    final /* synthetic */ zzfps zza;
    final /* synthetic */ zzfpi zzb;

    public zzfpp(zzfps zzfpsVar, zzfpi zzfpiVar) {
        this.zza = zzfpsVar;
        this.zzb = zzfpiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th2) {
        zzfpi zzfpiVar = this.zzb;
        zzfpiVar.zzj(th2);
        zzfpiVar.zzd(false);
        this.zza.zza(zzfpiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zzb(Object obj) {
    }
}
