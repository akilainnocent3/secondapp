package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzga implements zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzga(long j10, long j11, long j12) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzga)) {
            return false;
        }
        zzga zzgaVar = (zzga) obj;
        return this.zza == zzgaVar.zza && this.zzb == zzgaVar.zzb && this.zzc == zzgaVar.zzc;
    }

    public final int hashCode() {
        return ((((f0.p.a(this.zza) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + f0.p.a(this.zzb)) * 31) + f0.p.a(this.zzc);
    }

    public final String toString() {
        long j10 = this.zza;
        int length = String.valueOf(j10).length();
        long j11 = this.zzb;
        int length2 = String.valueOf(j11).length();
        long j12 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j12).length());
        sb2.append("Mp4Timestamp: creation time=");
        sb2.append(j10);
        sb2.append(", modification time=");
        sb2.append(j11);
        sb2.append(", timescale=");
        sb2.append(j12);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        j.a(this, zzamVar);
    }
}
