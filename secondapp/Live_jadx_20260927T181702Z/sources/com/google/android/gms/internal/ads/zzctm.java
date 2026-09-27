package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzctm implements zzbpe {
    final /* synthetic */ zzctp zza;

    public zzctm(zzctp zzctpVar) {
        Objects.requireNonNull(zzctpVar);
        this.zza = zzctpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final void zza(Object obj, Map map) {
        zzctp zzctpVar = this.zza;
        if (zzctpVar.zze(map)) {
            zzctpVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza.zzg().zzl();
                }
            });
        }
    }
}
