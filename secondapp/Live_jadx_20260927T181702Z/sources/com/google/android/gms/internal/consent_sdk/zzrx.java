package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzrx {
    private static final zzrx zza = new zzrx();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzsb zzb = new zzrh();

    private zzrx() {
    }

    public static zzrx zza() {
        return zza;
    }

    public final zzsa zzb(Class cls) {
        byte[] bArr = zzqs.zzb;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentMap concurrentMap = this.zzc;
        zzsa zzsaVarZza = (zzsa) concurrentMap.get(cls);
        if (zzsaVarZza == null) {
            zzsaVarZza = this.zzb.zza(cls);
            zzsa zzsaVar = (zzsa) concurrentMap.putIfAbsent(cls, zzsaVarZza);
            if (zzsaVar != null) {
                return zzsaVar;
            }
        }
        return zzsaVarZza;
    }
}
