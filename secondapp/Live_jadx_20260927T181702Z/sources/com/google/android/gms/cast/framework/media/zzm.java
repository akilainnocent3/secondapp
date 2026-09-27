package com.google.android.gms.cast.framework.media;

import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
final class zzm {

    @Nullable
    public final MediaSessionCompat.Token zza;
    public final boolean zzb;
    public final int zzc;

    @Nullable
    public final String zzd;
    public final String zze;
    public final boolean zzf;
    public final boolean zzg;

    public zzm(boolean z10, int i10, @Nullable String str, String str2, @Nullable MediaSessionCompat.Token token, boolean z11, boolean z12) {
        this.zzb = z10;
        this.zzc = i10;
        this.zzd = str;
        this.zze = str2;
        this.zza = token;
        this.zzf = z11;
        this.zzg = z12;
    }
}
