package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.vip.data.UserTopCoeffResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.vip.repository.ApiRepository$getUserTopCoeff$2", f = "ApiRepository.kt", l = {54}, m = "invokeSuspend", v = 1)
public final class eo0 extends tje0 implements Function1<v1b<? super HTTPResponse<UserTopCoeffResponse>>, Object> {
    public int a;
    public final /* synthetic */ jo0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo0(jo0 jo0Var, v1b<? super eo0> v1bVar) {
        super(1, v1bVar);
        this.b = jo0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new eo0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<UserTopCoeffResponse>> v1bVar) {
        return ((eo0) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        zbi0 zbi0Var = this.b.b;
        this.a = 1;
        Object objF = zbi0Var.f(this);
        return objF == y5bVar ? y5bVar : objF;
    }
}
