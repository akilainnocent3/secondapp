package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class zzvd extends zzin {
    public final int zza;

    public zzvd(Throwable th2, @Nullable zzve zzveVar) {
        super("Decoder failed: ".concat(String.valueOf(zzveVar == null ? null : zzveVar.zza)), th2);
        boolean z10 = th2 instanceof MediaCodec.CodecException;
        if (z10) {
            ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        this.zza = z10 ? ((MediaCodec.CodecException) th2).getErrorCode() : 0;
    }
}
