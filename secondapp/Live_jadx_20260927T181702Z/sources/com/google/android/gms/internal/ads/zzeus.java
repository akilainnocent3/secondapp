package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeus {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    @Nullable
    private zzeur zzb;

    public final void zza(boolean z10) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }

    public final void zzc(zzeur zzeurVar) {
        this.zzb = zzeurVar;
    }

    @Nullable
    public final zzeur zzd() {
        return this.zzb;
    }
}
