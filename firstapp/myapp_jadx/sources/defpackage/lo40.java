package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.redblack.remote.models.UserValidateResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.redblack.repositories.RedBlackRepository$userValidate$2", f = "RedBlackRepository.kt", l = {28}, m = "invokeSuspend", v = 1)
public final class lo40 extends tje0 implements Function1<v1b<? super HTTPResponse<UserValidateResponse>>, Object> {
    public int a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new lo40(1, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<UserValidateResponse>> v1bVar) {
        return ((lo40) create(v1bVar)).invokeSuspend(Unit.a);
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
        mpe0 mpe0Var = on0.a;
        zn40 zn40VarL = on0.l();
        this.a = 1;
        Object objUserValidate = zn40VarL.userValidate(this);
        return objUserValidate == y5bVar ? y5bVar : objUserValidate;
    }
}
