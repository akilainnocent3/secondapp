package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgwx extends zzgym {
    final /* synthetic */ zzgwy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgwx(zzgwy zzgwyVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgwyVar);
        this.zza = zzgwyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
