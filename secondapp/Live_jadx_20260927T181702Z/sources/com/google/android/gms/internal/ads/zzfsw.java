package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfsw {
    private final String zza;

    @Nullable
    private final AdFormat zzb;

    @Nullable
    private final String zzc;

    public /* synthetic */ zzfsw(zzfsv zzfsvVar, byte[] bArr) {
        this.zza = zzfsvVar.zzb();
        this.zzb = zzfsvVar.zzc();
        this.zzc = zzfsvVar.zzd();
    }

    public final boolean equals(@Nullable Object obj) {
        AdFormat adFormat;
        AdFormat adFormat2;
        if (obj instanceof zzfsw) {
            zzfsw zzfswVar = (zzfsw) obj;
            if (this.zza.equals(zzfswVar.zza) && (adFormat = this.zzb) != null && (adFormat2 = zzfswVar.zzb) != null && adFormat.equals(adFormat2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        AdFormat adFormat = this.zzb;
        return adFormat == null ? "unknown" : adFormat.name().toLowerCase(Locale.ENGLISH);
    }

    @Nullable
    public final String zzc() {
        return this.zzc;
    }
}
