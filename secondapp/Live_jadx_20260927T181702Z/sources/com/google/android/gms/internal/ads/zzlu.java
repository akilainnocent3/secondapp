package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzlu {
    public final long zza;
    public final float zzb;
    public final long zzc;

    public /* synthetic */ zzlu(zzlt zzltVar, byte[] bArr) {
        this.zza = zzltVar.zze();
        this.zzb = zzltVar.zzf();
        this.zzc = zzltVar.zzg();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlu)) {
            return false;
        }
        zzlu zzluVar = (zzlu) obj;
        return this.zza == zzluVar.zza && this.zzb == zzluVar.zzb && this.zzc == zzluVar.zzc;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc));
    }

    public final zzlt zza() {
        return new zzlt(this, null);
    }
}
