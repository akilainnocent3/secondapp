package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzajy implements Comparable {
    private final long zza;
    private final long zzb;
    private final long zzc;

    public /* synthetic */ zzajy(long j10, long j11, long j12, byte[] bArr) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.zza, ((zzajy) obj).zza);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzajy)) {
            return false;
        }
        zzajy zzajyVar = (zzajy) obj;
        return this.zza == zzajyVar.zza && this.zzb == zzajyVar.zzb && this.zzc == zzajyVar.zzc;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc));
    }

    public final /* synthetic */ long zza() {
        return this.zza;
    }

    public final /* synthetic */ long zzb() {
        return this.zzb;
    }

    public final /* synthetic */ long zzc() {
        return this.zzc;
    }
}
