package com.google.android.gms.internal.cast;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzed extends Handler {
    private final Looper zza;

    public zzed() {
        this.zza = Looper.getMainLooper();
    }

    public zzed(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }
}
