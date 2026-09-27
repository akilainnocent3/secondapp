package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhoe extends zzhop {
    private final zzhon zza;
    private final zziao zzb;
    private final zziam zzc;

    @zq.h
    private final Integer zzd;

    public /* synthetic */ zzhoe(zzhon zzhonVar, zziao zziaoVar, zziam zziamVar, Integer num, byte[] bArr) {
        this.zza = zzhonVar;
        this.zzb = zziaoVar;
        this.zzc = zziamVar;
        this.zzd = num;
    }

    public static zzhod zzc() {
        return new zzhod(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhop, com.google.android.gms.internal.ads.zzhdc
    public final /* synthetic */ zzhdt zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    @zq.h
    public final Integer zzb() {
        return this.zzd;
    }

    public final zziao zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhop
    public final zziam zze() {
        return this.zzc;
    }

    public final zzhon zzf() {
        return this.zza;
    }
}
