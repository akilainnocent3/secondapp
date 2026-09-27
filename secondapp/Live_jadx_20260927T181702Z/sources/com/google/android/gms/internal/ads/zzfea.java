package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfea implements zzfby {
    final ScheduledExecutorService zza;

    public zzfea(zzbyt zzbytVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final nj.t1 zza() {
        return zzhbi.zzk(zzhbi.zzi(zzhbi.zza(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfe)).longValue(), TimeUnit.MILLISECONDS, this.zza), zzfdz.zza, zzcff.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 49;
    }
}
