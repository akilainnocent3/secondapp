package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzezj implements zzfby {
    private final Context zza;
    private final Intent zzb;

    public zzezj(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final nj.t1 zza() {
        com.google.android.gms.ads.internal.util.zze.zza("HsdpMigrationSignal.produce");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzol)).booleanValue()) {
            return zzhbi.zza(new zzezk(null));
        }
        boolean z10 = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                com.google.android.gms.ads.internal.util.zze.zza("HSDP intent is supported");
                z10 = true;
            }
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return zzhbi.zza(new zzezk(Boolean.valueOf(z10)));
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 60;
    }
}
