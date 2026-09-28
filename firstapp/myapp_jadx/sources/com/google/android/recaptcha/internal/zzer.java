package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzer extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ zzye zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzfp zzfpVar, zzye zzyeVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzfpVar;
        this.zzc = zzyeVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzer(this.zzb, this.zzc, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzer) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws zzcg {
        y5b y5bVar = y5b.a;
        try {
            if (this.zza != 0) {
                uj50.b(obj);
            } else {
                uj50.b(obj);
                zzfp zzfpVar = this.zzb;
                zzif zzifVarZzj = zzfp.zzj(zzfpVar);
                zzcy zzcyVarZzg = zzfp.zzg(zzfpVar);
                zzye zzyeVar = this.zzc;
                this.zza = 1;
                obj = zzifVarZzj.zzb(zzcyVarZzg, zzyeVar, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            }
            return (zzyg) obj;
        } catch (Exception e) {
            throw zzfp.zzd(this.zzb, e);
        }
    }
}
