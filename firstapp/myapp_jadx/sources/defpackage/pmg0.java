package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.fragment.TradeAdditionalPinDialogFragment$initViewModel$1$3", f = "TradeAdditionalPinDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class pmg0 extends tje0 implements Function2<c330, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ mmg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmg0(mmg0 mmg0Var, v1b<? super pmg0> v1bVar) {
        super(2, v1bVar);
        this.b = mmg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        pmg0 pmg0Var = new pmg0(this.b, v1bVar);
        pmg0Var.a = obj;
        return pmg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c330 c330Var, v1b<? super Unit> v1bVar) {
        return ((pmg0) create(c330Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        c330 c330Var = (c330) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        h9h h9hVar = this.b.f;
        if (h9hVar != null) {
            b330.a(h9hVar.f, c330Var);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
