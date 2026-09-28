package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.fragment.RealBetHistoryFragment$initViewModel$4", f = "RealBetHistoryFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j540 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ o540 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j540(o540 o540Var, v1b<? super j540> v1bVar) {
        super(2, v1bVar);
        this.b = o540Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        j540 j540Var = new j540(this.b, v1bVar);
        j540Var.a = ((Boolean) obj).booleanValue();
        return j540Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((j540) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        o540 o540Var = this.b;
        pxi pxiVar = o540Var.C;
        if (pxiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        c8i0.o(pxiVar.i, z);
        if (z) {
            o540Var.m0();
        }
        return Unit.a;
    }
}
