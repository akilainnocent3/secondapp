package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgbw {
    private static zzgbw zzb;
    final zzgbs zza;

    private zzgbw(Context context) {
        this.zza = zzgbs.zza(context);
        zzgbr.zza(context);
    }

    public static final zzgbw zza(Context context) {
        zzgbw zzgbwVar;
        synchronized (zzgbw.class) {
            try {
                if (zzb == null) {
                    zzb = new zzgbw(context);
                }
                zzgbwVar = zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzgbwVar;
    }

    public final void zzb(@Nullable zzgbq zzgbqVar) throws IOException {
        synchronized (zzgbw.class) {
            zzgbs zzgbsVar = this.zza;
            zzgbsVar.zzf("vendor_scoped_gpid_v2_id");
            zzgbsVar.zzf("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
