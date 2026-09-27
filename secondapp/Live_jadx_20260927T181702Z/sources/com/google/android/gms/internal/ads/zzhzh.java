package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhzh implements zzhcu {
    private final zzhzx zza;
    private final zzhds zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzhzh(zzhzx zzhzxVar, zzhds zzhdsVar, int i10, byte[] bArr) {
        this.zza = zzhzxVar;
        this.zzb = zzhdsVar;
        this.zzc = i10;
        this.zzd = bArr;
    }

    public static zzhcu zzb(zzher zzherVar) throws GeneralSecurityException {
        zzhyr zzhyrVar = new zzhyr(zzherVar.zze().zzc(zzhda.zza()), zzherVar.zzg().zzf());
        String strValueOf = String.valueOf(zzherVar.zzg().zzh());
        return new zzhzh(zzhyrVar, new zziac(new zziab("HMAC".concat(strValueOf), new SecretKeySpec(zzherVar.zzf().zzc(zzhda.zza()), "HMAC")), zzherVar.zzg().zze()), zzherVar.zzg().zze(), zzherVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhcu
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int length = bArr.length;
        int i10 = this.zzc;
        int length2 = bArr3.length;
        if (length < i10 + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzhnq.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i11 = length - i10;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i11);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i11, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((zziac) this.zzb).zzc(zzhyy.zza(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))), bArrCopyOfRange2)) {
            return this.zza.zza(bArrCopyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
