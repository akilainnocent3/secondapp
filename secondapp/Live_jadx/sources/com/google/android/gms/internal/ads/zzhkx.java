package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhkx {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzhkx() {
    }

    public final zzhkx zza(Enum r10, Object obj) {
        this.zza.put(r10, obj);
        this.zzb.put(obj, r10);
        return this;
    }

    public final zzhky zzb() {
        return new zzhky(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }

    public /* synthetic */ zzhkx(byte[] bArr) {
    }
}
