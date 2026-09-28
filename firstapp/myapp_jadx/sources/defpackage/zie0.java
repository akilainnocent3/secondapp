package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.common.survey.SurveyViewModel$emitSurveyId$1", f = "SurveyViewModel.kt", l = {16}, m = "invokeSuspend", v = 2)
public final class zie0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ aje0 b;
    public final /* synthetic */ mie0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zie0(aje0 aje0Var, mie0 mie0Var, v1b<? super zie0> v1bVar) {
        super(2, v1bVar);
        this.b = aje0Var;
        this.c = mie0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zie0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zie0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            rie0 rie0Var = this.b.a;
            this.a = 1;
            if (rie0Var.b(this.c, this) == y5bVar) {
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
