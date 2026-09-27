package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzcpa implements zzeaq {
    private final zzcol zza;
    private Context zzb;
    private zzbqe zzc;

    public /* synthetic */ zzcpa(zzcol zzcolVar, byte[] bArr) {
        this.zza = zzcolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final zzear zza() {
        zzimq.zzc(this.zzb, Context.class);
        zzimq.zzc(this.zzc, zzbqe.class);
        return new zzcpb(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final /* bridge */ /* synthetic */ zzeaq zzb(zzbqe zzbqeVar) {
        zzbqeVar.getClass();
        this.zzc = zzbqeVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final /* bridge */ /* synthetic */ zzeaq zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
