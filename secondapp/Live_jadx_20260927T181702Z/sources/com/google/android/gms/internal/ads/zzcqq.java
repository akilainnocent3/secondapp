package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcqq implements zzimi {
    private final zzimr zza;

    private zzcqq(zzcqh zzcqhVar, zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzcqq zzc(zzcqh zzcqhVar, zzimr zzimrVar) {
        return new zzcqq(zzcqhVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfli zzb() {
        zzfli zzfliVarZza = zzfli.zza(((zzcng) this.zza).zza());
        zzimq.zzb(zzfliVarZza);
        return zzfliVarZza;
    }
}
