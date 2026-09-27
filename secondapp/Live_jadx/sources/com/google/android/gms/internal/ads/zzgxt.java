package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgxt implements Comparator {
    public static zzgxt zzb() {
        return zzgxr.zza;
    }

    public static zzgxt zzc(Comparator comparator) {
        return new zzgvi(comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzgxt zza() {
        return new zzgyc(this);
    }

    public final zzgxt zzd(zzgsn zzgsnVar) {
        return new zzguu(zzgsnVar, this);
    }
}
