package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.widget.QuickBetView$placeBet$1", f = "QuickBetView.kt", l = {4028}, m = "invokeSuspend", v = 2)
public final class ef30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ QuickBetView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef30(QuickBetView quickBetView, v1b<? super ef30> v1bVar) {
        super(2, v1bVar);
        this.b = quickBetView;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ef30(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ef30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            QuickBetView quickBetView = this.b;
            hc40 rebetRemixCombineAnTestHelper = quickBetView.getRebetRemixCombineAnTestHelper();
            boolean zM0 = quickBetView.getBetItem().m0();
            this.a = 1;
            if (rebetRemixCombineAnTestHelper.c(zM0, this) == y5bVar) {
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
