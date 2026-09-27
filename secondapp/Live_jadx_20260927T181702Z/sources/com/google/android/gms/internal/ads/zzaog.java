package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzaog {
    @Nullable
    public static zzaoh zza(@Nullable zzaoh zzaohVar, @Nullable String[] strArr, Map map) {
        int length;
        int i10 = 0;
        if (zzaohVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzaoh) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzaoh zzaohVar2 = new zzaoh();
                while (i10 < length2) {
                    zzaohVar2.zzr((zzaoh) map.get(strArr[i10]));
                    i10++;
                }
                return zzaohVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzaohVar.zzr((zzaoh) map.get(strArr[0]));
                return zzaohVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i10 < length) {
                    zzaohVar.zzr((zzaoh) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return zzaohVar;
    }
}
