package com.google.android.recaptcha;

import defpackage.v1b;
import defpackage.x1b;
import defpackage.y5b;
import defpackage.zi50;

/* JADX INFO: loaded from: classes4.dex */
public final class Recaptcha$getClient$1 extends x1b {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, v1b v1bVar) {
        super(v1bVar);
        this.zzb = recaptcha;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM10getClientBWLJW6A = this.zzb.m10getClientBWLJW6A(null, null, 0L, this);
        return objM10getClientBWLJW6A == y5b.a ? objM10getClientBWLJW6A : new zi50(objM10getClientBWLJW6A);
    }
}
