package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdpe {

    @Nullable
    private zzblp zza;

    public zzdpe(zzdop zzdopVar) {
        this.zza = zzdopVar;
    }

    @Nullable
    public final synchronized zzblp zza() {
        return this.zza;
    }

    public final synchronized void zzb(@Nullable zzblp zzblpVar) {
        this.zza = zzblpVar;
    }
}
