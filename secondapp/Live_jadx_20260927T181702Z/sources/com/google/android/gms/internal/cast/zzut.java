package com.google.android.gms.internal.cast;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzut {
    private static final zzus zza;
    private static final zzus zzb;

    static {
        zzus zzusVar = null;
        try {
            zzusVar = (zzus) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzusVar;
        zzb = new zzus();
    }

    public static zzus zza() {
        return zza;
    }

    public static zzus zzb() {
        return zzb;
    }
}
