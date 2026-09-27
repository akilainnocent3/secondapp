package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdod {
    private final JSONObject zza;
    private final zzdul zzb;

    @Nullable
    private final com.google.android.gms.ads.internal.zzb zzc;

    @Nullable
    private final zzcdb zzd;

    public zzdod(JSONObject jSONObject, zzdul zzdulVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzcdb zzcdbVar) {
        this.zza = jSONObject;
        this.zzb = zzdulVar;
        this.zzc = zzbVar;
        this.zzd = zzcdbVar;
    }

    @Nullable
    public final com.google.android.gms.ads.internal.zzb zza() {
        return this.zzc;
    }

    @Nullable
    public final zzcdb zzb() {
        return this.zzd;
    }

    public final JSONObject zzc() {
        return this.zza;
    }

    public final zzdul zzd() {
        return this.zzb;
    }
}
