package com.google.android.recaptcha.internal;

import defpackage.itg0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjv implements zzjt {
    public static final zzjv zza = new zzjv();

    private zzjv() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
        if (zzztVarArr.length != 1) {
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
        try {
            if (objZza instanceof String) {
                objZza = zzizVar.zzh().zza((String) objZza);
            }
            zzizVar.zzc().zze(i, zziy.zza(objZza));
        } catch (zzdm e) {
            throw e;
        } catch (Exception e2) {
            itg0.b(6, 8, e2);
        }
    }
}
