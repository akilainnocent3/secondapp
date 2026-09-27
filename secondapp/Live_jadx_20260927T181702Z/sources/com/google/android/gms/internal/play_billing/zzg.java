package com.google.android.gms.internal.play_billing;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzg {
    static final zzg zza;
    static final zzg zzb;

    @Nullable
    final Throwable zzc;

    static {
        if (zzq.zza) {
            zzb = null;
            zza = null;
        } else {
            zzb = new zzg(false, null);
            zza = new zzg(true, null);
        }
    }

    public zzg(boolean z10, @Nullable Throwable th2) {
        this.zzc = th2;
    }
}
