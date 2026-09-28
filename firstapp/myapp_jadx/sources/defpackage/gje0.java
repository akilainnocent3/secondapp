package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.common.survey.SurveyWebViewManager$1", f = "SurveyWebViewManager.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gje0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ oje0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gje0(oje0 oje0Var, v1b<? super gje0> v1bVar) {
        super(2, v1bVar);
        this.b = oje0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gje0 gje0Var = new gje0(this.b, v1bVar);
        gje0Var.a = obj;
        return gje0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gje0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        oje0 oje0Var = this.b;
        ej5.c(v5bVar, null, null, new ije0(oje0Var, null), 3);
        ej5.c(v5bVar, null, null, new jje0(oje0Var, null), 3);
        ej5.c(v5bVar, null, null, new hje0(oje0Var, null), 3);
        return Unit.a;
    }
}
