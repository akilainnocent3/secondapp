package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.t0(24)
final class zzil {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = c5.g.a(0, 0);

    public /* synthetic */ zzil(MediaCodec.CryptoInfo cryptoInfo, byte[] bArr) {
        this.zza = cryptoInfo;
    }

    public final /* synthetic */ void zza(int i10, int i11) {
        MediaCodec.CryptoInfo.Pattern pattern = this.zzb;
        pattern.set(i10, i11);
        this.zza.setPattern(pattern);
    }
}
