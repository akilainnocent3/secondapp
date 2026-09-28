package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawMomoFragment$initSwitchItemListViewModel$1$1", f = "WithdrawMomoFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class smj0 extends tje0 implements Function2<vne0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ tmj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smj0(tmj0 tmj0Var, v1b<? super smj0> v1bVar) {
        super(2, v1bVar);
        this.b = tmj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        smj0 smj0Var = new smj0(this.b, v1bVar);
        smj0Var.a = obj;
        return smj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vne0 vne0Var, v1b<? super Unit> v1bVar) {
        return ((smj0) create(vne0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        vne0 vne0Var = (vne0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (vne0Var instanceof vne0.e) {
            aoe0 aoe0Var = ((vne0.e) vne0Var).a;
            if (aoe0Var instanceof aoe0.h) {
                dnj0 dnj0VarV0 = this.b.P0();
                Object obj2 = ((aoe0.h) aoe0Var).a;
                String str = obj2 instanceof String ? (String) obj2 : null;
                if (str == null) {
                    return Unit.a;
                }
                ej5.c(o8i0.d(dnj0VarV0), null, null, new cnj0(dnj0VarV0, str, null), 3);
            }
        }
        return Unit.a;
    }
}
