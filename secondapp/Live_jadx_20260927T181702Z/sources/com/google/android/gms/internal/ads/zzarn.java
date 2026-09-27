package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzarn implements zzags {
    private final zzark zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzarn(zzark zzarkVar, int i10, long j10, long j11) {
        this.zza = zzarkVar;
        this.zzb = i10;
        this.zzc = j10;
        long j12 = (j11 - j10) / ((long) zzarkVar.zzd);
        this.zzd = j12;
        this.zze = zze(j12);
    }

    private final long zze(long j10) {
        return zzfk.zzv(j10 * ((long) this.zzb), 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j10) {
        long j11 = this.zzb;
        zzark zzarkVar = this.zza;
        long j12 = (((long) zzarkVar.zzc) * j10) / (j11 * 1000000);
        String str = zzfk.zza;
        long j13 = this.zzd - 1;
        long jMax = Math.max(0L, Math.min(j12, j13));
        long j14 = zzarkVar.zzd;
        long jZze = zze(jMax);
        long j15 = this.zzc;
        zzagt zzagtVar = new zzagt(jZze, (jMax * j14) + j15);
        if (jZze >= j10 || jMax == j13) {
            return new zzagq(zzagtVar, zzagtVar);
        }
        long j16 = jMax + 1;
        return new zzagq(zzagtVar, new zzagt(zze(j16), j15 + (j14 * j16)));
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public /* synthetic */ boolean zzj() {
        return h.a(this);
    }
}
