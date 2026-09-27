package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzasn implements Runnable {
    private final zzasx zza;
    private final zzatd zzb;
    private final Runnable zzc;

    public zzasn(zzasx zzasxVar, zzatd zzatdVar, Runnable runnable) {
        this.zza = zzasxVar;
        this.zzb = zzatdVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzasx zzasxVar = this.zza;
        zzasxVar.zzl();
        zzatd zzatdVar = this.zzb;
        if (zzatdVar.zzc()) {
            zzasxVar.zzs(zzatdVar.zza);
        } else {
            zzasxVar.zzt(zzatdVar.zzc);
        }
        if (zzatdVar.zzd) {
            zzasxVar.zzc("intermediate-response");
        } else {
            zzasxVar.zzd("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
