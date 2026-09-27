package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzftt {
    private boolean zza;

    public final boolean zza() {
        return this.zza;
    }

    public final void zzb(Context context) {
        zzfvs.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfva.zza().zzb(context);
        zzfur.zza().zzd(context);
        zzfvn.zza(context);
        zzfvo.zza(context);
        zzfvr.zza(context);
        zzfux.zza().zzc(context);
        zzfuq.zza().zzc(context);
        zzfvc.zza().zzb(context);
    }
}
