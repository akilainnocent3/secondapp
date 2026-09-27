package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcff {
    public static final zzhbs zza;
    public static final zzhbs zzb;
    public static final zzhbs zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzhbt zze;
    public static final zzhbs zzf;
    public static final ExecutorService zzg;
    public static final zzhbs zzh;

    /* JADX WARN: Code duplicated, block: B:14:0x0090  */
    static {
        ExecutorService threadPoolExecutor;
        ExecutorService executorServiceZza;
        ExecutorService executorServiceZzc;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfzv.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzcfc(aa.d.f4511a)));
        } else {
            zzbhv zzbhvVar = zzbie.zzmG;
            if (com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbhvVar) == null || !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbhvVar)).booleanValue()) {
                threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcfc(aa.d.f4511a));
            } else {
                zzbhv zzbhvVar2 = zzbie.zzmH;
                if (com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbhvVar2) != null) {
                    zzbhv zzbhvVar3 = zzbie.zzmI;
                    if (com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbhvVar3) != null) {
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbhvVar2)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbhvVar2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcfc(aa.d.f4511a));
                        threadPoolExecutor2.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbhvVar3)).booleanValue());
                        threadPoolExecutor = threadPoolExecutor2;
                    } else {
                        threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcfc(aa.d.f4511a));
                    }
                } else {
                    threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcfc(aa.d.f4511a));
                }
            }
        }
        byte[] bArr = null;
        zza = new zzcfe(threadPoolExecutor, bArr);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceZza = zzfzv.zza().zza(5, new zzcfc("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcfc("Loader"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorServiceZza = threadPoolExecutor3;
        }
        zzb = new zzcfe(executorServiceZza, bArr);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceZzc = zzfzv.zza().zzc(new zzcfc("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcfc("Activeview"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executorServiceZzc = threadPoolExecutor4;
        }
        zzc = new zzcfe(executorServiceZzc, bArr);
        zzcfb zzcfbVar = new zzcfb(3, new zzcfc("Schedule"));
        zzd = zzcfbVar;
        zze = zzhbz.zzc(zzcfbVar);
        zzf = new zzcfe(new zzcfd(), bArr);
        zzg = Executors.newSingleThreadExecutor(new zzcfc("AdQualityMetrics"));
        zzh = new zzcfe(zzhbz.zza(), bArr);
    }
}
