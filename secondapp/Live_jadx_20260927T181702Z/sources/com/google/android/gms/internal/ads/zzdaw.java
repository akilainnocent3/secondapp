package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzdaw implements zzhbf {
    final /* synthetic */ zzday zza;

    public zzdaw(zzday zzdayVar) {
        Objects.requireNonNull(zzdayVar);
        this.zza = zzdayVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        this.zza.zzk().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th2) {
    }
}
