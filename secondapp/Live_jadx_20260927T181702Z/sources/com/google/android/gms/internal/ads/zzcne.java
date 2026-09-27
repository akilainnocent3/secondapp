package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcne implements zzimi {
    private final zzcmz zza;

    private zzcne(zzcmz zzcmzVar) {
        this.zza = zzcmzVar;
    }

    public static zzcne zzc(zzcmz zzcmzVar) {
        return new zzcne(zzcmzVar);
    }

    public static Context zzd(zzcmz zzcmzVar) {
        Context contextZzb = zzcmzVar.zzb();
        zzimq.zzb(contextZzb);
        return contextZzb;
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
