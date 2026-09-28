package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.fragment.RealBetHistoryFragment$initViewModel$7", f = "RealBetHistoryFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m540 extends tje0 implements Function2<bbj0, v1b<? super Unit>, Object> {
    public final /* synthetic */ o540 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m540(o540 o540Var, v1b<? super m540> v1bVar) {
        super(2, v1bVar);
        this.a = o540Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m540(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(bbj0 bbj0Var, v1b<? super Unit> v1bVar) {
        return ((m540) create(bbj0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.s0();
        return Unit.a;
    }
}
