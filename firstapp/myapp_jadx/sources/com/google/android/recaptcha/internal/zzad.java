package com.google.android.recaptcha.internal;

import defpackage.hwr;
import defpackage.ttr;
import defpackage.v1b;

/* JADX INFO: loaded from: classes4.dex */
public final class zzad implements zzar {
    private final ttr zza;
    private boolean zzb;

    public zzad() {
        int i = zzby.zza;
        this.zza = hwr.b(zzac.zza);
        this.zzb = true;
    }

    public static final /* synthetic */ zzci zzb(zzad zzadVar) {
        return (zzci) zzadVar.zza.getValue();
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final int zza() {
        return 25;
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
        return new zzhg(new zzaa(this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzf(zzxp zzxpVar, v1b v1bVar) {
        return new zzhg(new zzab(zzxpVar, this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzg(Exception exc, v1b v1bVar) {
        return zzam.zzd(this, exc, v1bVar);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final void zzh(zzyg zzygVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final boolean zzi() {
        return this.zzb;
    }

    public final void zzj(boolean z) {
        this.zzb = false;
    }
}
