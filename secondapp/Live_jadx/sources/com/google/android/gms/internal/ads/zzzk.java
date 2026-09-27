package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzzk {
    public final long zza;
    public final long zzb;

    public zzzk(long j10, long j11) {
        this.zza = j10;
        this.zzb = j11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzzk)) {
            return false;
        }
        zzzk zzzkVar = (zzzk) obj;
        return this.zza == zzzkVar.zza && this.zzb == zzzkVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
