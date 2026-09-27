package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.t0(30)
final class zzado {
    public static void zza(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e10) {
            zzef.zzf("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
