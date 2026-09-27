package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhme {
    private static final zzhme zza = new zzhme();
    private static final zzhmd zzb = new zzhmd(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzhme zza() {
        return zza;
    }

    public final zzhlw zzb() {
        zzhlw zzhlwVar = (zzhlw) this.zzc.get();
        return zzhlwVar == null ? zzb : zzhlwVar;
    }
}
