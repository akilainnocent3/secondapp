package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.fragment.RealBetHistoryFragment$initViewModel$6", f = "RealBetHistoryFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l540 extends tje0 implements Function2<tzs, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ o540 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l540(o540 o540Var, v1b<? super l540> v1bVar) {
        super(2, v1bVar);
        this.b = o540Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        l540 l540Var = new l540(this.b, v1bVar);
        l540Var.a = obj;
        return l540Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tzs tzsVar, v1b<? super Unit> v1bVar) {
        return ((l540) create(tzsVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        tzs tzsVar = (tzs) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        pxi pxiVar = this.b.C;
        if (pxiVar != null) {
            c8i0.o(pxiVar.b, tzsVar.a());
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
