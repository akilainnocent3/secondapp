package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfmn implements zzfml {
    private final String zza;

    public zzfmn(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfml
    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzfmn) {
            return this.zza.equals(((zzfmn) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfml
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
