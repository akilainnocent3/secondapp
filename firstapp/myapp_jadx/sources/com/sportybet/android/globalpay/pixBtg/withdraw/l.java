package com.sportybet.android.globalpay.pixBtg.withdraw;

import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;
import defpackage.ahk;
import defpackage.c0d;
import defpackage.ib5;
import defpackage.itf0;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import defpackage.zi50;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawViewModel$refreshBalanceAndLimits$2", f = "PixBtgWithdrawViewModel.kt", l = {391}, m = "invokeSuspend", v = 2)
public final class l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ h b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar, v1b<? super l> v1bVar) {
        super(2, v1bVar);
        this.b = hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new l(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        y5b y5bVar = y5b.a;
        int i = this.a;
        h hVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            ahk ahkVar = hVar.v;
            this.a = 1;
            objA = ahkVar.a(this);
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
        Throwable thA = zi50.a(objA);
        if (thA != null) {
            itf0.a.f(thA, "Failed to get withdraw info", new Object[0]);
        }
        if (!(objA instanceof zi50.b)) {
            hVar.x1(new d.k((WithDrawInfo) objA));
        }
        return Unit.a;
    }
}
