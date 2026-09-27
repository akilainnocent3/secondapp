package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgpq implements zzgor, zzgem {
    static final String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private final Context zzb;
    private final ExecutorService zzc;
    private final String[] zzd;
    private long zze = 0;
    private long zzf = 0;
    private long zzg = -1;
    private boolean zzh = false;

    public zzgpq(Context context, zzgbx zzgbxVar, ExecutorService executorService, String[] strArr) {
        this.zzb = context;
        this.zzc = executorService;
        this.zzd = strArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final nj.t1 zza() {
        return Build.VERSION.SDK_INT < 30 ? zzhbi.zzb() : zzhbi.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgpp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgor
    public final void zzb(Map map) {
        long j10;
        long j11;
        zze();
        synchronized (this) {
            try {
                j10 = this.zzh ? this.zzf - this.zze : -1L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        map.put("vs", Long.valueOf(j10));
        synchronized (this) {
            j11 = this.zzg;
            this.zzg = -1L;
        }
        map.put("vf", Long.valueOf(j11));
    }

    @Override // com.google.android.gms.internal.ads.zzgor
    public final void zzc(Map map, Context context, View view) {
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgor
    public final void zzd(Map map) {
        zze();
    }

    public final void zze() {
        synchronized (this) {
            try {
                if (this.zzh) {
                    this.zzf = System.currentTimeMillis();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void zzf() {
        zzgpo zzgpoVar = new zzgpo(this);
        try {
            Object systemService = this.zzb.getSystemService("appops");
            if (systemService == null) {
                throw null;
            }
            ((AppOpsManager) systemService).startWatchingActive(this.zzd, this.zzc, zzgpoVar);
        } catch (Throwable unused) {
        }
    }

    public final /* synthetic */ void zzg(long j10) {
        this.zze = j10;
    }

    public final /* synthetic */ long zzh() {
        return this.zzf;
    }

    public final /* synthetic */ void zzi(long j10) {
        this.zzg = j10;
    }

    public final /* synthetic */ void zzj(boolean z10) {
        this.zzh = z10;
    }
}
