package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbfm {
    final long zza;
    final String zzb;
    final int zzc;

    public zzbfm(long j10, String str, int i10) {
        this.zza = j10;
        this.zzb = str;
        this.zzc = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzbfm)) {
            return false;
        }
        zzbfm zzbfmVar = (zzbfm) obj;
        return zzbfmVar.zza == this.zza && zzbfmVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
