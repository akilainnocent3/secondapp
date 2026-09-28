package defpackage;

import com.sporty.android.core.model.pocket.common.PaymentChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.deposit.CommonDepositViewModel$init$1", f = "CommonDepositViewModel.kt", l = {76}, m = "invokeSuspend", v = 2)
public final class yc8 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zc8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc8(zc8 zc8Var, v1b<? super yc8> v1bVar) {
        super(2, v1bVar);
        this.b = zc8Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yc8(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yc8) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object next;
        zc8 zc8Var = this.b;
        ArrayList arrayList = zc8Var.w;
        y5b y5bVar = y5b.a;
        int i = this.a;
        Object obj2 = null;
        if (i == 0) {
            uj50.b(obj);
            g77 g77Var = zc8Var.b;
            this.a = 1;
            obj = g77Var.a(this);
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
        List list = (List) obj;
        if (list.isEmpty()) {
            zc8Var.i.m(new g9e.a(1));
            return Unit.a;
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((PaymentChannel) next).isSupportMobileMoneyDeposit());
        PaymentChannel paymentChannel = (PaymentChannel) next;
        zc8Var.D = paymentChannel;
        if (paymentChannel != null) {
            arrayList.add(wc8.a.b);
        }
        for (Object obj3 : list) {
            if (((PaymentChannel) obj3).isSupportPaybill()) {
                obj2 = obj3;
                break;
            }
        }
        PaymentChannel paymentChannel2 = (PaymentChannel) obj2;
        zc8Var.E = paymentChannel2;
        if (paymentChannel2 != null) {
            arrayList.add(wc8.b.b);
        }
        zc8Var.y.m(arrayList);
        zc8Var.x1(true);
        return Unit.a;
    }
}
