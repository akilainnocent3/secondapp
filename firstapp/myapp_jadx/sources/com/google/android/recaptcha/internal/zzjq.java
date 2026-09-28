package com.google.android.recaptcha.internal;

import defpackage.itg0;
import java.lang.reflect.Array;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjq implements zzjt {
    public static final zzjq zza = new zzjq();

    private zzjq() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
        if (zzztVarArr.length != 2) {
            itg0.b(4, 3, null);
            return;
        }
        Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            itg0.b(4, 5, null);
            return;
        }
        Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (true != (objZza2 instanceof Integer)) {
            objZza2 = null;
        }
        Integer num = (Integer) objZza2;
        if (num == null) {
            itg0.b(4, 5, null);
            return;
        }
        int iIntValue = num.intValue();
        try {
            if (objZza instanceof String) {
                objZza = zzizVar.zzh().zza((String) objZza);
            }
            zzizVar.zzc().zze(i, Array.newInstance((Class<?>) zziy.zza(objZza), iIntValue));
        } catch (Exception e) {
            itg0.b(6, 21, e);
        }
    }
}
