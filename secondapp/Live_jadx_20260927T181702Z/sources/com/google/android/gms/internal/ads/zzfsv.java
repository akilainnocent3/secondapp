package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfsv {
    private final String zza;

    @Nullable
    private final AdFormat zzb;

    @Nullable
    private String zzc;

    public zzfsv(String str, @Nullable AdFormat adFormat) {
        this.zza = str;
        this.zzb = adFormat;
    }

    public final zzfsv zza(String str) {
        this.zzc = str;
        return this;
    }

    public final /* synthetic */ String zzb() {
        return this.zza;
    }

    public final /* synthetic */ AdFormat zzc() {
        return this.zzb;
    }

    public final /* synthetic */ String zzd() {
        return this.zzc;
    }
}
