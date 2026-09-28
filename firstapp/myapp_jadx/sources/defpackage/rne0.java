package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.SwitchPaymentItemDialogFragment$initViewModel$1$2", f = "SwitchPaymentItemDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rne0 extends tje0 implements Function2<vne0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ sne0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rne0(sne0 sne0Var, v1b<? super rne0> v1bVar) {
        super(2, v1bVar);
        this.b = sne0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rne0 rne0Var = new rne0(this.b, v1bVar);
        rne0Var.a = obj;
        return rne0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vne0 vne0Var, v1b<? super Unit> v1bVar) {
        return ((rne0) create(vne0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        vne0 vne0Var = (vne0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if ((vne0Var instanceof vne0.e) || Intrinsics.g(vne0Var, vne0.a.a) || Intrinsics.g(vne0Var, vne0.b.a)) {
            this.b.dismissAllowingStateLoss();
        }
        return Unit.a;
    }
}
