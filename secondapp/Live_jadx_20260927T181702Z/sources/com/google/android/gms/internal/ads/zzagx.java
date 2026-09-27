package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public final class zzagx extends zzagd {
    private final long zza;

    public zzagx(zzafq zzafqVar, long j10) {
        super(zzafqVar);
        zzgsw.zza(zzafqVar.zzn() >= j10);
        this.zza = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzagd, com.google.android.gms.internal.ads.zzafq
    public final long zzm() {
        return super.zzm() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzagd, com.google.android.gms.internal.ads.zzafq
    public final long zzn() {
        return super.zzn() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzagd, com.google.android.gms.internal.ads.zzafq
    public final long zzo() {
        return super.zzo() - this.zza;
    }
}
