package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzhcc implements Runnable {
    zzhce zza;

    public zzhcc(zzhce zzhceVar) {
        this.zza = zzhceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nj.t1 t1VarZzf;
        zzhce zzhceVar = this.zza;
        if (zzhceVar == null || (t1VarZzf = zzhceVar.zzf()) == null) {
            return;
        }
        this.zza = null;
        if (t1VarZzf.isDone()) {
            zzhceVar.zzk(t1VarZzf);
            return;
        }
        try {
            ScheduledFuture scheduledFutureZzx = zzhceVar.zzx();
            zzhceVar.zzy(null);
            String string = "Timed out";
            if (scheduledFutureZzx != null) {
                try {
                    long jAbs = Math.abs(scheduledFutureZzx.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(jAbs).length() + 55);
                        sb2.append("Timed out");
                        sb2.append(" (timeout delayed by ");
                        sb2.append(jAbs);
                        sb2.append(" ms after scheduled time)");
                        string = sb2.toString();
                    }
                } catch (Throwable th2) {
                    zzhceVar.zzb(new zzhcd(string, null));
                    throw th2;
                }
            }
            String string2 = t1VarZzf.toString();
            StringBuilder sb3 = new StringBuilder(string.length() + 2 + string2.length());
            sb3.append(string);
            sb3.append(": ");
            sb3.append(string2);
            zzhceVar.zzb(new zzhcd(sb3.toString(), null));
            t1VarZzf.cancel(true);
        } catch (Throwable th3) {
            t1VarZzf.cancel(true);
            throw th3;
        }
    }
}
