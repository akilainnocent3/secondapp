package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhug {
    public static final zzhug zza = new zzhug("SHA256");
    public static final zzhug zzb = new zzhug("SHA384");
    public static final zzhug zzc = new zzhug("SHA512");
    private final String zzd;

    private zzhug(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}
