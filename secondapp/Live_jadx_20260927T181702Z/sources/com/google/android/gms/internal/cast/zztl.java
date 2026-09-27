package com.google.android.gms.internal.cast;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zztl implements zzuv {
    private static final zztl zza = new zztl();

    private zztl() {
    }

    public static zztl zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.cast.zzuv
    public final zzuu zzb(Class cls) {
        if (!zztp.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzuu) zztp.zzw(cls.asSubclass(zztp.class)).zzb(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzuv
    public final boolean zzc(Class cls) {
        return zztp.class.isAssignableFrom(cls);
    }
}
