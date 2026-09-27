package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcxj implements zzcxk {
    private final Map zza;

    public zzcxj(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcxk
    @Nullable
    public final zzelg zza(int i10, String str) {
        return (zzelg) this.zza.get(str);
    }
}
