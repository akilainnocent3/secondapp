package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdke;
import com.google.android.gms.internal.ads.zzfno;
import com.google.android.gms.internal.ads.zzimi;
import com.google.android.gms.internal.ads.zzimr;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class zzax implements zzimi {
    private final zzimr zza;

    private zzax(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
    }

    public static zzax zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzax(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdke((zzr) this.zza.zzb(), zzfno.zzc());
    }
}
