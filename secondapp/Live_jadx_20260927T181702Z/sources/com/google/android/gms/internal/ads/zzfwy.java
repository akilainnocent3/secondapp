package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.h1
final class zzfwy implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    @k.h1
    protected final zzfxs zza;
    private final String zzb;
    private final String zzc;
    private final zzbdh zzd;
    private final LinkedBlockingQueue zze;
    private final HandlerThread zzf;
    private final zzfwq zzg;
    private final long zzh;

    public zzfwy(Context context, int i10, zzbdh zzbdhVar, String str, String str2, String str3, zzfwq zzfwqVar) {
        this.zzb = str;
        this.zzd = zzbdhVar;
        this.zzc = str2;
        this.zzg = zzfwqVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zzf = handlerThread;
        handlerThread.start();
        this.zzh = System.currentTimeMillis();
        zzfxs zzfxsVar = new zzfxs(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfxsVar;
        this.zze = new LinkedBlockingQueue();
        zzfxsVar.checkAvailabilityAndConnect();
    }

    private final void zzd(int i10, long j10, Exception exc) {
        zzfwq zzfwqVar = this.zzg;
        if (zzfwqVar != null) {
            zzfwqVar.zzc(i10, System.currentTimeMillis() - j10, exc);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfxx zzfxxVarZzc = zzc();
        if (zzfxxVarZzc != null) {
            try {
                zzfye zzfyeVarZzg = zzfxxVarZzc.zzg(new zzfyc(1, this.zzd, this.zzb, this.zzc));
                zzd(IronSourceConstants.errorCode_internal, this.zzh, null);
                this.zze.put(zzfyeVarZzg);
            } catch (Throwable th2) {
                try {
                    zzd(2010, this.zzh, new Exception(th2));
                } finally {
                    zzb();
                    this.zzf.quit();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zzd(4012, this.zzh, null);
            this.zze.put(new zzfye(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        try {
            zzd(4011, this.zzh, null);
            this.zze.put(new zzfye(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final zzfye zza(int i10) {
        zzfye zzfyeVar;
        try {
            zzfyeVar = (zzfye) this.zze.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            zzd(2009, this.zzh, e10);
            zzfyeVar = null;
        }
        zzd(3004, this.zzh, null);
        if (zzfyeVar != null) {
            if (zzfyeVar.zzc == 7) {
                zzfwq.zzg(3);
            } else {
                zzfwq.zzg(2);
            }
        }
        return zzfyeVar == null ? new zzfye(null, 1) : zzfyeVar;
    }

    public final void zzb() {
        zzfxs zzfxsVar = this.zza;
        if (zzfxsVar != null) {
            if (zzfxsVar.isConnected() || zzfxsVar.isConnecting()) {
                zzfxsVar.disconnect();
            }
        }
    }

    public final zzfxx zzc() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
