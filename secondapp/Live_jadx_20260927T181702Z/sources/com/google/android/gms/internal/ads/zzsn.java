package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzsn extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zzsp zza;

    public zzsn(zzsp zzspVar) {
        Objects.requireNonNull(zzspVar);
        this.zza = zzspVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        zzee zzeeVarZzu = this.zza.zza.zzu();
        zzeeVarZzu.zze(-1, zzsm.zza);
        zzeeVarZzu.zzf();
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzee zzeeVarZzu = this.zza.zza.zzu();
        zzeeVarZzu.zze(-1, zzsk.zza);
        zzeeVarZzu.zzf();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzee zzeeVarZzu = this.zza.zza.zzu();
        zzeeVarZzu.zze(-1, zzsl.zza);
        zzeeVarZzu.zzf();
    }
}
