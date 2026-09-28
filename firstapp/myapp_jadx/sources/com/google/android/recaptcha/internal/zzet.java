package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.txf0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzet extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzet(zzfp zzfpVar, String str, long j, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzfpVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzet zzetVar = new zzet(this.zzb, this.zzc, this.zzd, v1bVar);
        zzetVar.zze = obj;
        return zzetVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzet) create((zzgr) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws zzcg {
        zzgr zzgrVar;
        y5b y5bVar = y5b.a;
        int i = this.zza;
        try {
            if (i != 0) {
                if (i != 1) {
                    uj50.b(obj);
                } else {
                    zzgrVar = (zzgr) this.zze;
                    uj50.b(obj);
                }
                return (zzxx) obj;
            }
            uj50.b(obj);
            zzgrVar = (zzgr) this.zze;
            zzq zzqVarZzb = zzfp.zzb(this.zzb);
            String str = this.zzc;
            long j = this.zzd;
            this.zze = zzgrVar;
            this.zza = 1;
            obj = zzqVarZzb.zzb(str, j, this);
            if (obj != y5bVar) {
            }
            return y5bVar;
            this.zze = null;
            this.zza = 2;
            obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            return (zzxx) obj;
        } catch (zzcg e) {
            throw e;
        } catch (txf0 e2) {
            throw new zzcg(zzce.zzb, zzcd.zzb, e2.getMessage(), null, 8, null);
        } catch (Exception e3) {
            throw new zzcg(zzce.zzb, zzcd.zzaa, e3.getMessage(), null, 8, null);
        }
    }
}
