package com.google.android.gms.cast.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.bumptech.glide.manager.q;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.cast.zzed;
import java.util.Locale;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class zzau {
    public static final Object zza = new Object();
    protected final Logger zzb;

    @Nullable
    @h1
    zzas zze;

    @Nullable
    @h1
    Runnable zzf;
    private final long zzg;
    private final String zzh;
    private final Clock zzj = DefaultClock.getInstance();

    @h1
    long zzc = -1;

    @h1
    long zzd = 0;
    private final Handler zzi = new zzed(Looper.getMainLooper());

    public zzau(long j10, String str) {
        this.zzg = j10;
        this.zzh = str;
        this.zzb = new Logger(q.f31505d, str);
    }

    public static /* synthetic */ void zza(zzau zzauVar) {
        synchronized (zza) {
            try {
                if (zzauVar.zzf()) {
                    zzauVar.zzh(15, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void zzg(int i10, @Nullable Object obj, String str) {
        this.zzb.d(str, new Object[0]);
        Object obj2 = zza;
        synchronized (obj2) {
            try {
                if (this.zze != null) {
                    ((zzas) Preconditions.checkNotNull(this.zze)).zza(this.zzh, this.zzc, i10, obj, this.zzd, this.zzj.currentTimeMillis());
                }
                this.zzc = -1L;
                this.zze = null;
                synchronized (obj2) {
                    try {
                        Runnable runnable = this.zzf;
                        if (runnable != null) {
                            this.zzi.removeCallbacks(runnable);
                            this.zzf = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private final boolean zzh(int i10, @Nullable Object obj) {
        synchronized (zza) {
            try {
                if (!zzf()) {
                    return false;
                }
                zzg(i10, null, String.format(Locale.ROOT, "clearing request %d", Long.valueOf(this.zzc)));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb(long j10, @Nullable zzas zzasVar) {
        zzas zzasVar2;
        long j11;
        long j12;
        long jCurrentTimeMillis = this.zzj.currentTimeMillis();
        Object obj = zza;
        synchronized (obj) {
            zzasVar2 = this.zze;
            j11 = this.zzc;
            j12 = this.zzd;
            this.zzc = j10;
            this.zze = zzasVar;
            this.zzd = jCurrentTimeMillis;
        }
        if (zzasVar2 != null) {
            zzasVar2.zzb(this.zzh, j11, j12, jCurrentTimeMillis);
        }
        synchronized (obj) {
            try {
                Runnable runnable = this.zzf;
                if (runnable != null) {
                    this.zzi.removeCallbacks(runnable);
                }
                Runnable runnable2 = new Runnable() { // from class: com.google.android.gms.cast.internal.zzat
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzau.zza(this.zza);
                    }
                };
                this.zzf = runnable2;
                this.zzi.postDelayed(runnable2, this.zzg);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzc(int i10) {
        return zzh(2002, null);
    }

    public final boolean zzd(long j10, int i10, @Nullable Object obj) {
        synchronized (zza) {
            try {
                if (!zze(j10)) {
                    return false;
                }
                zzg(i10, obj, String.format(Locale.ROOT, "request %d completed", Long.valueOf(j10)));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zze(long j10) {
        boolean z10;
        synchronized (zza) {
            long j11 = this.zzc;
            z10 = false;
            if (j11 != -1 && j11 == j10) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean zzf() {
        boolean z10;
        synchronized (zza) {
            z10 = this.zzc != -1;
        }
        return z10;
    }
}
