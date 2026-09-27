package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfuv {
    private final zzfwj zza;
    private final String zzb;
    private final zzfub zzc;
    private final String zzd = "Ad overlay";

    public zzfuv(View view, zzfub zzfubVar, @Nullable String str) {
        this.zza = new zzfwj(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfubVar;
    }

    public final zzfwj zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzfub zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
