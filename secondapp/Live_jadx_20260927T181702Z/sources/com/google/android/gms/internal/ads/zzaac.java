package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzaac implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzaac(zzv zzvVar, int i10) {
        this.zza = 1 == (zzvVar.zze & 1);
        this.zzb = l1.c(i10, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaac zzaacVar) {
        return zzgvm.zzg().zzd(this.zzb, zzaacVar.zzb).zzd(this.zza, zzaacVar.zza).zze();
    }
}
