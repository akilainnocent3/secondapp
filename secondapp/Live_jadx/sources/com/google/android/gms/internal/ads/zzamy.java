package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzamy {
    public static void zza(zzamz zzamzVar, zzand zzandVar, zzds zzdsVar) {
        for (int i10 = 0; i10 < zzamzVar.zza(); i10++) {
            long jZzb = zzamzVar.zzb(i10);
            List listZzc = zzamzVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i10 == zzamzVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = zzamzVar.zzb(i10 + 1) - zzamzVar.zzb(i10);
                if (jZzb2 > 0) {
                    zzdsVar.zza(new zzamw(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
