package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhzz implements zzhps {
    public static zzhps zzb(zzhpq zzhpqVar) throws GeneralSecurityException {
        zzhps zzhpsVarZzb = zzhpw.zzb(zzhpqVar);
        try {
            return new zzhzy(zzhpsVarZzb, zzhpx.zzb(zzhpqVar), null);
        } catch (GeneralSecurityException unused) {
            return zzhpsVarZzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhps
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        throw null;
    }
}
