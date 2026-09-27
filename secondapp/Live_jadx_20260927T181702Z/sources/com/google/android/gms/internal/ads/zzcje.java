package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzcje implements zzhj {
    private final zzhj zza;
    private final long zzb;
    private final zzhj zzc;
    private long zzd;
    private Uri zze;

    public zzcje(zzhj zzhjVar, int i10, zzhj zzhjVar2) {
        this.zza = zzhjVar;
        this.zzb = i10;
        this.zzc = zzhjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        long j10 = this.zzd;
        long j11 = this.zzb;
        if (j10 < j11) {
            int iZza = this.zza.zza(bArr, i10, (int) Math.min(i11, j11 - j10));
            long j12 = this.zzd + ((long) iZza);
            this.zzd = j12;
            i12 = iZza;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 < j11) {
            return i12;
        }
        int iZza2 = this.zzc.zza(bArr, i10 + i12, i11 - i12);
        int i13 = i12 + iZza2;
        this.zzd += (long) iZza2;
        return i13;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final long zzb(zzhn zzhnVar) throws IOException {
        Uri uri;
        zzhn zzhnVar2;
        Uri uri2 = zzhnVar.zza;
        this.zze = uri2;
        long j10 = zzhnVar.zze;
        long j11 = this.zzb;
        zzhn zzhnVar3 = null;
        if (j10 >= j11) {
            uri = uri2;
            zzhnVar2 = null;
        } else {
            long j12 = zzhnVar.zzf;
            long jMin = j11 - j10;
            if (j12 != -1) {
                jMin = Math.min(j12, jMin);
            }
            uri = uri2;
            zzhnVar2 = new zzhn(uri, j10, jMin, null);
        }
        long j13 = zzhnVar.zzf;
        if (j13 == -1 || j10 + j13 > j11) {
            zzhnVar3 = new zzhn(uri, Math.max(j11, j10), j13 != -1 ? Math.min(j13, (j10 + j13) - j11) : -1L, null);
        }
        long jZzb = zzhnVar2 != null ? this.zza.zzb(zzhnVar2) : 0L;
        long jZzb2 = zzhnVar3 != null ? this.zzc.zzb(zzhnVar3) : 0L;
        this.zzd = j10;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final Map zzj() {
        return zzgwc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zze(zzih zzihVar) {
    }
}
