package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
final class zzeg extends tje0 implements Function2 {
    final /* synthetic */ zzeq zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeg(zzeq zzeqVar, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.zza = zzeqVar;
        this.zzb = str;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzeg(this.zza, this.zzb, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeg) create((zzgr) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws zzcg {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zzeq zzeqVar = this.zza;
        if (Intrinsics.g(zzeqVar.zzc(), this.zzb)) {
            return zzeqVar;
        }
        throw new zzcg(zzce.zzd, zzcd.zzam, null, null, 12, null);
    }
}
