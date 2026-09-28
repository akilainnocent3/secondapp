package com.google.android.recaptcha.internal;

import defpackage.itg0;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public final class zzkk implements zzjt {
    public static final zzkk zza = new zzkk();

    private zzkk() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
        if (zzztVarArr.length != 2) {
            itg0.b(4, 3, null);
            return;
        }
        Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (objZza instanceof Field)) {
            objZza = null;
        }
        Field field = (Field) objZza;
        if (field == null) {
            itg0.b(4, 5, null);
            return;
        }
        try {
            field.set(null, zzizVar.zzc().zza(zzztVarArr[1]));
        } catch (Exception e) {
            itg0.b(6, 11, e);
        }
    }
}
