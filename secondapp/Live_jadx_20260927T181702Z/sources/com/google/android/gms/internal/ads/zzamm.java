package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzamm {
    private final zzamn zza = new zzamn();
    private final zzes zzb = new zzes(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    private final int zzf(int i10) {
        int i11;
        int i12 = 0;
        this.zzd = 0;
        do {
            int i13 = this.zzd;
            int i14 = i10 + i13;
            zzamn zzamnVar = this.zza;
            if (i14 >= zzamnVar.zzc) {
                break;
            }
            this.zzd = i13 + 1;
            i11 = zzamnVar.zzf[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final void zza() {
        this.zza.zza();
        this.zzb.zza(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final boolean zzb(zzafq zzafqVar) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zza(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i10 = this.zzc;
            if (i10 < 0) {
                zzamn zzamnVar = this.zza;
                if (!zzamnVar.zzb(zzafqVar, -1L) || !zzamnVar.zzc(zzafqVar, true)) {
                    return false;
                }
                int iZzf = zzamnVar.zzd;
                if ((zzamnVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    iZzf += zzf(0);
                    i10 = this.zzd;
                } else {
                    i10 = 0;
                }
                if (!zzaft.zzd(zzafqVar, iZzf)) {
                    return false;
                }
                this.zzc = i10;
            }
            int iZzf2 = zzf(i10);
            int i11 = this.zzc + this.zzd;
            if (iZzf2 > 0) {
                zzes zzesVar = this.zzb;
                zzesVar.zzc(zzesVar.zze() + iZzf2);
                if (!zzaft.zzc(zzafqVar, zzesVar.zzi(), zzesVar.zze(), iZzf2)) {
                    return false;
                }
                zzesVar.zzf(zzesVar.zze() + iZzf2);
                this.zze = this.zza.zzf[i11 + (-1)] != 255;
            }
            if (i11 == this.zza.zzc) {
                i11 = -1;
            }
            this.zzc = i11;
        }
    }

    public final zzamn zzc() {
        return this.zza;
    }

    public final zzes zzd() {
        return this.zzb;
    }

    public final void zze() {
        zzes zzesVar = this.zzb;
        if (zzesVar.zzi().length == 65025) {
            return;
        }
        zzesVar.zzb(Arrays.copyOf(zzesVar.zzi(), Math.max(65025, zzesVar.zze())), zzesVar.zze());
    }
}
