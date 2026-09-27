package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzr {
    Object zza;
    zzu zzb;
    private zzw zzc = zzw.zze();
    private boolean zzd;

    public final void finalize() {
        zzw zzwVar;
        zzu zzuVar = this.zzb;
        if (zzuVar != null && !zzuVar.isDone()) {
            zzuVar.zzc(new zzs("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.zza))));
        }
        if (this.zzd || (zzwVar = this.zzc) == null) {
            return;
        }
        zzwVar.zzd(null);
    }

    public final void zza() {
        this.zza = null;
        this.zzb = null;
        this.zzc.zzd(null);
    }

    public final boolean zzb(Object obj) {
        this.zzd = true;
        zzu zzuVar = this.zzb;
        boolean z10 = zzuVar != null && zzuVar.zza(obj);
        if (z10) {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }
        return z10;
    }
}
