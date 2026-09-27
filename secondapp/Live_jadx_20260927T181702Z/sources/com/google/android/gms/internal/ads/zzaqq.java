package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzaqq implements zzafa {
    private final zzfh zza;
    private final zzes zzb = new zzes();
    private final int zzc;

    public zzaqq(int i10, zzfh zzfhVar, int i11) {
        this.zzc = i10;
        this.zza = zzfhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final zzaez zza(zzafq zzafqVar, long j10) throws IOException {
        int iZza;
        int iZza2;
        long jZzn = zzafqVar.zzn();
        int iMin = (int) Math.min(112800L, zzafqVar.zzo() - jZzn);
        zzes zzesVar = this.zzb;
        zzesVar.zza(iMin);
        zzafqVar.zzi(zzesVar.zzi(), 0, iMin);
        int iZze = zzesVar.zze();
        long j11 = -1;
        long j12 = -9223372036854775807L;
        long j13 = -1;
        while (zzesVar.zzd() >= 188 && (iZza2 = (iZza = zzarc.zza(zzesVar.zzi(), zzesVar.zzg(), iZze)) + 188) <= iZze) {
            long jZzb = zzarc.zzb(zzesVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZze = this.zza.zze(jZzb);
                if (jZze > j10) {
                    return j12 == -9223372036854775807L ? zzaez.zza(jZze, jZzn) : zzaez.zzc(jZzn + j13);
                }
                j13 = iZza;
                if (100000 + jZze > j10) {
                    return zzaez.zzc(jZzn + j13);
                }
                j12 = jZze;
            }
            zzesVar.zzh(iZza2);
            j11 = iZza2;
        }
        return j12 != -9223372036854775807L ? zzaez.zzb(j12, jZzn + j11) : zzaez.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzb() {
        byte[] bArr = zzfk.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
