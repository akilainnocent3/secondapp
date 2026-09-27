package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzdky;
import com.google.android.gms.internal.ads.zzdyu;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class zzr implements zzdky {
    private final zzdyu zza;
    private final zzq zzb;
    private final String zzc;

    @h1
    public zzr(zzdyu zzdyuVar, zzq zzqVar, String str) {
        this.zza = zzdyuVar;
        this.zzb = zzqVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzd(@Nullable zzbc zzbcVar) {
        if (zzbcVar == null) {
            return;
        }
        this.zzb.zza(this.zzc, zzbcVar.zzb, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zze(@Nullable String str) {
    }
}
