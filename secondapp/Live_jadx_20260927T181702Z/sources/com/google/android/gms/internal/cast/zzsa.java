package com.google.android.gms.internal.cast;

import com.ironsource.C4235d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzsa extends zzrg.zzi implements Runnable {
    private final Runnable zzb;

    public zzsa(Runnable runnable) {
        runnable.getClass();
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.run();
        } catch (Error | RuntimeException e10) {
            zzl(e10);
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzrg
    public final String zze() {
        return "task=[" + this.zzb.toString() + C4235d4.j.f61462e;
    }
}
