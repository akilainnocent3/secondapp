package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzakg implements zzakn {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzakg(long[] jArr, long[] jArr2, long j10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10 == -9223372036854775807L ? zzfk.zzs(jArr2[jArr2.length - 1]) : j10;
    }

    public static zzakg zze(long j10, zzajk zzajkVar, long j11) {
        int[] iArr = zzajkVar.zzd;
        int length = iArr.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (zzajkVar.zzb + iArr[i12]);
            j12 += (long) (zzajkVar.zzc + zzajkVar.zze[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new zzakg(jArr, jArr2, j11);
    }

    private static Pair zzi(long j10, long[] jArr, long[] jArr2) {
        int iZzo = zzfk.zzo(jArr, j10, true, true);
        long j11 = jArr[iZzo];
        long j12 = jArr2[iZzo];
        int i10 = iZzo + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j10) {
        String str = zzfk.zza;
        Pair pairZzi = zzi(zzfk.zzr(Math.max(0L, Math.min(j10, this.zzc))), this.zzb, this.zza);
        zzagt zzagtVar = new zzagt(zzfk.zzs(((Long) pairZzi.first).longValue()), ((Long) pairZzi.second).longValue());
        return new zzagq(zzagtVar, zzagtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final long zzf(long j10) {
        return zzfk.zzs(((Long) zzi(j10, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final long zzg() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final int zzh() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public /* synthetic */ boolean zzj() {
        return h.a(this);
    }
}
