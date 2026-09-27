package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzbqx extends zzbqu {
    final /* synthetic */ zzcfk zza;

    public zzbqx(zzbqy zzbqyVar, zzcfk zzcfkVar) {
        this.zza = zzcfkVar;
        Objects.requireNonNull(zzbqyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzb(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(parcelFileDescriptor);
    }
}
