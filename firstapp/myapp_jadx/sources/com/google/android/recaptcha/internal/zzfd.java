package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.txf0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.vxf0;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzfd extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzfp zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfd(long j, zzfp zzfpVar, zzxn zzxnVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = j;
        this.zzc = zzfpVar;
        this.zzd = zzxnVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzfd zzfdVar = new zzfd(this.zzb, this.zzc, this.zzd, v1bVar);
        zzfdVar.zze = obj;
        return zzfdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfd) create((zzhk) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws zzcg {
        y5b y5bVar = y5b.a;
        try {
            if (this.zza != 0) {
                uj50.b(obj);
            } else {
                uj50.b(obj);
                zzhk zzhkVar = (zzhk) this.zze;
                long j = this.zzb;
                zzfc zzfcVar = new zzfc(zzhkVar, this.zzc, this.zzd, j, null);
                this.zza = 1;
                if (vxf0.b(j, zzfcVar, this) == y5bVar) {
                    return y5bVar;
                }
            }
            return Unit.a;
        } catch (zzcg e) {
            throw e;
        } catch (txf0 e2) {
            throw new zzcg(zzce.zzb, zzcd.zzb, e2.getMessage(), null, 8, null);
        } catch (Exception e3) {
            throw new zzcg(zzce.zzb, zzcd.zzap, e3.getMessage(), null, 8, null);
        }
    }
}
