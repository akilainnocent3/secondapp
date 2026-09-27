package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcvj implements zzimi {
    private final zzcvg zza;

    private zzcvj(zzcvg zzcvgVar) {
        this.zza = zzcvgVar;
    }

    public static zzcvj zzc(zzcvg zzcvgVar) {
        return new zzcvj(zzcvgVar);
    }

    public static zzfju zzd(zzcvg zzcvgVar) {
        zzfju zzfjuVarZzd = zzcvgVar.zzd();
        zzimq.zzb(zzfjuVarZzd);
        return zzfjuVarZzd;
    }

    public final zzfju zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
