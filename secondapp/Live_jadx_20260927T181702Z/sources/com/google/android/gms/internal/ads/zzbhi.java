package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbhi {

    @k.h1
    zzbea zza;

    @k.h1
    boolean zzb;
    private final ExecutorService zzc;

    public zzbhi() {
        this.zzc = com.google.android.gms.ads.internal.util.client.zzb.zzb;
    }

    public final /* synthetic */ ExecutorService zza() {
        return this.zzc;
    }

    public zzbhi(final Context context) {
        ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbhe
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzge)).booleanValue();
                Context context2 = context;
                zzbhi zzbhiVar = this.zza;
                if (zBooleanValue) {
                    try {
                        zzbhiVar.zza = (zzbea) com.google.android.gms.ads.internal.util.client.zzs.zza(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzbhf.zza);
                        zzbhiVar.zza.zze(ObjectWrapper.wrap(context2), "GMA_SDK");
                        zzbhiVar.zzb = true;
                    } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
