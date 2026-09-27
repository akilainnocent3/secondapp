package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzarl {
    public final int zza;
    public final long zzb;

    private zzarl(int i10, long j10) {
        this.zza = i10;
        this.zzb = j10;
    }

    public static zzarl zza(zzafq zzafqVar, zzes zzesVar) throws IOException {
        zzafqVar.zzi(zzesVar.zzi(), 0, 8);
        zzesVar.zzh(0);
        return new zzarl(zzesVar.zzB(), zzesVar.zzA());
    }
}
