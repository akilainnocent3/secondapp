package com.google.android.recaptcha.internal;

import defpackage.v1b;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzg {
    private boolean zza;

    public abstract Object zza(String str, v1b v1bVar);

    public abstract Object zzb(String str, v1b v1bVar);

    public Object zzc(zzcg zzcgVar, v1b v1bVar) {
        return Unit.a;
    }

    public abstract Object zzd(zzxn zzxnVar, v1b v1bVar);

    public Object zze(String str, long j, Exception exc, v1b v1bVar) {
        return Unit.a;
    }

    public Object zzf(Exception exc, v1b v1bVar) {
        return zzh.zza(exc, new zzcg(zzce.zzb, zzcd.zzap, exc.getMessage(), null, 8, null));
    }

    public void zzh(zzyg zzygVar) {
    }

    public final boolean zzi() {
        return this.zza;
    }

    public abstract int zzj();

    public abstract int zzk();
}
