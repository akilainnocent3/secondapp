package com.google.android.recaptcha.internal;

import defpackage.v1b;
import defpackage.x1b;
import defpackage.y5b;
import defpackage.zi50;

/* JADX INFO: loaded from: classes4.dex */
final class zzek extends x1b {
    /* synthetic */ Object zza;
    final /* synthetic */ zzeq zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzek(zzeq zzeqVar, v1b v1bVar) {
        super(v1bVar);
        this.zzb = zzeqVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZze = this.zzb.zze(null, 0L, this);
        return objZze == y5b.a ? objZze : new zi50(objZze);
    }
}
