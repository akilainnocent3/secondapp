package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public final class zzmn {
    private final Object zza;

    @Nullable
    @k.a0("lock")
    private Looper zzb;

    @Nullable
    @k.a0("lock")
    private HandlerThread zzc;

    @k.a0("lock")
    private int zzd;

    public zzmn() {
        throw null;
    }

    public final Looper zza() {
        Looper looper;
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    boolean z10 = false;
                    if (this.zzd == 0 && this.zzc == null) {
                        z10 = true;
                    }
                    zzgsw.zzi(z10);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.zzc = handlerThread;
                    handlerThread.start();
                    this.zzb = this.zzc.getLooper();
                }
                this.zzd++;
                looper = this.zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public final void zzb() {
        HandlerThread handlerThread;
        synchronized (this.zza) {
            try {
                zzgsw.zzi(this.zzd > 0);
                int i10 = this.zzd - 1;
                this.zzd = i10;
                if (i10 == 0 && (handlerThread = this.zzc) != null) {
                    handlerThread.quit();
                    this.zzc = null;
                    this.zzb = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public zzmn(@Nullable Looper looper) {
        this.zza = new Object();
        this.zzb = null;
        this.zzc = null;
        this.zzd = 0;
    }
}
