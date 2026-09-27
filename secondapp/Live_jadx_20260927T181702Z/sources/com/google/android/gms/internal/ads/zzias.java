package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzias extends zziat implements Iterable {
    private final ArrayList zza = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zzias) && ((zzias) obj).zza.equals(this.zza);
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final void zza(zziat zziatVar) {
        this.zza.add(zziatVar);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final zziat zzc(int i10) {
        return (zziat) this.zza.get(i10);
    }

    @Override // com.google.android.gms.internal.ads.zziat
    public final String zzd() {
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        if (size == 1) {
            return ((zziat) arrayList.get(0)).zzd();
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 37);
        sb2.append("Array must have size 1, but has size ");
        sb2.append(size);
        throw new IllegalStateException(sb2.toString());
    }
}
