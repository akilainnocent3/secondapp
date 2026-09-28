package com.sportybet.android.globalpay.stp.spei;

import defpackage.c0d;
import defpackage.ej5;
import defpackage.o8i0;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.stp.spei.SpeiByStpDepositViewModel$onResume$1", f = "SpeiByStpDepositViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, v1b<? super e> v1bVar) {
        super(2, v1bVar);
        this.a = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        b bVar = this.a;
        bVar.c.g();
        bVar.x1(a.g.a);
        ej5.c(o8i0.d(bVar), null, null, new c(bVar, null), 3);
        return Unit.a;
    }
}
