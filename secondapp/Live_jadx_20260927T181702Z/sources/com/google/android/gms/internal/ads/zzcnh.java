package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcnh implements zzimi {
    private final zzcmz zza;

    private zzcnh(zzcmz zzcmzVar) {
        this.zza = zzcmzVar;
    }

    public static zzcnh zzc(zzcmz zzcmzVar) {
        return new zzcnh(zzcmzVar);
    }

    public static WeakReference zzd(zzcmz zzcmzVar) {
        WeakReference weakReferenceZzc = zzcmzVar.zzc();
        zzimq.zzb(weakReferenceZzc);
        return weakReferenceZzc;
    }

    public final WeakReference zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
