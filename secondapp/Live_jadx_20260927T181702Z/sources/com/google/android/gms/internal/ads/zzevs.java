package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzevs implements zzfby {
    private final zzhbs zza;
    private final VersionInfoParcel zzb;

    public zzevs(VersionInfoParcel versionInfoParcel, zzhbs zzhbsVar) {
        this.zzb = versionInfoParcel;
        this.zza = zzhbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final nj.t1 zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzevr
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 54;
    }

    public final /* synthetic */ zzevt zzc() {
        return zzevt.zzb(this.zzb);
    }
}
