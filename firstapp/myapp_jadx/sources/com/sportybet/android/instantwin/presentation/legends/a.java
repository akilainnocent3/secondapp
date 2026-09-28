package com.sportybet.android.instantwin.presentation.legends;

import defpackage.c0d;
import defpackage.ib5;
import defpackage.mgb0;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.SportyLegendsActivity$handleNavigationEvent$1", f = "SportyLegendsActivity.kt", l = {154}, m = "invokeSuspend", v = 2)
public final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ SportyLegendsActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SportyLegendsActivity sportyLegendsActivity, v1b<? super a> v1bVar) {
        super(2, v1bVar);
        this.b = sportyLegendsActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new a(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            SportyLegendsActivity sportyLegendsActivity = this.b;
            mgb0 mgb0Var = sportyLegendsActivity.c;
            if (mgb0Var == null) {
                Intrinsics.n("sportyAccountManager");
                throw null;
            }
            this.a = 1;
            if (mgb0Var.ensureLogin(sportyLegendsActivity, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
