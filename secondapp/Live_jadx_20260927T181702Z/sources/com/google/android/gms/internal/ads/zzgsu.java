package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgsu implements Serializable {
    public static zzgsu zzc() {
        return zzgsd.zza;
    }

    public static zzgsu zzd(Object obj) {
        return obj == null ? zzgsd.zza : new zzgtb(obj);
    }

    public abstract Object zza(Object obj);

    public abstract zzgsu zzb(zzgsn zzgsnVar);
}
