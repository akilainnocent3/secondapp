package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzbqy implements zzhaq {
    final /* synthetic */ zzbqq zza;

    public zzbqy(zzbrc zzbrcVar, zzbqq zzbqqVar) {
        this.zza = zzbqqVar;
        Objects.requireNonNull(zzbrcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final /* bridge */ /* synthetic */ nj.t1 zza(Object obj) throws Exception {
        zzcfk zzcfkVar = new zzcfk();
        ((zzbqw) obj).zze(this.zza, new zzbqx(this, zzcfkVar));
        return zzcfkVar;
    }
}
