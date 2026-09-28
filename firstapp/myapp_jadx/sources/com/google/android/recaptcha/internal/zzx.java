package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import android.os.Build;
import defpackage.hwr;
import defpackage.ttr;
import defpackage.v1b;

/* JADX INFO: loaded from: classes4.dex */
public final class zzx implements zzar {
    private final ttr zza;

    public zzx() {
        int i = zzby.zza;
        this.zza = hwr.b(zzw.zza);
    }

    public static final /* synthetic */ ContentResolver zzb(zzx zzxVar) {
        return (ContentResolver) zzxVar.zza.getValue();
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzc(String str, v1b v1bVar) {
        return zzam.zza(this, str, v1bVar);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzd(zzxp zzxpVar, v1b v1bVar) {
        return zzhj.zzd(36, zza(), new zzap(this, zzxpVar, null), v1bVar);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zze(String str, v1b v1bVar) {
        return new zzhg(new zzv(this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzf(zzxp zzxpVar, v1b v1bVar) {
        return zzam.zzc(this, zzxpVar, v1bVar);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzg(Exception exc, v1b v1bVar) {
        int i = Build.VERSION.SDK_INT;
        zzys zzysVarZzf = zzyt.zzf();
        zzysVarZzf.zzr(16);
        zzysVarZzf.zzq(i > 34 ? 59 : 58);
        return zzas.zza(this, (zzyt) zzysVarZzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ void zzh(zzyg zzygVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final boolean zzi() {
        return true;
    }
}
