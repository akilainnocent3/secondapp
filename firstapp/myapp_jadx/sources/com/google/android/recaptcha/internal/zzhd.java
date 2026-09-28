package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhd {
    public static final zzww zza(zzcs zzcsVar, zzcs zzcsVar2) {
        zzwu zzwuVarZzf = zzww.zzf();
        zzwuVarZzf.zzq(zzvl.zzb(zzcsVar.zzb()));
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        zzwuVarZzf.zzr(zzvj.zza(zzcsVar.zza(timeUnit)));
        zzwuVarZzf.zze(zzvl.zzb(zzcsVar2.zzb()));
        zzwuVarZzf.zzf(zzvj.zza(zzcsVar2.zza(timeUnit)));
        return (zzww) zzwuVarZzf.zzk();
    }
}
