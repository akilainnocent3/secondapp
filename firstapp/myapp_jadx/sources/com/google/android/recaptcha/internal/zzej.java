package com.google.android.recaptcha.internal;

import defpackage.v1b;
import defpackage.x1b;
import defpackage.y5b;
import defpackage.zi50;

/* JADX INFO: loaded from: classes4.dex */
final class zzej extends x1b {
    /* synthetic */ Object zza;
    final /* synthetic */ zzeq zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzej(zzeq zzeqVar, v1b v1bVar) {
        super(v1bVar);
        this.zzb = zzeqVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo12executegIAlus = this.zzb.mo12executegIAlus(null, this);
        return objMo12executegIAlus == y5b.a ? objMo12executegIAlus : new zi50(objMo12executegIAlus);
    }
}
