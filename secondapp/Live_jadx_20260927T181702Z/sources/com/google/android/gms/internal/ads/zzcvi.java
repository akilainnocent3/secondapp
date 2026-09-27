package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcvi implements zzimi {
    private final zzcvg zza;

    private zzcvi(zzcvg zzcvgVar) {
        this.zza = zzcvgVar;
    }

    public static zzcvi zzc(zzcvg zzcvgVar) {
        return new zzcvi(zzcvgVar);
    }

    public static View zzd(zzcvg zzcvgVar) {
        View viewZzb = zzcvgVar.zzb();
        zzimq.zzb(viewZzb);
        return viewZzb;
    }

    public final View zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
