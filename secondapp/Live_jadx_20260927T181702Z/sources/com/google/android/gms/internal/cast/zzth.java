package com.google.android.gms.internal.cast;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzth {
    private static final zztf zza = new zztg();
    private static final zztf zzb;

    static {
        zztf zztfVar = null;
        try {
            zztfVar = (zztf) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zzb = zztfVar;
    }

    public static zztf zza() {
        zztf zztfVar = zzb;
        if (zztfVar != null) {
            return zztfVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zztf zzb() {
        return zza;
    }
}
