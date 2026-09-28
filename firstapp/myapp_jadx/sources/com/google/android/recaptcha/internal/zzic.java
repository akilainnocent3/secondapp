package com.google.android.recaptcha.internal;

import defpackage.v1b;
import defpackage.x1b;

/* JADX INFO: loaded from: classes4.dex */
final class zzic extends x1b {
    /* synthetic */ Object zza;
    final /* synthetic */ zzif zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzic(zzif zzifVar, v1b v1bVar) {
        super(v1bVar);
        this.zzb = zzifVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return zzif.zzc(this.zzb, null, null, this);
    }
}
