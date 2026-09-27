package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdbq implements zzimi {
    private final zzdbp zza;
    private final zzimr zzb;

    private zzdbq(zzdbp zzdbpVar, zzimr zzimrVar) {
        this.zza = zzdbpVar;
        this.zzb = zzimrVar;
    }

    public static zzdbq zza(zzdbp zzdbpVar, zzimr zzimrVar) {
        return new zzdbq(zzdbpVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return this.zza.zzg((String) this.zzb.zzb());
    }
}
