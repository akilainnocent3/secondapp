package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcuf implements zzimi {
    private final zzimr zza;

    private zzcuf(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzcuf zza(zzimr zzimrVar) {
        return new zzcuf(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcxy) this.zza).zza().zzz);
        } catch (JSONException unused) {
            return null;
        }
    }
}
