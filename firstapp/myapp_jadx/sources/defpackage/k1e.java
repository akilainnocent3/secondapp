package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositMomoFragment$initPayMethodViewModel$1", f = "DepositMomoFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k1e extends tje0 implements Function2<y200, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ m1e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1e(m1e m1eVar, v1b<? super k1e> v1bVar) {
        super(2, v1bVar);
        this.b = m1eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        k1e k1eVar = new k1e(this.b, v1bVar);
        k1eVar.a = obj;
        return k1eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(y200 y200Var, v1b<? super Unit> v1bVar) {
        return ((k1e) create(y200Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y200 y200Var = (y200) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        osa0.a(Intrinsics.g(y200Var != null ? y200Var.b() : null, "mobilemoney"), this.b.P0().G0, null);
        return Unit.a;
    }
}
