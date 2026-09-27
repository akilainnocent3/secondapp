package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzhcf extends zzhbp {
    final /* synthetic */ zzhch zza;
    private final zzhap zzb;

    public zzhcf(zzhch zzhchVar, zzhap zzhapVar) {
        Objects.requireNonNull(zzhchVar);
        this.zza = zzhchVar;
        this.zzb = zzhapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzhap zzhapVar = this.zzb;
        nj.t1 t1VarZza = zzhapVar.zza();
        zzgsw.zzl(t1VarZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhapVar);
        return t1VarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* synthetic */ void zzf(Object obj) {
        this.zza.zzk((nj.t1) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final void zzg(Throwable th2) {
        this.zza.zzb(th2);
    }
}
