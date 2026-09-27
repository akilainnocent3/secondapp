package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgoq implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzgoq(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzgoq zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzgoq(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgop((zzgpg) this.zza.zzb(), ((zzimu) this.zzb).zzb());
    }
}
