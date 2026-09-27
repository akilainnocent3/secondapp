package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzho implements zzhi {
    private final Context zza;
    private final zzhi zzb;

    public zzho(Context context) {
        zzhq zzhqVar = new zzhq();
        this.zza = context.getApplicationContext();
        this.zzb = zzhqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    public final /* bridge */ /* synthetic */ zzhj zza() {
        return new zzhp(this.zza, this.zzb.zza());
    }
}
