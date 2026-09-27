package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcrg implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzcrg(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzcrg zzc(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzcrg(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcrf zzb() {
        return new zzcrf(((zzimm) this.zza).zzb(), ((zzimm) this.zzb).zzb());
    }
}
