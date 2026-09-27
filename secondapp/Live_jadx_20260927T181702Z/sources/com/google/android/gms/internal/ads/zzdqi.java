package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdqi {
    private final zzdyz zza;

    public zzdqi(zzdyz zzdyzVar) {
        this.zza = zzdyzVar;
    }

    public final void zza(@Nullable View view, zzfjt zzfjtVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzor)).booleanValue() || view == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(view) ? "0" : "1";
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc("action", "hcp");
        zzdyyVarZza.zzc("hcp", str);
        zzdyyVarZza.zzb(zzfjtVar);
        zzdyyVarZza.zzd();
    }
}
