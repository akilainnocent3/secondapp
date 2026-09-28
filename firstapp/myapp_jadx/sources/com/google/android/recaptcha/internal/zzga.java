package com.google.android.recaptcha.internal;

import defpackage.dm8;
import defpackage.ej5;
import defpackage.em8;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
final class zzga extends tje0 implements Function2 {
    final /* synthetic */ zzgb zza;
    final /* synthetic */ long zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzga(zzgb zzgbVar, long j, v1b v1bVar) {
        super(2, v1bVar);
        this.zza = zzgbVar;
        this.zzb = j;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzga zzgaVar = new zzga(this.zza, this.zzb, v1bVar);
        zzgaVar.zzc = obj;
        return zzgaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzga) create((zzhk) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zzhk zzhkVar = (zzhk) this.zzc;
        zzgb zzgbVar = this.zza;
        if (Intrinsics.g(zzgbVar.zze(), zzdv.zzb) || Intrinsics.g(zzgbVar.zze(), zzdv.zzc)) {
            return Unit.a;
        }
        if (Intrinsics.g(zzgbVar.zze(), zzdv.zzd) && !zzgb.zzo(zzgbVar, zzgbVar.zzd)) {
            return Unit.a;
        }
        zzgbVar.zzf = zzdv.zzc;
        dm8 dm8VarA = em8.a();
        zzgbVar.zzb = dm8VarA;
        ej5.c(zzgb.zzd(zzgbVar).zza(), null, null, new zzfz(zzgbVar, dm8VarA, zzhkVar, this.zzb, null), 3);
        return Unit.a;
    }
}
