package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeld implements zzimi {
    private final zzimr zza;

    private zzeld(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzeld zza(zzimr zzimrVar) {
        return new zzeld(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzelc(((zzcng) this.zza).zza());
    }
}
