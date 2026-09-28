package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter$triggerOneCutChecked$1$1", f = "BetSlipFooter.kt", l = {1694}, m = "invokeSuspend", v = 2)
public final class d43 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mgd0 b;
    public final /* synthetic */ BetSlipFooter c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d43(v1b v1bVar, mgd0 mgd0Var, BetSlipFooter betSlipFooter) {
        super(2, v1bVar);
        this.b = mgd0Var;
        this.c = betSlipFooter;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d43(v1bVar, this.b, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d43) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            mgd0 mgd0Var = this.b;
            mgd0Var.s0.setChecked(true);
            int i2 = BetSlipFooter.j0;
            BetSlipFooter betSlipFooter = this.c;
            betSlipFooter.r(true);
            int iH = (int) (betSlipFooter.getRemoteConfigRepository().h("android_onecut_stake_proportion_default") * 100.0d);
            mgd0Var.w0.setProgress(iH);
            to3 to3Var = betSlipFooter.H;
            if (to3Var != null) {
                to3Var.d(iH);
            }
            m2l dataStore = betSlipFooter.getDataStore();
            this.a = 1;
            if (dataStore.a.b("slider_progress_percentage", this) == y5bVar) {
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
