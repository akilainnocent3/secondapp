package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzar implements Iterator {
    final /* synthetic */ zzas zza;
    private int zzb;

    public zzar(zzas zzasVar) {
        Objects.requireNonNull(zzasVar);
        this.zza = zzasVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzb().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        zzas zzasVar = this.zza;
        String strZzb = zzasVar.zzb();
        int i10 = this.zzb;
        if (i10 >= strZzb.length()) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return new zzas(String.valueOf(zzasVar.zzb().charAt(i10)));
    }
}
