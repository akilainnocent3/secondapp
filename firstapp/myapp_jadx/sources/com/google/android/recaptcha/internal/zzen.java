package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import defpackage.zi50;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzen extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzen(zzeq zzeqVar, RecaptchaAction recaptchaAction, long j, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzeqVar;
        this.zzc = recaptchaAction;
        this.zzd = j;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzen(this.zzb, this.zzc, this.zzd, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzen) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objZze;
        y5b y5bVar = y5b.a;
        int i = this.zza;
        uj50.b(obj);
        if (i != 0) {
            objZze = ((zi50) obj).a;
        } else {
            zzeq zzeqVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            objZze = zzeqVar.zze(recaptchaAction, j, this);
            if (objZze == y5bVar) {
                return y5bVar;
            }
        }
        uj50.b(objZze);
        return objZze;
    }
}
