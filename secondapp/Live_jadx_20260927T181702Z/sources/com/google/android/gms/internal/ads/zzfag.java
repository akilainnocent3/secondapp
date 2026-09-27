package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfag implements zzfby {
    private final zzhbs zza;
    private final zzeac zzb;

    public zzfag(zzhbs zzhbsVar, zzeac zzeacVar) {
        this.zza = zzhbsVar;
        this.zzb = zzeacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final nj.t1 zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfaf
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 62;
    }

    public final /* synthetic */ zzfah zzc() {
        return new zzfah(this.zzb.zzb());
    }
}
