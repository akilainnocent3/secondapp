package defpackage;

import com.sporty.android.core.model.realsports.OddsFilterEventCountData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.usecase.PreMatchSectionUseCase$getPreMatchEventCountsByOddsFilter$2", f = "PreMatchSectionUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class oj20 extends tje0 implements Function2<lk50<? extends OddsFilterEventCountData>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ azt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj20(azt aztVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = aztVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        oj20 oj20Var = new oj20(this.b, v1bVar);
        oj20Var.a = obj;
        return oj20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends OddsFilterEventCountData> lk50Var, v1b<? super Unit> v1bVar) {
        return ((oj20) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.invoke(lk50Var);
        return Unit.a;
    }
}
