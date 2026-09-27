package com.google.android.gms.internal.cast;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzby implements com.google.android.gms.cast.framework.media.internal.zza {
    final /* synthetic */ zzca zza;

    public zzby(zzca zzcaVar) {
        this.zza = zzcaVar;
    }

    @Override // com.google.android.gms.cast.framework.media.internal.zza
    public final void zza(Bitmap bitmap) {
        if (bitmap != null) {
            zzca zzcaVar = this.zza;
            if (zzcaVar.zzd != null) {
                zzcaVar.zzd.setVisibility(4);
            }
            this.zza.zza.setVisibility(0);
            this.zza.zza.setImageBitmap(bitmap);
            zzca zzcaVar2 = this.zza;
            if (zzcaVar2.zzf != null) {
                zzcaVar2.zzf.zza();
            }
        }
    }
}
