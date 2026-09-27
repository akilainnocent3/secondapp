package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzvz implements zzvc {
    private final MediaCodec zza;

    public zzvz(MediaCodec mediaCodec) {
        this.zza = mediaCodec;
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzb(int i10, int i11, int i12, long j10, int i13) {
        this.zza.queueInputBuffer(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzc(int i10, int i11, zzim zzimVar, long j10, int i12) {
        this.zza.queueSecureInputBuffer(i10, 0, zzimVar.zzb(), j10, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzd(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzg() {
    }
}
