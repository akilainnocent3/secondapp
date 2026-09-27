package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzafd implements zzags {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzafd(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i10 = length - 1;
            this.zzf = jArr2[i10] + jArr3[i10];
        }
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        String string = Arrays.toString(this.zzb);
        String string2 = Arrays.toString(jArr3);
        String string3 = Arrays.toString(jArr2);
        String string4 = Arrays.toString(jArr);
        int i10 = this.zza;
        int length = String.valueOf(i10).length();
        int length2 = String.valueOf(string).length();
        int length3 = String.valueOf(string2).length();
        StringBuilder sb2 = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(string3).length() + 14 + String.valueOf(string4).length() + 1);
        sb2.append("ChunkIndex(length=");
        sb2.append(i10);
        sb2.append(", sizes=");
        sb2.append(string);
        sb2.append(", offsets=");
        sb2.append(string2);
        sb2.append(", timeUs=");
        sb2.append(string3);
        sb2.append(", durationsUs=");
        sb2.append(string4);
        sb2.append(gi.j.f86771d);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j10) {
        long[] jArr = this.zze;
        int iZzo = zzfk.zzo(jArr, j10, true, true);
        long j11 = jArr[iZzo];
        long[] jArr2 = this.zzc;
        zzagt zzagtVar = new zzagt(j11, jArr2[iZzo]);
        if (zzagtVar.zzb >= j10 || iZzo == this.zza - 1) {
            return new zzagq(zzagtVar, zzagtVar);
        }
        int i10 = iZzo + 1;
        return new zzagq(zzagtVar, new zzagt(jArr[i10], jArr2[i10]));
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public /* synthetic */ boolean zzj() {
        return h.a(this);
    }
}
