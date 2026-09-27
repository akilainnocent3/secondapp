package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzti implements zzth {
    private final Object zza;

    private zzti(Object obj) {
        this.zza = obj;
    }

    public static zzth zza(Object obj) {
        if (obj != null) {
            return new zzti(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    public final Object zzb() {
        return this.zza;
    }
}
