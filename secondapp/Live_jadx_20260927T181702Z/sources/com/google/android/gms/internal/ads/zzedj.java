package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzedj {
    private final Context zza;
    private zzarq zzb;

    public zzedj(Context context) {
        this.zza = context;
    }

    public final void zza() {
        this.zzb = zzarp.zza(this.zza);
    }

    public final void zzb(zzart zzartVar) {
        this.zzb.zzb(zzartVar);
    }

    public final void zzc() {
        this.zzb.zzc();
    }

    @Nullable
    public final zzaru zzd() {
        try {
            zzarq zzarqVar = this.zzb;
            if (zzarqVar == null || !zzarqVar.zza()) {
                return null;
            }
            return zzarqVar.zzd();
        } catch (RemoteException unused) {
            return null;
        }
    }
}
