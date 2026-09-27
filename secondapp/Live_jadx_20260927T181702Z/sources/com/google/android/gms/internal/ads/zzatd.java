package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzatd {

    @Nullable
    public final Object zza;

    @Nullable
    public final zzasg zzb;

    @Nullable
    public final zzatg zzc;
    public boolean zzd;

    private zzatd(zzatg zzatgVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzatgVar;
    }

    public static zzatd zza(@Nullable Object obj, @Nullable zzasg zzasgVar) {
        return new zzatd(obj, zzasgVar);
    }

    public static zzatd zzb(zzatg zzatgVar) {
        return new zzatd(zzatgVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }

    private zzatd(@Nullable Object obj, @Nullable zzasg zzasgVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzasgVar;
        this.zzc = null;
    }
}
