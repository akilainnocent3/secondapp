package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhwf extends zzhxb {
    public static final BigInteger zza = BigInteger.valueOf(65537);
    private final int zzb;
    private final BigInteger zzc;
    private final zzhwe zzd;
    private final zzhwd zze;

    public /* synthetic */ zzhwf(int i10, BigInteger bigInteger, zzhwe zzhweVar, zzhwd zzhwdVar, byte[] bArr) {
        this.zzb = i10;
        this.zzc = bigInteger;
        this.zzd = zzhweVar;
        this.zze = zzhwdVar;
    }

    public static zzhwc zzb() {
        return new zzhwc(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhwf)) {
            return false;
        }
        zzhwf zzhwfVar = (zzhwf) obj;
        return zzhwfVar.zzb == this.zzb && Objects.equals(zzhwfVar.zzc, this.zzc) && zzhwfVar.zzd == this.zzd && zzhwfVar.zze == this.zze;
    }

    public final int hashCode() {
        return Objects.hash(zzhwf.class, Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze);
    }

    public final String toString() {
        BigInteger bigInteger = this.zzc;
        zzhwd zzhwdVar = this.zze;
        String strValueOf = String.valueOf(this.zzd);
        String strValueOf2 = String.valueOf(zzhwdVar);
        String strValueOf3 = String.valueOf(bigInteger);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i10).length() + 13);
        sb2.append("RSA SSA PKCS1 Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", hashType: ");
        sb2.append(strValueOf2);
        sb2.append(", publicExponent: ");
        sb2.append(strValueOf3);
        sb2.append(", and ");
        sb2.append(i10);
        sb2.append("-bit modulus)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzd != zzhwe.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final BigInteger zzd() {
        return this.zzc;
    }

    public final zzhwe zze() {
        return this.zzd;
    }

    public final zzhwd zzf() {
        return this.zze;
    }
}
