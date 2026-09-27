package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhwj extends zzhxd {
    private final zzhwf zza;
    private final BigInteger zzb;
    private final zziam zzc;

    @zq.h
    private final Integer zzd;

    public /* synthetic */ zzhwj(zzhwf zzhwfVar, BigInteger bigInteger, zziam zziamVar, Integer num, byte[] bArr) {
        this.zza = zzhwfVar;
        this.zzb = bigInteger;
        this.zzc = zziamVar;
        this.zzd = num;
    }

    public static zzhwi zzc() {
        return new zzhwi(null);
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

    public final BigInteger zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhxd
    public final zziam zze() {
        return this.zzc;
    }

    public final zzhwf zzf() {
        return this.zza;
    }
}
