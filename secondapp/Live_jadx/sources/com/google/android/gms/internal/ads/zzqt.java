package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqt {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd = 0;

    public final zzqt zza(boolean z10) {
        this.zza = z10;
        return this;
    }

    public final zzqt zzb(boolean z10) {
        this.zzb = z10;
        return this;
    }

    public final zzqt zzc(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzqt zzd(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzqu zze() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzqu(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }

    public final /* synthetic */ boolean zzf() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzg() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zzc;
    }

    public final /* synthetic */ int zzi() {
        return this.zzd;
    }
}
