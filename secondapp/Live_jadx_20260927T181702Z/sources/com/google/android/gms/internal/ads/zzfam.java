package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfam implements zzfbw {

    @Nullable
    private final String zza;

    @Nullable
    private final Integer zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final String zzd;

    @Nullable
    private final String zze;

    @Nullable
    private final String zzf;

    public zzfam(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.zza = str;
        this.zzb = num;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
    }

    @Override // com.google.android.gms.internal.ads.zzfbw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzflb.zze(bundle, "pn", this.zza);
        zzflb.zzh(bundle, "vc", this.zzb);
        zzflb.zze(bundle, "vnm", this.zzc);
        zzflb.zze(bundle, z5.g.f160356x, this.zzd);
        zzflb.zze(bundle, "ins_pn", this.zze);
        zzflb.zze(bundle, "ini_pn", this.zzf);
    }
}
