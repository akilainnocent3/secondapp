package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzpz {
    public static final zzpz zza;
    public final String zzb;

    @Nullable
    private final zzpy zzc;

    static {
        new zzpz("");
        zza = new zzpz("preload");
    }

    public zzpz(String str) {
        this.zzb = str;
        this.zzc = Build.VERSION.SDK_INT >= 31 ? new zzpy() : null;
    }

    @k.t0(31)
    public final synchronized LogSessionId zza() {
        zzpy zzpyVar;
        zzpyVar = this.zzc;
        if (zzpyVar == null) {
            throw null;
        }
        return zzpyVar.zza;
    }

    @k.t0(31)
    public final synchronized void zzb(LogSessionId logSessionId) {
        zzpy zzpyVar = this.zzc;
        if (zzpyVar == null) {
            throw null;
        }
        zzgsw.zzi(zzpyVar.zza.equals(LogSessionId.LOG_SESSION_ID_NONE));
        zzpyVar.zza = logSessionId;
    }
}
