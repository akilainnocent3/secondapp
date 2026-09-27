package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcuh {
    private final zzdyz zza;
    private final zzfke zzb;

    public zzcuh(zzdyz zzdyzVar, zzfke zzfkeVar) {
        this.zza = zzdyzVar;
        this.zzb = zzfkeVar;
    }

    public final void zza(long j10, int i10) {
        String str;
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zza(this.zzb.zzb.zzb);
        zzdyyVarZza.zzc("action", "ad_closed");
        zzdyyVarZza.zzc("show_time", String.valueOf(j10));
        zzdyyVarZza.zzc(FirebaseAnalytics.d.f52079b, "app_open_ad");
        int i11 = i10 - 1;
        if (i11 == 0) {
            str = "h";
        } else if (i11 == 1) {
            str = "bb";
        } else if (i11 == 2) {
            str = t1.c.f135980f;
        } else if (i11 != 3) {
            str = i11 != 4 ? "u" : CampaignEx.KEY_ACTIVITY_PATH_AND_NAME;
        } else {
            str = "cb";
        }
        zzdyyVarZza.zzc("acr", str);
        zzdyyVarZza.zzd();
    }
}
