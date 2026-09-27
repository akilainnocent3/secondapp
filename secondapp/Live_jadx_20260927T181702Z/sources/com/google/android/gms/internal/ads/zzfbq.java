package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfbq implements zzfby {
    private final boolean zza;

    public zzfbq(@Nullable zzfho zzfhoVar) {
        this.zza = zzfhoVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final nj.t1 zza() {
        return zzhbi.zza(new zzfbp(this.zza, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 36;
    }
}
