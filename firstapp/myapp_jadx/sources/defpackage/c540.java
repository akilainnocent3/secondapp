package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.fragment.RealBetHistoryFragment$initLoadCodeViewModel$3", f = "RealBetHistoryFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c540 extends tje0 implements Function2<tzs, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ o540 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c540(o540 o540Var, v1b<? super c540> v1bVar) {
        super(2, v1bVar);
        this.b = o540Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        c540 c540Var = new c540(this.b, v1bVar);
        c540Var.a = obj;
        return c540Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tzs tzsVar, v1b<? super Unit> v1bVar) {
        return ((c540) create(tzsVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        tzs tzsVar = (tzs) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean zG = Intrinsics.g(tzsVar, tzs.b.a);
        o540 o540Var = this.b;
        if (zG) {
            h330 h330Var = o540Var.B;
            if (h330Var != null) {
                h330Var.b();
            }
        } else {
            if (!Intrinsics.g(tzsVar, tzs.a.a)) {
                uhc.a();
                return null;
            }
            h330 h330Var2 = o540Var.B;
            if (h330Var2 != null) {
                h330Var2.a();
            }
        }
        return Unit.a;
    }
}
