package com.google.android.gms.internal.cast;

import com.ironsource.C4235d4;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import zq.a;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzse extends zzrm implements RunnableFuture {

    @a
    private volatile zzrw zzb;

    public zzse(Callable callable) {
        this.zzb = new zzsd(this, callable);
    }

    public static zzse zzn(Runnable runnable, Object obj) {
        return new zzse(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzrw zzrwVar = this.zzb;
        if (zzrwVar != null) {
            zzrwVar.run();
        }
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.cast.zzrg
    @a
    public final String zze() {
        zzrw zzrwVar = this.zzb;
        if (zzrwVar == null) {
            return super.zze();
        }
        return "task=[" + zzrwVar.toString() + C4235d4.j.f61462e;
    }

    @Override // com.google.android.gms.internal.cast.zzrg
    public final void zzj() {
        zzrw zzrwVar;
        if (zzm() && (zzrwVar = this.zzb) != null) {
            zzrwVar.zze();
        }
        this.zzb = null;
    }
}
