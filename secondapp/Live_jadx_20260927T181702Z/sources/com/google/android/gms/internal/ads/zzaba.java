package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaba {
    public final int zza;
    public final zzmx[] zzb;
    public final zzaas[] zzc;
    public final zzbn zzd;

    @Nullable
    public final Object zze;

    public zzaba(zzmx[] zzmxVarArr, zzaas[] zzaasVarArr, zzbn zzbnVar, @Nullable Object obj) {
        int length = zzmxVarArr.length;
        zzgsw.zza(length == zzaasVarArr.length);
        this.zzb = zzmxVarArr;
        this.zzc = (zzaas[]) zzaasVarArr.clone();
        this.zzd = zzbnVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(int i10) {
        return this.zzb[i10] != null;
    }

    public final boolean zzb(@Nullable zzaba zzabaVar, int i10) {
        return zzabaVar != null && Objects.equals(this.zzb[i10], zzabaVar.zzb[i10]) && Objects.equals(this.zzc[i10], zzabaVar.zzc[i10]);
    }
}
