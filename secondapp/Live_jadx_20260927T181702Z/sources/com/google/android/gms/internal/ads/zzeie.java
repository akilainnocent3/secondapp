package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeie {
    private final zzcak zza;

    public zzeie(zzcak zzcakVar) {
        this.zza = zzcakVar;
    }

    public final void zza() {
        nj.t1 t1VarZza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziG)).booleanValue()) {
            zzcfi.zzb(t1VarZza, "persistFlags");
        } else {
            zzcfi.zza(t1VarZza, "persistFlags", zzcff.zzh);
        }
    }
}
