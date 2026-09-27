package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzuy {
    public final zzve zza;
    public final MediaFormat zzb;
    public final zzv zzc;

    @Nullable
    public final Surface zzd;

    @Nullable
    public final MediaCrypto zze = null;

    @Nullable
    public final zzux zzf;

    private zzuy(zzve zzveVar, MediaFormat mediaFormat, zzv zzvVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, @Nullable zzux zzuxVar) {
        this.zza = zzveVar;
        this.zzb = mediaFormat;
        this.zzc = zzvVar;
        this.zzd = surface;
        this.zzf = zzuxVar;
    }

    public static zzuy zza(zzve zzveVar, MediaFormat mediaFormat, zzv zzvVar, @Nullable MediaCrypto mediaCrypto, @Nullable zzux zzuxVar) {
        return new zzuy(zzveVar, mediaFormat, zzvVar, null, null, zzuxVar);
    }

    public static zzuy zzb(zzve zzveVar, MediaFormat mediaFormat, zzv zzvVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
        return new zzuy(zzveVar, mediaFormat, zzvVar, surface, null, null);
    }
}
