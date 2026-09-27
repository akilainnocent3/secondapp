package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdno implements zzimi {
    private final zzdnl zza;

    private zzdno(zzdnl zzdnlVar) {
        this.zza = zzdnlVar;
    }

    public static zzdno zzc(zzdnl zzdnlVar) {
        return new zzdno(zzdnlVar);
    }

    public static zzdpr zzd(zzdnl zzdnlVar) {
        zzdpr zzdprVarZza = zzdnlVar.zza();
        zzimq.zzb(zzdprVarZza);
        return zzdprVarZza;
    }

    public final zzdpr zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
