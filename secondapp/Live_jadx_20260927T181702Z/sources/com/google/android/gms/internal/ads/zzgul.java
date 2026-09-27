package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
class zzgul implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzgum zzc;

    public zzgul(zzgum zzgumVar) {
        Objects.requireNonNull(zzgumVar);
        this.zzc = zzgumVar;
        Collection collection = zzgumVar.zzb;
        this.zzb = collection;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        zzgum zzgumVar = this.zzc;
        zzgup zzgupVar = zzgumVar.zze;
        zzgupVar.zzq(zzgupVar.zzp() - 1);
        zzgumVar.zzb();
    }

    public final void zza() {
        zzgum zzgumVar = this.zzc;
        zzgumVar.zza();
        if (zzgumVar.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    public zzgul(zzgum zzgumVar, Iterator it) {
        Objects.requireNonNull(zzgumVar);
        this.zzc = zzgumVar;
        this.zzb = zzgumVar.zzb;
        this.zza = it;
    }
}
