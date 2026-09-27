package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.C4235d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzagt {
    public static final zzagt zza = new zzagt(0, 0);
    public final long zzb;
    public final long zzc;

    public zzagt(long j10, long j11) {
        this.zzb = j10;
        this.zzc = j11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagt.class == obj.getClass()) {
            zzagt zzagtVar = (zzagt) obj;
            if (this.zzb == zzagtVar.zzb && this.zzc == zzagtVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j10 = this.zzb;
        int length = String.valueOf(j10).length();
        long j11 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(j11).length() + 1);
        sb2.append("[timeUs=");
        sb2.append(j10);
        sb2.append(", position=");
        sb2.append(j11);
        sb2.append(C4235d4.j.f61462e);
        return sb2.toString();
    }
}
