package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawBankV2Fragment$initView$1$1$1$2$1$4$1$1", f = "WithdrawBankV2Fragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gjj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ijj0 a;
    public final /* synthetic */ ytw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjj0(ijj0 ijj0Var, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.a = ijj0Var;
        this.b = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gjj0(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gjj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        gme0 gme0Var = (gme0) this.a.d0.getValue();
        List list = (List) this.b.getValue();
        list.getClass();
        wwd0 wwd0Var = gme0Var.b;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, fme0.a(fme0.f, null, 0, null, false, 30)));
        wwd0 wwd0Var2 = gme0Var.a;
        wwd0Var2.getClass();
        wwd0Var2.k(null, list);
        return Unit.a;
    }
}
