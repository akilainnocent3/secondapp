package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaga implements zzags {
    private final zzagc zza;
    private final long zzb;

    public zzaga(zzagc zzagcVar, long j10) {
        this.zza = zzagcVar;
        this.zzb = j10;
    }

    private final zzagt zze(long j10, long j11) {
        return new zzagt((j10 * 1000000) / ((long) this.zza.zze), this.zzb + j11);
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j10) {
        zzagc zzagcVar = this.zza;
        zzagb zzagbVar = zzagcVar.zzk;
        zzagbVar.getClass();
        long jZzb = zzagcVar.zzb(j10);
        long[] jArr = zzagbVar.zza;
        int iZzo = zzfk.zzo(jArr, jZzb, true, false);
        long j11 = iZzo == -1 ? 0L : jArr[iZzo];
        long[] jArr2 = zzagbVar.zzb;
        zzagt zzagtVarZze = zze(j11, iZzo != -1 ? jArr2[iZzo] : 0L);
        if (zzagtVarZze.zzb == j10 || iZzo == jArr.length - 1) {
            return new zzagq(zzagtVarZze, zzagtVarZze);
        }
        int i10 = iZzo + 1;
        return new zzagq(zzagtVarZze, zze(jArr[i10], jArr2[i10]));
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public /* synthetic */ boolean zzj() {
        return h.a(this);
    }
}
