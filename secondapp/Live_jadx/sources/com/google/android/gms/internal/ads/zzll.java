package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzll {
    public zzmm zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzll(zzmm zzmmVar) {
        this.zza = zzmmVar;
    }

    public final void zza(int i10) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i10);
        this.zzb += i10;
    }

    public final void zzb(zzmm zzmmVar) {
        this.zze |= this.zza != zzmmVar;
        this.zza = zzmmVar;
    }

    public final void zzc(int i10) {
        if (this.zzc && this.zzd != 5) {
            zzgsw.zza(i10 == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i10;
    }

    public final /* synthetic */ boolean zzd() {
        return this.zze;
    }
}
