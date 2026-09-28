package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.vxf0;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
final class zzft extends tje0 implements Function1 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzgb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzft(long j, zzgb zzgbVar, v1b v1bVar) {
        super(1, v1bVar);
        this.zzb = j;
        this.zzc = zzgbVar;
    }

    @Override // defpackage.pz1
    public final v1b create(v1b v1bVar) {
        return new zzft(this.zzb, this.zzc, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzft) create((v1b) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.zza;
        uj50.b(obj);
        if (i == 0) {
            long j = this.zzb;
            zzfs zzfsVar = new zzfs(this.zzc, null);
            this.zza = 1;
            if (vxf0.b(j, zzfsVar, this) == y5bVar) {
                return y5bVar;
            }
        }
        return Unit.a;
    }
}
