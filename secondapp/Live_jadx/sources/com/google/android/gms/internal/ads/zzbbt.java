package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzbbt implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzbbu zza;

    public zzbbt(zzbbu zzbbuVar) {
        Objects.requireNonNull(zzbbuVar);
        this.zza = zzbbuVar;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        if (z10) {
            zzbbu zzbbuVar = this.zza;
            zzbbuVar.zze(System.currentTimeMillis());
            zzbbuVar.zzh(true);
            return;
        }
        zzbbu zzbbuVar2 = this.zza;
        long jZzf = zzbbuVar2.zzf();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jZzf > 0 && jCurrentTimeMillis >= zzbbuVar2.zzf()) {
            zzbbuVar2.zzg(jCurrentTimeMillis - zzbbuVar2.zzf());
        }
        zzbbuVar2.zzh(false);
    }
}
