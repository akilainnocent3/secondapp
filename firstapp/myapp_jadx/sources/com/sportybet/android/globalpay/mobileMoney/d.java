package com.sportybet.android.globalpay.mobileMoney;

import com.sporty.android.core.model.pocket.common.UserAdditionalPhoneConfig;
import defpackage.bm50;
import defpackage.c0d;
import defpackage.ib5;
import defpackage.lk50;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.wl50;
import defpackage.wwd0;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.mobileMoney.MobileMoneyDepositViewModel$collectUserAdditionalPhoneConfig$1", f = "MobileMoneyDepositViewModel.kt", l = {160}, m = "invokeSuspend", v = 2)
public final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, v1b<? super d> v1bVar) {
        super(2, v1bVar);
        this.b = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        c cVar = this.b;
        wwd0 wwd0Var = cVar.N;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wl50 wl50VarK = cVar.v.k();
            this.a = 1;
            obj = bm50.p(wl50VarK, this);
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
        lk50 lk50Var = (lk50) obj;
        if (lk50Var instanceof lk50.c) {
            UserAdditionalPhoneConfig userAdditionalPhoneConfig = (UserAdditionalPhoneConfig) ((lk50.c) lk50Var).a;
            cVar.T = userAdditionalPhoneConfig.getPrimaryPhoneOtpVerificationRequired();
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, c.a.a((c.a) value2, null, null, userAdditionalPhoneConfig.getEnabled(), userAdditionalPhoneConfig.getMaxCount(), null, false, false, false, false, 499)));
        } else {
            cVar.T = false;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, c.a.a((c.a) value, null, null, false, 1, null, false, false, false, false, 499)));
        }
        return Unit.a;
    }
}
