package defpackage;

import com.sportybet.plugin.realsports.data.TimeFilterEventCountData;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.sportssoccer.expandview.TimeFilterPopupView;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.PreMatchSportActivity$collectData$1$5", f = "PreMatchSportActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ol20 extends tje0 implements Function2<lk50<? extends TimeFilterEventCountData>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ PreMatchSportActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol20(PreMatchSportActivity preMatchSportActivity, v1b<? super ol20> v1bVar) {
        super(2, v1bVar);
        this.b = preMatchSportActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ol20 ol20Var = new ol20(this.b, v1bVar);
        ol20Var.a = obj;
        return ol20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends TimeFilterEventCountData> lk50Var, v1b<? super Unit> v1bVar) {
        return ((ol20) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
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
            TimeFilterEventCountData timeFilterEventCountData = (TimeFilterEventCountData) ((lk50.c) lk50Var).a;
            ymhVarC1.getClass();
            timeFilterEventCountData.getClass();
            ((TimeFilterPopupView) ymhVarC1.e.getValue()).setEventCounts(timeFilterEventCountData);
        }
        return Unit.a;
    }
}
