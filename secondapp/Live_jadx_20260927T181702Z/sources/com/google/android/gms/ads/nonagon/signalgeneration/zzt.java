package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdze;
import com.google.android.gms.internal.ads.zzimi;
import com.google.android.gms.internal.ads.zzimr;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class zzt implements zzimi {
    private final zzimr zza;

    private zzt(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzt zza(zzimr zzimrVar) {
        return new zzt(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzq((zzdze) this.zza.zzb());
    }
}
