package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhnr {

    @zq.h
    private zzhnz zza = null;

    @zq.h
    private zziao zzb = null;

    @zq.h
    private Integer zzc = null;

    private zzhnr() {
    }

    public final zzhnr zza(zzhnz zzhnzVar) {
        this.zza = zzhnzVar;
        return this;
    }

    public final zzhnr zzb(zziao zziaoVar) throws GeneralSecurityException {
        this.zzb = zziaoVar;
        return this;
    }

    public final zzhnr zzc(@zq.h Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhns zzd() throws GeneralSecurityException {
        zziao zziaoVar;
        zziam zziamVarZza;
        zzhnz zzhnzVar = this.zza;
        if (zzhnzVar == null || (zziaoVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhnzVar.zzc() != zziaoVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhnzVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhny.zzd) {
            zziamVarZza = zzhmk.zza;
        } else if (this.zza.zzf() == zzhny.zzc || this.zza.zzf() == zzhny.zzb) {
            zziamVarZza = zzhmk.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhny.zza) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
            }
            zziamVarZza = zzhmk.zzb(this.zzc.intValue());
        }
        return new zzhns(this.zza, this.zzb, zziamVarZza, this.zzc, null);
    }

    public /* synthetic */ zzhnr(byte[] bArr) {
    }
}
