package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzacc implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ Runnable zza;

    public zzacc(zzace zzaceVar, Runnable runnable) {
        this.zza = runnable;
        Objects.requireNonNull(zzaceVar);
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.zza.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.zza.run();
    }
}
