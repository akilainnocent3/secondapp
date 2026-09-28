package com.google.android.recaptcha.internal;

import defpackage.v1b;
import defpackage.x1b;
import defpackage.y5b;
import defpackage.zi50;

/* JADX INFO: loaded from: classes4.dex */
final class zzei extends x1b {
    /* synthetic */ Object zza;
    final /* synthetic */ zzeq zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzei(zzeq zzeqVar, v1b v1bVar) {
        super(v1bVar);
        this.zzb = zzeqVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo11execute0E7RQCE = this.zzb.mo11execute0E7RQCE(null, 0L, this);
        return objMo11execute0E7RQCE == y5b.a ? objMo11execute0E7RQCE : new zi50(objMo11execute0E7RQCE);
    }
}
