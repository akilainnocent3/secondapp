package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzido implements zzidf {
    final int zza;
    final zzigu zzb;
    final boolean zzc;
    final boolean zzd;

    public zzido(zzidw zzidwVar, int i10, zzigu zziguVar, boolean z10, boolean z11) {
        this.zza = i10;
        this.zzb = zziguVar;
        this.zzc = z10;
        this.zzd = z11;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzido) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzidf
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzidf
    public final zzigu zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzidf
    public final zzigv zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzidf
    public final boolean zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzidf
    public final boolean zze() {
        return this.zzd;
    }
}
