package defpackage;

import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.common.survey.SurveyWebViewManager$startTimer$2", f = "SurveyWebViewManager.kt", l = {}, m = "invokeSuspend", v = 2)
public final class nje0 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public final /* synthetic */ oje0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nje0(oje0 oje0Var, v1b<? super nje0> v1bVar) {
        super(1, v1bVar);
        this.a = oje0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new nje0(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((nje0) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        oje0 oje0Var = this.a;
        oje0Var.i = false;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SURVEY);
        aVar.d("SurveyWebViewManager: load survey timeout, " + oje0Var.i, new Object[0]);
        return Unit.a;
    }
}
