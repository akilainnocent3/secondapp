package com.google.android.recaptcha.internal;

import defpackage.cm8;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
final class zzfy extends tje0 implements Function1 {
    int zza;
    final /* synthetic */ zzhk zzb;
    final /* synthetic */ zzgb zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ cm8 zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfy(zzhk zzhkVar, zzgb zzgbVar, long j, cm8 cm8Var, v1b v1bVar) {
        super(1, v1bVar);
        this.zzb = zzhkVar;
        this.zzc = zzgbVar;
        this.zzd = j;
        this.zze = cm8Var;
    }

    @Override // defpackage.pz1
    public final v1b create(v1b v1bVar) {
        return new zzfy(this.zzb, this.zzc, this.zzd, this.zze, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzfy) create((v1b) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.zza;
        uj50.b(obj);
        if (i != 0) {
            return obj;
        }
        zzhk zzhkVar = this.zzb;
        zzfx zzfxVar = new zzfx(this.zzc, this.zzd, this.zze, null);
        this.zza = 1;
        Object objZze = zzhj.zze(zzhkVar, 41, zzfxVar, this);
        return objZze == y5bVar ? y5bVar : objZze;
    }
}
