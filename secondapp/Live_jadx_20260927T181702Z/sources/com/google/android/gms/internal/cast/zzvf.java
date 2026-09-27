package com.google.android.gms.internal.cast;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzvf {
    private static final zzvf zza = new zzvf();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzvj zzb = new zzup();

    private zzvf() {
    }

    public static zzvf zza() {
        return zza;
    }

    public final zzvi zzb(Class cls) {
        zzty.zzc(cls, "messageType");
        zzvi zzviVar = (zzvi) this.zzc.get(cls);
        if (zzviVar != null) {
            return zzviVar;
        }
        zzvi zzviVarZza = this.zzb.zza(cls);
        zzty.zzc(cls, "messageType");
        zzvi zzviVar2 = (zzvi) this.zzc.putIfAbsent(cls, zzviVarZza);
        return zzviVar2 == null ? zzviVarZza : zzviVar2;
    }
}
