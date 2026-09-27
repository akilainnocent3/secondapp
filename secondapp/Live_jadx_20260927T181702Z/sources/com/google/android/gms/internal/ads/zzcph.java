package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzcph implements zzegw {
    private final zzcol zza;
    private Context zzb;

    public /* synthetic */ zzcph(zzcol zzcolVar, byte[] bArr) {
        this.zza = zzcolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegw
    public final zzegx zza() {
        zzimq.zzc(this.zzb, Context.class);
        return new zzcpi(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzegw
    public final /* bridge */ /* synthetic */ zzegw zzb(Context context) {
        this.zzb = context;
        return this;
    }
}
