package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgbr {
    private static zzgbr zzb;
    final zzgbs zza;

    private zzgbr(Context context) {
        this.zza = zzgbs.zza(context);
    }

    public static final zzgbr zza(Context context) {
        zzgbr zzgbrVar;
        synchronized (zzgbr.class) {
            try {
                if (zzb == null) {
                    zzb = new zzgbr(context);
                }
                zzgbrVar = zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzgbrVar;
    }

    public final void zzb(boolean z10) throws IOException {
        synchronized (zzgbr.class) {
            try {
                zzgbs zzgbsVar = this.zza;
                zzgbsVar.zzb("paidv2_publisher_option", Boolean.valueOf(z10));
                if (!z10) {
                    zzgbsVar.zzf("paidv2_creation_time");
                    zzgbsVar.zzf("paidv2_id");
                    zzgbsVar.zzf("vendor_scoped_gpid_v2_id");
                    zzgbsVar.zzf("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzc() {
        boolean zZze;
        synchronized (zzgbr.class) {
            zZze = this.zza.zze("paidv2_publisher_option", true);
        }
        return zZze;
    }

    public final void zzd(boolean z10) throws IOException {
        synchronized (zzgbr.class) {
            this.zza.zzb("paidv2_user_option", Boolean.valueOf(z10));
        }
    }

    public final boolean zze() {
        boolean zZze;
        synchronized (zzgbr.class) {
            zZze = this.zza.zze("paidv2_user_option", true);
        }
        return zZze;
    }
}
