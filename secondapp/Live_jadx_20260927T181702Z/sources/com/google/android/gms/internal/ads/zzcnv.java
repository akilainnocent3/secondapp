package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcnv implements zzimi {
    private final zzcmz zza;

    private zzcnv(zzcmz zzcmzVar) {
        this.zza = zzcmzVar;
    }

    public static zzcnv zza(zzcmz zzcmzVar) {
        return new zzcnv(zzcmzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        String strZze = this.zza.zze();
        zzimq.zzb(strZze);
        return strZze;
    }
}
