package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.fragment.RealBetHistoryFragment$initViewModel$5", f = "RealBetHistoryFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k540 extends tje0 implements Function2<c330, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ o540 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k540(o540 o540Var, v1b<? super k540> v1bVar) {
        super(2, v1bVar);
        this.b = o540Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        k540 k540Var = new k540(this.b, v1bVar);
        k540Var.a = obj;
        return k540Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c330 c330Var, v1b<? super Unit> v1bVar) {
        return ((k540) create(c330Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        c330 c330Var = (c330) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        pxi pxiVar = this.b.C;
        if (pxiVar != null) {
            b330.a(pxiVar.d, c330Var);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
