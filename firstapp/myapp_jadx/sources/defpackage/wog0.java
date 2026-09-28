package defpackage;

import com.sporty.android.common_ui.widgets.d;
import com.sporty.android.common_ui.widgets.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.common.presentation.activity.TradingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.activity.TradingActivity$initViewModel$4", f = "TradingActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wog0 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public final /* synthetic */ TradingActivity a;

    public static final /* synthetic */ class a extends pf implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            e400 e400Var = (e400) this.a;
            e400Var.getClass();
            et7 et7VarD = o8i0.d(e400Var);
            pfd pfdVar = fse.a;
            ej5.c(et7VarD, odd.b, null, new d400(e400Var, null), 2);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wog0(TradingActivity tradingActivity, v1b<? super wog0> v1bVar) {
        super(2, v1bVar);
        this.a = tradingActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wog0(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((wog0) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        TradingActivity tradingActivity = this.a;
        if (tradingActivity.isFinishing() || tradingActivity.isDestroyed()) {
            return Unit.a;
        }
        ye yeVar = tradingActivity.d;
        if (yeVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        if (yeVar.w.getTabCount() >= 4) {
            e eVar = new e(tradingActivity);
            eVar.c = d.b.a.b;
            String cMSString = tradingActivity.getCMSString(R.string.page_payment__explore_more_available_payment_method_hint, new Object[0]);
            cMSString.getClass();
            eVar.e = cMSString;
            eVar.d = new a(0, tradingActivity.z1(), e400.class, "setTabLayoutTooltipCloseForever", "setTabLayoutTooltipCloseForever()Lkotlinx/coroutines/Job;", 8);
            eVar.f = "tab_layout_scroll_btn_promoted";
            ye yeVar2 = tradingActivity.d;
            if (yeVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            eVar.b(yeVar2.w);
        }
        return Unit.a;
    }
}
