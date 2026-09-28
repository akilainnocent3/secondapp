package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.fragment.RealBetHistoryFragment$initViewModel$8", f = "RealBetHistoryFragment.kt", l = {430}, m = "invokeSuspend", v = 2)
public final class n540 extends tje0 implements Function2<kqz<t640>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ o540 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n540(o540 o540Var, v1b<? super n540> v1bVar) {
        super(2, v1bVar);
        this.c = o540Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        n540 n540Var = new n540(this.c, v1bVar);
        n540Var.b = obj;
        return n540Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kqz<t640> kqzVar, v1b<? super Unit> v1bVar) {
        return ((n540) create(kqzVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        kqz kqzVar = (kqz) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            w540 w540Var = this.c.F;
            if (w540Var == null) {
                Intrinsics.n("realBetHistoryAdapter");
                throw null;
            }
            this.b = null;
            this.a = 1;
            v01<T> v01Var = w540Var.b;
            v01Var.i.incrementAndGet();
            t01 t01Var = v01Var.h;
            Object objA = t01Var.g.a(0, new tqz(t01Var, kqzVar, null), this);
            if (objA != y5bVar) {
                objA = Unit.a;
            }
            if (objA != y5bVar) {
                objA = Unit.a;
            }
            if (objA != y5bVar) {
                objA = Unit.a;
            }
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
