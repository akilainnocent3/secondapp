package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sportybet.feature.payment.impl.common.presentation.activity.TradingActivity;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.activity.TradingActivity$initViewModel$3", f = "TradingActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vog0 extends tje0 implements Function2<y200, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ TradingActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vog0(TradingActivity tradingActivity, v1b<? super vog0> v1bVar) {
        super(2, v1bVar);
        this.b = tradingActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vog0 vog0Var = new vog0(this.b, v1bVar);
        vog0Var.a = obj;
        return vog0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(y200 y200Var, v1b<? super Unit> v1bVar) {
        return ((vog0) create(y200Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List<y200> list;
        Object value;
        y200 y200Var = (y200) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        TradingActivity tradingActivity = this.b;
        if (y200Var != null) {
            int i = TradingActivity.X;
            wwd0 wwd0Var = ((qdd0) tradingActivity.U.getValue()).b;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, Pair.a((Pair) value, y200Var, null, 2)));
        }
        int i2 = TradingActivity.X;
        z200 value2 = tradingActivity.z1().x1().getValue();
        int iIndexOf = (value2 == null || (list = value2.a) == null) ? -1 : list.indexOf(y200Var);
        if (iIndexOf != -1) {
            ye yeVar = tradingActivity.d;
            if (yeVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TabLayout.g gVarK = yeVar.w.G.k(iIndexOf);
            if (gVarK != null) {
                gVarK.b();
            }
            ye yeVar2 = tradingActivity.d;
            if (yeVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            yeVar2.y.setCurrentItem(iIndexOf);
        }
        return Unit.a;
    }
}
