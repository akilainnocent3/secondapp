package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzahq implements zzahl {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzahq(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.zza = i10;
        this.zzb = i12;
        this.zzc = i13;
        this.zzd = i14;
        this.zze = i15;
        this.zzf = i16;
    }

    public static zzahq zzb(zzes zzesVar) {
        int iZzC = zzesVar.zzC();
        zzesVar.zzk(12);
        int iZzC2 = zzesVar.zzC();
        int iZzC3 = zzesVar.zzC();
        int iZzC4 = zzesVar.zzC();
        zzesVar.zzk(4);
        int iZzC5 = zzesVar.zzC();
        int iZzC6 = zzesVar.zzC();
        zzesVar.zzk(4);
        return new zzahq(iZzC, iZzC2, iZzC3, iZzC4, iZzC5, iZzC6, zzesVar.zzC());
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    public final int zza() {
        return 1752331379;
    }

    public final int zzc() {
        int i10 = this.zza;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        zzef.zzc("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i10))));
        return -1;
    }

    public final long zzd() {
        return zzfk.zzv(this.zzd, ((long) this.zzb) * 1000000, this.zzc, RoundingMode.DOWN);
    }
}
