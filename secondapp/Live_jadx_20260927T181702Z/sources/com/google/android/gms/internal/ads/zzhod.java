package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhod {

    @zq.h
    private zzhon zza = null;

    @zq.h
    private zziao zzb = null;

    @zq.h
    private Integer zzc = null;

    private zzhod() {
    }

    public final zzhod zza(zzhon zzhonVar) {
        this.zza = zzhonVar;
        return this;
    }

    public final zzhod zzb(zziao zziaoVar) {
        this.zzb = zziaoVar;
        return this;
    }

    public final zzhod zzc(@zq.h Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhoe zzd() throws GeneralSecurityException {
        zziao zziaoVar;
        zziam zziamVarZza;
        zzhon zzhonVar = this.zza;
        if (zzhonVar == null || (zziaoVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhonVar.zzc() != zziaoVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhonVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhom.zzd) {
            zziamVarZza = zzhmk.zza;
        } else if (this.zza.zzf() == zzhom.zzc || this.zza.zzf() == zzhom.zzb) {
            zziamVarZza = zzhmk.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhom.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
            }
            zziamVarZza = zzhmk.zzb(this.zzc.intValue());
        }
        return new zzhoe(this.zza, this.zzb, zziamVarZza, this.zzc, null);
    }

    public /* synthetic */ zzhod(byte[] bArr) {
    }
}
