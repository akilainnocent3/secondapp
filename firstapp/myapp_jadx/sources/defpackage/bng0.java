package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.fragment.TradeAdditionalSecondOtpDialogFragment$initViewModel$1$3", f = "TradeAdditionalSecondOtpDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bng0 extends tje0 implements Function2<c330, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ymg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bng0(ymg0 ymg0Var, v1b<? super bng0> v1bVar) {
        super(2, v1bVar);
        this.b = ymg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bng0 bng0Var = new bng0(this.b, v1bVar);
        bng0Var.a = obj;
        return bng0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c330 c330Var, v1b<? super Unit> v1bVar) {
        return ((bng0) create(c330Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        c330 c330Var = (c330) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        i9h i9hVar = this.b.i;
        if (i9hVar != null) {
            b330.a(i9hVar.v, c330Var);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
