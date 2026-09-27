package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzaqs {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfh zza = new zzfh(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzes zzb = new zzes();

    public zzaqs(int i10) {
    }

    private final int zze(zzafq zzafqVar) {
        byte[] bArr = zzfk.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzafqVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzafq zzafqVar, zzagp zzagpVar, int i10) throws IOException {
        if (i10 <= 0) {
            zze(zzafqVar);
            return 0;
        }
        long j10 = -9223372036854775807L;
        if (this.zze) {
            if (this.zzg == -9223372036854775807L) {
                zze(zzafqVar);
                return 0;
            }
            if (this.zzd) {
                long j11 = this.zzf;
                if (j11 == -9223372036854775807L) {
                    zze(zzafqVar);
                    return 0;
                }
                zzfh zzfhVar = this.zza;
                this.zzh = zzfhVar.zzf(this.zzg) - zzfhVar.zze(j11);
                zze(zzafqVar);
                return 0;
            }
            int iMin = (int) Math.min(112800L, zzafqVar.zzo());
            if (zzafqVar.zzn() != 0) {
                zzagpVar.zza = 0L;
                return 1;
            }
            zzes zzesVar = this.zzb;
            zzesVar.zza(iMin);
            zzafqVar.zzl();
            zzafqVar.zzi(zzesVar.zzi(), 0, iMin);
            int iZze = zzesVar.zze();
            for (int iZzg = zzesVar.zzg(); iZzg < iZze; iZzg++) {
                if (zzesVar.zzi()[iZzg] == 71) {
                    long jZzb = zzarc.zzb(zzesVar, iZzg, i10);
                    if (jZzb != -9223372036854775807L) {
                        j10 = jZzb;
                        break;
                    }
                }
            }
            this.zzf = j10;
            this.zzd = true;
            return 0;
        }
        long jZzo = zzafqVar.zzo();
        int iMin2 = (int) Math.min(112800L, jZzo);
        long j12 = jZzo - ((long) iMin2);
        if (zzafqVar.zzn() != j12) {
            zzagpVar.zza = j12;
            return 1;
        }
        zzes zzesVar2 = this.zzb;
        zzesVar2.zza(iMin2);
        zzafqVar.zzl();
        zzafqVar.zzi(zzesVar2.zzi(), 0, iMin2);
        int iZzg2 = zzesVar2.zzg();
        int iZze2 = zzesVar2.zze();
        for (int i11 = iZze2 - 188; i11 >= iZzg2; i11--) {
            byte[] bArrZzi = zzesVar2.zzi();
            int i12 = 0;
            for (int i13 = -4; i13 <= 4; i13++) {
                int i14 = (i13 * 188) + i11;
                if (i14 >= iZzg2 && i14 < iZze2 && bArrZzi[i14] == 71) {
                    i12++;
                    if (i12 == 5) {
                        long jZzb2 = zzarc.zzb(zzesVar2, i11, i10);
                        if (jZzb2 == -9223372036854775807L) {
                            break;
                        }
                        j10 = jZzb2;
                        break;
                    }
                } else {
                    i12 = 0;
                }
            }
        }
        this.zzg = j10;
        this.zze = true;
        return 0;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final zzfh zzd() {
        return this.zza;
    }
}
