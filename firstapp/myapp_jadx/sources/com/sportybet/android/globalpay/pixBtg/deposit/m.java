package com.sportybet.android.globalpay.pixBtg.deposit;

import com.sportybet.android.globalpay.pixBtg.antest.BrDepositHotButtonConversionData;
import defpackage.c0d;
import defpackage.ebk;
import defpackage.ib5;
import defpackage.qe10;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.whn;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$onDialogAction$9", f = "PixBtgDepositViewModel.kt", l = {278}, m = "invokeSuspend", v = 2)
public final class m extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g gVar, a aVar, v1b<? super m> v1bVar) {
        super(2, v1bVar);
        this.b = gVar;
        this.c = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        Object obj2 = null;
        g gVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            obj = gVar.x1(this);
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
        whn whnVar = (whn) obj;
        qe10 qe10VarA1 = gVar.A1();
        String str = ((a.k) this.c).a;
        String str2 = whnVar.b;
        BrDepositHotButtonConversionData brDepositHotButtonConversionData = new BrDepositHotButtonConversionData(whnVar.e, false);
        qe10VarA1.getClass();
        str2.getClass();
        ebk.a aVar = qe10VarA1.g;
        if (aVar == null) {
            Intrinsics.n("pendingDepositsResult");
            throw null;
        }
        for (Object obj3 : aVar.a) {
            if (Intrinsics.g(((ebk.b) obj3).a, str)) {
                obj2 = obj3;
                break;
            }
        }
        ebk.b bVar = (ebk.b) obj2;
        if (bVar != null) {
            qe10VarA1.c.invoke(new c.e(bVar.a, bVar.e, String.valueOf(bVar.b), str2, brDepositHotButtonConversionData));
        }
        return Unit.a;
    }
}
