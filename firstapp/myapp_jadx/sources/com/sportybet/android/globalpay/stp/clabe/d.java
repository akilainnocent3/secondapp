package com.sportybet.android.globalpay.stp.clabe;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sportybet.android.globalpay.data.KycLimitData;
import defpackage.c0d;
import defpackage.c100;
import defpackage.cp7;
import defpackage.f3k;
import defpackage.ga00;
import defpackage.ib5;
import defpackage.o1l;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.uxs;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.w9e;
import defpackage.wwd0;
import defpackage.xsm;
import defpackage.y5b;
import defpackage.zi50;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.stp.clabe.ClabeDepositViewModel$onConfirmClicked$2", f = "ClabeDepositViewModel.kt", l = {94}, m = "invokeSuspend", v = 2)
public final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, v1b<? super d> v1bVar) {
        super(2, v1bVar);
        this.b = fVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.a;
        f fVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            f3k f3kVar = fVar.w;
            String str = fVar.y;
            if (str == null) {
                Intrinsics.n("tradeId");
                throw null;
            }
            this.a = 1;
            objA = f3kVar.a(str, this);
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
            SprThrowable sprThrowable = thA instanceof SprThrowable ? (SprThrowable) thA : null;
            fVar.x1(new c.a(sprThrowable != null ? sprThrowable.getE() : null));
        }
        if (!(objA instanceof zi50.b)) {
            BankTradeData bankTradeData = (BankTradeData) objA;
            w9e w9eVar = fVar.e;
            long j = bankTradeData.payAmount;
            c100 c100Var = c100.e;
            ga00 ga00Var = ga00.DEPOSIT;
            w9eVar.getClass();
            int iA = o1l.a(w9eVar.o, w9eVar.p, String.valueOf(340), String.valueOf(34001), j, ga00Var);
            int i2 = bankTradeData.status;
            if (i2 == 10) {
                KycLimitData kycLimitData = fVar.e.o;
                if ((kycLimitData != null ? kycLimitData.getCurrentLevel() : 0) < iA) {
                    fVar.x1(new c.C0248c(String.valueOf(bankTradeData.payAmount), iA));
                } else {
                    fVar.x1(c.d.a);
                }
            } else if (i2 == 20) {
                String str2 = fVar.y;
                if (str2 == null) {
                    Intrinsics.n("tradeId");
                    throw null;
                }
                xsm xsmVar = fVar.v;
                String str3 = fVar.z;
                if (str3 == null) {
                    Intrinsics.n("amount");
                    throw null;
                }
                fVar.x1(new c.f(str2, xsmVar.b(str3, false)));
            } else if (i2 != 80) {
                fVar.x1(new c.a(null));
            } else {
                fVar.x1(new c.C0248c(String.valueOf(bankTradeData.payAmount), iA));
            }
        }
        wwd0 wwd0Var = fVar.a;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, cp7.a((cp7) value, false, uxs.ENABLE, 31)));
        return Unit.a;
    }
}
