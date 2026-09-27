package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcmq {
    private final zzcmh zza;
    private final zzdyz zzb;

    public zzcmq(zzcmh zzcmhVar, zzdyz zzdyzVar) {
        this.zza = zzcmhVar;
        this.zzb = zzdyzVar;
    }

    public final void zza(final Context context, final VersionInfoParcel versionInfoParcel) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpq)).booleanValue()) {
            Executor threadPoolExecutor = zzcff.zza;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzps)).booleanValue()) {
                zzcmp zzcmpVar = new zzcmp(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpu)).intValue(), null);
                int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpt)).intValue();
                threadPoolExecutor = new ThreadPoolExecutor(iIntValue, iIntValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzcmpVar);
            }
            threadPoolExecutor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb(context, versionInfoParcel);
                }
            });
        }
    }

    public final /* synthetic */ void zzb(Context context, VersionInfoParcel versionInfoParcel) {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        com.google.android.gms.ads.internal.zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpr)).booleanValue()) {
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            zzdyy zzdyyVarZza = this.zzb.zza();
            zzdyyVarZza.zzc("action", "webview_startup_l");
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length());
            sb2.append(jElapsedRealtime2);
            zzdyyVarZza.zzc("webview_startup_l", sb2.toString());
            zzdyyVarZza.zzd();
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpx)).booleanValue() || Build.VERSION.SDK_INT < 24) {
            return;
        }
        zzcff.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ void zzc() {
        this.zza.zzb(new zzcml(this, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
    }

    public final /* synthetic */ zzdyz zzd() {
        return this.zzb;
    }
}
