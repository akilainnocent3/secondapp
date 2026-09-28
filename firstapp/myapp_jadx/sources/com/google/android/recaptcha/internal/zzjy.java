package com.google.android.recaptcha.internal;

import defpackage.ay0;
import defpackage.itg0;
import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjy implements zzjt {
    public static final zzjy zza = new zzjy();

    private zzjy() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
        int length = zzztVarArr.length;
        if (length < 2) {
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
        String strZza = zzizVar.zzh().zza(str);
        if (Intrinsics.g(strZza, "forName")) {
            itg0.b(6, 48, null);
            return;
        }
        Class[] clsArrZzf = zzizVar.zzc().zzf(ay0.S(zzztVarArr).subList(2, length));
        try {
            zzizVar.zzc().zze(i, cls.getMethod(strZza, (Class[]) Arrays.copyOf(clsArrZzf, clsArrZzf.length)));
        } catch (Exception e) {
            itg0.b(6, 13, e);
        }
    }
}
