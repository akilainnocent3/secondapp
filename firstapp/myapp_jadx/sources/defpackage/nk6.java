package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import com.sportybet.android.cashoutphase3.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$initLoadCodeViewModel$1", f = "CashOutFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class nk6 extends tje0 implements Function2<a, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk6(b bVar, v1b<? super nk6> v1bVar) {
        super(2, v1bVar);
        this.b = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nk6 nk6Var = new nk6(this.b, v1bVar);
        nk6Var.a = obj;
        return nk6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, v1b<? super Unit> v1bVar) {
        return ((nk6) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        a aVar = (a) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        b bVar = this.b;
        e eVarV0 = bVar.v0();
        shd0 shd0Var = bVar.b0;
        shd0Var.getClass();
        eVarV0.d(aVar, bVar, shd0Var.a, null);
        return Unit.a;
    }
}
