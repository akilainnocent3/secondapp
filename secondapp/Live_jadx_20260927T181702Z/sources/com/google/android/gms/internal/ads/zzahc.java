package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzahc {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzb(zzafq zzafqVar) throws IOException {
        if (this.zzb) {
            return;
        }
        byte[] bArr = this.zza;
        zzafqVar.zzi(bArr, 0, 10);
        zzafqVar.zzl();
        int i10 = zzaeq.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }

    public final void zzc(zzahb zzahbVar, long j10, int i10, int i11, int i12, @Nullable zzaha zzahaVar) {
        zzgsw.zzj(this.zzg <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i13 = this.zzc;
            int i14 = i13 + 1;
            this.zzc = i14;
            if (i13 == 0) {
                this.zzd = j10;
                this.zze = i10;
                this.zzf = 0;
            }
            this.zzf += i11;
            this.zzg = i12;
            if (i14 >= 16) {
                zzd(zzahbVar, zzahaVar);
            }
        }
    }

    public final void zzd(zzahb zzahbVar, @Nullable zzaha zzahaVar) {
        if (this.zzc > 0) {
            zzahbVar.zze(this.zzd, this.zze, this.zzf, this.zzg, zzahaVar);
            this.zzc = 0;
        }
    }
}
