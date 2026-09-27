package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgzy extends zzhaa {
    public zzgzy(nj.t1 t1Var, Class cls, zzhaq zzhaqVar) {
        super(t1Var, cls, zzhaqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhaa
    public final /* synthetic */ void zze(Object obj) {
        zzk((nj.t1) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhaa
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th2) throws Exception {
        zzhaq zzhaqVar = (zzhaq) obj;
        nj.t1 t1VarZza = zzhaqVar.zza(th2);
        zzgsw.zzl(t1VarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhaqVar);
        return t1VarZza;
    }
}
