package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzatp implements zzats {
    final /* synthetic */ File zza;

    public zzatp(zzatt zzattVar, File file) {
        this.zza = file;
        Objects.requireNonNull(zzattVar);
    }

    @Override // com.google.android.gms.internal.ads.zzats
    public final File zza() {
        return this.zza;
    }
}
