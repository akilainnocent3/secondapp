package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzcw extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ Function1 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(int i, long j, long j2, double d, Function1 function1, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = function1;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzcw(20, 100L, 1000L, 2.0d, this.zzb, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcw) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.zza;
        uj50.b(obj);
        if (i != 0) {
            return obj;
        }
        Function1 function1 = this.zzb;
        zzcx zzcxVar = zzcx.zza;
        this.zza = 1;
        Object objZza = zzcxVar.zza(20, 100L, 1000L, 2.0d, function1, this);
        return objZza == y5bVar ? y5bVar : objZza;
    }
}
