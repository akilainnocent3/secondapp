package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import androidx.annotation.Nullable;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbgz {

    @Nullable
    private zzbgo zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzbgz(Context context) {
        this.zzc = context;
    }

    public final Future zza(zzbgp zzbgpVar) {
        zzbgt zzbgtVar = new zzbgt(this);
        zzbgx zzbgxVar = new zzbgx(this, zzbgpVar, zzbgtVar);
        zzbgy zzbgyVar = new zzbgy(this, zzbgtVar);
        synchronized (this.zzd) {
            zzbgo zzbgoVar = new zzbgo(this.zzc, com.google.android.gms.ads.internal.zzt.zzs().zza(), zzbgxVar, zzbgyVar);
            this.zza = zzbgoVar;
            zzbgoVar.checkAvailabilityAndConnect();
        }
        return zzbgtVar;
    }

    public final /* synthetic */ void zzb() {
        synchronized (this.zzd) {
            try {
                zzbgo zzbgoVar = this.zza;
                if (zzbgoVar == null) {
                    return;
                }
                zzbgoVar.disconnect();
                this.zza = null;
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ zzbgo zzc() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzd() {
        return this.zzb;
    }

    public final /* synthetic */ void zze(boolean z10) {
        this.zzb = true;
    }

    public final /* synthetic */ Object zzf() {
        return this.zzd;
    }
}
