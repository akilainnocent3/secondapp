package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@zq.j
public final class zzbez {
    private final Object zza = new Object();
    private zzbex zzb = null;
    private boolean zzc = false;

    public final void zza(Context context) {
        synchronized (this.zza) {
            try {
                if (!this.zzc) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not cast Context to Application");
                    } else {
                        if (this.zzb == null) {
                            this.zzb = new zzbex();
                        }
                        this.zzb.zza(application, context);
                        this.zzc = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb(zzbey zzbeyVar) {
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    this.zzb = new zzbex();
                }
                this.zzb.zzb(zzbeyVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc(zzbey zzbeyVar) {
        synchronized (this.zza) {
            try {
                zzbex zzbexVar = this.zzb;
                if (zzbexVar == null) {
                    return;
                }
                zzbexVar.zzc(zzbeyVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public final Activity zzd() {
        synchronized (this.zza) {
            try {
                zzbex zzbexVar = this.zzb;
                if (zzbexVar == null) {
                    return null;
                }
                return zzbexVar.zzd();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public final Context zze() {
        synchronized (this.zza) {
            try {
                zzbex zzbexVar = this.zzb;
                if (zzbexVar == null) {
                    return null;
                }
                return zzbexVar.zze();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzf() {
        synchronized (this.zza) {
            try {
                zzbex zzbexVar = this.zzb;
                if (zzbexVar == null) {
                    return false;
                }
                return zzbexVar.zzg().get();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzg(zzdwi zzdwiVar) {
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    this.zzb = new zzbex();
                }
                this.zzb.zzj(zzdwiVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
