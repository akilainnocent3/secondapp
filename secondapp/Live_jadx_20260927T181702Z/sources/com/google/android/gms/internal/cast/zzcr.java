package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.framework.media.uicontroller.UIController;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzcr extends UIController {
    private boolean zza = true;

    public void zza(boolean z10) {
        this.zza = z10;
    }

    public abstract void zzb(long j10);

    public final boolean zzc() {
        return this.zza;
    }
}
