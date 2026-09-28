package com.google.android.recaptcha.internal;

import defpackage.ej5;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzlh extends tje0 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlh(zzly zzlyVar, zzxn zzxnVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzc = zzlyVar;
        this.zzd = zzxnVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzlh zzlhVar = new zzlh(this.zzc, this.zzd, v1bVar);
        zzlhVar.zze = obj;
        return zzlhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlh) create((zzhk) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzhk zzhkVar2;
        zzhk zzhkVar3;
        y5b y5bVar = y5b.a;
        int i = this.zzb;
        try {
            if (i != 0) {
                if (i != 1) {
                    zzhkVar3 = (zzhk) this.zze;
                    uj50.b(obj);
                } else {
                    zzhk zzhkVar4 = (zzhk) this.zza;
                    zzhk zzhkVar5 = (zzhk) this.zze;
                    uj50.b(obj);
                    zzhkVar2 = zzhkVar4;
                    zzhkVar = zzhkVar5;
                }
                zzly zzlyVar = this.zzc;
                ej5.c(zzlyVar.zzD().zzb(), null, null, new zzlg(zzlyVar, zzhkVar3, (String) obj, null), 3);
                return Unit.a;
            }
            uj50.b(obj);
            zzhkVar = (zzhk) this.zze;
            zzib zzibVarZzp = zzly.zzp(this.zzc);
            zzxn zzxnVar = this.zzd;
            this.zze = zzhkVar;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = zzibVarZzp.zzc(zzxnVar, this);
            if (obj != y5bVar) {
                zzhkVar2 = zzhkVar;
            }
            return y5bVar;
            this.zze = zzhkVar;
            this.zza = null;
            this.zzb = 2;
            obj = ((zzhg) obj).zza(zzhkVar2, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            zzhkVar3 = zzhkVar;
            zzly zzlyVar2 = this.zzc;
            ej5.c(zzlyVar2.zzD().zzb(), null, null, new zzlg(zzlyVar2, zzhkVar3, (String) obj, null), 3);
            return Unit.a;
        } catch (zzcg e) {
            this.zzc.zzz().F(e);
        }
    }
}
