package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgpo implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzgpq zza;

    public zzgpo(zzgpq zzgpqVar) {
        Objects.requireNonNull(zzgpqVar);
        this.zza = zzgpqVar;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        zzgpq zzgpqVar = this.zza;
        synchronized (zzgpqVar) {
            try {
                if (z10) {
                    zzgpqVar.zzg(System.currentTimeMillis());
                    zzgpqVar.zzj(true);
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzgpqVar.zzh() > 0 && jCurrentTimeMillis >= zzgpqVar.zzh()) {
                        zzgpqVar.zzi(jCurrentTimeMillis - zzgpqVar.zzh());
                    }
                    zzgpqVar.zzj(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
