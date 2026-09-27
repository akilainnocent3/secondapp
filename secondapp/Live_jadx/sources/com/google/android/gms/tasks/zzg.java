package com.google.android.gms.tasks;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzg implements Runnable {
    final /* synthetic */ zzh zza;

    public zzg(zzh zzhVar) {
        this.zza = zzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzb) {
            try {
                zzh zzhVar = this.zza;
                if (zzhVar.zzc != null) {
                    zzhVar.zzc.onCanceled();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
