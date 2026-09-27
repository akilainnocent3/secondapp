package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhfa {

    @zq.h
    private zzhfh zza = null;

    @zq.h
    private zziao zzb = null;

    @zq.h
    private Integer zzc = null;

    private zzhfa() {
    }

    public final zzhfa zza(zzhfh zzhfhVar) {
        this.zza = zzhfhVar;
        return this;
    }

    public final zzhfa zzb(zziao zziaoVar) {
        this.zzb = zziaoVar;
        return this;
    }

    public final zzhfa zzc(@zq.h Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhfb zzd() throws GeneralSecurityException {
        zziao zziaoVar;
        zziam zziamVarZzb;
        zzhfh zzhfhVar = this.zza;
        if (zzhfhVar == null || (zziaoVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhfhVar.zzc() != zziaoVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhfhVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzhfg.zzc) {
            zziamVarZzb = zzhmk.zza;
        } else if (this.zza.zze() == zzhfg.zzb) {
            zziamVarZzb = zzhmk.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhfg.zza) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zziamVarZzb = zzhmk.zzb(this.zzc.intValue());
        }
        return new zzhfb(this.zza, this.zzb, zziamVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzhfa(byte[] bArr) {
    }
}
