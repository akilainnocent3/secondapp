package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangePreCheckResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.account.verifiedemailchange.EmailChangeRepositoryImpl$getEmailChangePreCheck$2", f = "EmailChangeRepositoryImpl.kt", l = {38}, m = "invokeSuspend", v = 2)
public final class syf extends tje0 implements Function2<v5b, v1b<? super EmailChangePreCheckResponse>, Object> {
    public int a;
    public final /* synthetic */ pyf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syf(pyf pyfVar, v1b<? super syf> v1bVar) {
        super(2, v1bVar);
        this.b = pyfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new syf(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super EmailChangePreCheckResponse> v1bVar) {
        return ((syf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            xxz xxzVar = this.b.a;
            this.a = 1;
            obj = xxzVar.r1(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return n52.b((BaseResponse) obj);
    }
}
