package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfce implements zzfby {
    private final Context zza;
    private final zzhbs zzb;

    public zzfce(Context context, zzhbs zzhbsVar) {
        this.zza = context;
        this.zzb = zzhbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final nj.t1 zza() {
        return ((Boolean) zzbjw.zzb.zze()).booleanValue() ? this.zzb.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        }) : zzhbi.zza(new zzfcf(-1, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 59;
    }

    public final /* synthetic */ zzfcf zzc() {
        Context context = this.zza;
        return new zzfcf(zzbhp.zzc(context), zzbhp.zzd(context));
    }
}
