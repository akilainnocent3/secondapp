package com.google.android.recaptcha.internal;

import defpackage.v1b;
import defpackage.x1b;

/* JADX INFO: loaded from: classes4.dex */
final class zzhe extends x1b {
    /* synthetic */ Object zza;
    final /* synthetic */ zzhf zzb;
    int zzc;
    zzgr zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhe(zzhf zzhfVar, v1b v1bVar) {
        super(v1bVar);
        this.zzb = zzhfVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zza(null, this);
    }
}
