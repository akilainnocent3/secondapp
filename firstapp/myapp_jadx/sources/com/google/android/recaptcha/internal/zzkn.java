package com.google.android.recaptcha.internal;

import defpackage.itg0;

/* JADX INFO: loaded from: classes4.dex */
public final class zzkn implements zzjt {
    public static final zzkn zza = new zzkn();

    private zzkn() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
        if (zzztVarArr.length != 2) {
            itg0.b(4, 3, null);
            return;
        }
        Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (objZza instanceof int[])) {
            objZza = null;
        }
        int[] iArr = (int[]) objZza;
        if (iArr == null) {
            itg0.b(4, 5, null);
            return;
        }
        Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (true != (objZza2 instanceof String)) {
            objZza2 = null;
        }
        String str = (String) objZza2;
        if (str == null) {
            itg0.b(4, 5, null);
            return;
        }
        zzja zzjaVarZzc = zzizVar.zzc();
        StringBuilder sb = new StringBuilder();
        try {
            for (int i2 : iArr) {
                sb.append(str.charAt(i2));
            }
            zzjaVarZzc.zze(i, sb.toString());
        } catch (Exception e) {
            itg0.b(4, 22, e);
        }
    }
}
