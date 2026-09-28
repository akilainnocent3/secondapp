package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import defpackage.ej5;
import defpackage.v1b;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdz {
    private static zzeh zza;

    public static final zzeh zza(Application application) {
        zzeh zzehVar = zza;
        if (zzehVar == null) {
            zzehVar = new zzeh(application);
        }
        if (zza == null) {
            zza = zzehVar;
        }
        return zzehVar;
    }

    public static final Object zzb(Application application, String str, long j, v1b v1bVar) {
        return zzeh.zzd(zza(application), str, j, null, null, v1bVar, 12, null);
    }

    public static final Task zzc(Application application, String str, long j) {
        return zzbv.zza(ej5.a(zza(application).zza().zza(), null, new zzdx(application, str, j, null), 3));
    }

    public static final Object zzd(Application application, String str, v1b v1bVar) {
        return zzeh.zzd(zza(application), str, 0L, null, zzdq.zzb, v1bVar, 2, null);
    }

    public static final Task zze(Application application, String str) {
        return zzbv.zza(ej5.a(zza(application).zza().zza(), null, new zzdy(application, str, null), 3));
    }
}
