package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzaoi implements zzamz {
    private final zzaob zza;
    private final long[] zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;

    public zzaoi(zzaob zzaobVar, Map map, Map map2, Map map3) {
        this.zza = zzaobVar;
        this.zzd = map2;
        this.zze = map3;
        this.zzc = Collections.unmodifiableMap(map);
        this.zzb = zzaobVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final long zzb(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final List zzc(long j10) {
        return this.zza.zzh(j10, this.zzc, this.zzd, this.zze);
    }
}
