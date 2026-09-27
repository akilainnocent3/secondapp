package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzlx {
    public final zzxc zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final boolean zzj;
    public final boolean zzk;

    public zzlx(zzxc zzxcVar, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        zzgsw.zza(!z14 || z12);
        if (z13 && !z12) {
            z15 = false;
        }
        zzgsw.zza(z15);
        this.zza = zzxcVar;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = j12;
        this.zze = j13;
        this.zzf = j14;
        this.zzg = false;
        this.zzh = false;
        this.zzi = z12;
        this.zzj = z13;
        this.zzk = z14;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlx.class == obj.getClass()) {
            zzlx zzlxVar = (zzlx) obj;
            if (this.zzb == zzlxVar.zzb && this.zzd == zzlxVar.zzd && this.zze == zzlxVar.zze && this.zzf == zzlxVar.zzf && this.zzi == zzlxVar.zzi && this.zzj == zzlxVar.zzj && this.zzk == zzlxVar.zzk && Objects.equals(this.zza, zzlxVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        long j10 = this.zzf;
        long j11 = this.zze;
        return (((((((((((((iHashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzd)) * 31) + ((int) j11)) * 31) + ((int) j10)) * 29791) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0)) * 31) + (this.zzk ? 1 : 0);
    }

    public final zzlx zza(long j10, long j11) {
        return (j10 == this.zzb && j11 == this.zzc) ? this : new zzlx(this.zza, j10, j11, this.zzd, this.zze, this.zzf, false, false, this.zzi, this.zzj, this.zzk);
    }

    public final zzlx zzb(long j10) {
        return j10 == this.zzd ? this : new zzlx(this.zza, this.zzb, this.zzc, j10, this.zze, this.zzf, false, false, this.zzi, this.zzj, this.zzk);
    }
}
