package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzguy extends zzgvc {
    final /* synthetic */ zzgvg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzguy(zzgvg zzgvgVar) {
        super(zzgvgVar, null);
        Objects.requireNonNull(zzgvgVar);
        this.zza = zzgvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    public final Object zza(int i10) {
        return this.zza.zzo(i10);
    }
}
