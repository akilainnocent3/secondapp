package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzdlb;
import com.google.android.gms.internal.ads.zzhbf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
final class zzar implements zzhbf {
    final /* synthetic */ zzdlb zza;

    public zzar(zzdlb zzdlbVar) {
        this.zza = zzdlbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th2) {
        this.zza.zzb(th2.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* synthetic */ void zzb(@Nullable Object obj) {
        this.zza.zza((zzbc) obj);
    }
}
