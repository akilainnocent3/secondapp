package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzbpt implements zzbpu {
    final /* synthetic */ zzcfk zza;

    public zzbpt(zzbpv zzbpvVar, zzcfk zzcfkVar) {
        this.zza = zzcfkVar;
        Objects.requireNonNull(zzbpvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zza(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzb(@Nullable String str) {
        this.zza.zzd(new zzbtl(str));
    }
}
