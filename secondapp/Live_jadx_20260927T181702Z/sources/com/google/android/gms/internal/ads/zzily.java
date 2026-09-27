package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzily implements Iterator {
    int zza = 0;
    final /* synthetic */ zzilz zzb;

    public zzily(zzilz zzilzVar) {
        this.zzb = zzilzVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zza;
        zzilz zzilzVar = this.zzb;
        return i10 < zzilzVar.zza.size() || zzilzVar.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.zza;
        zzilz zzilzVar = this.zzb;
        List list = zzilzVar.zza;
        if (i10 >= list.size()) {
            list.add(zzilzVar.zzb.next());
            return next();
        }
        int i11 = this.zza;
        this.zza = i11 + 1;
        return list.get(i11);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
