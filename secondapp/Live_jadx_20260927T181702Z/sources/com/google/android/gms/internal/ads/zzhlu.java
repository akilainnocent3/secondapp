package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhlu implements zzhcv {
    private final Map zza;

    static {
        new zzhlt().zza();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhlu) {
            return this.zza.equals(((zzhlu) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final boolean zza() {
        return this.zza.isEmpty();
    }
}
