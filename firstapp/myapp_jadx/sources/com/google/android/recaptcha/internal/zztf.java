package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zztf {
    public static final List zza(Object obj, long j) {
        zzsu zzsuVar = (zzsu) zzvc.zzf(obj, j);
        if (zzsuVar.zzc()) {
            return zzsuVar;
        }
        int size = zzsuVar.size();
        zzsu zzsuVarZzd = zzsuVar.zzd(size == 0 ? 10 : size + size);
        zzvc.zzs(obj, j, zzsuVarZzd);
        return zzsuVarZzd;
    }
}
