package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzj extends tje0 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzg zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ long zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzj(zzgr zzgrVar, zzg zzgVar, String str, long j, v1b v1bVar) {
        super(2, v1bVar);
        this.zzc = zzgrVar;
        this.zzd = zzgVar;
        this.zze = str;
        this.zzf = j;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzj(this.zzc, this.zzd, this.zze, this.zzf, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzj) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        y5b y5bVar = y5b.a;
        int i = this.zzb;
        if (i == 0) {
            uj50.b(obj);
            zzgrVar = this.zzc;
            zzg zzgVar = this.zzd;
            String str = this.zze;
            long j = this.zzf;
            this.zza = zzgrVar;
            this.zzb = 1;
            obj = new zzhg(new zzb(zzgVar, str, j, null));
            if (obj != y5bVar) {
            }
        }
        if (i != 1) {
            uj50.b(obj);
            return obj;
        }
        zzgrVar = (zzgr) this.zza;
        uj50.b(obj);
        this.zza = null;
        this.zzb = 2;
        Object objZza = ((zzhg) obj).zza(zzgrVar.zza(), this);
        return objZza == y5bVar ? y5bVar : objZza;
    }
}
