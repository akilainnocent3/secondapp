package com.google.android.gms.internal.ads;

import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfme {
    private final zzfmd zza = new zzfmd();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public final void zza() {
        this.zzd++;
    }

    public final void zzb() {
        this.zze++;
    }

    public final void zzc() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zzd() {
        this.zzc++;
        this.zza.zzb = true;
    }

    public final void zze() {
        this.zzf++;
    }

    public final zzfmd zzf() {
        zzfmd zzfmdVar = this.zza;
        zzfmd zzfmdVarClone = zzfmdVar.clone();
        zzfmdVar.zza = false;
        zzfmdVar.zzb = false;
        return zzfmdVarClone;
    }

    public final String zzg() {
        return "\n\tPool does not exist: " + this.zzd + "\n\tNew pools created: " + this.zzb + "\n\tPools removed: " + this.zzc + "\n\tEntries added: " + this.zzf + "\n\tNo entries retrieved: " + this.zze + IOUtils.LINE_SEPARATOR_UNIX;
    }
}
