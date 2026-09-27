package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzazd implements PackageManager$OnChecksumsReadyListener {
    final zzhcb zza = zzhcb.zze();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.zza.zza("");
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ApkChecksum apkChecksumA = z.a(list.get(i10));
                if (apkChecksumA.getType() == 8) {
                    zzhcb zzhcbVar = this.zza;
                    zzgyu zzgyuVarZzi = zzgyu.zzn().zzi();
                    byte[] value = apkChecksumA.getValue();
                    zzhcbVar.zza(zzgyuVarZzi.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zza("");
    }
}
