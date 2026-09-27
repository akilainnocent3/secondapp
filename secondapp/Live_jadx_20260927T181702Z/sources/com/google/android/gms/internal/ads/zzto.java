package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzto implements zzrt {
    final /* synthetic */ zztp zza;

    public /* synthetic */ zzto(zztp zztpVar, byte[] bArr) {
        Objects.requireNonNull(zztpVar);
        this.zza = zztpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final void zza(Exception exc) {
        zzef.zzf("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzaz().zzi(exc);
    }
}
