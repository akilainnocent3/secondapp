package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfnk implements zzimi {
    public static zzfnk zza() {
        return zzfnj.zza;
    }

    public static zzhbs zzc() {
        zzhbs zzhbsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgK)).booleanValue()) {
            zzhbsVar = zzcff.zzc;
        } else {
            zzhbsVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgJ)).booleanValue() ? zzcff.zza : zzcff.zzf;
        }
        zzimq.zzb(zzhbsVar);
        return zzhbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzc();
    }
}
