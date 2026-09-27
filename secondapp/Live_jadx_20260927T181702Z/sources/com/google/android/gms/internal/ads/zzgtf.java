package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgtf implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzgtl zzb;

    public zzgtf(zzgtl zzgtlVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzgtlVar);
        this.zzb = zzgtlVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzf(this.zza);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(fw.b.f85384k);
        zzgsq.zzb(sb2, this, ", ");
        sb2.append(fw.b.f85385l);
        return sb2.toString();
    }
}
