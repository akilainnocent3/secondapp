package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhfr {

    @zq.h
    private zzhfz zza = null;

    @zq.h
    private zziao zzb = null;

    @zq.h
    private Integer zzc = null;

    private zzhfr() {
    }

    public final zzhfr zza(zzhfz zzhfzVar) {
        this.zza = zzhfzVar;
        return this;
    }

    public final zzhfr zzb(zziao zziaoVar) {
        this.zzb = zziaoVar;
        return this;
    }

    public final zzhfr zzc(@zq.h Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhfs zzd() throws GeneralSecurityException {
        zziao zziaoVar;
        zziam zziamVarZzb;
        zzhfz zzhfzVar = this.zza;
        if (zzhfzVar == null || (zziaoVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhfzVar.zzc() != zziaoVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhfzVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzhfy.zzc) {
            zziamVarZzb = zzhmk.zza;
        } else if (this.zza.zzd() == zzhfy.zzb) {
            zziamVarZzb = zzhmk.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzhfy.zza) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zziamVarZzb = zzhmk.zzb(this.zzc.intValue());
        }
        return new zzhfs(this.zza, this.zzb, zziamVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzhfr(byte[] bArr) {
    }
}
