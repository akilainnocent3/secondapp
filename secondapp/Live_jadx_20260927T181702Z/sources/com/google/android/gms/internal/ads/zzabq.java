package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"HandlerLeak"})
final class zzabq extends Handler implements Runnable {
    final /* synthetic */ zzabv zza;
    private final zzabr zzb;
    private final long zzc;

    @Nullable
    private zzabn zzd;

    @Nullable
    private IOException zze;
    private int zzf;

    @Nullable
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzabq(zzabv zzabvVar, Looper looper, zzabr zzabrVar, zzabn zzabnVar, int i10, long j10) {
        super(looper);
        Objects.requireNonNull(zzabvVar);
        this.zza = zzabvVar;
        this.zzb = zzabrVar;
        this.zzd = zzabnVar;
        this.zzc = j10;
    }

    private final void zzd() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.zzc;
        zzabn zzabnVar = this.zzd;
        zzabnVar.getClass();
        zzabnVar.zzC(this.zzb, jElapsedRealtime, j10, this.zzf);
        this.zze = null;
        zzabv zzabvVar = this.zza;
        zzabq zzabqVarZzj = zzabvVar.zzj();
        zzabqVarZzj.getClass();
        zzabvVar.zzi().execute(zzabqVarZzj);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        int i10 = message.what;
        if (i10 == 1) {
            zzd();
            return;
        }
        if (i10 == 4) {
            throw ((Error) message.obj);
        }
        zzabv zzabvVar = this.zza;
        zzabvVar.zzk(null);
        long j10 = this.zzc;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = jElapsedRealtime - j10;
        zzabn zzabnVar = this.zzd;
        zzabnVar.getClass();
        if (this.zzh) {
            zzabnVar.zzA(this.zzb, jElapsedRealtime, j11, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 2) {
            try {
                zzabnVar.zzB(this.zzb, jElapsedRealtime, j11);
                return;
            } catch (RuntimeException e10) {
                zzef.zzf("LoadTask", "Unexpected exception handling load completed", e10);
                this.zza.zzl(new zzabu(e10));
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i12 = this.zzf + 1;
        this.zzf = i12;
        zzabp zzabpVarZzz = zzabnVar.zzz(this.zzb, jElapsedRealtime, j11, iOException, i12);
        if (zzabpVarZzz.zzb() == 3) {
            zzabvVar.zzl(this.zze);
        } else if (zzabpVarZzz.zzb() != 2) {
            if (zzabpVarZzz.zzb() == 1) {
                this.zzf = 1;
            }
            zzb(zzabpVarZzz.zzc() != -9223372036854775807L ? zzabpVarZzz.zzc() : Math.min((this.zzf - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (!z10) {
                zzabr zzabrVar = this.zzb;
                String simpleName = zzabrVar.getClass().getSimpleName();
                StringBuilder sb2 = new StringBuilder(simpleName.length() + 5);
                sb2.append("load:");
                sb2.append(simpleName);
                Trace.beginSection(sb2.toString());
                try {
                    zzabrVar.zzc();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e10) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e10).sendToTarget();
        } catch (Exception e11) {
            if (this.zzi) {
                return;
            }
            zzef.zzf("LoadTask", "Unexpected exception loading stream", e11);
            obtainMessage(3, new zzabu(e11)).sendToTarget();
        } catch (OutOfMemoryError e12) {
            if (this.zzi) {
                return;
            }
            zzef.zzf("LoadTask", "OutOfMemory error loading stream", e12);
            obtainMessage(3, new zzabu(e12)).sendToTarget();
        } catch (Error e13) {
            if (!this.zzi) {
                zzef.zzf("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        }
    }

    public final void zza(int i10) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i10) {
            throw iOException;
        }
    }

    public final void zzb(long j10) {
        zzabv zzabvVar = this.zza;
        zzgsw.zzi(zzabvVar.zzj() == null);
        zzabvVar.zzk(this);
        if (j10 > 0) {
            sendEmptyMessageDelayed(1, j10);
        } else {
            zzd();
        }
    }

    public final void zzc(boolean z10) {
        this.zzi = z10;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.zzh = true;
                    this.zzb.zzb();
                    Thread thread = this.zzg;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z10) {
            this.zza.zzk(null);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzabn zzabnVar = this.zzd;
            zzabnVar.getClass();
            zzabnVar.zzA(this.zzb, jElapsedRealtime, jElapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }
}
