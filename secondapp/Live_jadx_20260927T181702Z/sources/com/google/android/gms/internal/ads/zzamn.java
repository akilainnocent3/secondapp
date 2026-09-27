package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzamn {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzes zzg = new zzes(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzafq zzafqVar, long j10) throws IOException {
        zzgsw.zza(zzafqVar.zzn() == zzafqVar.zzm());
        zzes zzesVar = this.zzg;
        zzesVar.zza(4);
        while (true) {
            if ((j10 != -1 && zzafqVar.zzn() + 4 >= j10) || !zzaft.zze(zzafqVar, zzesVar.zzi(), 0, 4, true)) {
                break;
            }
            zzesVar.zzh(0);
            if (zzesVar.zzz() == 1332176723) {
                zzafqVar.zzl();
                return true;
            }
            zzafqVar.zzf(1);
        }
        do {
            if (j10 != -1 && zzafqVar.zzn() >= j10) {
                break;
            }
        } while (zzafqVar.zzd(1) != -1);
        return false;
    }

    public final boolean zzc(zzafq zzafqVar, boolean z10) throws IOException {
        zza();
        zzes zzesVar = this.zzg;
        zzesVar.zza(27);
        if (zzaft.zze(zzafqVar, zzesVar.zzi(), 0, 27, z10) && zzesVar.zzz() == 1332176723) {
            if (zzesVar.zzs() != 0) {
                if (z10) {
                    return false;
                }
                throw zzat.zzc("unsupported bit stream revision");
            }
            this.zza = zzesVar.zzs();
            this.zzb = zzesVar.zzE();
            zzesVar.zzA();
            zzesVar.zzA();
            zzesVar.zzA();
            int iZzs = zzesVar.zzs();
            this.zzc = iZzs;
            this.zzd = iZzs + 27;
            zzesVar.zza(iZzs);
            if (zzaft.zze(zzafqVar, zzesVar.zzi(), 0, this.zzc, z10)) {
                for (int i10 = 0; i10 < this.zzc; i10++) {
                    int[] iArr = this.zzf;
                    int iZzs2 = zzesVar.zzs();
                    iArr[i10] = iZzs2;
                    this.zze += iZzs2;
                }
                return true;
            }
        }
        return false;
    }
}
