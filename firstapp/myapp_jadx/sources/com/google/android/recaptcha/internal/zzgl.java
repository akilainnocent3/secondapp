package com.google.android.recaptcha.internal;

import defpackage.hwr;
import defpackage.mpe0;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgl {
    public static final /* synthetic */ int zza = 0;
    private static final String zzb = UUID.randomUUID().toString();

    public static final String zza() {
        return zzb;
    }

    public static final void zzb(zzwk zzwkVar, String str, zzwa zzwaVar) {
        int i = zzby.zza;
        mpe0 mpe0VarB = hwr.b(zzgi.zza);
        mpe0 mpe0VarB2 = hwr.b(zzgj.zza);
        if (zzwaVar != null) {
            zzwkVar.zzt(zzwaVar);
        }
        for (zzca zzcaVar : ((zzcc) hwr.b(zzgk.zza).getValue()).zza()) {
            zzwkVar.zzq(0);
        }
        if (zzwkVar.zzz()) {
            int i2 = zzco.zza;
            zzco.zza(zzwkVar.zze() + 20000, zzwkVar.zzf() * 1000);
        } else {
            int i3 = zzco.zza;
            int iZzD = zzwkVar.zzD();
            zzco.zza(zzwl.zza(iZzD) + 10000, zzwkVar.zzf() * 1000);
        }
        zzwkVar.zzv(((zzgh) mpe0VarB.getValue()).zza(str));
        zzzl zzzlVarZzi = zzzm.zzi();
        zzzlVarZzi.zze(zzwkVar);
        ((zzgs) mpe0VarB2.getValue()).zza((zzzm) zzzlVarZzi.zzk());
    }
}
