package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateCrtKey;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zziaf implements zzhdv {
    public /* synthetic */ zziaf(RSAPrivateCrtKey rSAPrivateCrtKey, zzhzv zzhzvVar, zzhzv zzhzvVar2, int i10, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (zzhki.zza()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zziak.zzb(zzhzvVar);
        if (!zzhzvVar.equals(zzhzvVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        zziak.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zziak.zzd(rSAPrivateCrtKey.getPublicExponent());
    }

    @Override // com.google.android.gms.internal.ads.zzhdv
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
