package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgwg extends zzgvv {
    private final transient zzgwh zza;

    public zzgwg(zzgwh zzgwhVar) {
        this.zza = zzgwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgwe(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    /* JADX INFO: renamed from: zza */
    public final zzgyn iterator() {
        return new zzgwe(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    public final boolean zzf() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgvv
    public final int zzg(Object[] objArr, int i10) {
        zzgyo zzgyoVarListIterator = ((zzgvz) this.zza.map.values()).listIterator(0);
        while (zzgyoVarListIterator.hasNext()) {
            i10 = ((zzgvv) zzgyoVarListIterator.next()).zzg(objArr, i10);
        }
        return i10;
    }
}
