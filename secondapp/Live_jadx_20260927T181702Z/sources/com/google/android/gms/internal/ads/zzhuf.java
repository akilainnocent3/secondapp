package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhuf {
    public static final zzhuf zza = new zzhuf("NIST_P256", zzhkw.zza);
    public static final zzhuf zzb = new zzhuf("NIST_P384", zzhkw.zzb);
    public static final zzhuf zzc = new zzhuf("NIST_P521", zzhkw.zzc);
    private final String zzd;
    private final ECParameterSpec zze;

    private zzhuf(String str, ECParameterSpec eCParameterSpec) {
        this.zzd = str;
        this.zze = eCParameterSpec;
    }

    public final String toString() {
        return this.zzd;
    }

    public final ECParameterSpec zza() {
        return this.zze;
    }
}
