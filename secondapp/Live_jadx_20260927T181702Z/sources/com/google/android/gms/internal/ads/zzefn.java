package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzefn implements zzhbf {
    final /* synthetic */ Context zza;

    public zzefn(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th2) {
        if (((Boolean) zzbjw.zzh.zze()).booleanValue() && (th2 instanceof com.google.android.gms.ads.internal.util.zzaz)) {
            zzbhp.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbjw.zzj.zze()).booleanValue()) {
            zzbhp.zze(this.zza);
        }
    }
}
