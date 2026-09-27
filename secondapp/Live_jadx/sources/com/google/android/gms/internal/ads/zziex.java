package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zziex {
    public static final boolean zza(Object obj) {
        return !((zziew) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zziew zziewVarZzc = (zziew) obj;
        zziew zziewVar = (zziew) obj2;
        if (!zziewVar.isEmpty()) {
            if (!zziewVarZzc.zze()) {
                zziewVarZzc = zziewVarZzc.zzc();
            }
            zziewVarZzc.zzb(zziewVar);
        }
        return zziewVarZzc;
    }
}
