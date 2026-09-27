package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zziav extends zziat {
    private final zzibj zza = new zzibj(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zziav) && ((zziav) obj).zza.equals(this.zza);
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(String str, zziat zziatVar) {
        this.zza.put(str, zziatVar);
    }

    public final Set zzb() {
        return this.zza.entrySet();
    }

    public final boolean zzc(String str) {
        return this.zza.containsKey(str);
    }

    public final zziat zzh(String str) {
        return (zziat) this.zza.get(str);
    }
}
