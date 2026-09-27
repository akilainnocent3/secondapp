package com.google.android.gms.cast.framework.media.widget;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class zzb {
    public final int zza;
    public final int zzb;
    public final boolean zzc;

    public zzb(int i10, int i11, boolean z10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = z10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzb) && this.zza == ((zzb) obj).zza;
    }

    public final int hashCode() {
        return Integer.valueOf(this.zza).hashCode();
    }
}
