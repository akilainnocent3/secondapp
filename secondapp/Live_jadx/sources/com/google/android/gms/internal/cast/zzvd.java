package com.google.android.gms.internal.cast;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzvd {
    private static final zzvc zza;
    private static final zzvc zzb;

    static {
        zzvc zzvcVar = null;
        try {
            zzvcVar = (zzvc) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzvcVar;
        zzb = new zzvc();
    }

    public static zzvc zza() {
        return zza;
    }

    public static zzvc zzb() {
        return zzb;
    }
}
