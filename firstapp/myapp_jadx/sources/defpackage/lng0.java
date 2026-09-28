package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.fragment.TradeAdditionalSmsDialogFragment$initViewModel$1$3", f = "TradeAdditionalSmsDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lng0 extends tje0 implements Function2<l6b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ing0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lng0(ing0 ing0Var, v1b<? super lng0> v1bVar) {
        super(2, v1bVar);
        this.b = ing0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lng0 lng0Var = new lng0(this.b, v1bVar);
        lng0Var.a = obj;
        return lng0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(l6b l6bVar, v1b<? super Unit> v1bVar) {
        return ((lng0) create(l6bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        l6b l6bVar = (l6b) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = l6bVar instanceof l6b.a;
        ing0 ing0Var = this.b;
        if (z) {
            l9h l9hVar = ing0Var.f;
            if (l9hVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            l9hVar.v.a(((l6b.a) l6bVar).a);
        } else {
            if (!Intrinsics.g(l6bVar, l6b.b.a)) {
                uhc.a();
                return null;
            }
            l9h l9hVar2 = ing0Var.f;
            if (l9hVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            l9hVar2.v.b();
        }
        return Unit.a;
    }
}
