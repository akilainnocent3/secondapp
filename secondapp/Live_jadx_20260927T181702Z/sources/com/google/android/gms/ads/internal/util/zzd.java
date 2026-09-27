package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbka;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzcfi;
import nj.t1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class zzd {
    public static void zza(Context context) {
        int i10 = com.google.android.gms.ads.internal.util.client.zzl.zza;
        if (((Boolean) zzbka.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || com.google.android.gms.ads.internal.util.client.zzl.zzi()) {
                    return;
                }
                t1 t1VarZzb = new zzc(context).zzb();
                int i11 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Updating ad debug logging enablement.");
                zzcfi.zza(t1VarZzb, "AdDebugLogUpdater.updateEnablement", zzcff.zzh);
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to determine debug setting.", e10);
            }
        }
    }
}
