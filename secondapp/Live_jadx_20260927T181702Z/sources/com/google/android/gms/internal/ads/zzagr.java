package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class zzagr implements zzags {
    private final long zza;
    private final zzagq zzb;

    public zzagr(long j10, long j11) {
        this.zza = j10;
        zzagt zzagtVar = j11 == 0 ? zzagt.zza : new zzagt(0L, j11);
        this.zzb = new zzagq(zzagtVar, zzagtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j10) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public /* synthetic */ boolean zzj() {
        return h.a(this);
    }
}
