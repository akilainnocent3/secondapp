package com.google.android.gms.internal.cast;

import java.util.AbstractMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfy extends zzfq {
    final /* synthetic */ zzfz zza;

    public zzfy(zzfz zzfzVar) {
        this.zza = zzfzVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzez.zza(i10, this.zza.zzc, "index");
        zzfz zzfzVar = this.zza;
        int i11 = i10 + i10;
        Object obj = zzfzVar.zzb[i11];
        obj.getClass();
        Object obj2 = zzfzVar.zzb[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.cast.zzfm
    public final boolean zzf() {
        return true;
    }
}
