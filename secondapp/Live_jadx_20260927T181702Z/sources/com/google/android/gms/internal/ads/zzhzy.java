package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzhzy implements zzhps {
    final zzhps zza;
    final zzhps zzb;

    public /* synthetic */ zzhzy(zzhps zzhpsVar, zzhps zzhpsVar2, byte[] bArr) {
        this.zza = zzhpsVar;
        this.zzb = zzhpsVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhps
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        return bArr.length <= 64 ? this.zza.zza(bArr, i10) : this.zzb.zza(bArr, i10);
    }
}
