package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzaot implements Comparable {
    public final int zza;
    public final zzaoo zzb;

    public zzaot(int i10, zzaoo zzaooVar) {
        this.zza = i10;
        this.zzb = zzaooVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzaot) obj).zza);
    }
}
