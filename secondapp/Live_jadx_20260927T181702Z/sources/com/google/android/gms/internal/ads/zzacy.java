package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzacy extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzacx zzd;
    private boolean zze;

    public /* synthetic */ zzacy(zzacx zzacxVar, SurfaceTexture surfaceTexture, boolean z10, byte[] bArr) {
        super(surfaceTexture);
        this.zzd = zzacxVar;
        this.zza = z10;
    }

    public static synchronized boolean zza(Context context) {
        int i10;
        if (!zzc) {
            try {
                if (zzdw.zza(context)) {
                    i10 = zzdw.zzb() ? 1 : 2;
                } else {
                    i10 = 0;
                }
            } catch (zzdv e10) {
                zzef.zze("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e10.getMessage())));
            }
            zzb = i10;
            zzc = true;
        }
        return zzb != 0;
    }

    public static zzacy zzb(Context context, boolean z10) {
        boolean z11 = true;
        if (z10 && !zza(context)) {
            z11 = false;
        }
        zzgsw.zzi(z11);
        return new zzacx().zza(z10 ? zzb : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzacx zzacxVar = this.zzd;
        synchronized (zzacxVar) {
            try {
                if (!this.zze) {
                    zzacxVar.zzb();
                    this.zze = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
