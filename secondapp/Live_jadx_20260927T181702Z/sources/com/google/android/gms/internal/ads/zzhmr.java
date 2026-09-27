package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzhmr implements Iterable {
    final /* synthetic */ List zza;
    final /* synthetic */ List zzb;

    public zzhmr(zzhmu zzhmuVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
        Objects.requireNonNull(zzhmuVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzhmt(this.zza.iterator(), this.zzb.iterator(), null);
    }
}
