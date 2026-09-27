package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzakc {
    private final zzes zza = new zzes(8);
    private int zzb;

    private final long zzb(zzafq zzafqVar) throws IOException {
        int i10;
        zzes zzesVar = this.zza;
        zzafg zzafgVar = (zzafg) zzafqVar;
        int i11 = 0;
        zzafgVar.zzh(zzesVar.zzi(), 0, 1, false);
        int i12 = zzesVar.zzi()[0] & 255;
        if (i12 == 0) {
            return Long.MIN_VALUE;
        }
        int i13 = 128;
        int i14 = 0;
        while (true) {
            i10 = i14 + 1;
            if ((i12 & i13) != 0) {
                break;
            }
            i13 >>= 1;
            i14 = i10;
        }
        int i15 = i12 & (~i13);
        zzafgVar.zzh(zzesVar.zzi(), 1, i14, false);
        while (i11 < i14) {
            i11++;
            i15 = (zzesVar.zzi()[i11] & 255) + (i15 << 8);
        }
        this.zzb += i10;
        return i15;
    }

    public final boolean zza(zzafq zzafqVar) throws IOException {
        long jZzo = zzafqVar.zzo();
        long j10 = 1024;
        if (jZzo != -1 && jZzo <= 1024) {
            j10 = jZzo;
        }
        zzes zzesVar = this.zza;
        zzafg zzafgVar = (zzafg) zzafqVar;
        zzafgVar.zzh(zzesVar.zzi(), 0, 4, false);
        this.zzb = 4;
        for (long jZzz = zzesVar.zzz(); jZzz != 440786851; jZzz = ((jZzz << 8) & (-256)) | ((long) (zzesVar.zzi()[0] & 255))) {
            int i10 = (int) j10;
            int i11 = this.zzb + 1;
            this.zzb = i11;
            if (i11 == i10) {
                return false;
            }
            zzafgVar.zzh(zzesVar.zzi(), 0, 1, false);
        }
        long jZzb = zzb(zzafqVar);
        long j11 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j12 = j11 + jZzb;
            if (jZzo == -1 || j12 < jZzo) {
                while (true) {
                    long j13 = this.zzb;
                    if (j13 < j12) {
                        if (zzb(zzafqVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzafqVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i12 = (int) jZzb2;
                            zzafgVar.zzj(i12, false);
                            this.zzb += i12;
                        }
                    } else if (j13 == j12) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
