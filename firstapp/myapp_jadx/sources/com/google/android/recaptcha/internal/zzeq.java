package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import defpackage.ej5;
import defpackage.hwr;
import defpackage.ib5;
import defpackage.ttr;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import defpackage.zi50;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeq implements RecaptchaClient, RecaptchaTasksClient {
    private static final Regex zza = new Regex("^[a-zA-Z0-9/_]{1,100}$");
    private final zzdw zzb;
    private final String zzc;
    private final zzhh zzd;
    private final ttr zze;

    public zzeq(zzdw zzdwVar, String str, zzhh zzhhVar) {
        this.zzb = zzdwVar;
        this.zzc = str;
        this.zzd = zzhhVar;
        int i = zzby.zza;
        this.zze = hwr.b(zzep.zza);
    }

    public static final /* synthetic */ void zzd(zzeq zzeqVar, long j, RecaptchaAction recaptchaAction) throws zzcg {
        zzcg zzcgVar = !zza.f(recaptchaAction.getAction()) ? new zzcg(zzce.zzg, zzcd.zzh, null, null, 12, null) : null;
        if (j < 5000) {
            zzcgVar = new zzcg(zzce.zzb, zzcd.zzI, null, null, 12, null);
        }
        if (zzcgVar != null) {
            throw zzcgVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zze(RecaptchaAction recaptchaAction, long j, v1b v1bVar) {
        zzek zzekVar;
        if (v1bVar instanceof zzek) {
            zzekVar = (zzek) v1bVar;
            int i = zzekVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzekVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzekVar = new zzek(this, v1bVar);
            }
        } else {
            zzekVar = new zzek(this, v1bVar);
        }
        Object objInvoke = zzekVar.zza;
        y5b y5bVar = y5b.a;
        int i2 = zzekVar.zzc;
        if (i2 == 0) {
            uj50.b(objInvoke);
            zzhh zzhhVar = this.zzd;
            zzem zzemVar = new zzem(this, j, recaptchaAction, null);
            zzekVar.zzc = 1;
            objInvoke = zzemVar.invoke(zzhhVar, zzekVar);
            if (objInvoke == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objInvoke);
        }
        return ((zi50) objInvoke).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-0E7RQCE */
    public final Object mo11execute0E7RQCE(RecaptchaAction recaptchaAction, long j, v1b<? super zi50<String>> v1bVar) {
        zzei zzeiVar;
        if (v1bVar instanceof zzei) {
            zzeiVar = (zzei) v1bVar;
            int i = zzeiVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzeiVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzeiVar = new zzei(this, v1bVar);
            }
        } else {
            zzeiVar = new zzei(this, v1bVar);
        }
        Object obj = zzeiVar.zza;
        Object obj2 = y5b.a;
        int i2 = zzeiVar.zzc;
        if (i2 == 0) {
            uj50.b(obj);
            zzeiVar.zzc = 1;
            Object objZze = zze(recaptchaAction, j, zzeiVar);
            return objZze == obj2 ? obj2 : objZze;
        }
        if (i2 == 1) {
            uj50.b(obj);
            return ((zi50) obj).a;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-gIAlu-s */
    public final Object mo12executegIAlus(RecaptchaAction recaptchaAction, v1b<? super zi50<String>> v1bVar) {
        zzej zzejVar;
        if (v1bVar instanceof zzej) {
            zzejVar = (zzej) v1bVar;
            int i = zzejVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzejVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzejVar = new zzej(this, v1bVar);
            }
        } else {
            zzejVar = new zzej(this, v1bVar);
        }
        Object obj = zzejVar.zza;
        Object obj2 = y5b.a;
        int i2 = zzejVar.zzc;
        if (i2 == 0) {
            uj50.b(obj);
            zzejVar.zzc = 1;
            Object objMo11execute0E7RQCE = mo11execute0E7RQCE(recaptchaAction, 10000L, zzejVar);
            return objMo11execute0E7RQCE == obj2 ? obj2 : objMo11execute0E7RQCE;
        }
        if (i2 == 1) {
            uj50.b(obj);
            return ((zi50) obj).a;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzbv.zza(ej5.a(((zzcr) this.zze.getValue()).zzb(), null, new zzen(this, recaptchaAction, 10000L, null), 3));
    }

    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j) {
        return zzbv.zza(ej5.a(((zzcr) this.zze.getValue()).zzb(), null, new zzen(this, recaptchaAction, j, null), 3));
    }
}
