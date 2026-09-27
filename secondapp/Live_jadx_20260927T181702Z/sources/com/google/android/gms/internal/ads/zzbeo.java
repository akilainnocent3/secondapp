package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzbeo implements zzber {
    final /* synthetic */ Activity zza;

    public zzbeo(zzbes zzbesVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzbesVar);
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.zza);
    }
}
