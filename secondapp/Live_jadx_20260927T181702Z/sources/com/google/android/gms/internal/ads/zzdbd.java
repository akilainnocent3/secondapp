package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzdbd implements zzddt, zzdda {
    private final zzfjt zza;

    public zzdbd(Context context, zzfjt zzfjtVar, zzbyu zzbyuVar) {
        this.zza = zzfjtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzg() {
        zzbyv zzbyvVar = this.zza.zzad;
        if (zzbyvVar == null || !zzbyvVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = zzbyvVar.zzb;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zza(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzb(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzc(@Nullable Context context) {
    }
}
