package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes4.dex */
final class zztn {
    public static final boolean zza(Object obj) {
        return !((zztm) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zztm zztmVarZzb = (zztm) obj;
        zztm zztmVar = (zztm) obj2;
        if (!zztmVar.isEmpty()) {
            if (!zztmVarZzb.zze()) {
                zztmVarZzb = zztmVarZzb.zzb();
            }
            zztmVarZzb.zzd(zztmVar);
        }
        return zztmVarZzb;
    }
}
