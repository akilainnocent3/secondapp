package com.google.android.recaptcha.internal;

import defpackage.ib5;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhf {
    private final Function2 zza;
    private final Integer zzb;
    private final int zzc;

    public zzhf(int i, Function2 function2, Integer num) {
        this.zzc = i;
        this.zza = function2;
        this.zzb = num;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zza(zzhk zzhkVar, v1b v1bVar) throws zzcg {
        zzhe zzheVar;
        zzcg e;
        zzgr zzgrVar;
        if (v1bVar instanceof zzhe) {
            zzheVar = (zzhe) v1bVar;
            int i = zzheVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzheVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzheVar = new zzhe(this, v1bVar);
            }
        } else {
            zzheVar = new zzhe(this, v1bVar);
        }
        Object objInvoke = zzheVar.zza;
        y5b y5bVar = y5b.a;
        int i2 = zzheVar.zzc;
        if (i2 == 0) {
            uj50.b(objInvoke);
            zzgr zzgrVar2 = new zzgr(zzhkVar, this.zzc, this.zzb);
            try {
                Function2 function2 = this.zza;
                zzheVar.zzd = zzgrVar2;
                zzheVar.zzc = 1;
                objInvoke = function2.invoke(zzgrVar2, zzheVar);
                if (objInvoke == y5bVar) {
                    return y5bVar;
                }
                zzgrVar = zzgrVar2;
            } catch (zzcg e2) {
                e = e2;
                zzgrVar = zzgrVar2;
                zzgrVar.zzc(e);
                throw e;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zzgrVar = zzheVar.zzd;
            try {
                uj50.b(objInvoke);
            } catch (zzcg e3) {
                e = e3;
                zzgrVar.zzc(e);
                throw e;
            }
        }
        zzgrVar.zzb();
        return objInvoke;
    }
}
