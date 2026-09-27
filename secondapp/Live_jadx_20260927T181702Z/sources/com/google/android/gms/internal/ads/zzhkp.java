package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzhkp {
    final zzhkq zza;
    final long[] zzb;

    public zzhkp(zzhkq zzhkqVar, long[] jArr) {
        this.zza = zzhkqVar;
        this.zzb = jArr;
    }

    public zzhkp() {
        this(new zzhkq(), new long[10]);
    }

    public zzhkp(zzhkp zzhkpVar) {
        this.zza = new zzhkq(zzhkpVar.zza);
        this.zzb = Arrays.copyOf(zzhkpVar.zzb, 10);
    }
}
