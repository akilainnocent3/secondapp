package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgwd extends zzgyn {
    final Iterator zza;
    Object zzb;
    Iterator zzc;
    final /* synthetic */ zzgwh zzd;

    public zzgwd(zzgwh zzgwhVar) {
        Objects.requireNonNull(zzgwhVar);
        this.zzd = zzgwhVar;
        this.zza = zzgwhVar.map.entrySet().zze().listIterator(0);
        this.zzb = null;
        this.zzc = zzgwp.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.zzc.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            this.zzb = entry.getKey();
            this.zzc = ((zzgvv) entry.getValue()).iterator();
        }
        Object obj = this.zzb;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.zzc.next());
    }
}
