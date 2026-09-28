package com.google.android.recaptcha.internal;

import defpackage.v1b;
import defpackage.x1b;

/* JADX INFO: loaded from: classes4.dex */
final class zzcv extends x1b {
    Object zza;
    Object zzb;
    long zzc;
    long zzd;
    double zze;
    /* synthetic */ Object zzf;
    final /* synthetic */ zzcx zzg;
    int zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcv(zzcx zzcxVar, v1b v1bVar) {
        super(v1bVar);
        this.zzg = zzcxVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.zzf = obj;
        this.zzh |= Integer.MIN_VALUE;
        return this.zzg.zzb(null, 0L, 0L, 0.0d, null, this);
    }
}
