package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzcdt {

    @k.a0("this")
    private final Map zza = new HashMap();

    @k.a0("this")
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzcdg zzd;

    public zzcdt(Context context, zzcdg zzcdgVar) {
        this.zzc = context;
        this.zzd = zzcdgVar;
    }

    public final synchronized void zza(zzcdr zzcdrVar) {
        this.zzb.add(zzcdrVar);
    }

    public final synchronized void zzb(String str) {
        try {
            Map map = this.zza;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
            zzcdq zzcdqVar = new zzcdq(this, str);
            map.put(str, zzcdqVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzcdqVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final /* synthetic */ void zzc(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.zzd.zzb();
        }
    }

    public final /* synthetic */ List zzd() {
        return this.zzb;
    }
}
