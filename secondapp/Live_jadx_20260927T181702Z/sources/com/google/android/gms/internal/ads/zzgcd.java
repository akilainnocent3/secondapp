package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgcd implements zzimi {
    private final zzimr zza;

    private zzgcd(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzgcd zza(zzimr zzimrVar) {
        return new zzgcd(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        File dir = ((Context) this.zza.zzb()).getDir("yqzdkcache", 0);
        zzimq.zzb(dir);
        return dir;
    }
}
