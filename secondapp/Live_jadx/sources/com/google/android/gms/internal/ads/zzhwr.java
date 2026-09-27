package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhwr extends zzhxb {
    public static final BigInteger zza = BigInteger.valueOf(65537);
    private final int zzb;
    private final BigInteger zzc;
    private final zzhwq zzd;
    private final zzhwp zze;
    private final zzhwp zzf;
    private final int zzg;

    public /* synthetic */ zzhwr(int i10, BigInteger bigInteger, zzhwq zzhwqVar, zzhwp zzhwpVar, zzhwp zzhwpVar2, int i11, byte[] bArr) {
        this.zzb = i10;
        this.zzc = bigInteger;
        this.zzd = zzhwqVar;
        this.zze = zzhwpVar;
        this.zzf = zzhwpVar2;
        this.zzg = i11;
    }

    public static zzhwo zzb() {
        return new zzhwo(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhwr)) {
            return false;
        }
        zzhwr zzhwrVar = (zzhwr) obj;
        return zzhwrVar.zzb == this.zzb && Objects.equals(zzhwrVar.zzc, this.zzc) && Objects.equals(zzhwrVar.zzd, this.zzd) && Objects.equals(zzhwrVar.zze, this.zze) && Objects.equals(zzhwrVar.zzf, this.zzf) && zzhwrVar.zzg == this.zzg;
    }

    public final int hashCode() {
        return Objects.hash(zzhwr.class, Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzf, Integer.valueOf(this.zzg));
    }

    public final String toString() {
        BigInteger bigInteger = this.zzc;
        zzhwp zzhwpVar = this.zzf;
        zzhwp zzhwpVar2 = this.zze;
        String strValueOf = String.valueOf(this.zzd);
        String strValueOf2 = String.valueOf(zzhwpVar2);
        String strValueOf3 = String.valueOf(zzhwpVar);
        String strValueOf4 = String.valueOf(bigInteger);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i10 = this.zzg;
        int length4 = String.valueOf(i10).length();
        int length5 = strValueOf4.length();
        int i11 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i11).length() + 13);
        sb2.append("RSA SSA PSS Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", signature hashType: ");
        sb2.append(strValueOf2);
        sb2.append(", mgf1 hashType: ");
        sb2.append(strValueOf3);
        sb2.append(", saltLengthBytes: ");
        sb2.append(i10);
        sb2.append(", publicExponent: ");
        sb2.append(strValueOf4);
        sb2.append(", and ");
        sb2.append(i11);
        sb2.append("-bit modulus)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzd != zzhwq.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final BigInteger zzd() {
        return this.zzc;
    }

    public final zzhwq zze() {
        return this.zzd;
    }

    public final zzhwp zzf() {
        return this.zze;
    }

    public final zzhwp zzg() {
        return this.zzf;
    }

    public final int zzh() {
        return this.zzg;
    }
}
