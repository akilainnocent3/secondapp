package com.google.android.gms.internal.ads;

import java.security.spec.ECPoint;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhun extends zzhxd {
    private final zzhuj zza;
    private final ECPoint zzb;
    private final zziam zzc;

    @zq.h
    private final Integer zzd;

    public /* synthetic */ zzhun(zzhuj zzhujVar, ECPoint eCPoint, zziam zziamVar, Integer num, byte[] bArr) {
        this.zza = zzhujVar;
        this.zzb = eCPoint;
        this.zzc = zziamVar;
        this.zzd = num;
    }

    public static zzhum zzc() {
        return new zzhum(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhxd, com.google.android.gms.internal.ads.zzhdc
    public final /* synthetic */ zzhdt zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    @zq.h
    public final Integer zzb() {
        return this.zzd;
    }

    public final ECPoint zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhxd
    public final zziam zze() {
        return this.zzc;
    }

    public final zzhuj zzf() {
        return this.zza;
    }
}
