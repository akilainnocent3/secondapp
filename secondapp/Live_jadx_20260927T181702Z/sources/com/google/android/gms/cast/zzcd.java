package com.google.android.gms.cast;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
final class zzcd {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();

    public final int zza(String str) {
        Integer num = (Integer) this.zzc.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final zzcd zzb(String str, String str2, int i10) {
        this.zza.put(str, str2);
        this.zzb.put(str2, str);
        this.zzc.put(str, Integer.valueOf(i10));
        return this;
    }

    @Nullable
    public final String zzc(String str) {
        return (String) this.zza.get(str);
    }

    @Nullable
    public final String zzd(String str) {
        return (String) this.zzb.get(str);
    }
}
