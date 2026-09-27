package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzkx implements zzma {
    private final Object zza;
    private zzbf zzb;

    public zzkx(Object obj, zzwx zzwxVar) {
        this.zza = obj;
        this.zzb = zzwxVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final zzbf zzb() {
        return this.zzb;
    }

    public final void zzc(zzbf zzbfVar) {
        this.zzb = zzbfVar;
    }
}
