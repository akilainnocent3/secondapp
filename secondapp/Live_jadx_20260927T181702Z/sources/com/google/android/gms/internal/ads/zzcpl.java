package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzcpl implements zzfjm {
    private final zzcol zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcpl(zzcol zzcolVar, byte[] bArr) {
        this.zza = zzcolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final zzfjn zza() {
        zzimq.zzc(this.zzb, Context.class);
        return new zzcpm(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final /* synthetic */ zzfjm zzb(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final /* bridge */ /* synthetic */ zzfjm zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
