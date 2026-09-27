package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzheq {

    @zq.h
    private zzhez zza = null;

    @zq.h
    private zziao zzb = null;

    @zq.h
    private zziao zzc = null;

    @zq.h
    private Integer zzd = null;

    private zzheq() {
    }

    public final zzheq zza(zzhez zzhezVar) {
        this.zza = zzhezVar;
        return this;
    }

    public final zzheq zzb(zziao zziaoVar) {
        this.zzb = zziaoVar;
        return this;
    }

    public final zzheq zzc(zziao zziaoVar) {
        this.zzc = zziaoVar;
        return this;
    }

    public final zzheq zzd(@zq.h Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzher zze() throws GeneralSecurityException {
        zziam zziamVarZzb;
        zzhez zzhezVar = this.zza;
        if (zzhezVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zziao zziaoVar = this.zzb;
        if (zziaoVar == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (zzhezVar.zzc() != zziaoVar.zzd()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (zzhezVar.zzd() != this.zzc.zzd()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zza() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzhey.zzc) {
            zziamVarZzb = zzhmk.zza;
        } else if (this.zza.zzg() == zzhey.zzb) {
            zziamVarZzb = zzhmk.zza(this.zzd.intValue());
        } else {
            if (this.zza.zzg() != zzhey.zza) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzg())));
            }
            zziamVarZzb = zzhmk.zzb(this.zzd.intValue());
        }
        return new zzher(this.zza, this.zzb, this.zzc, zziamVarZzb, this.zzd, null);
    }

    public /* synthetic */ zzheq(byte[] bArr) {
    }
}
