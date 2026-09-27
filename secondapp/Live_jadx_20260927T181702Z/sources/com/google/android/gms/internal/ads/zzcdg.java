package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcdg {
    private final Clock zza;
    private final zzcde zzb;

    public zzcdg(Clock clock, zzcde zzcdeVar) {
        this.zza = clock;
        this.zzb = zzcdeVar;
    }

    public static zzcdg zza(Context context) {
        return zzcdo.zzb(context).zza();
    }

    public final void zzb() {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzfr zzfrVar) {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzd(int i10, long j10) {
        this.zzb.zza(i10, j10);
    }
}
