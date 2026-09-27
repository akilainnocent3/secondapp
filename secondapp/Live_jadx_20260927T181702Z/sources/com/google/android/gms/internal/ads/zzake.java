package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzake extends zzaff implements zzakn {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzake(long j10, long j11, int i10, int i11, boolean z10) {
        this(j10, j11, i10, i11, false, true);
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final long zzf(long j10) {
        return zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final long zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final int zzh() {
        return this.zzb;
    }

    public final zzake zzi(long j10) {
        return new zzake(j10, this.zza, this.zzb, this.zzc, false, false);
    }

    private zzake(long j10, long j11, int i10, int i11, boolean z10, boolean z11) {
        super(j10, j11, i10, i11, false, z11);
        this.zza = j11;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10 == -1 ? -1L : j10;
    }

    public zzake(long j10, long j11, zzagm zzagmVar, boolean z10) {
        this(j10, j11, zzagmVar.zzf, zzagmVar.zzc, false, true);
    }
}
