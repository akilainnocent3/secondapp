package com.google.android.gms.internal.cast;

import java.io.Serializable;
import zq.a;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzev implements Serializable {
    public static zzev zzb() {
        return zzer.zza;
    }

    public static zzev zzc(@a Object obj) {
        return obj == null ? zzer.zza : new zzfa(obj);
    }

    public abstract Object zza(Object obj);
}
