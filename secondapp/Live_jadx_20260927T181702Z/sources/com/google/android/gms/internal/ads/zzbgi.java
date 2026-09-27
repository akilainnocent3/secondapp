package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzbgi implements zzbey {
    final /* synthetic */ zzbgl zza;

    public zzbgi(zzbgl zzbglVar) {
        Objects.requireNonNull(zzbglVar);
        this.zza = zzbglVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbey
    public final void zza(boolean z10) {
        if (z10) {
            this.zza.zzf();
        } else {
            this.zza.zzg();
        }
    }
}
