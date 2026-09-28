package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.deposit.momo.CommonMobileMoneyDepositFragment$initViewModel$1$12", f = "CommonMobileMoneyDepositFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class te8 extends tje0 implements Function2<a, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ re8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te8(re8 re8Var, v1b<? super te8> v1bVar) {
        super(2, v1bVar);
        this.b = re8Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        te8 te8Var = new te8(this.b, v1bVar);
        te8Var.a = obj;
        return te8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, v1b<? super Unit> v1bVar) {
        return ((te8) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        a aVar = (a) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        re8 re8Var = this.b;
        e eVar = re8Var.C;
        if (eVar != null) {
            eVar.d(aVar, re8Var, re8Var.n0().a, null);
            return Unit.a;
        }
        Intrinsics.n("commonUiEventProcessor");
        throw null;
    }
}
