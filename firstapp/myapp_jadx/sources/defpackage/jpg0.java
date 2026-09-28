package defpackage;

import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.TradingSharedViewModel$initAssetsInfo$1", f = "TradingSharedViewModel.kt", l = {108}, m = "invokeSuspend", v = 2)
public final class jpg0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ qpg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpg0(qpg0 qpg0Var, v1b<? super jpg0> v1bVar) {
        super(2, v1bVar);
        this.b = qpg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jpg0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jpg0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qpg0 qpg0Var = this.b;
        wwd0 wwd0Var = qpg0Var.w;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0Var.setValue(lk50.b.a);
            lyh<lk50<AssetsInfo>> lyhVarH = qpg0Var.a.h(pu0.c.a);
            this.a = 1;
            obj = bm50.p(lyhVarH, this);
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
        qpg0Var.B.setValue(lk50Var);
        wwd0Var.setValue(bm50.l(lk50Var, new ipg0()));
        return Unit.a;
    }
}
