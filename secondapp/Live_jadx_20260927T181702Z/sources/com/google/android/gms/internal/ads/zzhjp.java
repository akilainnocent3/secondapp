package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhjp implements zzhcu {
    private final byte[] zza;
    private final int zzb;
    private final zzhps zzc;

    private zzhjp(byte[] bArr, zziam zziamVar, int i10) throws GeneralSecurityException {
        this.zzc = zzhzz.zzb(zzhpq.zzc(zzhpr.zzb(bArr.length), zziao.zza(bArr, zzhda.zza())));
        this.zza = zziamVar.zzc();
        this.zzb = i10;
    }

    public static zzhcu zzb(zzhhp zzhhpVar) throws GeneralSecurityException {
        zzhhpVar.zzf();
        zzhhpVar.zzf();
        return new zzhjp(zzhhpVar.zze().zzc(zzhda.zza()), zzhhpVar.zzc(), zzhhpVar.zzf().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzhcu
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zza;
        int i10 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i11 = i10 + length2;
        if (length < i11 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhnq.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i11);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = bArrCopyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 4, length3);
        System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length3);
        zzhps zzhpsVar = this.zzc;
        byte[] bArr6 = new byte[32];
        System.arraycopy(zzhpsVar.zza(bArr4, 16), 0, bArr6, 0, 16);
        System.arraycopy(zzhpsVar.zza(bArr5, 16), 0, bArr6, 16, 16);
        if (!zzhkh.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKey secretKeyZzb = zzhin.zzb(bArr6);
        int i12 = i11 + 12;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i11, i12);
        if (bArrCopyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i11 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecZzc = zzhin.zzc(bArrCopyOfRange2, 0, 12);
        Cipher cipherZza = zzhin.zza();
        cipherZza.init(2, secretKeyZzb, algorithmParameterSpecZzc);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZza.updateAAD(bArr2);
        }
        return cipherZza.doFinal(bArr, i12, length - i12);
    }
}
