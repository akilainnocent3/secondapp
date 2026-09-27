package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public final class zzagz implements zzafs {
    private final long zzb;
    private final zzafs zzc;

    public zzagz(long j10, zzafs zzafsVar) {
        this.zzb = j10;
        this.zzc = zzafsVar;
    }

    public final /* synthetic */ long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final zzahb zzu(int i10, int i11) {
        return this.zzc.zzu(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final void zzv() {
        this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final void zzw(zzags zzagsVar) {
        this.zzc.zzw(new zzagy(this, zzagsVar, zzagsVar));
    }
}
