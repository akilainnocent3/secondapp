package com.google.android.recaptcha.internal;

import defpackage.dq40;
import defpackage.j6w;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzew extends tje0 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfp zzd;
    final /* synthetic */ zzgr zze;
    final /* synthetic */ zzye zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzew(long j, zzfp zzfpVar, zzgr zzgrVar, zzye zzyeVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzc = j;
        this.zzd = zzfpVar;
        this.zze = zzgrVar;
        this.zzf = zzyeVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzew(this.zzc, this.zzd, this.zze, this.zzf, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzew) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws zzcg {
        dq40 dq40Var;
        dq40 dq40Var2;
        Object objZzc;
        zzcg zzcgVar;
        y5b y5bVar = y5b.a;
        if (this.zzb != 0) {
            dq40Var2 = (dq40) this.zza;
            try {
                uj50.b(obj);
                objZzc = obj;
            } catch (Exception e) {
                e = e;
                zzcgVar = (zzcg) dq40Var2.a;
                if (zzcgVar == null) {
                    throw zzfp.zzd(this.zzd, e);
                }
                throw zzcgVar;
            }
        } else {
            dq40 dq40VarA = j6w.a(obj);
            try {
                long j = this.zzc;
                zzev zzevVar = new zzev(this.zze, this.zzd, this.zzf, dq40VarA, null);
                dq40Var = dq40VarA;
                try {
                    this.zza = dq40Var;
                    this.zzb = 1;
                    objZzc = zzcx.zzc(j, 20, 100L, 1000L, 2.0d, zzevVar, this);
                    if (objZzc == y5bVar) {
                        return y5bVar;
                    }
                    dq40Var2 = dq40Var;
                } catch (Exception e2) {
                    e = e2;
                    dq40Var2 = dq40Var;
                    zzcgVar = (zzcg) dq40Var2.a;
                    if (zzcgVar == null) {
                        throw zzfp.zzd(this.zzd, e);
                    }
                    throw zzcgVar;
                }
            } catch (Exception e3) {
                e = e3;
                dq40Var = dq40VarA;
            }
        }
        return (zzyg) objZzc;
    }
}
