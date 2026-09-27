package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzbgt extends zzcfk {
    final /* synthetic */ zzbgz zza;

    public zzbgt(zzbgz zzbgzVar) {
        Objects.requireNonNull(zzbgzVar);
        this.zza = zzbgzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        this.zza.zzb();
        return super.cancel(z10);
    }
}
