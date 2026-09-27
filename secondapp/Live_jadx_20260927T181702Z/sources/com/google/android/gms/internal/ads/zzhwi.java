package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhwi {

    @zq.h
    private zzhwf zza = null;

    @zq.h
    private BigInteger zzb = null;

    @zq.h
    private Integer zzc = null;

    private zzhwi() {
    }

    public final zzhwi zza(zzhwf zzhwfVar) {
        this.zza = zzhwfVar;
        return this;
    }

    public final zzhwi zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhwi zzc(@zq.h Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhwj zzd() throws GeneralSecurityException {
        zziam zziamVarZza;
        if (this.zza == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = this.zzb;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        int iZzc = this.zza.zzc();
        if (iBitLength != iZzc) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(iZzc).length());
            sb2.append("Got modulus size ");
            sb2.append(iBitLength);
            sb2.append(", but parameters requires modulus size ");
            sb2.append(iZzc);
            throw new GeneralSecurityException(sb2.toString());
        }
        if (this.zza.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzhwe.zzd) {
            zziamVarZza = zzhmk.zza;
        } else if (this.zza.zze() == zzhwe.zzc || this.zza.zze() == zzhwe.zzb) {
            zziamVarZza = zzhmk.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhwe.zza) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zziamVarZza = zzhmk.zzb(this.zzc.intValue());
        }
        return new zzhwj(this.zza, this.zzb, zziamVarZza, this.zzc, null);
    }

    public /* synthetic */ zzhwi(byte[] bArr) {
    }
}
