package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgts {
    public static zzgto zza(zzgto zzgtoVar) {
        if ((zzgtoVar instanceof zzgtr) || (zzgtoVar instanceof zzgtp)) {
            return zzgtoVar;
        }
        return zzgtoVar instanceof Serializable ? new zzgtp(zzgtoVar) : new zzgtr(zzgtoVar);
    }
}
