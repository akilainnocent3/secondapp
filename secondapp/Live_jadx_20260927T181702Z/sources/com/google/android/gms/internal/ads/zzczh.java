package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzczh implements com.google.android.gms.ads.internal.client.zza {
    private final zzczl zza;
    private final zzfkm zzb;

    public zzczh(zzczl zzczlVar, zzfkm zzfkmVar) {
        this.zza = zzczlVar;
        this.zzb = zzfkmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zza(this.zzb.zzg);
    }
}
