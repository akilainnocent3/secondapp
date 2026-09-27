package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbtc extends zzcfr {
    private final Object zza = new Object();
    private final zzbth zzb;
    private boolean zzc;

    public zzbtc(zzbth zzbthVar) {
        this.zzb = zzbthVar;
    }

    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("release: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock acquired");
                if (this.zzc) {
                    com.google.android.gms.ads.internal.util.zze.zza("release: Lock already released");
                    return;
                }
                this.zzc = true;
                zze(new zzbsz(this), new zzcfn());
                zze(new zzbta(this), new zzbtb(this));
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock released");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ zzbth zzb() {
        return this.zzb;
    }
}
