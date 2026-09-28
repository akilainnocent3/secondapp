package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import defpackage.zi50;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzel extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzel(zzeq zzeqVar, long j, RecaptchaAction recaptchaAction, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzeqVar;
        this.zzc = j;
        this.zzd = recaptchaAction;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzel zzelVar = new zzel(this.zzb, this.zzc, this.zzd, v1bVar);
        zzelVar.zze = obj;
        return zzelVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzel) create((zzhk) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        y5b y5bVar = y5b.a;
        int i = this.zza;
        try {
            if (i != 0) {
                if (i != 1) {
                    uj50.b(obj);
                } else {
                    zzhkVar = (zzhk) this.zze;
                    uj50.b(obj);
                }
                zi50.a aVar = zi50.b;
                return new zi50(obj);
            }
            uj50.b(obj);
            zzhkVar = (zzhk) this.zze;
            zi50.a aVar2 = zi50.b;
            zzeq zzeqVar = this.zzb;
            long j = this.zzc;
            RecaptchaAction recaptchaAction = this.zzd;
            this.zze = zzhkVar;
            this.zza = 1;
            obj = new zzhf(9, new zzeo(zzeqVar, j, recaptchaAction, null), null);
            if (obj != y5bVar) {
            }
            return y5bVar;
            this.zze = null;
            this.zza = 2;
            obj = ((zzhf) obj).zza(zzhkVar, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            zi50.a aVar3 = zi50.b;
        } catch (zzcg e) {
            zi50.a aVar4 = zi50.b;
            obj = uj50.a(e.zzc());
        }
        return new zi50(obj);
    }
}
