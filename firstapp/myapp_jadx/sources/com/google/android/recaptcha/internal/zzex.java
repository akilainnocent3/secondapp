package com.google.android.recaptcha.internal;

import defpackage.ej5;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzex extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzye zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzex(zzfp zzfpVar, long j, zzye zzyeVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzfpVar;
        this.zzc = j;
        this.zzd = zzyeVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzex zzexVar = new zzex(this.zzb, this.zzc, this.zzd, v1bVar);
        zzexVar.zze = obj;
        return zzexVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzex) create((zzgr) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.zza;
        uj50.b(obj);
        if (i != 0) {
            return obj;
        }
        zzgr zzgrVar = (zzgr) this.zze;
        zzfp zzfpVar = this.zzb;
        CoroutineContext coroutineContext = zzfp.zzf(zzfpVar).zza().getCoroutineContext();
        zzew zzewVar = new zzew(this.zzc, zzfpVar, zzgrVar, this.zzd, null);
        this.zza = 1;
        Object objD = ej5.d(coroutineContext, zzewVar, this);
        return objD == y5bVar ? y5bVar : objD;
    }
}
