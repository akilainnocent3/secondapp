package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzaab extends zzaai implements Comparable {
    private final int zze;
    private final int zzf;

    public zzaab(int i10, zzbg zzbgVar, int i11, zzaae zzaaeVar, int i12) {
        super(i10, zzbgVar, i11);
        this.zze = l1.c(i12, zzaaeVar.zzV) ? 1 : 0;
        this.zzf = this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaab zzaabVar) {
        return Integer.compare(this.zzf, zzaabVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final /* bridge */ /* synthetic */ boolean zzc(zzaai zzaaiVar) {
        return false;
    }
}
