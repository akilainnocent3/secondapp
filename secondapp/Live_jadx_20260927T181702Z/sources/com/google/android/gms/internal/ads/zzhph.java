package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhph implements zzhoa {
    private zzhph(zzhns zzhnsVar, Provider provider) throws GeneralSecurityException {
        if (!zzhkh.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            zzhnsVar.zze().zzc();
            zzhnsVar.zzf();
            new SecretKeySpec(zzhnsVar.zzd().zzc(zzhda.zza()), to.c.asp);
        } catch (NoSuchAlgorithmException e10) {
            throw new GeneralSecurityException("AES-CMAC not available.", e10);
        }
    }

    public static zzhoa zza(zzhns zzhnsVar, Provider provider) throws GeneralSecurityException {
        return new zzhph(zzhnsVar, provider);
    }
}
