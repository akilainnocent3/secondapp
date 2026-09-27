package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcjy {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    public zzcjy(String str) {
    }

    public final boolean zza() {
        return this.zza.get();
    }

    public final void zzb() {
        this.zza.set(true);
    }

    public final void zzc() {
        this.zza.set(false);
    }

    public final void zzd() {
        this.zza.set(false);
    }
}
