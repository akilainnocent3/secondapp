package com.google.android.gms.cast.internal;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
final class zzal implements zzas {
    final /* synthetic */ zzas zza;
    final /* synthetic */ zzaq zzb;

    public zzal(zzaq zzaqVar, zzas zzasVar) {
        this.zzb = zzaqVar;
        this.zza = zzasVar;
    }

    @Override // com.google.android.gms.cast.internal.zzas
    public final void zza(String str, long j10, int i10, @Nullable Object obj, long j11, long j12) {
        this.zzb.zzx = null;
        zzas zzasVar = this.zza;
        if (zzasVar != null) {
            zzasVar.zza(str, j10, i10, obj, j11, j12);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzas
    public final void zzb(String str, long j10, long j11, long j12) {
        zzas zzasVar = this.zza;
        if (zzasVar != null) {
            zzasVar.zzb(str, j10, j11, j12);
        }
    }
}
