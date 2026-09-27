package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzcfp implements zzhbf {
    final /* synthetic */ zzcfr zza;

    public zzcfp(zzcfr zzcfrVar) {
        Objects.requireNonNull(zzcfrVar);
        this.zza = zzcfrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th2) {
        this.zza.zzj().set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zzb(@Nullable Object obj) {
        this.zza.zzj().set(1);
    }
}
