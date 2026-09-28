package com.google.android.recaptcha.internal;

import android.app.Application;
import defpackage.hwr;
import defpackage.ib5;
import defpackage.o0b;
import defpackage.quw;
import defpackage.ttr;
import defpackage.uj50;
import defpackage.uuw;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeh {
    private final Application zza;
    private final quw zzb = uuw.a();
    private zzeq zzc;
    private final ttr zzd;

    public zzeh(Application application) {
        this.zza = application;
        int i = zzby.zza;
        this.zzd = hwr.b(zzef.zza);
        zzdp.zza(application);
    }

    public static /* synthetic */ Object zzd(zzeh zzehVar, String str, long j, zzdw zzdwVar, zzdq zzdqVar, v1b v1bVar, int i, Object obj) {
        if ((i & 8) != 0) {
            zzdqVar = zzdq.zza;
        }
        zzdq zzdqVar2 = zzdqVar;
        if ((i & 2) != 0) {
            j = 10000;
        }
        return zzehVar.zzc(str, j, null, zzdqVar2, v1bVar);
    }

    public static final /* synthetic */ void zzf(zzeh zzehVar, long j) throws zzcg {
        if (j < 5000) {
            throw new zzcg(zzce.zzj, zzcd.zzI, null, null, 12, null);
        }
        if (o0b.a(zzehVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzcg(zzce.zzc, zzcd.zzao, null, null, 12, null);
        }
    }

    public final zzcr zza() {
        return (zzcr) this.zzd.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object zzc(String str, long j, zzdw zzdwVar, zzdq zzdqVar, v1b v1bVar) throws Throwable {
        zzea zzeaVar;
        String str2;
        zzdq zzdqVar2;
        long j2;
        quw quwVar;
        quw quwVar2;
        int i;
        int i2;
        if (v1bVar instanceof zzea) {
            zzeaVar = (zzea) v1bVar;
            int i3 = zzeaVar.zzg;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zzeaVar.zzg = i3 - Integer.MIN_VALUE;
            } else {
                zzeaVar = new zzea(this, v1bVar);
            }
        } else {
            zzeaVar = new zzea(this, v1bVar);
        }
        zzea zzeaVar2 = zzeaVar;
        Object objInvoke = zzeaVar2.zze;
        y5b y5bVar = y5b.a;
        int i4 = zzeaVar2.zzg;
        try {
            if (i4 == 0) {
                uj50.b(objInvoke);
                quw quwVar3 = this.zzb;
                str2 = str;
                zzeaVar2.zza = str2;
                zzeaVar2.zzb = null;
                zzdqVar2 = zzdqVar;
                zzeaVar2.zzh = zzdqVar2;
                zzeaVar2.zzc = quwVar3;
                j2 = j;
                zzeaVar2.zzd = j2;
                zzeaVar2.zzg = 1;
                if (quwVar3.d(zzeaVar2) != y5bVar) {
                    quwVar = quwVar3;
                }
                return y5bVar;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                quwVar2 = (quw) zzeaVar2.zza;
                try {
                    uj50.b(objInvoke);
                    zzeq zzeqVar = (zzeq) objInvoke;
                    quwVar2.f(null);
                    return zzeqVar;
                } catch (Throwable th) {
                    th = th;
                    quwVar2.f(null);
                    throw th;
                }
            }
            long j3 = zzeaVar2.zzd;
            quw quwVar4 = (quw) zzeaVar2.zzc;
            zzdq zzdqVar3 = zzeaVar2.zzh;
            String str3 = (String) zzeaVar2.zza;
            uj50.b(objInvoke);
            quwVar = quwVar4;
            zzdqVar2 = zzdqVar3;
            str2 = str3;
            j2 = j3;
            if (!Intrinsics.g(zzdqVar2, zzdq.zza)) {
                if (Intrinsics.g(zzdqVar2, zzdq.zzb)) {
                    i2 = 4;
                } else {
                    i = 2;
                }
                zzed zzedVar = new zzed(this, str2, null, zzdqVar2, j2, null);
                zzeaVar2.zza = quwVar;
                zzeaVar2.zzb = null;
                zzeaVar2.zzh = null;
                zzeaVar2.zzc = null;
                zzeaVar2.zzg = 2;
                objInvoke = zzedVar.invoke(new zzhh(str2, i), zzeaVar2);
                if (objInvoke != y5bVar) {
                    quwVar2 = quwVar;
                    zzeq zzeqVar2 = (zzeq) objInvoke;
                    quwVar2.f(null);
                    return zzeqVar2;
                }
                return y5bVar;
            }
            i2 = 3;
            i = i2;
            zzed zzedVar2 = new zzed(this, str2, null, zzdqVar2, j2, null);
            zzeaVar2.zza = quwVar;
            zzeaVar2.zzb = null;
            zzeaVar2.zzh = null;
            zzeaVar2.zzc = null;
            zzeaVar2.zzg = 2;
            objInvoke = zzedVar2.invoke(new zzhh(str2, i), zzeaVar2);
            if (objInvoke != y5bVar) {
                quwVar2 = quwVar;
                zzeq zzeqVar3 = (zzeq) objInvoke;
                quwVar2.f(null);
                return zzeqVar3;
            }
            return y5bVar;
        } catch (Throwable th2) {
            th = th2;
            quwVar2 = quwVar;
            quwVar2.f(null);
            throw th;
        }
    }
}
