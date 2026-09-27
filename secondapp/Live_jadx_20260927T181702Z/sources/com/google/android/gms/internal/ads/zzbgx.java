package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzbgx implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbgp zza;
    final /* synthetic */ zzcfk zzb;
    final /* synthetic */ zzbgz zzc;

    public zzbgx(zzbgz zzbgzVar, zzbgp zzbgpVar, zzcfk zzcfkVar) {
        this.zza = zzbgpVar;
        this.zzb = zzcfkVar;
        Objects.requireNonNull(zzbgzVar);
        this.zzc = zzbgzVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        zzbgz zzbgzVar = this.zzc;
        synchronized (zzbgzVar.zzf()) {
            try {
                if (zzbgzVar.zzd()) {
                    return;
                }
                zzbgzVar.zze(true);
                final zzbgo zzbgoVarZzc = zzbgzVar.zzc();
                if (zzbgoVarZzc == null) {
                    return;
                }
                zzhbs zzhbsVar = zzcff.zza;
                final zzbgp zzbgpVar = this.zza;
                final zzcfk zzcfkVar = this.zzb;
                final nj.t1 t1VarZza = zzhbsVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbgw
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcfk zzcfkVar2 = zzcfkVar;
                        zzbgo zzbgoVar = zzbgoVarZzc;
                        zzbgx zzbgxVar = this.zza;
                        try {
                            zzbgr zzbgrVarZzq = zzbgoVar.zzq();
                            boolean zZzp = zzbgoVar.zzp();
                            zzbgp zzbgpVar2 = zzbgpVar;
                            zzbgm zzbgmVarZzf = zZzp ? zzbgrVarZzq.zzf(zzbgpVar2) : zzbgrVarZzq.zze(zzbgpVar2);
                            if (!zzbgmVarZzf.zza()) {
                                zzcfkVar2.zzd(new RuntimeException("No entry contents."));
                                zzbgxVar.zzc.zzb();
                                return;
                            }
                            zzbgu zzbguVar = new zzbgu(zzbgxVar, zzbgmVarZzf.zzb(), 1);
                            int i10 = zzbguVar.read();
                            if (i10 == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            zzbguVar.unread(i10);
                            zzcfkVar2.zzc(zzbhb.zza(zzbguVar, zzbgmVarZzf.zzd(), zzbgmVarZzf.zzg(), zzbgmVarZzf.zzf(), zzbgmVarZzf.zze()));
                        } catch (RemoteException e10) {
                            e = e10;
                            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                            zzcfkVar2.zzd(e);
                            zzbgxVar.zzc.zzb();
                        } catch (IOException e11) {
                            e = e11;
                            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                            zzcfkVar2.zzd(e);
                            zzbgxVar.zzc.zzb();
                        }
                    }
                });
                zzcfkVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbgv
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        if (zzcfkVar.isCancelled()) {
                            t1VarZza.cancel(true);
                        }
                    }
                }, zzcff.zzh);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
    }
}
