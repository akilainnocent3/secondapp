package com.google.android.recaptcha.internal;

import defpackage.v1b;
import defpackage.x1b;

/* JADX INFO: loaded from: classes4.dex */
final class zzbc extends x1b {
    /* synthetic */ Object zza;
    final /* synthetic */ zzbo zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbc(zzbo zzboVar, v1b v1bVar) {
        super(v1bVar);
        this.zzb = zzboVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzl(this);
    }
}
