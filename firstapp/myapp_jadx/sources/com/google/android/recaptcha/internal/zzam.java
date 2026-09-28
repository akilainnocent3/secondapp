package com.google.android.recaptcha.internal;

import defpackage.txf0;
import defpackage.v1b;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zzam {
    public static /* synthetic */ Object zza(zzar zzarVar, String str, v1b v1bVar) {
        return new zzhg(new zzao(zzarVar, str, null));
    }

    public static /* synthetic */ Object zzc(zzar zzarVar, zzxp zzxpVar, v1b v1bVar) {
        return new zzhg(new zzaq(null));
    }

    public static /* synthetic */ Object zzd(zzar zzarVar, Exception exc, v1b v1bVar) {
        int i = true != (exc instanceof txf0) ? 2 : 27;
        int iZza = zzarVar.zza();
        zzys zzysVarZzf = zzyt.zzf();
        zzysVarZzf.zzf(iZza);
        zzysVarZzf.zzr(13);
        zzysVarZzf.zzq(i);
        return zzas.zza(zzarVar, (zzyt) zzysVarZzf.zzk());
    }
}
