package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzerd {
    private final zzdmu zza;

    public zzerd(zzdmu zzdmuVar) {
        this.zza = zzdmuVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfke zzfkeVar, zzfjt zzfjtVar, View view, zzeqz zzeqzVar) {
        zzerb zzerbVar = new zzerb(this, new zzera(this, zzfjtVar));
        zzdlo zzdloVarZzd = this.zza.zzd(new zzcxx(zzfkeVar, zzfjtVar, null), zzerbVar);
        zzeqzVar.zzd(new zzerc(this, zzdloVarZzd));
        return zzdloVarZzd.zzh();
    }
}
