package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzhaf extends zzhah {
    public zzhaf(nj.t1 t1Var, zzhaq zzhaqVar) {
        super(t1Var, zzhaqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final /* synthetic */ void zze(Object obj) {
        zzk((nj.t1) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzhaq zzhaqVar = (zzhaq) obj;
        nj.t1 t1VarZza = zzhaqVar.zza(obj2);
        zzgsw.zzl(t1VarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhaqVar);
        return t1VarZza;
    }
}
