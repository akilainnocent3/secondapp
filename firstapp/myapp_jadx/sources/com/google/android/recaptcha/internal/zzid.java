package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzid extends tje0 implements Function2 {
    final /* synthetic */ zzif zza;
    final /* synthetic */ zzcy zzb;
    final /* synthetic */ zzye zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzid(zzif zzifVar, zzcy zzcyVar, zzye zzyeVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zza = zzifVar;
        this.zzb = zzcyVar;
        this.zzc = zzyeVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzid(this.zza, this.zzb, this.zzc, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzid) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zzhl zzhlVarZza = null;
        try {
            try {
                zzhlVarZza = zzif.zza(this.zza).zza(this.zzb.zzd());
                zzhlVarZza.zzc();
                zzhlVarZza.zze(this.zzc.zzd());
                zzyg zzygVar = (zzyg) zzhlVarZza.zza(zzyg.zzi());
                zzhlVarZza.zzd();
                return zzygVar;
            } catch (zzcg e) {
                throw e;
            } catch (Exception e2) {
                throw new zzcg(zzce.zzc, zzcd.zzF, e2.getMessage(), null, 8, null);
            }
        } catch (Throwable th) {
            if (zzhlVarZza == null) {
                throw th;
            }
            zzhlVarZza.zzd();
            throw th;
        }
    }
}
