package defpackage;

import com.sporty.android.core.model.realsports.OddsFilterEventCountData;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.widget.OddsFilterSettingView;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.PreMatchSportActivity$collectData$1$6", f = "PreMatchSportActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class pl20 extends tje0 implements Function2<lk50<? extends OddsFilterEventCountData>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ PreMatchSportActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl20(PreMatchSportActivity preMatchSportActivity, v1b<? super pl20> v1bVar) {
        super(2, v1bVar);
        this.b = preMatchSportActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        pl20 pl20Var = new pl20(this.b, v1bVar);
        pl20Var.a = obj;
        return pl20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends OddsFilterEventCountData> lk50Var, v1b<? super Unit> v1bVar) {
        return ((pl20) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.c) {
            LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
            ymh ymhVarC1 = this.b.C1();
            OddsFilterEventCountData oddsFilterEventCountData = (OddsFilterEventCountData) ((lk50.c) lk50Var).a;
            ymhVarC1.getClass();
            oddsFilterEventCountData.getClass();
            ((OddsFilterSettingView) ymhVarC1.g.getValue()).setEventCounts(oddsFilterEventCountData);
        }
        return Unit.a;
    }
}
