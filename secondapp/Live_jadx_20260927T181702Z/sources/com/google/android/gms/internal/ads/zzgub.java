package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgub implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzguc zzc;

    public zzgub(zzguc zzgucVar) {
        Objects.requireNonNull(zzgucVar);
        this.zzc = zzgucVar;
        this.zza = zzgucVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zzb(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzgsw.zzj(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        int size = this.zzb.size();
        zzgup zzgupVar = this.zzc.zzb;
        zzgupVar.zzq(zzgupVar.zzp() - size);
        this.zzb.clear();
        this.zzb = null;
    }
}
