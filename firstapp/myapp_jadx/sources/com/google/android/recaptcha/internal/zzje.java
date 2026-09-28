package com.google.android.recaptcha.internal;

import defpackage.itg0;
import java.lang.reflect.Array;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzje implements zzjt {
    public static final zzje zza = new zzje();

    private zzje() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
        if (zzztVarArr.length != 3) {
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
        Object objZza3 = zzizVar.zzc().zza(zzztVarArr[2]);
        if (true != Objects.nonNull(objZza3)) {
            objZza3 = null;
        }
        if (objZza3 == null) {
            itg0.b(4, 5, null);
            return;
        }
        try {
            Array.set(objZza, iIntValue, objZza3);
        } catch (Exception e) {
            if (e instanceof ArrayIndexOutOfBoundsException) {
                itg0.b(4, 22, e);
            } else {
                itg0.b(4, 25, e);
            }
        }
    }
}
