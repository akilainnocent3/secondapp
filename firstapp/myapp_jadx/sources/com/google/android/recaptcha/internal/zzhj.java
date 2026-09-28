package com.google.android.recaptcha.internal;

import defpackage.ib5;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhj {
    public static final Object zza(zzhh zzhhVar, Function2 function2, v1b v1bVar) {
        return function2.invoke(new zzhk(zzhhVar), v1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object zzb(zzhk zzhkVar, zzhf zzhfVar, v1b v1bVar) {
        zzhi zzhiVar;
        if (v1bVar instanceof zzhi) {
            zzhiVar = (zzhi) v1bVar;
            int i = zzhiVar.zzb;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzhiVar.zzb = i - Integer.MIN_VALUE;
            } else {
                zzhiVar = new zzhi(v1bVar);
            }
        } else {
            zzhiVar = new zzhi(v1bVar);
        }
        Object obj = zzhiVar.zza;
        Object obj2 = y5b.a;
        int i2 = zzhiVar.zzb;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                zzhiVar.zzb = 1;
                if (zzhfVar.zza(zzhkVar, zzhiVar) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        } catch (Exception unused) {
            return Unit.a;
        }
    }

    public static final Object zzc(zzgr zzgrVar, zzhg zzhgVar, v1b v1bVar) {
        Object objZza = zzhgVar.zza(zzgrVar.zza(), v1bVar);
        return objZza == y5b.a ? objZza : Unit.a;
    }

    public static final Object zzd(int i, int i2, Function2 function2, v1b v1bVar) {
        return new zzhf(i, function2, new Integer(i2));
    }

    public static final Object zze(zzhk zzhkVar, int i, Function2 function2, v1b v1bVar) {
        return new zzhf(i, function2, null).zza(zzhkVar, v1bVar);
    }
}
