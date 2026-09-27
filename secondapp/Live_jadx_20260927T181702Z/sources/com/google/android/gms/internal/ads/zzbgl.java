package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbgl {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzbgh(this);
    private final Object zzc = new Object();

    @Nullable
    private zzbgo zzd;

    @Nullable
    private Context zze;

    @Nullable
    private zzbgr zzf;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final void zzf() {
        synchronized (this.zzc) {
            try {
                if (this.zze != null && this.zzd == null) {
                    zzbgo zzbgoVarZze = zze(new zzbgj(this), new zzbgk(this));
                    this.zzd = zzbgoVarZze;
                    zzbgoVarZze.checkAvailabilityAndConnect();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zza(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            try {
                if (this.zze != null) {
                    return;
                }
                this.zze = context.getApplicationContext();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfg)).booleanValue()) {
                    zzf();
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzff)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzbgi(this));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfh)).booleanValue()) {
            synchronized (this.zzc) {
                try {
                    zzf();
                    ScheduledFuture scheduledFuture = this.zza;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.zza = zzcff.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfi)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final zzbgm zzc(zzbgp zzbgpVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbgm();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzf(zzbgpVar);
                }
                return this.zzf.zze(zzbgpVar);
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call into cache service.", e10);
                return new zzbgm();
            }
        }
    }

    public final long zzd(zzbgp zzbgpVar) {
        synchronized (this.zzc) {
            try {
                if (this.zzf == null) {
                    return -2L;
                }
                if (this.zzd.zzp()) {
                    try {
                        return this.zzf.zzg(zzbgpVar);
                    } catch (RemoteException e10) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call into cache service.", e10);
                    }
                }
                return -2L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @k.h1
    public final synchronized zzbgo zze(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbgo(this.zze, com.google.android.gms.ads.internal.zzt.zzs().zza(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final /* synthetic */ void zzg() {
        synchronized (this.zzc) {
            try {
                zzbgo zzbgoVar = this.zzd;
                if (zzbgoVar == null) {
                    return;
                }
                if (zzbgoVar.isConnected() || this.zzd.isConnecting()) {
                    this.zzd.disconnect();
                }
                this.zzd = null;
                this.zzf = null;
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzc;
    }

    public final /* synthetic */ zzbgo zzi() {
        return this.zzd;
    }

    public final /* synthetic */ void zzj(zzbgo zzbgoVar) {
        this.zzd = null;
    }

    public final /* synthetic */ void zzk(zzbgr zzbgrVar) {
        this.zzf = zzbgrVar;
    }
}
