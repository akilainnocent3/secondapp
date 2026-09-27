package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhpi implements zzhoa {
    public zzhpi(zzhns zzhnsVar) {
    }

    public static zzhoa zza(zzhns zzhnsVar) throws GeneralSecurityException {
        if (!zzhkh.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider providerZza = zzhkl.zza();
        if (providerZza != null) {
            try {
                return zzhph.zza(zzhnsVar, providerZza);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new zzhpi(zzhnsVar);
    }
}
