package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
class zzhkn {
    final long[] zza;
    final long[] zzb;
    final long[] zzc;

    public zzhkn(long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = jArr3;
    }

    public void zza(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final void zzb(zzhkn zzhknVar, int i10) {
        zzhkm.zza(this.zza, zzhknVar.zza, i10);
        zzhkm.zza(this.zzb, zzhknVar.zzb, i10);
        zzhkm.zza(this.zzc, zzhknVar.zzc, i10);
    }

    public zzhkn() {
        this(new long[10], new long[10], new long[10]);
    }

    public zzhkn(zzhkn zzhknVar) {
        this.zza = Arrays.copyOf(zzhknVar.zza, 10);
        this.zzb = Arrays.copyOf(zzhknVar.zzb, 10);
        this.zzc = Arrays.copyOf(zzhknVar.zzc, 10);
    }
}
