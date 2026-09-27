package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcsn implements zzdda {
    private final zzflk zza;

    public zzcsn(zzflk zzflkVar) {
        this.zza = zzflkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zza(@Nullable Context context) {
        try {
            this.zza.zzi();
        } catch (zzfkt e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onPause for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzb(@Nullable Context context) {
        try {
            zzflk zzflkVar = this.zza;
            zzflkVar.zzj();
            if (context != null) {
                zzflkVar.zzp(context);
            }
        } catch (zzfkt e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onResume for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzc(@Nullable Context context) {
        try {
            this.zza.zzf();
        } catch (zzfkt e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onDestroy for the mediation adapter.", e10);
        }
    }
}
