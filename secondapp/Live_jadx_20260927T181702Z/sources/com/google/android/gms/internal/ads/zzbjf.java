package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@zq.j
public final class zzbjf {

    @Nullable
    private z.m zza;

    @Nullable
    private z.d zzb;

    @Nullable
    private z.i zzc;

    @Nullable
    private zzbje zzd;

    public static boolean zza(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i10 = 0; i10 < listQueryIntentActivities.size(); i10++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(zzimy.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final void zzb(Activity activity) {
        z.i iVar = this.zzc;
        if (iVar == null) {
            return;
        }
        activity.unbindService(iVar);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    @Nullable
    public final z.m zzc() {
        z.d dVar = this.zzb;
        if (dVar == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = dVar.k(null);
        }
        return this.zza;
    }

    public final void zzd(zzbje zzbjeVar) {
        this.zzd = zzbjeVar;
    }

    public final void zze(Activity activity) {
        String strZza;
        if (this.zzb == null && (strZza = zzimy.zza(activity)) != null) {
            zzimz zzimzVar = new zzimz(this);
            this.zzc = zzimzVar;
            z.d.b(activity, strZza, zzimzVar);
        }
    }

    public final void zzf(z.d dVar) {
        this.zzb = dVar;
        dVar.n(0L);
        zzbje zzbjeVar = this.zzd;
        if (zzbjeVar != null) {
            zzbjeVar.zza();
        }
    }

    public final void zzg() {
        this.zzb = null;
        this.zza = null;
    }
}
