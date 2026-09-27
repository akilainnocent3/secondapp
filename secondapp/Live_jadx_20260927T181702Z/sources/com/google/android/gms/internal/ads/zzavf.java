package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzavf {
    public static zzawf zza(final long j10) {
        return zzawf.zzf(new zzavx() { // from class: com.google.android.gms.internal.ads.zzave
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                try {
                    ((zzawa) obj).zzb.zzb(zzawf.zzb(j10));
                    return Optional.empty();
                } catch (zzavv unused) {
                    return Optional.of(zzaup.zza);
                }
            }
        });
    }

    public static int zzb(long j10, zzawe zzaweVar, boolean z10) throws IOException {
        long j11;
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j12 = jArr[0];
        long j13 = jArr[1];
        long j14 = jArr[2];
        long j15 = jArr[3];
        long j16 = jArr[4];
        long j17 = jArr[5];
        long j18 = jArr[6];
        long j19 = jArr[7];
        long j20 = j18 + (((((~j12) & j13) | j14) + ((j12 & j15) | j16)) - j17);
        long j21 = j19 % 1629190168;
        int i10 = ((((~1725868784) & 388366538) | 739792167) + ((1725868784 & 1395525853) | 1087913783)) - 2073845026;
        int i11 = 1550046828 % 184366026;
        int i12 = ((((~84870791) & 719462960) | 688752780) + ((84870791 & 317383283) | 806209731)) - 1437974767;
        int i13 = 2023762697 % 959200313;
        int i14 = ((((~294151249) & 1465191424) | 201912514) + ((294151249 & 1398095366) | 75641662)) - 1330100008;
        int i15 = 1583887958 % 619175679;
        if (z10) {
            j11 = (j10 >> ((((((~1375552878) & 930005102) | 1249030018) + ((1375552878 & 1024213116) | 136481682)) - 2090967727) ^ (2014126950 % 228698447))) ^ (j10 + j10);
        } else {
            j11 = j10;
        }
        int i16 = 1;
        while (true) {
            long j22 = j20 ^ j21;
            long j23 = j11 >>> (i12 ^ i13);
            boolean z11 = j23 != 0 || i16 < 0;
            int i17 = (int) (j11 & j22);
            if (z11) {
                int i18 = i10 ^ i11;
                i17 = ((i17 | (i14 ^ i15)) << i18) >> i18;
            }
            zzaweVar.zza((byte) i17);
            if (!z11) {
                return i16;
            }
            i16++;
            j11 = j23;
        }
    }
}
