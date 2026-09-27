package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public interface zzvb {
    void zza(int i10, int i11, int i12, long j10, int i13);

    void zzb(int i10, int i11, zzim zzimVar, long j10, int i12);

    void zzc(int i10, boolean z10);

    void zzd(int i10, long j10);

    int zze();

    int zzf(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzg();

    @Nullable
    ByteBuffer zzh(int i10);

    void zzi(Runnable runnable);

    @Nullable
    ByteBuffer zzj(int i10);

    void zzk();

    void zzl();

    boolean zzm(zzva zzvaVar);

    void zzn(Surface surface);

    @k.t0(35)
    void zzo();

    void zzp(Bundle bundle);

    void zzq(int i10);

    @k.t0(31)
    void zzr(List list);
}
