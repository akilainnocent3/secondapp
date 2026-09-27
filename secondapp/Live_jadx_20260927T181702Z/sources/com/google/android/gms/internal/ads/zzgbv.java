package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgbv extends zzgbt {
    private static zzgbv zzd;

    private zzgbv(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzgbv zzh(Context context) {
        zzgbv zzgbvVar;
        synchronized (zzgbv.class) {
            try {
                if (zzd == null) {
                    zzd = new zzgbv(context);
                }
                zzgbvVar = zzd;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzgbvVar;
    }

    public final zzgbq zzi(long j10, boolean z10) throws IOException {
        synchronized (zzgbv.class) {
            try {
                if (this.zzc.zzc()) {
                    return zza(null, null, j10, z10);
                }
                return new zzgbq();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzgbv.class) {
            try {
                if (zzg(false)) {
                    zzc(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
