package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfdq implements zzfby {
    private final JSONObject zza;

    public zzfdq(Context context) {
        this.zza = zzcan.zzc(context, VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final nj.t1 zza() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzns)).booleanValue() ? zzhbi.zza(zzfdo.zza) : zzhbi.zza(new zzfbw() { // from class: com.google.android.gms.internal.ads.zzfdp
            @Override // com.google.android.gms.internal.ads.zzfbw
            public final /* synthetic */ void zza(Object obj) {
                this.zza.zzc((JSONObject) obj);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 46;
    }

    public final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
