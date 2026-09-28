package com.google.android.recaptcha.internal;

import defpackage.itg0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjx implements zzjt {
    public static final zzjx zza = new zzjx();

    private zzjx() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
        if (zzztVarArr.length != 2) {
            itg0.b(4, 3, null);
            return;
        }
        Class<?> clsZza = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != Objects.nonNull(clsZza)) {
            clsZza = null;
        }
        if (clsZza == null) {
            itg0.b(4, 5, null);
            return;
        }
        Class<?> cls = clsZza instanceof Class ? clsZza : clsZza.getClass();
        Object objZza = zzizVar.zzc().zza(zzztVarArr[1]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            itg0.b(4, 5, null);
            return;
        }
        try {
            zzizVar.zzc().zze(i, cls.getField(zzizVar.zzh().zza(str)));
        } catch (Exception e) {
            itg0.b(6, 10, e);
        }
    }
}
