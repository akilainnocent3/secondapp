package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zziaj {
    public static String zza(zzhzv zzhzvVar) throws GeneralSecurityException {
        zziak.zzb(zzhzvVar);
        return zzhzvVar.toString().concat("withECDSA");
    }

    public static String zzb(zzhzv zzhzvVar) throws GeneralSecurityException {
        int iOrdinal = zzhzvVar.ordinal();
        if (iOrdinal == 0) {
            return "SHA-1";
        }
        if (iOrdinal == 1) {
            return "SHA-224";
        }
        if (iOrdinal == 2) {
            return to.c.algoTypeS2;
        }
        if (iOrdinal == 3) {
            return "SHA-384";
        }
        if (iOrdinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(zzhzvVar.toString()));
    }
}
