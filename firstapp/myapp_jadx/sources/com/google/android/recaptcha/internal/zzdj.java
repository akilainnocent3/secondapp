package com.google.android.recaptcha.internal;

import defpackage.ay0;
import defpackage.ib5;
import defpackage.quw;
import defpackage.uj50;
import defpackage.uuw;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdj {
    private Object zza;
    private final quw zzb = uuw.a();

    public zzdj(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zza(Object obj, v1b v1bVar) {
        zzdg zzdgVar;
        quw quwVar;
        if (v1bVar instanceof zzdg) {
            zzdgVar = (zzdg) v1bVar;
            int i = zzdgVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdgVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzdgVar = new zzdg(this, v1bVar);
            }
        } else {
            zzdgVar = new zzdg(this, v1bVar);
        }
        Object obj2 = zzdgVar.zzb;
        y5b y5bVar = y5b.a;
        int i2 = zzdgVar.zzd;
        if (i2 == 0) {
            uj50.b(obj2);
            quwVar = this.zzb;
            zzdgVar.zze = (zzmc) obj;
            zzdgVar.zza = quwVar;
            zzdgVar.zzd = 1;
            if (quwVar.d(zzdgVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            quw quwVar2 = (quw) zzdgVar.zza;
            zzmc zzmcVar = zzdgVar.zze;
            uj50.b(obj2);
            quwVar = quwVar2;
            obj = zzmcVar;
        }
        try {
            return Boolean.valueOf(Intrinsics.g(this.zza, obj));
        } finally {
            quwVar.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzb(Object[] objArr, v1b v1bVar) {
        zzdh zzdhVar;
        quw quwVar;
        if (v1bVar instanceof zzdh) {
            zzdhVar = (zzdh) v1bVar;
            int i = zzdhVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdhVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzdhVar = new zzdh(this, v1bVar);
            }
        } else {
            zzdhVar = new zzdh(this, v1bVar);
        }
        Object obj = zzdhVar.zzb;
        y5b y5bVar = y5b.a;
        int i2 = zzdhVar.zzd;
        if (i2 == 0) {
            uj50.b(obj);
            quwVar = this.zzb;
            zzdhVar.zze = (zzmc[]) objArr;
            zzdhVar.zza = quwVar;
            zzdhVar.zzd = 1;
            if (quwVar.d(zzdhVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            quw quwVar2 = (quw) zzdhVar.zza;
            zzmc[] zzmcVarArr = zzdhVar.zze;
            uj50.b(obj);
            quwVar = quwVar2;
            objArr = zzmcVarArr;
        }
        try {
            return Boolean.valueOf(ay0.s(this.zza, objArr));
        } finally {
            quwVar.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzc(Object obj, v1b v1bVar) {
        zzdi zzdiVar;
        quw quwVar;
        if (v1bVar instanceof zzdi) {
            zzdiVar = (zzdi) v1bVar;
            int i = zzdiVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdiVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzdiVar = new zzdi(this, v1bVar);
            }
        } else {
            zzdiVar = new zzdi(this, v1bVar);
        }
        Object obj2 = zzdiVar.zzb;
        y5b y5bVar = y5b.a;
        int i2 = zzdiVar.zzd;
        if (i2 == 0) {
            uj50.b(obj2);
            quwVar = this.zzb;
            zzdiVar.zze = (zzmc) obj;
            zzdiVar.zza = quwVar;
            zzdiVar.zzd = 1;
            if (quwVar.d(zzdiVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            quw quwVar2 = (quw) zzdiVar.zza;
            zzmc zzmcVar = zzdiVar.zze;
            uj50.b(obj2);
            quwVar = quwVar2;
            obj = zzmcVar;
        }
        try {
            this.zza = obj;
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            quwVar.f(null);
        }
    }
}
