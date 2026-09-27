package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzabv {
    public static final zzabp zza = new zzabp(2, -9223372036854775807L, null);
    public static final zzabp zzb = new zzabp(3, -9223372036854775807L, null);
    private final zzacb zzc = b.a(zzfk.zzg("ExoPlayer:Loader:ProgressiveMediaPeriod"), zzabo.zza);

    @Nullable
    private zzabq zzd;

    @Nullable
    private IOException zze;

    public zzabv(String str) {
    }

    public static zzabp zza(boolean z10, long j10) {
        return new zzabp(z10 ? 1 : 0, j10, null);
    }

    public final boolean zzb() {
        return this.zze != null;
    }

    public final void zzc() {
        this.zze = null;
    }

    public final long zzd(zzabr zzabrVar, zzabn zzabnVar, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.zze = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new zzabq(this, looperMyLooper, zzabrVar, zzabnVar, i10, jElapsedRealtime).zzb(0L);
        return jElapsedRealtime;
    }

    public final boolean zze() {
        return this.zzd != null;
    }

    public final void zzf() {
        zzabq zzabqVar = this.zzd;
        zzabqVar.getClass();
        zzabqVar.zzc(false);
    }

    public final void zzg(@Nullable zzabs zzabsVar) {
        zzabq zzabqVar = this.zzd;
        if (zzabqVar != null) {
            zzabqVar.zzc(true);
        }
        zzacb zzacbVar = this.zzc;
        zzacbVar.execute(new zzabt(zzabsVar));
        zzacbVar.zza();
    }

    public final void zzh(int i10) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null) {
            throw iOException;
        }
        zzabq zzabqVar = this.zzd;
        if (zzabqVar != null) {
            zzabqVar.zza(i10);
        }
    }

    public final /* synthetic */ zzacb zzi() {
        return this.zzc;
    }

    public final /* synthetic */ zzabq zzj() {
        return this.zzd;
    }

    public final /* synthetic */ void zzk(zzabq zzabqVar) {
        this.zzd = zzabqVar;
    }

    public final /* synthetic */ void zzl(IOException iOException) {
        this.zze = iOException;
    }
}
