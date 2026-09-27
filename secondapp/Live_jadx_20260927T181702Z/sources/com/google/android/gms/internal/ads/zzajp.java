package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzajp {
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzajp(long j10, long j11, int i10) {
        zzgsw.zza(j10 < j11);
        this.zza = j10;
        this.zzb = j11;
        this.zzc = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajp.class == obj.getClass()) {
            zzajp zzajpVar = (zzajp) obj;
            if (this.zza == zzajpVar.zza && this.zzb == zzajpVar.zzb && this.zzc == zzajpVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)};
        String str = zzfk.zza;
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", objArr);
    }
}
