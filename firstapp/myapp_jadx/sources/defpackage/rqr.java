package defpackage;

import com.sportybet.android.account.international.data.model.RegistrationStatusResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.latam.signup.presentation.LatamSignUpEmailViewModel$onScreenShown$3", f = "LatamSignUpEmailViewModel.kt", l = {122}, m = "invokeSuspend", v = 2)
public final class rqr extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ lqr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqr(lqr lqrVar, v1b<? super rqr> v1bVar) {
        super(2, v1bVar);
        this.b = lqrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rqr(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rqr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        nor norVarA1;
        psm psmVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            lqr lqrVar = this.b;
            wwd0 wwd0Var = lqrVar.a;
            do {
                value = wwd0Var.getValue();
                norVarA1 = lqrVar.A1();
                psmVar = lqrVar.E;
            } while (!wwd0Var.g(value, jqr.a((jqr) value, norVarA1, null, null, null, null, null, null, null, null, null, psmVar.M(), psmVar.l(), null, null, null, false, false, false, false, false, false, false, false, 16771068)));
            RegistrationStatusResponse registrationStatusResponse = lqrVar.z1().a;
            if (registrationStatusResponse != null) {
                this.a = 1;
                if (lqrVar.E1(registrationStatusResponse, this) == y5bVar) {
                    return y5bVar;
                }
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
