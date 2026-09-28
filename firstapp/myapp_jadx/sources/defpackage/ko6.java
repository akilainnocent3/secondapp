package defpackage;

import com.sportybet.android.cashoutphase3.e;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$openBetDataWithBoreDrawConfigStateFlow$1", f = "CashOutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ko6 extends tje0 implements gaj<e, xo6, v1b<? super xyy>, Object> {
    public /* synthetic */ e a;
    public /* synthetic */ xo6 b;

    @Override // defpackage.gaj
    public final Object invoke(e eVar, xo6 xo6Var, v1b<? super xyy> v1bVar) {
        ko6 ko6Var = new ko6(3, v1bVar);
        ko6Var.a = eVar;
        ko6Var.b = xo6Var;
        return ko6Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        e eVar = this.a;
        xo6 xo6Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new xyy(eVar, xo6Var.q);
    }
}
