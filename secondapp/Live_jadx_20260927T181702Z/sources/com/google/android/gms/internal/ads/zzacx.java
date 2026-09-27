package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzacx extends HandlerThread implements Handler.Callback {
    private zzdu zza;
    private Handler zzb;

    @Nullable
    private Error zzc;

    @Nullable
    private RuntimeException zzd;

    @Nullable
    private zzacy zze;

    public zzacx() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 == 1) {
                try {
                    try {
                        int i11 = message.arg1;
                        zzdu zzduVar = this.zza;
                        if (zzduVar == null) {
                            throw null;
                        }
                        zzduVar.zza(i11);
                        this.zze = new zzacy(this, this.zza.zzc(), i11 != 0, null);
                        synchronized (this) {
                            notify();
                        }
                    } catch (zzdv e10) {
                        zzef.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                        this.zzd = new IllegalStateException(e10);
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (Error e11) {
                    zzef.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.zzc = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    zzef.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.zzd = e12;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i10 == 2) {
                try {
                    zzdu zzduVar2 = this.zza;
                    if (zzduVar2 == null) {
                        throw null;
                    }
                    zzduVar2.zzb();
                    return true;
                } catch (Throwable th2) {
                    try {
                        zzef.zzf("PlaceholderSurface", "Failed to release placeholder surface", th2);
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th3) {
            synchronized (this) {
                notify();
                throw th3;
            }
        }
    }

    public final zzacy zza(int i10) {
        boolean z10;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzdu(this.zzb, null);
        synchronized (this) {
            z10 = false;
            this.zzb.obtainMessage(1, i10, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzacy zzacyVar = this.zze;
        zzacyVar.getClass();
        return zzacyVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
