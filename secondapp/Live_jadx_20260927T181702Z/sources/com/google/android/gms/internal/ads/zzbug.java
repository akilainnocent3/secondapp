package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzbug implements zzbpu {
    private final zzcfk zza;

    public zzbug(zzbui zzbuiVar, zzcfk zzcfkVar) {
        Objects.requireNonNull(zzbuiVar);
        this.zza = zzcfkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zza(JSONObject jSONObject) {
        try {
            this.zza.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e10) {
            this.zza.zzd(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzb(@Nullable String str) {
        try {
            if (str == null) {
                this.zza.zzd(new zzbtl());
            } else {
                this.zza.zzd(new zzbtl(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
