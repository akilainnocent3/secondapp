package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhwu {

    @zq.h
    private zzhwr zza = null;

    @zq.h
    private BigInteger zzb = null;

    @zq.h
    private Integer zzc = null;

    private zzhwu() {
    }

    public final zzhwu zza(zzhwr zzhwrVar) {
        this.zza = zzhwrVar;
        return this;
    }

    public final zzhwu zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhwu zzc(@zq.h Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhwv zzd() throws GeneralSecurityException {
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
        if (this.zza.zze() == zzhwq.zzd) {
            zziamVarZza = zzhmk.zza;
        } else if (this.zza.zze() == zzhwq.zzc || this.zza.zze() == zzhwq.zzb) {
            zziamVarZza = zzhmk.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhwq.zza) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zziamVarZza = zzhmk.zzb(this.zzc.intValue());
        }
        return new zzhwv(this.zza, this.zzb, zziamVarZza, this.zzc, null);
    }

    public /* synthetic */ zzhwu(byte[] bArr) {
    }
}
