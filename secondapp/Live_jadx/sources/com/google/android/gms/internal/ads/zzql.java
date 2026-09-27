package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzql {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzql zza(boolean z10) {
        this.zza = z10;
        return this;
    }

    public final zzql zzb(boolean z10) {
        this.zzb = z10;
        return this;
    }

    public final zzql zzc(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzqm zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzqm(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public final /* synthetic */ boolean zze() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzf() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzg() {
        return this.zzc;
    }
}
