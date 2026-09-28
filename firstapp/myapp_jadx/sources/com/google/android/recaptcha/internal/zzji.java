package com.google.android.recaptcha.internal;

import defpackage.itg0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzji implements zzjt {
    public static final zzji zza = new zzji();

    private zzji() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
        boolean z = true;
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
            try {
                if (objZza instanceof String) {
                    objZza = zzizVar.zzh().zza((String) objZza);
                }
                zzja zzjaVarZzc = zzizVar.zzc();
                try {
                    zziy.zza(objZza);
                } catch (zzdm e) {
                    if (e.zzb() == 8 || e.zzb() == 6) {
                        z = false;
                    } else if (e.zzb() != 47) {
                        throw e;
                    }
                }
                zzjaVarZzc.zze(i, Boolean.valueOf(z));
            } catch (zzdm e2) {
                throw e2;
            }
        } catch (Exception e3) {
            itg0.b(6, 8, e3);
        }
    }
}
