package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgxv extends zzgvz {
    final /* synthetic */ zzgxw zza;

    public zzgxv(zzgxw zzgxwVar) {
        Objects.requireNonNull(zzgxwVar);
        this.zza = zzgxwVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzgxw zzgxwVar = this.zza;
        zzgsw.zzm(i10, zzgxwVar.zzx(), "index");
        int i11 = i10 + i10;
        Object obj = zzgxwVar.zzw()[i11];
        Objects.requireNonNull(obj);
        Object obj2 = zzgxwVar.zzw()[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    public final boolean zzf() {
        return true;
    }
}
