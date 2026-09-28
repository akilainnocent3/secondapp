package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import defpackage.cm8;
import defpackage.em8;
import defpackage.hwr;
import defpackage.ib5;
import defpackage.ttr;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgb implements zzdw {
    private final zzfp zza;
    private cm8 zzb = em8.a();
    private final ttr zzc;
    private zzcg zzd;
    private zzxn zze;
    private zzdv zzf;

    public zzgb(zzfp zzfpVar, zzct zzctVar) {
        this.zza = zzfpVar;
        int i = zzby.zza;
        this.zzc = hwr.b(zzfv.zza);
        this.zzf = zzdv.zza;
    }

    public static final /* synthetic */ zzcr zzd(zzgb zzgbVar) {
        return (zzcr) zzgbVar.zzc.getValue();
    }

    public static final /* synthetic */ boolean zzo(zzgb zzgbVar, Exception exc) {
        if (!(exc instanceof zzcg)) {
            return true;
        }
        zzcg zzcgVar = (zzcg) exc;
        return (Intrinsics.g(zzcgVar.zzb(), zzce.zzd) || Intrinsics.g(zzcgVar.zzb(), zzce.zze) || Intrinsics.g(zzcgVar.zzb(), zzce.zzf)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzp(Function1 function1, v1b v1bVar) {
        zzfr zzfrVar;
        zzcs zzcsVar;
        if (v1bVar instanceof zzfr) {
            zzfrVar = (zzfr) v1bVar;
            int i = zzfrVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzfrVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzfrVar = new zzfr(this, v1bVar);
            }
        } else {
            zzfrVar = new zzfr(this, v1bVar);
        }
        Object obj = zzfrVar.zza;
        y5b y5bVar = y5b.a;
        int i2 = zzfrVar.zzc;
        if (i2 == 0) {
            uj50.b(obj);
            zzcs zzcsVar2 = new zzcs();
            zzfrVar.zzd = zzcsVar2;
            zzfrVar.zzc = 1;
            if (function1.invoke(zzfrVar) == y5bVar) {
                return y5bVar;
            }
            zzcsVar = zzcsVar2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zzcsVar = zzfrVar.zzd;
            uj50.b(obj);
        }
        zzcsVar.zzc();
        return new Long(zzcsVar.zza(TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzq(long j, v1b v1bVar) {
        return new zzhg(new zzga(this, j, null));
    }

    @Override // com.google.android.recaptcha.internal.zzdw
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j, v1b v1bVar) {
        return new zzhg(new zzfq(this, j, str, recaptchaAction, null));
    }

    @Override // com.google.android.recaptcha.internal.zzdw
    public final Object zzb(long j, v1b v1bVar) {
        return zzq(j, v1bVar);
    }

    public final zzdv zze() {
        return this.zzf;
    }
}
