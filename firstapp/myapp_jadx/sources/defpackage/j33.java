package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter$initSeekBar$1$2", f = "BetSlipFooter.kt", l = {2112}, m = "invokeSuspend", v = 2)
public final class j33 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ BetSlipFooter b;
    public final /* synthetic */ mgd0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j33(v1b v1bVar, mgd0 mgd0Var, BetSlipFooter betSlipFooter) {
        super(2, v1bVar);
        this.b = betSlipFooter;
        this.c = mgd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j33(v1bVar, this.c, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j33) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        BetSlipFooter betSlipFooter = this.b;
        if (i == 0) {
            uj50.b(obj);
            int iH = (int) (betSlipFooter.getRemoteConfigRepository().h("android_onecut_stake_proportion_default") * 100.0d);
            m2l dataStore = betSlipFooter.getDataStore();
            this.a = 1;
            obj = dataStore.a.getInt("slider_progress_percentage", iH, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        int iIntValue = ((Number) obj).intValue();
        this.c.w0.setProgress(iIntValue);
        to3 to3Var = betSlipFooter.H;
        if (to3Var != null) {
            to3Var.d(iIntValue);
        }
        return Unit.a;
    }
}
