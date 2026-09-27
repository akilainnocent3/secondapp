package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfdx implements zzfby {
    final zzhbs zza;
    final List zzb;

    public zzfdx(zzbho zzbhoVar, zzhbs zzhbsVar, List list) {
        this.zza = zzhbsVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final nj.t1 zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfdw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfdy(this.zza.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 48;
    }
}
