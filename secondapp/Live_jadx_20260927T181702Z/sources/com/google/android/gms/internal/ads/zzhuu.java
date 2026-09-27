package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhuu extends zzhxc {
    private final zzhva zza;
    private final zziao zzb;

    private zzhuu(zzhva zzhvaVar, zziao zziaoVar) {
        this.zza = zzhvaVar;
        this.zzb = zziaoVar;
    }

    public static zzhuu zzc(zzhva zzhvaVar, zziao zziaoVar) throws GeneralSecurityException {
        if (zziaoVar.zzd() == 32) {
            if (Arrays.equals(zzhvaVar.zzd().zzc(), zzhks.zza(zzhks.zzb(zziaoVar.zzc(zzhda.zza()))))) {
                return new zzhuu(zzhvaVar, zziaoVar);
            }
            throw new GeneralSecurityException("Ed25519 keys mismatch");
        }
        int iZzd = zziaoVar.zzd();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 65);
        sb2.append("Ed25519 key must be constructed with key of length 32 bytes, not ");
        sb2.append(iZzd);
        throw new GeneralSecurityException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhxc, com.google.android.gms.internal.ads.zzhdc
    public final /* synthetic */ zzhdt zza() {
        return this.zza.zzf();
    }

    public final zzhut zzd() {
        return this.zza.zzf();
    }

    public final zzhva zze() {
        return this.zza;
    }

    public final zziao zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhxc
    public final /* synthetic */ zzhxd zzg() {
        return this.zza;
    }
}
