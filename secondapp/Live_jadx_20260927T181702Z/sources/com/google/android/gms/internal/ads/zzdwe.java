package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdwe implements zzdda {

    @Nullable
    private final zzcki zza;

    public zzdwe(@Nullable zzcki zzckiVar) {
        this.zza = zzckiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zza(@Nullable Context context) {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzb(@Nullable Context context) {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzc(@Nullable Context context) {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.destroy();
        }
    }
}
