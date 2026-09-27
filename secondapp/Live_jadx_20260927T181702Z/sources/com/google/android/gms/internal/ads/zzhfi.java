package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhfi {

    @zq.h
    private zzhfq zza = null;

    @zq.h
    private zziao zzb = null;

    @zq.h
    private Integer zzc = null;

    private zzhfi() {
    }

    public final zzhfi zza(zzhfq zzhfqVar) {
        this.zza = zzhfqVar;
        return this;
    }

    public final zzhfi zzb(zziao zziaoVar) {
        this.zzb = zziaoVar;
        return this;
    }

    public final zzhfi zzc(@zq.h Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhfj zzd() throws GeneralSecurityException {
        zziao zziaoVar;
        zziam zziamVarZzb;
        zzhfq zzhfqVar = this.zza;
        if (zzhfqVar == null || (zziaoVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhfqVar.zzc() != zziaoVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhfqVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzhfp.zzc) {
            zziamVarZzb = zzhmk.zza;
        } else if (this.zza.zzd() == zzhfp.zzb) {
            zziamVarZzb = zzhmk.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzhfp.zza) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zziamVarZzb = zzhmk.zzb(this.zzc.intValue());
        }
        return new zzhfj(this.zza, this.zzb, zziamVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzhfi(byte[] bArr) {
    }
}
