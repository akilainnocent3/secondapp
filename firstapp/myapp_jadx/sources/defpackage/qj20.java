package defpackage;

import com.sportybet.plugin.realsports.data.TimeFilterEventCountData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.usecase.PreMatchSectionUseCase$getPreMatchEventCountsByTimeFilter$2", f = "PreMatchSectionUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qj20 extends tje0 implements Function2<lk50<? extends TimeFilterEventCountData>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ wj20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj20(wj20 wj20Var, v1b v1bVar) {
        super(2, v1bVar);
        this.b = wj20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qj20 qj20Var = new qj20(this.b, v1bVar);
        qj20Var.a = obj;
        return qj20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends TimeFilterEventCountData> lk50Var, v1b<? super Unit> v1bVar) {
        return ((qj20) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
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
