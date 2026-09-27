package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgxm extends zzgxl {
    final /* synthetic */ zzgxn zza;

    public zzgxm(zzgxn zzgxnVar, int i10) {
        Objects.requireNonNull(zzgxnVar);
        this.zza = zzgxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final zzgwu zza() {
        return new zzgxp(this.zza.zza(), new zzgxk(2));
    }
}
