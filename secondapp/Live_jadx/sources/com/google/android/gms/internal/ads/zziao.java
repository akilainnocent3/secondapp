package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zziao {
    private final zziam zza;

    private zziao(zziam zziamVar) {
        this.zza = zziamVar;
    }

    public static zziao zza(byte[] bArr, zzhdx zzhdxVar) {
        return new zziao(zziam.zza(bArr));
    }

    public static zziao zzb(int i10) {
        return new zziao(zziam.zza(zzhnh.zza(i10)));
    }

    public final byte[] zzc(zzhdx zzhdxVar) {
        return this.zza.zzc();
    }

    public final int zzd() {
        return this.zza.zzd();
    }
}
