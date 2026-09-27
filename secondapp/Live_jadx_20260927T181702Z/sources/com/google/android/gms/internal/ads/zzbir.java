package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@zq.j
@Deprecated
public final class zzbir {
    private final Map zza = new HashMap();
    private final zzbit zzb;

    public zzbir(zzbit zzbitVar) {
        this.zzb = zzbitVar;
    }

    public final void zza(String str, @Nullable zzbiq zzbiqVar) {
        this.zza.put(str, zzbiqVar);
    }

    public final void zzb(String str, String str2, long j10) {
        Map map = this.zza;
        zzbiq zzbiqVar = (zzbiq) map.get(str2);
        String[] strArr = {str};
        if (zzbiqVar != null) {
            this.zzb.zzb(zzbiqVar, j10, strArr);
        }
        map.put(str, new zzbiq(j10, null, null));
    }

    public final zzbit zzc() {
        return this.zzb;
    }
}
