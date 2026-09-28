package com.sportybet.android.globalpay.stp.spei;

import com.sporty.android.core.model.pocket.deposit.DepositHistoryStatusData;
import defpackage.c0d;
import defpackage.ib5;
import defpackage.itf0;
import defpackage.k5k;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.wwd0;
import defpackage.y5b;
import defpackage.zi50;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.stp.spei.SpeiByStpDepositViewModel$loadKycDialogData$1", f = "SpeiByStpDepositViewModel.kt", l = {233}, m = "invokeSuspend", v = 2)
public final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, v1b<? super c> v1bVar) {
        super(2, v1bVar);
        this.b = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        b bVar = this.b;
        wwd0 wwd0Var = bVar.z;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            Boolean bool = Boolean.TRUE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
            k5k k5kVar = bVar.d;
            this.a = 1;
            objA = k5kVar.a(this);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (!(objA instanceof zi50.b)) {
            bVar.x1(new a.d((DepositHistoryStatusData) objA));
        }
        Throwable thA = zi50.a(objA);
        if (thA != null) {
            bVar.x1(a.f.a);
            itf0.a.f(thA, "Error fetching deposit history status", new Object[0]);
        }
        Boolean bool2 = Boolean.FALSE;
        wwd0Var.getClass();
        wwd0Var.k(null, bool2);
        return Unit.a;
    }
}
