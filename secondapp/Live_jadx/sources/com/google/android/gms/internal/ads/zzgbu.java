package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgbu extends zzgbt {
    private static zzgbu zzd;

    private zzgbu(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzgbu zzh(Context context) {
        zzgbu zzgbuVar;
        synchronized (zzgbu.class) {
            try {
                if (zzd == null) {
                    zzd = new zzgbu(context);
                }
                zzgbuVar = zzd;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzgbuVar;
    }

    public final zzgbq zzi(long j10, boolean z10) throws IOException {
        zzgbq zzgbqVarZza;
        synchronized (zzgbu.class) {
            zzgbqVarZza = zza(null, null, j10, z10);
        }
        return zzgbqVarZza;
    }

    public final zzgbq zzj(String str, String str2, long j10, boolean z10) throws IOException {
        zzgbq zzgbqVarZza;
        synchronized (zzgbu.class) {
            zzgbqVarZza = zza(str, str2, j10, z10);
        }
        return zzgbqVarZza;
    }

    public final void zzk() throws IOException {
        synchronized (zzgbu.class) {
            zzc(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzgbu.class) {
            zzc(true);
        }
    }
}
