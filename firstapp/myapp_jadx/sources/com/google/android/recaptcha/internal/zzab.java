package com.google.android.recaptcha.internal;

import defpackage.jpu;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzab extends tje0 implements Function2 {
    final /* synthetic */ zzxp zza;
    final /* synthetic */ zzad zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzab(zzxp zzxpVar, zzad zzadVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zza = zzxpVar;
        this.zzb = zzadVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzab(this.zza, this.zzb, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzab) create((zzhk) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws zzcg {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zzxp zzxpVar = this.zza;
        int length = zzxpVar.zzl().length();
        zzad zzadVar = this.zzb;
        if (length != 0) {
            zzad.zzb(zzadVar).zzb(jpu.b(new Pair("_GRECAPTCHA_KC", zzxpVar.zzl())));
            return Unit.a;
        }
        zzadVar.zzj(false);
        throw new zzcg(zzce.zzb, zzcd.zzab, null, null, 12, null);
    }
}
