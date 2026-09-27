package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgl {
    public final zzgvz zza;
    public final zzge zzb;

    @Nullable
    public final zzgg zzc;

    @Nullable
    public final zzgk zzd;

    public zzgl(zzgc zzgcVar, @Nullable List list, zzge zzgeVar, @Nullable zzgg zzggVar, @Nullable zzgk zzgkVar) {
        this.zza = list != null ? zzgvz.zzq(list) : zzgvz.zzi();
        this.zzb = zzgeVar;
        this.zzc = zzggVar;
        this.zzd = zzgkVar;
    }
}
