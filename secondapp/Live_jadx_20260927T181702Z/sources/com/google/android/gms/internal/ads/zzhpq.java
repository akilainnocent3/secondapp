package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhpq extends zzhpt {
    private final zzhpr zza;
    private final zziao zzb;

    private zzhpq(zzhpr zzhprVar, zziao zziaoVar) {
        this.zza = zzhprVar;
        this.zzb = zziaoVar;
    }

    public static zzhpq zzc(zzhpr zzhprVar, zziao zziaoVar) throws GeneralSecurityException {
        if (zzhprVar.zzc() == zziaoVar.zzd()) {
            return new zzhpq(zzhprVar, zziaoVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.android.gms.internal.ads.zzhpt, com.google.android.gms.internal.ads.zzhdc
    public final /* synthetic */ zzhdt zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    @zq.h
    public final Integer zzb() {
        return null;
    }

    public final zziao zzd() {
        return this.zzb;
    }
}
