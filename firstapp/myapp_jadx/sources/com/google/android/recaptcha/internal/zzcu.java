package com.google.android.recaptcha.internal;

import defpackage.cq40;
import defpackage.v1b;
import defpackage.x1b;

/* JADX INFO: loaded from: classes4.dex */
final class zzcu extends x1b {
    long zza;
    double zzb;
    Object zzc;
    int zzd;
    int zze;
    /* synthetic */ Object zzf;
    final /* synthetic */ zzcx zzg;
    int zzh;
    cq40 zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcu(zzcx zzcxVar, v1b v1bVar) {
        super(v1bVar);
        this.zzg = zzcxVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.zzf = obj;
        this.zzh |= Integer.MIN_VALUE;
        return this.zzg.zza(0, 0L, 0L, 0.0d, null, this);
    }
}
