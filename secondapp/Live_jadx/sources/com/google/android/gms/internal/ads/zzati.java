package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzati {
    public static final boolean zza = zzatj.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    public final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzatj.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j10) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzath(str, j10, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        this.zzc = true;
        List<zzath> list = this.zzb;
        long j10 = list.size() == 0 ? 0L : ((zzath) list.get(list.size() - 1)).zzc - ((zzath) list.get(0)).zzc;
        if (j10 > 0) {
            long j11 = ((zzath) list.get(0)).zzc;
            zzatj.zzb("(%-4d ms) %s", Long.valueOf(j10), str);
            for (zzath zzathVar : list) {
                long j12 = zzathVar.zzc;
                zzatj.zzb("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(zzathVar.zzb), zzathVar.zza);
                j11 = j12;
            }
        }
    }
}
