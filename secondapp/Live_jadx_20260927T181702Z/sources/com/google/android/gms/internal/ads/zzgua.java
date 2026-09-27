package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgua extends zzgxc {
    final /* synthetic */ zzguc zza;

    public zzgua(zzguc zzgucVar) {
        Objects.requireNonNull(zzgucVar);
        this.zza = zzgucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzgux.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzgub(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzguc zzgucVar = this.zza;
        zzgucVar.zzb.zzn(entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxc
    public final Map zza() {
        return this.zza;
    }
}
