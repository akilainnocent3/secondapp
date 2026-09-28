package com.google.android.recaptcha.internal;

import defpackage.cm8;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzfz extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzgb zzb;
    final /* synthetic */ cm8 zzc;
    final /* synthetic */ zzhk zzd;
    final /* synthetic */ long zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfz(zzgb zzgbVar, cm8 cm8Var, zzhk zzhkVar, long j, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzgbVar;
        this.zzc = cm8Var;
        this.zzd = zzhkVar;
        this.zze = j;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzfz(this.zzb, this.zzc, this.zzd, this.zze, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfz) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Exception {
        zzcg zzcgVar;
        zzfz zzfzVar;
        zzcg e;
        y5b y5bVar = y5b.a;
        if (this.zza != 0) {
            try {
                uj50.b(obj);
                zzfzVar = this;
            } catch (zzcg e2) {
                zzcgVar = e2;
                zzfzVar = this;
                zzfzVar.zzb.zzf = zzdv.zzd;
                zzfzVar.zzc.F(zzcgVar);
            }
        } else {
            uj50.b(obj);
            try {
                zzcx zzcxVar = zzcx.zza;
                zzgb zzgbVar = this.zzb;
                zzfw zzfwVar = new zzfw(zzgbVar);
                zzfy zzfyVar = new zzfy(this.zzd, zzgbVar, this.zze, this.zzc, null);
                this.zza = 1;
                zzfzVar = this;
                try {
                    obj = zzcxVar.zzb(zzfwVar, 100L, 1000L, 2.0d, zzfyVar, zzfzVar);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                } catch (zzcg e3) {
                    e = e3;
                    zzcgVar = e;
                    zzfzVar.zzb.zzf = zzdv.zzd;
                    zzfzVar.zzc.F(zzcgVar);
                }
            } catch (zzcg e4) {
                e = e4;
                zzfzVar = this;
                zzcgVar = e;
                zzfzVar.zzb.zzf = zzdv.zzd;
                zzfzVar.zzc.F(zzcgVar);
            }
        }
        ((Boolean) obj).getClass();
        return Unit.a;
    }
}
