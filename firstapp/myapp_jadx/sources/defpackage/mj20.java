package defpackage;

import com.sportybet.plugin.realsports.prematch.data.PreMatchWrappedData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.usecase.PreMatchSectionUseCase$getLiveAndPreMatchEventsByOrder$fetchJob$2", f = "PreMatchSectionUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mj20 extends tje0 implements Function2<lk50<? extends PreMatchWrappedData>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ uj20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj20(uj20 uj20Var, v1b v1bVar) {
        super(2, v1bVar);
        this.b = uj20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mj20 mj20Var = new mj20(this.b, v1bVar);
        mj20Var.a = obj;
        return mj20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends PreMatchWrappedData> lk50Var, v1b<? super Unit> v1bVar) {
        return ((mj20) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
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
