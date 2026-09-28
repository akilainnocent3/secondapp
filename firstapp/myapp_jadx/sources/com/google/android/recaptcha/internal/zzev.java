package com.google.android.recaptcha.internal;

import defpackage.dq40;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
final class zzev extends tje0 implements Function1 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzfp zzd;
    final /* synthetic */ zzye zze;
    final /* synthetic */ dq40 zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzev(zzgr zzgrVar, zzfp zzfpVar, zzye zzyeVar, dq40 dq40Var, v1b v1bVar) {
        super(1, v1bVar);
        this.zzc = zzgrVar;
        this.zzd = zzfpVar;
        this.zze = zzyeVar;
        this.zzf = dq40Var;
    }

    @Override // defpackage.pz1
    public final v1b create(v1b v1bVar) {
        return new zzev(this.zzc, this.zzd, this.zze, this.zzf, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzev) create((v1b) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [T, com.google.android.recaptcha.internal.zzcg, java.lang.Throwable] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        y5b y5bVar = y5b.a;
        int i = this.zzb;
        try {
            if (i != 0) {
                if (i != 1) {
                    uj50.b(obj);
                } else {
                    zzgrVar = (zzgr) this.zza;
                    uj50.b(obj);
                }
                return (zzyg) obj;
            }
            uj50.b(obj);
            zzgrVar = this.zzc;
            zzfp zzfpVar = this.zzd;
            zzye zzyeVar = this.zze;
            this.zza = zzgrVar;
            this.zzb = 1;
            obj = new zzhf(48, new zzes(zzfpVar, zzyeVar, null), null);
            if (obj != y5bVar) {
            }
            return y5bVar;
            this.zza = null;
            this.zzb = 2;
            obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            return (zzyg) obj;
        } catch (zzcg e) {
            this.zzf.a = e;
            throw e;
        }
    }
}
