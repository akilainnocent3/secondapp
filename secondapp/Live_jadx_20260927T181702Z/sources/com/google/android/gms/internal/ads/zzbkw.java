package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbkw {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    public static zzbku zza() {
        return (zzbku) zza.get();
    }

    public static zzbkv zzb() {
        return (zzbkv) zzb.get();
    }

    public static void zzc(zzbku zzbkuVar) {
        zza.set(zzbkuVar);
    }
}
