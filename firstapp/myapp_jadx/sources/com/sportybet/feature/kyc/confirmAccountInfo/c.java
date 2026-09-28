package com.sportybet.feature.kyc.confirmAccountInfo;

import defpackage.c0d;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoScreenKt$ConfirmAccountInfoScreen$2$1", f = "ConfirmAccountInfoScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Function1<d, Unit> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Function1<? super d, Unit> function1, v1b<? super c> v1bVar) {
        super(2, v1bVar);
        this.a = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.invoke(d.h.a);
        return Unit.a;
    }
}
