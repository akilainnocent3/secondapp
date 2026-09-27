package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdbo {
    private Context zza;
    private zzfkm zzb;
    private Bundle zzc;

    @Nullable
    private zzfkf zzd;

    @Nullable
    private zzdbi zze;

    @Nullable
    private zzell zzf;

    public final zzdbo zza(Context context) {
        this.zza = context;
        return this;
    }

    public final zzdbo zzb(zzfkm zzfkmVar) {
        this.zzb = zzfkmVar;
        return this;
    }

    public final zzdbo zzc(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzdbo zzd(@Nullable zzdbi zzdbiVar) {
        this.zze = zzdbiVar;
        return this;
    }

    public final zzdbp zze() {
        return new zzdbp(this, null);
    }

    public final zzdbo zzf(zzfkf zzfkfVar) {
        this.zzd = zzfkfVar;
        return this;
    }

    public final zzdbo zzg(@Nullable zzell zzellVar) {
        this.zzf = zzellVar;
        return this;
    }

    public final /* synthetic */ Context zzh() {
        return this.zza;
    }

    public final /* synthetic */ zzfkm zzi() {
        return this.zzb;
    }

    public final /* synthetic */ Bundle zzj() {
        return this.zzc;
    }

    public final /* synthetic */ zzfkf zzk() {
        return this.zzd;
    }

    public final /* synthetic */ zzdbi zzl() {
        return this.zze;
    }

    public final /* synthetic */ zzell zzm() {
        return this.zzf;
    }
}
