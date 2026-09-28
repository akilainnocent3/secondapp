package com.google.android.recaptcha.internal;

import defpackage.hwr;
import defpackage.ib5;
import defpackage.ttr;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.w5b;
import defpackage.y5b;

/* JADX INFO: loaded from: classes4.dex */
public final class zzif {
    private final ttr zza;

    public zzif() {
        int i = zzby.zza;
        this.zza = hwr.b(zzie.zza);
    }

    public static final /* synthetic */ zzhm zza(zzif zzifVar) {
        return (zzhm) zzifVar.zza.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object zzc(zzif zzifVar, zzcy zzcyVar, zzye zzyeVar, v1b v1bVar) {
        zzic zzicVar;
        if (v1bVar instanceof zzic) {
            zzicVar = (zzic) v1bVar;
            int i = zzicVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzicVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzicVar = new zzic(zzifVar, v1bVar);
            }
        } else {
            zzicVar = new zzic(zzifVar, v1bVar);
        }
        Object obj = zzicVar.zza;
        y5b y5bVar = y5b.a;
        int i2 = zzicVar.zzc;
        if (i2 != 0) {
            if (i2 == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        zzid zzidVar = new zzid(zzifVar, zzcyVar, zzyeVar, null);
        zzicVar.zzc = 1;
        Object objD = w5b.d(zzidVar, zzicVar);
        return objD == y5bVar ? y5bVar : objD;
    }

    public final Object zzb(zzcy zzcyVar, zzye zzyeVar, v1b v1bVar) {
        return zzc(this, zzcyVar, zzyeVar, v1bVar);
    }
}
