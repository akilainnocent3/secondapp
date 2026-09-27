package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzewo implements zzfby {
    private final zzhbs zza;

    public zzewo(zzhbs zzhbsVar) {
        this.zza = zzhbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final nj.t1 zza() {
        return this.zza.zzc(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzewn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzewp(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzb());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 55;
    }
}
