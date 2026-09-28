package defpackage;

import com.sportybet.android.cashoutphase3.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$initFeaturedCodesViewModel$5", f = "CashOutFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mk6 extends tje0 implements gaj<lk50<? extends List<? extends gz4>>, jj40, v1b<? super Unit>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ jj40 b;
    public final /* synthetic */ b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk6(b bVar, v1b<? super mk6> v1bVar) {
        super(3, v1bVar);
        this.c = bVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(lk50<? extends List<? extends gz4>> lk50Var, jj40 jj40Var, v1b<? super Unit> v1bVar) {
        mk6 mk6Var = new mk6(this.c, v1bVar);
        mk6Var.a = lk50Var;
        mk6Var.b = jj40Var;
        return mk6Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list;
        lk50 lk50Var = this.a;
        jj40 jj40Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        if (cVar == null || (list = (List) cVar.a) == null) {
            list = m2g.a;
        }
        ArrayList arrayListA = h0z.a(list, jj40Var, false);
        f0z f0zVar = this.c.k0;
        if (f0zVar != null) {
            f0zVar.i(arrayListA);
            return Unit.a;
        }
        Intrinsics.n("openBetRecommendedCodeAdapter");
        throw null;
    }
}
