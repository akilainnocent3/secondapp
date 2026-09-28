package com.google.android.recaptcha.internal;

import defpackage.itg0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjf implements zzjt {
    public static final zzjf zza = new zzjf();

    private zzjf() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
        if (zzztVarArr.length != 3) {
            itg0.b(4, 3, null);
            return;
        }
        Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (objZza instanceof Integer)) {
            objZza = null;
        }
        Integer num = (Integer) objZza;
        if (num == null) {
            itg0.b(4, 5, null);
            return;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            itg0.b(4, 6, null);
            return;
        }
        Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (true != Objects.nonNull(objZza2)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            itg0.b(4, 5, null);
            return;
        }
        Object objZza3 = zzizVar.zzc().zza(zzztVarArr[2]);
        if (true != Objects.nonNull(objZza3)) {
            objZza3 = null;
        }
        if (objZza3 == null) {
            itg0.b(4, 5, null);
        } else if (objZza2.equals(objZza3)) {
            zzizVar.zzg(zzizVar.zza() + iIntValue);
        }
    }
}
