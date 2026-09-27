package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaev implements zzags {
    private final zzaey zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzaev(zzaey zzaeyVar, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.zza = zzaeyVar;
        this.zzb = j10;
        this.zzc = j12;
        this.zzd = j13;
        this.zze = j14;
        this.zzf = j15;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j10) {
        zzagt zzagtVar = new zzagt(j10, zzaex.zza(this.zza.zza(j10), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzagq(zzagtVar, zzagtVar);
    }

    public final long zzd(long j10) {
        return this.zza.zza(j10);
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ long zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zze;
    }

    public final /* synthetic */ long zzh() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public /* synthetic */ boolean zzj() {
        return h.a(this);
    }
}
