package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.txf0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.vxf0;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
final class zzfo extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzfp zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfo(long j, zzfp zzfpVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = j;
        this.zzc = zzfpVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzfo zzfoVar = new zzfo(this.zzb, this.zzc, v1bVar);
        zzfoVar.zzd = obj;
        return zzfoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfo) create((zzgr) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws zzcg {
        y5b y5bVar = y5b.a;
        try {
            if (this.zza != 0) {
                uj50.b(obj);
            } else {
                uj50.b(obj);
                zzgr zzgrVar = (zzgr) this.zzd;
                long j = this.zzb;
                zzfn zzfnVar = new zzfn(zzgrVar, this.zzc, null);
                this.zza = 1;
                obj = vxf0.b(j, zzfnVar, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            }
            return (zzxn) obj;
        } catch (zzcg e) {
            if (Intrinsics.g(e.zzb(), zzce.zzc)) {
                throw this.zzc.zzt(e, e);
            }
            throw e;
        } catch (txf0 e2) {
            throw this.zzc.zzt(e2, new zzcg(zzce.zzc, zzcd.zzb, e2.getMessage(), null, 8, null));
        } catch (Exception e3) {
            throw this.zzc.zzt(e3, new zzcg(zzce.zzc, zzcd.zzaz, e3.getMessage(), null, 8, null));
        }
    }
}
