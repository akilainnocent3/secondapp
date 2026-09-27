package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcwz {
    private final zzdfg zza;

    @Nullable
    private final zzdhl zzb;

    public zzcwz(zzdfg zzdfgVar, @Nullable zzdhl zzdhlVar) {
        this.zza = zzdfgVar;
        this.zzb = zzdhlVar;
    }

    public final zzdfg zza() {
        return this.zza;
    }

    public final zzdke zzb() {
        zzdhl zzdhlVar = this.zzb;
        return zzdhlVar != null ? new zzdke(zzdhlVar, zzcff.zzh) : new zzdke(new zzcwy(this), zzcff.zzh);
    }

    @Nullable
    public final zzdhl zzc() {
        return this.zzb;
    }
}
