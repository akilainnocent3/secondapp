package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfa {
    final /* synthetic */ zzfb zza;
    private final int zzb;
    private int zzc;
    private boolean zzd;
    private long zze;

    public zzfa(zzfb zzfbVar, int i10) {
        Objects.requireNonNull(zzfbVar);
        this.zza = zzfbVar;
        this.zzb = i10;
    }

    public final void zza() {
        zzfb zzfbVar = this.zza;
        int iZzi = zzfbVar.zzd().zzi();
        if (!zzfbVar.zzd().zzk() || zzfbVar.zzd().zzh() == 1 || zzfbVar.zzd().zzh() == 4 || iZzi == 0 || iZzi == 1) {
            if (this.zzd) {
                zzfbVar.zzg().zzk(4);
            }
            this.zzd = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzd && this.zzc == iZzi) {
            long j10 = jElapsedRealtime - this.zze;
            int i10 = this.zzb;
            if (j10 >= i10) {
                zzfbVar.zze().zza(new zzfc(4, i10));
                return;
            }
            return;
        }
        this.zzd = true;
        this.zze = jElapsedRealtime;
        this.zzc = iZzi;
        zzfbVar.zzg().zzk(4);
        zzfbVar.zzg().zzi(4, this.zzb);
    }
}
