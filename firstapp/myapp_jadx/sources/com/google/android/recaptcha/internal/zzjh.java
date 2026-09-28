package com.google.android.recaptcha.internal;

import defpackage.itg0;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjh implements zzjt {
    public static final zzjh zza = new zzjh();

    private zzjh() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
        if (zzztVarArr.length != 2) {
            itg0.b(4, 3, null);
            return;
        }
        Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            itg0.b(4, 5, null);
            return;
        }
        Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (objZza2 == null) {
            throw new zzdm(4, 4, null);
        }
        if (!(objZza2 instanceof Integer) && !(objZza2 instanceof Short) && !(objZza2 instanceof Byte) && !(objZza2 instanceof Long) && !(objZza2 instanceof Double) && !(objZza2 instanceof Float) && !(objZza2 instanceof Boolean) && !(objZza2 instanceof Character) && !(objZza2 instanceof String)) {
            itg0.b(4, 7, null);
        } else {
            zzizVar.zzi().zzb(str, objZza2.toString());
        }
    }
}
