package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import k.j0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhl {
    private final zza zza;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface zza {
        void doStartService(Context context, Intent intent);
    }

    public zzhl(zza zzaVar) {
        Preconditions.checkNotNull(zzaVar);
        this.zza = zzaVar;
    }

    @j0
    public final void zza(Context context, Intent intent) {
        zzic zzicVarZzy = zzic.zzy(context, null, null);
        zzgu zzguVarZzaV = zzicVarZzy.zzaV();
        if (intent == null) {
            zzguVarZzaV.zze().zza("Receiver called with null intent");
            return;
        }
        zzicVarZzy.zzaU();
        String action = intent.getAction();
        zzguVarZzaV.zzk().zzb("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                zzguVarZzaV.zze().zza("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzguVarZzaV.zzk().zza("Starting wakeful intent.");
            this.zza.doStartService(context, className);
        }
    }
}
