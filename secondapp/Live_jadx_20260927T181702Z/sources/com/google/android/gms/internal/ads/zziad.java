package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zziad implements zzhdw {
    private final RSAPublicKey zza;
    private final zzhzv zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    public /* synthetic */ zziad(RSAPublicKey rSAPublicKey, zzhzv zzhzvVar, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (zzhki.zza()) {
            throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        }
        zziak.zzb(zzhzvVar);
        zziak.zzc(rSAPublicKey.getModulus().bitLength());
        zziak.zzd(rSAPublicKey.getPublicExponent());
        this.zza = rSAPublicKey;
        this.zzb = zzhzvVar;
        this.zzc = bArr;
        this.zzd = bArr2;
    }

    private final void zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZza;
        int i10;
        RSAPublicKey rSAPublicKey = this.zza;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        if (iBitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrZzb = zzhkk.zzb(bigInteger.modPow(publicExponent, modulus), iBitLength);
        zzhzv zzhzvVar = this.zzb;
        zziak.zzb(zzhzvVar);
        MessageDigest messageDigest = (MessageDigest) zzhzm.zzd.zzb(zziaj.zzb(zzhzvVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.zzd;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = zzhzvVar.ordinal();
        int i11 = 2;
        if (iOrdinal == 2) {
            bArrZza = zzhzw.zza("3031300d060960864801650304020105000420");
        } else if (iOrdinal == 3) {
            bArrZza = zzhzw.zza("3041300d060960864801650304020205000430");
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(zzhzvVar.toString()));
            }
            bArrZza = zzhzw.zza("3051300d060960864801650304020305000440");
        }
        int length = bArrZza.length + bArrDigest.length;
        if (iBitLength < length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[iBitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i12 = 0;
        while (true) {
            i10 = i11 + 1;
            if (i12 >= (iBitLength - length) - 3) {
                break;
            }
            bArr4[i11] = -1;
            i12++;
            i11 = i10;
        }
        bArr4[i11] = 0;
        int length2 = bArrZza.length;
        System.arraycopy(bArrZza, 0, bArr4, i10, length2);
        System.arraycopy(bArrDigest, 0, bArr4, i10 + length2, bArrDigest.length);
        if (!MessageDigest.isEqual(bArrZzb, bArr4)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdw
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzc;
        int length = bArr3.length;
        if (length == 0) {
            zzb(bArr, bArr2);
        } else {
            if (!zzhnq.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzb(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
