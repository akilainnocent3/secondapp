package com.sportybet.android.globalpay.stp.clabe;

import defpackage.c0d;
import defpackage.c100;
import defpackage.cp7;
import defpackage.ga00;
import defpackage.h400;
import defpackage.ib5;
import defpackage.jak;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.w9e;
import defpackage.wwd0;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.stp.clabe.ClabeDepositViewModel$onResume$1", f = "ClabeDepositViewModel.kt", l = {73}, m = "invokeSuspend", v = 2)
public final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, v1b<? super e> v1bVar) {
        super(2, v1bVar);
        this.b = fVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        f fVar = this.b;
        wwd0 wwd0Var = fVar.a;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, cp7.a((cp7) value, true, null, 62)));
            w9e w9eVar = fVar.e;
            ga00 ga00Var = ga00.DEPOSIT;
            jak.a aVar = new jak.a(h400.STP, c100.v);
            this.a = 1;
            obj = w9eVar.f(ga00Var, aVar, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        do {
            value2 = wwd0Var.getValue();
        } while (!wwd0Var.g(value2, cp7.a((cp7) value2, false, null, 62)));
        if (!zBooleanValue) {
            fVar.x1(c.b.a);
        }
        return Unit.a;
    }
}
