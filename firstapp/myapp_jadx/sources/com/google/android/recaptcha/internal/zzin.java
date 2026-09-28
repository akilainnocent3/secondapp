package com.google.android.recaptcha.internal;

import defpackage.jq40;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.w5b;
import defpackage.y5b;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzin extends tje0 implements Function2 {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zziz zzb;
    final /* synthetic */ zzip zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzin(Exception exc, zziz zzizVar, zzip zzipVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zza = exc;
        this.zzb = zzizVar;
        this.zzc = zzipVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzin zzinVar = new zzin(this.zza, this.zzb, this.zzc, v1bVar);
        zzinVar.zzd = obj;
        return zzinVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzin) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        zzys zzysVarZza;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        v5b v5bVar = (v5b) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzdm) {
            zzysVarZza = ((zzdm) exc).zza();
            zzysVarZza.zze(this.zzb.zza());
        } else {
            zziz zzizVar = this.zzb;
            zzys zzysVarZzf = zzyt.zzf();
            zzysVarZzf.zze(zzizVar.zza());
            zzysVarZzf.zzr(2);
            zzysVarZzf.zzq(2);
            zzysVarZza = zzysVarZzf;
        }
        zzyt zzytVar = (zzyt) zzysVarZza.zzk();
        zzytVar.zzl();
        zzytVar.zzk();
        jq40.a(exc.getClass()).k();
        exc.getMessage();
        zziz zzizVar2 = this.zzb;
        zzcs zzcsVarZzb = zzizVar2.zzb();
        zzcs zzcsVar = zzizVar2.zza;
        if (zzcsVar == null) {
            zzcsVar = null;
        }
        zzww zzwwVarZza = zzhd.zza(zzcsVarZzb, zzcsVar);
        String strZzd = zzizVar2.zzd();
        if (strZzd.length() == 0) {
            strZzd = "recaptcha.m.Main.rge";
        }
        if (w5b.e(v5bVar)) {
            zzip zzipVar = this.zzc;
            zzpp zzppVarZzh = zzpp.zzh();
            byte[] bArrZzd = zzytVar.zzd();
            String strZzi = zzppVarZzh.zzi(bArrZzd, 0, bArrZzd.length);
            zzpp zzppVarZzh2 = zzpp.zzh();
            byte[] bArrZzd2 = zzwwVarZza.zzd();
            zzipVar.zzb.zzd().zzb(strZzd, (String[]) Arrays.copyOf(new String[]{strZzi, zzppVarZzh2.zzi(bArrZzd2, 0, bArrZzd2.length)}, 2));
        }
        return Unit.a;
    }
}
