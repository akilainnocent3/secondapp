package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbhn implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Object zza = new Object();

    @Nullable
    private SharedPreferences zzb = null;
    private JSONObject zzc = new JSONObject();

    private final void zzg(@Nullable final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzc = new JSONObject((String) zzbig.zza(new zzgto() { // from class: com.google.android.gms.internal.ads.zzbhm
                    @Override // com.google.android.gms.internal.ads.zzgto
                    public final /* synthetic */ Object zza() {
                        return sharedPreferences.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, @Nullable String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    public final void zza(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (this.zza) {
            try {
                if (this.zzb != null) {
                    return;
                }
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                com.google.android.gms.ads.internal.client.zzba.zza();
                SharedPreferences sharedPreferencesZza = zzbhx.zza(context);
                this.zzb = sharedPreferencesZza;
                zzg(sharedPreferencesZza);
                if (!((Boolean) zzbke.zzb.zze()).booleanValue() && (sharedPreferences = this.zzb) != null) {
                    sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String zzb(String str, String str2) {
        return !str.startsWith("adapter:") ? str2 : this.zzc.optString(str, str2);
    }

    public final long zzc(String str, long j10) {
        return !str.startsWith("adapter:") ? j10 : this.zzc.optLong(str, j10);
    }

    public final int zzd(String str, int i10) {
        return !str.startsWith("adapter:") ? i10 : this.zzc.optInt(str, i10);
    }

    public final float zze(String str, float f10) {
        return !str.startsWith("adapter:") ? f10 : (float) this.zzc.optDouble(str, f10);
    }

    public final boolean zzf(String str, boolean z10) {
        return !str.startsWith("adapter:") ? z10 : this.zzc.optBoolean(str, z10);
    }
}
